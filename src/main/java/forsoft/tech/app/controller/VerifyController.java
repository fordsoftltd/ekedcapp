package forsoft.tech.app.controller;

import forsoft.tech.app.dto.*;
import forsoft.tech.app.mapper.DtoMapper;
import forsoft.tech.app.model.*;
import forsoft.tech.app.service.AppService;
import forsoft.tech.app.utils.AppUtil;
import forsoft.tech.app.utils.BCrypt;
import forsoft.tech.app.utils.FacesUtils;
import forsoft.tech.app.utils.Utils;
import org.apache.commons.lang3.StringUtils;
import org.primefaces.PrimeFaces;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;
//Y!SW1@ad?22#Lih02
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.event.ActionEvent;
import javax.faces.model.SelectItem;
import javax.servlet.http.HttpSession;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.*;


@Component
@Scope(value="session",  proxyMode = ScopedProxyMode.TARGET_CLASS)
public class VerifyController implements Serializable {

    @Autowired
    AppService service;
    @Autowired
    LoginController login;
    private List<Poleshistorydto> hthistoryList;
    private Polesdto currenthtpole;

    private List<Ltpoleshistorydto> lthistoryList;
    private Ltpolesdto currentltpole;
    private List<Customerhistorydto> customerhistoryList;
    private Customerdto currentCustomer;
    private Customer mainCustomer;
    private List<SelectItem> tflist;
    private List<String> businessList;
    private List<String> houseList;
    private List<String> tariffList;
    private List<String> upriserList;
    private Customerdto cr;
    private List<String> transformerList;
    private List<Feeder> feederList;
    private List<District> districtList;
    private List<String> poletypelist;
    private Ltpolesdto crlt;
    private Polesdto crht;
private Integer reportYear;
    @PostConstruct
    public void init() {
        reportYear=LocalDate.now().getYear();
        crht = new Polesdto();
        crlt = new Ltpolesdto();
        poletypelist = new ArrayList<>();
        transformerList = new ArrayList<>();
        feederList = new ArrayList<>();
        districtList = new ArrayList<>();
        cr = new Customerdto();
        upriserList = new ArrayList<>();
        tariffList = new ArrayList<>();
        tflist = new ArrayList<>();
        businessList = new ArrayList<>();
        houseList = new ArrayList<>();
        hthistoryList = new ArrayList<>();
        currenthtpole = new Polesdto();
        customerhistoryList = new ArrayList<>();
        currentCustomer = new Customerdto();
        currentltpole = new Ltpolesdto();
        lthistoryList = new ArrayList<>();
        populatetarif();
    }
    public void updateDone(){
        Users user = login.loginUser();
        String buildingCode=login.getBuildingCode();

        service.getBuildingRepo().updateBuilding(new Date(),
                true, user.getId(), buildingCode);
        Building bd = login.getCurrentBuilding();
        bd.setDone(true);
        login.setCurrentBuilding(bd);
        login.updateCustomer();
        login.printMessage("Building verification completed successfully", AppUtil.SUCCESS, AppUtil.SUCCESS_TAG);
    }
public void loadCustomer(Customer customer){
        this.mainCustomer=customer;
    PrimeFaces current = PrimeFaces.current();
    Customerdto masterList3 = DtoMapper.maptoCustomerdto(customer);
    List<Customerhistorydto> masterHistories3 = null;
    if (masterList3 == null) {
        masterHistories3 = DtoMapper.maptoCustomerhistorydtoList(service.getCustomerhistoryRepo().findByCin(customer.getCin()));
        if (masterHistories3 == null || masterHistories3.isEmpty()) {
            login.printMessage(AppUtil.INVALID_CUSTOMER, AppUtil.ERROR, AppUtil.ERROR_TAG);
            login.storeToSession(Utils.VALIDATED, null);
            //response = null;
        } else {
            Customerhistorydto single = masterHistories3.get(0);
            Optional<Customer> cm = service.getCustomerRepo().findById(single.getParent().getId());
            Customerdto currentht = null;
            //Check if record with given parent id  present in the parent table
            if (cm.isPresent()) {
                currentht = DtoMapper.maptoCustomerdto(cm.get());
                setCurrentCustomer(currentht);
                masterHistories3 = DtoMapper.maptoCustomerhistorydtoList(service.getCustomerhistoryRepo().findByParentid(single.getParent().getId()));
                setCustomerhistoryList(masterHistories3);
                login.storeToSession(Utils.VALIDATED, currentht);
                currentht.setLogindate(new Date());
                service.getCustomerRepo().save(DtoMapper.maptoCustomer(currentht));
                //response = "./apps/verify/customer.htm?faces-redirect=true";
                current.executeScript("PF('detailDialog').show()");
            } else {
                //If the record with given Id not present search the record by accountnumber
                if (single.getCustomerACCOUNTNO() != null && single.getCustomerACCOUNTNO().length() > 9) {
                    List<Customer> clist = service.getCustomerRepo().findByAccountNumber(single.getCustomerACCOUNTNO());
                    //If no record found set the session to null
                    if (clist.isEmpty()) {
                        login.printMessage(AppUtil.INVALID_CUSTOMER, AppUtil.ERROR, AppUtil.ERROR_TAG);
                        login.storeToSession(Utils.VALIDATED, null);
                       // response = null;
                    } else {
                        //If the record found retrieve the modifications made to the record from it's child table Customerhistory
                        currentht = DtoMapper.maptoCustomerdto(clist.get(0));
                        setCurrentCustomer(currentht);
                        masterHistories3 = DtoMapper.maptoCustomerhistorydtoList(
                                service.getCustomerhistoryRepo().findByAccountNumber(currentht.getCustomerACCOUNTNO()));
                        setCustomerhistoryList(masterHistories3);
                        login.storeToSession(Utils.VALIDATED, currentht);
                        currentht.setLogindate(new Date());
                        service.getCustomerRepo().save(DtoMapper.maptoCustomer(currentht));
                      //  response = "./apps/verify/customer.htm?faces-redirect=true";

                        current.executeScript("PF('detailDialog').show()");
                    }
                } else {
                    //If the account number is not up to the given size
                    login.printMessage(AppUtil.INVALID_CUSTOMER, AppUtil.ERROR, AppUtil.ERROR_TAG);
                    login.storeToSession(Utils.VALIDATED, null);
//                    response = null;
                }

            }

        }
    } else {
        Customerdto single = masterList3;
        setCurrentCustomer(single);
        login.storeToSession(Utils.VALIDATED, single);
        masterHistories3 = DtoMapper.maptoCustomerhistorydtoList(service.getCustomerhistoryRepo().findByParentid(single.getId()));
        setCustomerhistoryList(masterHistories3);
        mainCustomer.setLogindate(new Date());
        currentCustomer.setComments(mainCustomer.getComments());
        service.getCustomerRepo().save(mainCustomer);
        //response = "./apps/verify/customer.htm?faces-redirect=true";
        current.executeScript("PF('detailDialog').show()");

    }
}
    public void updateHtpolesid() {
        String poleno = currenthtpole.getNewpoleno();//new last
        if (poleno.equals(currenthtpole.getLTPoleID())) {

        }
        {
            if (poleno != null && StringUtils.isEmpty(poleno) == false
                    && StringUtils.isNumeric(poleno) && poleno.length() == 4) {
                DtoMapper.selfPoledto(currenthtpole, crht);
                HttpSession session = FacesUtils.getHttpSession(false);
                Usersdto user = (Usersdto) session.getAttribute(Utils.VERIFIED_USER);

                String no = currenthtpole.getHTSupportStructureNO();
                String firstpart = no.substring(0, 11);//first digit before lt
                String newno = firstpart + poleno;

                currenthtpole.setHTSupportStructureNO(newno);
                service.getPolesRepo().save(DtoMapper.maptoPoles(currenthtpole));

                service.getPoleshistoryRepo().save(DtoMapper.convertToPolesHistory(crht, true, user.getUsername()));
                login.printMessage(AppUtil.UPDATED, AppUtil.SUCCESS, AppUtil.SUCCESS_TAG);

            } else {
                login.printMessage("INVALID_LTPOLE_NUMBER", AppUtil.ERROR, AppUtil.ERROR_TAG);
            }
        }
    }

    public void updateLtpolesid() {
        String poleno = currentltpole.getNewltpoleno();//new last
        if (poleno.equals(currenthtpole.getLTPoleID())) {

        }
        {
            if (poleno != null && StringUtils.isEmpty(poleno) == false && StringUtils.isNumeric(poleno) && poleno.length() == 3) {
                DtoMapper.selfPoledto(currentltpole, crlt);
                HttpSession session = FacesUtils.getHttpSession(false);
                Usersdto user = (Usersdto) session.getAttribute(Utils.VERIFIED_USER);

                String no = currentltpole.getLTSupportStructureNO();
                String firstpart = no.substring(0, 17);// first part before upriser
                String uprs = no.substring(17, 18); //upriser
                //String ltno = no.substring(18);// old last three digit
                String newno = firstpart + uprs + poleno;

                currentltpole.setLTSupportStructureNO(newno);
                currentltpole.setLTPoleID(poleno);
                service.getLtpolesRepo().save(DtoMapper.maptoLtpoles(currentltpole));

                service.getLtpoleshistoryRepo().save(DtoMapper.convertToLtpolesHistory(crlt, true, user.getUsername()));
                login.printMessage(AppUtil.UPDATED, AppUtil.SUCCESS, AppUtil.SUCCESS_TAG);

            } else {
                login.printMessage("INVALID_LTPOLE_NUMBER", AppUtil.ERROR, AppUtil.ERROR_TAG);
            }
        }
    }

    public void updateLtpolesUpriser() {
        String upriser = currentltpole.getNewupriser();
        if (upriser.equals(currentltpole.getCableUpriserID())) {

        } else {
            if (upriser != null && StringUtils.isEmpty(upriser) == false && StringUtils.isNumeric(upriser) && upriser.length() == 1) {
                DtoMapper.selfPoledto(currentltpole, crlt);
                HttpSession session = FacesUtils.getHttpSession(false);
                Usersdto user = (Usersdto) session.getAttribute(Utils.VERIFIED_USER);

                String no = currentltpole.getLTSupportStructureNO();
                String firstpart = no.substring(0, 17);// first part before upriser
                // String uprs = no.substring(17, 18); old upriser
                String ltno = no.substring(18);// last three digit
                String newno = firstpart + upriser + ltno;

                currentltpole.setLTSupportStructureNO(newno);
                currentltpole.setCableUpriserID(upriser);
                service.getLtpolesRepo().save(DtoMapper.maptoLtpoles(currentltpole));

                service.getLtpoleshistoryRepo().save(DtoMapper.convertToLtpolesHistory(crlt, true, user.getUsername()));
                login.printMessage(AppUtil.UPDATED, AppUtil.SUCCESS, AppUtil.SUCCESS_TAG);

            } else {
                login.printMessage("INVALID_CABLE_UPRISER", AppUtil.ERROR, AppUtil.ERROR_TAG);
            }
        }
    }

    public void fetchDistrict(String contractor) {
        districtList = service.getDistrictRepo().listByContractor(contractor);
    }

    public void fetchFeeder() {
        AppHelper app = (AppHelper) FacesUtils.getManagedBean("appHelper");
        feederList = service.getFeederRepo().findByBusinessunit(app.getDistrictid());
    }

    public void fetchTransformer() {
        transformerList = service.getCustomerRepo().findTransformerList(currentCustomer.getFeederName(), reportYear);
    }

    public void updateCustomerDataFeeder() {
        Customer ct =DtoMapper.maptoCustomer(currentCustomer);
        ct.setDone(mainCustomer.getDone());
        ct.setPastedby(mainCustomer.getPastedby());
        ct.setContractorid(mainCustomer.getContractorid());
        ct.setLongs(mainCustomer.getLongs());
        ct.setLat(mainCustomer.getLat());
        ct.setDatecreated(mainCustomer.getDatecreated());
        ct.setDateUploaded(mainCustomer.getDateUploaded());
        ct.setPrintcount(mainCustomer.getPrintcount());

       ct= service.getCustomerRepo().save(ct);
        currentCustomer = DtoMapper.maptoCustomerdto(ct);
        login.printMessage("Customer Data Updated Successfully", AppUtil.SUCCESS, AppUtil.SUCCESS_TAG);
        transformerList = service.getCustomerRepo().findTransformerList(currentCustomer.getFeederName(), reportYear);
    }

    public void updateLtpoleDataFeeder() {
        updateLtpoles();
        transformerList = service.getLtpolesRepo().findTransformerList(currentltpole.getFeederid());
    }
    /////////////begining of update logic

    public void updateServicewire() {
        String cin = currentCustomer.getCin();
        String servicewire = cin.substring(21, 23);
        String customerid = cin.substring(cin.length() - 3);
        HttpSession session = FacesUtils.getHttpSession(false);
        Usersdto user = (Usersdto) session.getAttribute(Utils.VERIFIED_USER);
        if (!currentCustomer.getNewservicewireno().equals(servicewire)) {
            Customerhistory rs = DtoMapper.convertToCustomerhistory(currentCustomer, true, user.getUsername());
            service.getCustomerhistoryRepo().save(rs);
            String lower = cin.substring(0, 21);
            currentCustomer.setCin(lower + currentCustomer.getNewservicewireno() + customerid);
            currentCustomer.setServiceWireNo(lower + currentCustomer.getServiceWireNo());
            service.getCustomerRepo().save(DtoMapper.maptoCustomer(currentCustomer));
            login.printMessage("Service wire Updated", AppUtil.SUCCESS, AppUtil.SUCCESS_TAG);
        }

    }

    public void updateCustomerId() {
        String cin = currentCustomer.getCin();
        String servicewire = cin.substring(21, 23);
        String customerid = cin.substring(cin.length() - 3);
        HttpSession session = FacesUtils.getHttpSession(false);
        Usersdto user = (Usersdto) session.getAttribute(Utils.VERIFIED_USER);
        if (!currentCustomer.getNewcustomerid().equals(customerid)) {
            Customerhistory rs = DtoMapper.convertToCustomerhistory(currentCustomer, true, user.getUsername());
            service.getCustomerhistoryRepo().save(rs);
            String lower = cin.substring(0, 21);
            currentCustomer.setCin(lower + servicewire + currentCustomer.getNewcustomerid());
            currentCustomer.setCustomerID(currentCustomer.getNewcustomerid());
            Customer ct =DtoMapper.maptoCustomer(currentCustomer);
            ct.setDone(mainCustomer.getDone());
            ct.setPastedby(mainCustomer.getPastedby());
            ct.setContractorid(mainCustomer.getContractorid());
            ct.setLongs(mainCustomer.getLongs());
            ct.setLat(mainCustomer.getLat());
            ct.setDatecreated(mainCustomer.getDatecreated());
            ct.setDateUploaded(mainCustomer.getDateUploaded());
            ct.setPrintcount(mainCustomer.getPrintcount());

            service.getCustomerRepo().save(ct);
            login.printMessage("CustomerId Updated", AppUtil.SUCCESS, AppUtil.SUCCESS_TAG);
        }

    }

    public String updateCin(String cin, String ltpoleid, String cableupriser) {
        String firstpart = cin.substring(0, 17);
        String lastpart = cin.substring(21, 26);

        String newcin = firstpart + cableupriser + ltpoleid + lastpart;
        return newcin;
    }

    public String getLtpoleid(String cin) {
        String ltpoleid;
        if (!StringUtils.isEmpty(cin) && cin != null && cin.length() > 3) {
            ltpoleid = cin.substring(cin.length() - 3);
        } else {
            ltpoleid = cin;
        }
        return ltpoleid;
    }

    public String getUpriser(String cin) {
        String exupriser;
        if (!StringUtils.isEmpty(cin) && cin != null && cin.length() > 1) {
            exupriser = cin.substring(cin.length() - 1);
        } else {
            exupriser = cin;
        }
        return exupriser;
    }

    ////////////////////////////end of update logic
    void populatetarif() {

        tariffList = service.getCustomerTariffRepo().listDate();
        businessList = service.getCustomerBustypeRepo().listDate();
        houseList = service.getCustomerHouseRepo().listDate();
//        List<String> list = service.getCustomerRepo().getUpriserlist();
//        Set<String> set = new TreeSet<>();
//        for (String rs : list) {
//        	System.out.println("Cin..............................................: "+rs);
//            if (rs != null && !rs.isEmpty()) {
//                set.add(getUpriser(rs));
//            }
//        }
//        upriserList.addAll(set);
        tariffList.remove("");
        tariffList.remove(null);
        upriserList.remove("");
        upriserList.remove(null);
        businessList.remove("");
        businessList.remove(" ");
        businessList.remove(null);

        houseList.remove("");
        houseList.remove(" ");
        houseList.remove(null);

    }

    public SelectItem[] getData(List<SelectItem> list) {
        SelectItem[] items = new SelectItem[list.size()];
        int i = 0;
        for (SelectItem rs : list) {
            items[i] = rs;
            i++;
        }
        return items;
    }

    public void updateCustomerData() {
        Customer ct =DtoMapper.maptoCustomer(currentCustomer);
        ct.setDone(true);

        ct.setPastedby(mainCustomer.getPastedby());
        ct.setContractorid(mainCustomer.getContractorid());
        ct.setLongs(mainCustomer.getLongs());
        ct.setLat(mainCustomer.getLat());
        ct.setDatecreated(mainCustomer.getDatecreated());
        ct.setPrintcount(mainCustomer.getPrintcount());
        ct.setLastmodified(new Date());
        ct.setComments(currentCustomer.getComments());
        ct=service.getCustomerRepo().save(ct);
        currentCustomer = DtoMapper.maptoCustomerdto(ct);
        login.printMessage("Customer Data Updated Successfully", AppUtil.SUCCESS, AppUtil.SUCCESS_TAG);
    }

    public void updateCustomerAccountNo() {
        currentCustomer.setCaptureddate(new Date());
        Customer ct =DtoMapper.maptoCustomer(currentCustomer);
        ct.setDone(mainCustomer.getDone());
        ct.setPastedby(mainCustomer.getPastedby());
        ct.setContractorid(mainCustomer.getContractorid());
        ct.setLongs(mainCustomer.getLongs());
        ct.setLat(mainCustomer.getLat());
        ct.setDatecreated(mainCustomer.getDatecreated());
        ct.setDateUploaded(mainCustomer.getDateUploaded());
        ct.setPrintcount(mainCustomer.getPrintcount());
        ct.setCaptureddate(new Date());

        ct=service.getCustomerRepo().save(ct);
        currentCustomer = DtoMapper.maptoCustomerdto(ct);
        login.printMessage("Customer Data Updated Successfully", AppUtil.SUCCESS, AppUtil.SUCCESS_TAG);
    }

    public void updateMaterial() {
        currenthtpole = DtoMapper.maptoPolesdto(service.getPolesRepo().save(DtoMapper.maptoPoles(currenthtpole)));
        login.printMessage(AppUtil.MATERIAL_UPDATED, AppUtil.SUCCESS, AppUtil.SUCCESS_TAG);
    }

    public void updateMaterial2() {
        currentltpole = DtoMapper.maptoLtpolesdto(service.getLtpolesRepo().save(DtoMapper.maptoLtpoles(currentltpole)));
        login.printMessage(AppUtil.MATERIAL_UPDATED, AppUtil.SUCCESS, AppUtil.SUCCESS_TAG);
    }
//    public void updateCustomerData() {
//       currentCustomer =DtoMapper.maptoCustomerdto(service.getCustomerRepo().save(DtoMapper.maptoCustomer(currentCustomer)));
//        appController.printMessage("Record updated", AppUtil.SUCCESS, AppUtil.SUCCESS_TAG);
//    }
/////////change later

    public void updateStruct() {
        currenthtpole = DtoMapper.maptoPolesdto(service.getPolesRepo().save(DtoMapper.maptoPoles(currenthtpole)));
        login.printMessage(AppUtil.STRUCT_UPDATED, AppUtil.SUCCESS, AppUtil.SUCCESS_TAG);
    }
//// change later

    public void updateMaterial(Poleshistorydto rs) {
        service.getPoleshistoryRepo().save(DtoMapper.maptoPoleshistory(rs));
        login.printMessage(AppUtil.MATERIAL_UPDATED, AppUtil.SUCCESS, AppUtil.SUCCESS_TAG);
    }

    public void clearVerification(ActionEvent e) {
        HttpSession session = FacesUtils.getHttpSession(false);
        session.setAttribute("data", null);
        session.setAttribute(Utils.VALIDATED, null);
        session.setAttribute(Utils.HTPOLE, null);
        session.setAttribute("ld", null);
        hthistoryList = new ArrayList<>();
        currenthtpole = new Polesdto();
        customerhistoryList = new ArrayList<>();
        currentCustomer = new Customerdto();
        crht = new Polesdto();
        crlt = new Ltpolesdto();
        poletypelist = new ArrayList<>();
        transformerList = new ArrayList<>();
        feederList = new ArrayList<>();
        districtList = new ArrayList<>();
        cr = new Customerdto();
        upriserList = new ArrayList<>();
        tariffList = new ArrayList<>();
        tflist = new ArrayList<>();
        businessList = new ArrayList<>();
        houseList = new ArrayList<>();
        hthistoryList = new ArrayList<>();
        currenthtpole = new Polesdto();
        customerhistoryList = new ArrayList<>();
        currentCustomer = new Customerdto();
        currentltpole = new Ltpolesdto();
        lthistoryList = new ArrayList<>();

    }

    public void clearCustomerVerification(ActionEvent e) {
        HttpSession session = FacesUtils.getHttpSession(false);
        session.setAttribute("data", null);
        session.setAttribute(Utils.VALIDATED, null);
        session.setAttribute(Utils.CUSTOMER, null);

        hthistoryList = new ArrayList<>();
        currenthtpole = new Polesdto();
        customerhistoryList = new ArrayList<>();
        currentCustomer = new Customerdto();
        crht = new Polesdto();
        crlt = new Ltpolesdto();
        poletypelist = new ArrayList<>();
        transformerList = new ArrayList<>();
        feederList = new ArrayList<>();
        districtList = new ArrayList<>();
        cr = new Customerdto();
        upriserList = new ArrayList<>();
        tariffList = new ArrayList<>();
        tflist = new ArrayList<>();
        businessList = new ArrayList<>();
        houseList = new ArrayList<>();
        hthistoryList = new ArrayList<>();
        currenthtpole = new Polesdto();
        customerhistoryList = new ArrayList<>();
        currentCustomer = new Customerdto();
        currentltpole = new Ltpolesdto();
        lthistoryList = new ArrayList<>();
        try {
            login.getSession().setAttribute("login", null);
            login.getSession().setAttribute("ld", null);
            FacesUtils.getExternalContext().redirect(FacesUtils.getServletContext().getContextPath());
        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }

    public void updatePoles() {
        HttpSession session = FacesUtils.getHttpSession(false);
        Usersdto user = (Usersdto) session.getAttribute(Utils.VERIFIED_USER);
        if (user != null) {
            currenthtpole.setPastedby(user);

        }
        currenthtpole.setDatepasted(new Date());
        currenthtpole = DtoMapper.maptoPolesdto(service.getPolesRepo().save(DtoMapper.maptoPoles(currenthtpole)));
        login.printMessage(AppUtil.UPDATED, AppUtil.SUCCESS, AppUtil.SUCCESS_TAG);
    }

    public void updateLtpoles_v2() {
        HttpSession session = FacesUtils.getHttpSession(false);
        Usersdto user = (Usersdto) session.getAttribute(Utils.VERIFIED_USER);
        if (user != null) {
            currentltpole.setPastedby(user);
        }
        currentltpole.setDatepasted(new Date());
        currentltpole = DtoMapper.maptoLtpolesdto(service.getLtpolesRepo().save(DtoMapper.maptoLtpoles(currentltpole)));
        login.printMessage(AppUtil.UPDATED, AppUtil.SUCCESS, AppUtil.SUCCESS_TAG);
    }

    public void updateLtpoles() {
        currentltpole = DtoMapper.maptoLtpolesdto(service.getLtpolesRepo().save(DtoMapper.maptoLtpoles(currentltpole)));
        login.printMessage(AppUtil.UPDATED, AppUtil.SUCCESS, AppUtil.SUCCESS_TAG);
    }

    public void updateCustomer_v2() {

        Users user = login.loginUser();
        if (user != null) {
            mainCustomer.setPastedby(user);
        }
        mainCustomer.setDone(true);
        mainCustomer.setPasteddate(new Date());
        currentCustomer = DtoMapper.maptoCustomerdto(service.getCustomerRepo()
                .save(mainCustomer));
        login.printMessage(AppUtil.UPDATED, AppUtil.SUCCESS, AppUtil.SUCCESS_TAG);
    }

    public void updateCustomer() {
        Users user = login.loginUser();

        if (cr.getLtpoleid().equals(currentCustomer.getLtpoleid()) && cr.getUpriser().equals(currentCustomer.getUpriser())) {
            Customer ct =DtoMapper.maptoCustomer(currentCustomer);
            ct.setDone(mainCustomer.getDone());
            ct.setPastedby(mainCustomer.getPastedby());
            ct.setContractorid(mainCustomer.getContractorid());
            ct.setLongs(mainCustomer.getLongs());
            ct.setLat(mainCustomer.getLat());
            ct.setDatecreated(mainCustomer.getDatecreated());
            ct.setDateUploaded(mainCustomer.getDateUploaded());
            ct.setPrintcount(mainCustomer.getPrintcount());

            ct=service.getCustomerRepo().save(ct);
            currentCustomer = DtoMapper.maptoCustomerdto(ct);
        } else {
            if (currentCustomer.getUpriser() != null && !currentCustomer.getUpriser().equals("")) {
                currentCustomer.setPasteddate(new Date());
                currentCustomer.setCin(updateCin(currentCustomer.getCin(), currentCustomer.getLtpoleid(),
                        currentCustomer.getUpriser()));
                String result = currentCustomer.getCableUpriserID().substring(0, currentCustomer.getCableUpriserID().length() - 1);
                String total = result + currentCustomer.getUpriser();
                currentCustomer.setCableUpriserID(total);
                String wire = currentCustomer.getCin().substring(0, currentCustomer.getCin().length() - 3);
                currentCustomer.setServiceWireNo(wire);
                Customer ct =DtoMapper.maptoCustomer(currentCustomer);
                ct.setDone(true);
                ct.setPastedby(user);
                ct.setContractorid(mainCustomer.getContractorid());
                ct.setLongs(mainCustomer.getLongs());
                ct.setLat(mainCustomer.getLat());
                ct.setLogindate(new Date());
                ct.setBldcodefinalupdated(mainCustomer.getBldcodefinalupdated());
                ct.setDatecreated(mainCustomer.getDatecreated());
                ct.setPrintcount(mainCustomer.getPrintcount());

                ct=service.getCustomerRepo().save(ct);
                currentCustomer = DtoMapper.maptoCustomerdto(ct);
                service.getCustomerhistoryRepo()
                        .save(DtoMapper.convertToCustomerhistory(cr, true, user.getUsername()));
                DtoMapper.selfCustomerddto(currentCustomer, cr);
            }
        }
        login.printMessage(AppUtil.UPDATED, AppUtil.SUCCESS, AppUtil.SUCCESS_TAG);

    }


    public AppService getService() {
        return service;
    }

    public void setService(AppService service) {
        this.service = service;
    }

    public List<Poleshistorydto> getHthistoryList() {
        return hthistoryList;
    }

    public void setHthistoryList(List<Poleshistorydto> hthistoryList) {
        this.hthistoryList = hthistoryList;
    }

    public Polesdto getCurrenthtpole() {
        return currenthtpole;
    }

    public void setCurrenthtpole(Polesdto currenthtpole) {
        this.currenthtpole = currenthtpole;
    }

    public List<Customerhistorydto> getCustomerhistoryList() {
        return customerhistoryList;
    }

    public void setCustomerhistoryList(List<Customerhistorydto> customerhistoryList) {
        this.customerhistoryList = customerhistoryList;
    }

    public Customerdto getCurrentCustomer() {

        return currentCustomer;
    }

    public void setCurrentCustomer(Customerdto cs) {
        cs.setUpriser(getUpriser(cs.getCableUpriserID()));
        cs.setLtpoleid(getLtpoleid(cs.getLtpoleid()));
        DtoMapper.selfCustomerddto(cs, cr);
        this.currentCustomer = cs;
    }

    public List<SelectItem> getTflist() {
        return tflist;
    }

    public void setTflist(List<SelectItem> tflist) {
        this.tflist = tflist;
    }

    public List<String> getBusinessList() {
        return businessList;
    }

    public void setBusinessList(List<String> businessList) {
        this.businessList = businessList;
    }

    public List<String> getHouseList() {
        return houseList;
    }

    public void setHouseList(List<String> houseList) {
        this.houseList = houseList;
    }

    public List<Ltpoleshistorydto> getLthistoryList() {
        return lthistoryList;
    }

    public void setLthistoryList(List<Ltpoleshistorydto> lthistoryList) {
        this.lthistoryList = lthistoryList;
    }

    public Ltpolesdto getCurrentltpole() {
        return currentltpole;
    }

    public void setCurrentltpole(Ltpolesdto currentltpole) {
        this.currentltpole = currentltpole;
    }

    public List<String> getTariffList() {
        return tariffList;
    }

    public void setTariffList(List<String> tariffList) {
        this.tariffList = tariffList;
    }

    public List<String> getUpriserList() {
        return upriserList;
    }

    public void setUpriserList(List<String> upriserList) {
        this.upriserList = upriserList;
    }

    public Customerdto getCr() {
        return cr;
    }

    public void setCr(Customerdto cr) {
        this.cr = cr;
    }

    public List<String> getTransformerList() {
        return transformerList;
    }

    public void setTransformerList(List<String> transformerList) {
        this.transformerList = transformerList;
    }

    public List<Feeder> getFeederList() {
        return feederList;
    }

    public void setFeederList(List<Feeder> feederList) {
        this.feederList = feederList;
    }

    public List<District> getDistrictList() {
        return districtList;
    }

    public void setDistrictList(List<District> districtList) {
        this.districtList = districtList;
    }

    public List<String> getPoletypelist() {
        return poletypelist;
    }

    public void setPoletypelist(List<String> poletypelist) {
        this.poletypelist = poletypelist;
    }

    public Ltpolesdto getCrlt() {
        return crlt;
    }

    public void setCrlt(Ltpolesdto crlt) {
        this.crlt = crlt;
    }

    public Customer getMainCustomer() {
        return mainCustomer;
    }

    public void setMainCustomer(Customer mainCustomer) {
        this.mainCustomer = mainCustomer;
    }
}
