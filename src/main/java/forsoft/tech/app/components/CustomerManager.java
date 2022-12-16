/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forsoft.tech.app.components;

import forsoft.tech.app.model.Building;
import forsoft.tech.app.model.Customer;
import forsoft.tech.app.model.CustomerMeta;
import forsoft.tech.app.service.AppService;
import forsoft.tech.app.utils.BuildingUtils;
import forsoft.tech.app.utils.CustomerUtils;
import forsoft.tech.app.utils.Utils;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

/**
 *
 * @author odofintimothy
 */
@Component
public class CustomerManager {

    @Autowired
    AppService service;

    @Async("asyncExecutor")
    public void save(File f) {
        try {
            FileInputStream inputStream = new FileInputStream(f);
            Workbook workbook = Utils.getWorkbook(inputStream, f.getAbsolutePath());
            Sheet firstSheet = workbook.getSheetAt(0);
            Map<String, Integer> map = Utils.getColumnName(firstSheet);
            Iterator<Row> iterator = firstSheet.iterator();
            iterator.next();
            int totalRow = firstSheet.getLastRowNum();
            int counter = 1;
            while (iterator.hasNext()) {
                counter++;
                Row row = iterator.next();
                saveBuilding(row, map);
                

            }
            System.out.println("Done with all the record:"+counter);
        } catch (IOException ex) {
            Logger.getLogger(CustomerManager.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Async("asyncExecutor")
    public void saveCustomer(File f,String contractor) {
        try {
            FileInputStream inputStream = new FileInputStream(f);
            Workbook workbook = Utils.getWorkbook(inputStream, f.getAbsolutePath());
            Sheet firstSheet = workbook.getSheetAt(0);
            Map<String, Integer> map = Utils.getColumnName(firstSheet);
            Iterator<Row> iterator = firstSheet.iterator();
            iterator.next();
            int totalRow = firstSheet.getLastRowNum();
            int counter = 1;
            while (iterator.hasNext()) {
                //counter++;
                Row row = iterator.next();
                saveCustomer(row, map,contractor);
                counter++;


            }
            System.out.println("Customer Done with all the record*********************"+counter++);

        } catch (IOException ex) {
            Logger.getLogger(CustomerManager.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    void saveBuilding(Row row, Map<String, Integer> map) {

        Building rs = new Building();

        rs.setAddress(Utils.getData(row, BuildingUtils.ADDRESS, map) + "");
//        rs.setOldBuildingCode(Utils.getData(row, BuildingUtils.OLD_BUILDING_CODE_UPDATE, map) + "");
        rs.setAncillaryrole(Utils.getData(row, BuildingUtils.ANCILLARYROLE, map) + "");
        rs.setBldcode(Utils.getData(row, BuildingUtils.BLD_CODE, map) + "");
        rs.setBldcodefinal(Utils.getData(row, BuildingUtils.BLDCODE_FINAL, map) + "");
        rs.setBuilding_code_updated(Utils.getData(row, BuildingUtils.BLDCODE_FINAL_UPDATED, map) + "");
        rs.setLongitude(Utils.getData(row, BuildingUtils.LONGITUDE, map) + "");
        rs.setLatitude(Utils.getData(row, BuildingUtils.LATITUDE, map) + "");
        rs.setFeedername(Utils.getData(row, BuildingUtils.FEEDER_NAME, map) + "");

        rs.setCableupriserid(Utils.getData(row, BuildingUtils.CABLEUPRISERID, map) + "");
        rs.setComments(Utils.getData(row, BuildingUtils.COMMENTS, map) + "");
        rs.setConnectiontype(Utils.getData(row, BuildingUtils.CONNECTIONTYPE, map) + "");
        rs.setConsultant(Utils.getData(row, BuildingUtils.CONSULTANT, map) + "");
        rs.setContractor(Utils.getData(row, BuildingUtils.CONTRACTOR, map) + "");
        rs.setCreationuser(Utils.getData(row, BuildingUtils.CREATIONUSER, map) + "");
        rs.setCustomerrelationid(Utils.getData(row, BuildingUtils.CUSTOMERRELATIONID, map) + "");
        rs.setCutoutsize(Utils.getData(row, BuildingUtils.CUTOUTSIZE, map) + "");
        rs.setDatasource(Utils.getData(row, BuildingUtils.DATASOURCE, map) + "");
        rs.setDemanddkw(Utils.getData(row, BuildingUtils.DEMANDKW, map) + "");
        rs.setDistrictcode(Utils.getData(row, BuildingUtils.DISTRICT_CODE, map) + "");
        rs.setEdservicepointoid(Utils.getData(row, BuildingUtils.EDSERVICEPOINTOID, map) + "");
        rs.setElectrictraceweight(Utils.getData(row, BuildingUtils.ELECTRICTRACEWEIGHT, map) + "");
        rs.setEnabled(Utils.getData(row, BuildingUtils.ENABLED, map) + "");
        rs.setEnergizationdate(Utils.getData(row, BuildingUtils.ENERGIZATIONDATE, map) + "");
        rs.setFacilityid(Utils.getData(row, BuildingUtils.FACILITYID, map) + "");
        rs.setFeedercode(Utils.getData(row, BuildingUtils.FEEDER_CODE, map) + "");

        rs.setFeederid(Utils.getData(row, BuildingUtils.FEEDERID, map) + "");
        rs.setFeederid2(Utils.getData(row, BuildingUtils.FEEDERID2, map) + "");
        rs.setFeederinfo(Utils.getData(row, BuildingUtils.FEEDERINFO, map) + "");
        rs.setHyperlink(Utils.getData(row, BuildingUtils.HYPERLINK, map) + "");
        rs.setInstallationdate(Utils.getData(row, BuildingUtils.INSTALLATIONDATE, map) + "");
        rs.setLastmaintenancedate(Utils.getData(row, BuildingUtils.LASTMAINTENANCEDATE, map) + "");
        rs.setLastuser(Utils.getData(row, BuildingUtils.LASTUSER, map) + "");
        rs.setLocationid(Utils.getData(row, BuildingUtils.LOCATIONID, map) + "");
        rs.setLtpoleid(Utils.getData(row, BuildingUtils.LTPOLEID, map) + "");
        rs.setObjectid(Utils.getData(row, BuildingUtils.OBJECTID, map) + "");
        rs.setOperatingvoltage(Utils.getData(row, BuildingUtils.OPERATINGVOLTAGE, map) + "");
        rs.setPhasedesignation(Utils.getData(row, BuildingUtils.PHASEDESIGNATION, map) + "");
        rs.setServicecurrentrating(Utils.getData(row, BuildingUtils.SERVICECURRENTRATING, map) + "");
        rs.setServicewireno(Utils.getData(row, BuildingUtils.SERVICEWIRENO, map) + "");
        rs.setStatus(Utils.getData(row, BuildingUtils.STATUS, map) + "");
        rs.setSubtypecd(Utils.getData(row, BuildingUtils.SUBTYPECD, map) + "");
        rs.setSymbolrotation(Utils.getData(row, BuildingUtils.SYMBOLROTATION, map) + "");
        rs.setTransformername(Utils.getData(row, BuildingUtils.TRANSFORMERNAME, map) + "");
        rs.setBuilding_code_updated(Utils.getData(row, BuildingUtils.BUILDING_CODE_NEW, map) + "");
        rs.setBuname(Utils.getData(row, BuildingUtils.BU_NAME, map) + "");
        rs.setCapturedate(Utils.getData(row, BuildingUtils.CAPTURE_DATE, map) + "");
        rs.setCapturename(Utils.getData(row, BuildingUtils.CAPTURE_NAME, map) + "");
        rs.setConntype(Utils.getData(row, BuildingUtils.CONN_TYPE, map) + "");
        rs.setSrv_wire_no(Utils.getData(row, BuildingUtils.SRV_WIRE_NO, map) + "");
        rs.setSrvwiresize(Utils.getData(row, BuildingUtils.SRV_WIRE_SIZE, map) + "");
        rs.setBldgid(Utils.getData(row, BuildingUtils.BLDG_ID, map) + "");
        rs.setBldgusage(Utils.getData(row, BuildingUtils.BLDG_USAGE, map) + "");
        rs.setHt_pole_id(Utils.getData(row, BuildingUtils.HT_POLE_ID, map) + "");
        rs.setUpriserno(Utils.getData(row, BuildingUtils.UPRISER_NO, map) + "");
        rs.setBuildingstatus(Utils.getData(row, BuildingUtils.BUILDINGSTATUS, map) + "");
        rs.setBuildingtype(Utils.getData(row, BuildingUtils.BUILDINGTYPE, map) + "");
        rs.setHouseno(Utils.getData(row, BuildingUtils.HOUSENO, map) + "");
        rs.setFeedername(Utils.getData(row, BuildingUtils.FEEDER_NAME, map) + "");

        rs.setVoltagelevelkv(Utils.getData(row, BuildingUtils.VOLTAGELEVELKV, map) + "");

        List<Building> b = service.getBuildingRepo().findByBldcodefinal(rs.getBuilding_code_updated());
        if (!b.isEmpty()) {
            Building db = b.get(0);
            rs.setId(db.getId());
            rs.setDatemodified(new Date());
            rs.setDatecreated(new Date());
            rs.setContractor("HAFMANI");

        }else{
            rs.setDatecreated(new Date());
         rs.setContractor("HAFMANI");
                     rs.setDone(false);

        }
        service.getBuildingRepo().save(rs);
    }


    @Async("asyncExecutor")
    public void updateCustomer(File f, String contractor) {
        try {
            FileInputStream inputStream = new FileInputStream(f);
            Workbook workbook = Utils.getWorkbook(inputStream, f.getAbsolutePath());
            Sheet firstSheet = workbook.getSheetAt(0);
            Map<String, Integer> map = Utils.getColumnName(firstSheet);
            Iterator<Row> iterator = firstSheet.iterator();
            iterator.next();
            int totalRow = firstSheet.getLastRowNum();
            int counter = 1;
            while (iterator.hasNext()) {
                //counter++;
                Row row = iterator.next();
                updateCustomer(row, map,contractor);
                counter++;


            }
            System.out.println("Customer Done with all the record*********************"+counter++);

        } catch (IOException ex) {
            Logger.getLogger(CustomerManager.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    void saveCustomer(Row row, Map<String, Integer> map, String contractor) {
        Customer rs = new Customer();
        rs.setDistrictName(Utils.getData(row, CustomerUtils.DISTRICT, map) + "");
        rs.setStatus(Utils.getData(row, CustomerUtils.STATUS, map) + "");
        rs.setBldcode(Utils.getData(row, CustomerUtils.BLD_CODE, map) + "");
        rs.setBldcodefinal(Utils.getData(row, CustomerUtils.BLDCODE_FINAL, map) + "");
        rs.setBldcodefinalupdated(Utils.getData(row, CustomerUtils.BLDCODE_FINAL, map) + "");
        rs.setActualtariff(Utils.getData(row, CustomerUtils.ActualTariff, map) + "");
        rs.setAddressonbill(Utils.getData(row, CustomerUtils.AddressOnBill, map) + "");
        rs.setApproximatetotalratingofac(Utils.getData(row, CustomerUtils.APPROXIMATETOTALRATINGOFAC, map) + "");
        rs.setBillingtype(Utils.getData(row, CustomerUtils.BILLINGTYPE, map) + "");
        rs.setBuildingcodeid(Utils.getData(row, CustomerUtils.BuildingCodeID, map) + "");
        rs.setCustomernameonbill(Utils.getData(row, CustomerUtils.CUSTOMERNAMEonBILL, map) + "");
        rs.setCustomeraccountno(Utils.getData(row, CustomerUtils.CustomerACCOUNTNO, map) + "");
        rs.setCustomerid(Utils.getData(row, CustomerUtils.CustomerID, map) + "");
        rs.setCustomerrelationid(Utils.getData(row, CustomerUtils.CustomerRelationID, map) + "");
        rs.setCustomernumber(Utils.getData(row, CustomerUtils.CUSTOMERNUMBER, map) + "");
        rs.setCustomerphoneno(Utils.getData(row, CustomerUtils.CUSTOMERPHONENO, map) + "");
        rs.setCutoutsize(Utils.getData(row, CustomerUtils.CUTOUTSIZE, map) + "");
        rs.setCableupriserid(Utils.getData(row, CustomerUtils.CableUpriserID, map) + "");
        rs.setCallbackno(Utils.getData(row, CustomerUtils.CALL_BACK_NO, map) + "");
        rs.setCin(Utils.getData(row, CustomerUtils.CIN, map) + "");
        rs.setCity(Utils.getData(row, CustomerUtils.CITY, map) + "");
        rs.setComment(Utils.getData(row, CustomerUtils.COMMENT, map) + "");
        rs.setConnectiontype(Utils.getData(row, CustomerUtils.ConnectionType, map) + "");
        rs.setCtratio(Utils.getData(row, CustomerUtils.CTRATIO, map) + "");
        rs.setDials(Utils.getData(row, CustomerUtils.DIALS, map) + "");
        rs.setDiscoid(Utils.getData(row, CustomerUtils.DiscoID, map) + "");
        rs.setDone(false);
        rs.setEdservicepointoid(Utils.getData(row, CustomerUtils.EDServicePointOID, map) + "");
        rs.setEmailaddress(Utils.getData(row, CustomerUtils.EMAILADDRESS, map) + "");
        rs.setFeedername(Utils.getData(row, CustomerUtils.FeederName, map) + "");
        rs.setFeederid(Utils.getData(row, CustomerUtils.FEEDERID, map) + "");
        rs.setGpscoordinate(Utils.getData(row, CustomerUtils.GPSCOORDINATE, map) + "");
        rs.setHtpoleid(Utils.getData(row, CustomerUtils.HTPoleID, map) + "");
        rs.setHouseno(Utils.getData(row, CustomerUtils.HouseNo, map) + "");
        rs.setInjectionsubstationid(Utils.getData(row, CustomerUtils.INJECTIONSUBSTATIONID, map) + "");
        rs.setNameofdatacapturer(Utils.getData(row, CustomerUtils.NAME_OF_DATA_CAPTURER, map) + "");
        rs.setNatureofuseelectricity(Utils.getData(row, CustomerUtils.NatureOfUseElectricity, map) + "");
        rs.setNumberofaircondictioner(Utils.getData(row, CustomerUtils.NUMBEROFAIRCONDICTIONER, map) + "");
        rs.setMeterbypass(Utils.getData(row, CustomerUtils.METERBYPASS, map) + "");
        rs.setMeterdesigntype(Utils.getData(row, CustomerUtils.METERDESIGNTYPE, map) + "");
        rs.setMeterno(Utils.getData(row, CustomerUtils.METERNO, map) + "");
        rs.setMeterreading(Utils.getData(row, CustomerUtils.METERREADING, map) + "");
        rs.setMetersealno(Utils.getData(row, CustomerUtils.METERSEALNO, map) + "");
        rs.setMeterstatus(Utils.getData(row, CustomerUtils.METERSTATUS, map) + "");
        rs.setMultiplierfactoronmeter(Utils.getData(row, CustomerUtils.MULTIPLIERFACTORONMETER, map) + "");
        rs.setPhasedesignation(Utils.getData(row, CustomerUtils.PHASEDESIGNATION, map) + "");
        rs.setPhysicaladdress(Utils.getData(row, CustomerUtils.Physical_Address, map) + "");
        rs.setPlot(Utils.getData(row, CustomerUtils.PLOT, map) + "");
        rs.setPowertrasformerid(Utils.getData(row, CustomerUtils.PowerTrasformerID, map) + "");
        rs.setPremisestype(Utils.getData(row, CustomerUtils.PREMISESTYPE, map) + "");
        rs.setPrintcount(0);
        rs.setPrinted(true);
        rs.setPtratio(Utils.getData(row, CustomerUtils.PTRATIO, map) + "");
        rs.setServicewireno(Utils.getData(row, CustomerUtils.ServiceWireNo, map) + "");
        rs.setStreet(Utils.getData(row, CustomerUtils.Street, map) + "");
        rs.setSubdiscoid(Utils.getData(row, CustomerUtils.SUBDISCOID, map) + "");
        rs.setSupplystructureid(Utils.getData(row, CustomerUtils.SUPPLYSTRUCTUREID, map) + "");
        rs.setSupplytype(Utils.getData(row, CustomerUtils.SUPPLYTYPE, map) + "");
        rs.setTariff(Utils.getData(row, CustomerUtils.TARIFF, map) + "");
        rs.setTransfomerid(Utils.getData(row, CustomerUtils.TransfomerID, map) + "");
        rs.setTransformername(Utils.getData(row, CustomerUtils.TRANSFORMERNAME, map) + "");
        rs.setLandlordname(Utils.getData(row, CustomerUtils.LANDLORDNAME, map) + "");
        rs.setLandmark(Utils.getData(row, CustomerUtils.landmark, map) + "");
        rs.setLat(Utils.getData(row, CustomerUtils.LAT, map) + "");
        rs.setLongs(Utils.getData(row, CustomerUtils.LONG, map) + "");
        rs.setLtpoleid(Utils.getData(row, CustomerUtils.LTPOLEID, map) + "");
        rs.setContractorid(contractor);

        List<Customer> b = service.getCustomerRepo().findByCin(rs.getCin());
        if (!b.isEmpty()) {
            Customer db = b.get(0);
            rs.setId(db.getId());
            rs.setLastmodified(new Date());
            rs.setDone(db.getDone());
            rs.setPastedby(db.getPastedby());
            rs.setPrintcount(db.getPrintcount());
            rs.setPrinted(db.getPrinted());
            rs.setDone(db.getDone());
            rs.setId(db.getId());
            rs.setPasteddate(db.getPasteddate());
            rs.setLogindate(db.getLogindate());
            rs.setDateUploaded(db.getDateUploaded()==null?new Date():db.getDateUploaded());
            rs.setLastmodified(new Date());

        } else {
            rs.setDatecreated(new Date());
            rs.setLastmodified(new Date());
            rs.setDateUploaded(new Date());
            rs.setDone(false);
        }
        service.getCustomerRepo().save(rs);
    }

    void updateCustomer(Row row, Map<String, Integer> map, String contractor) {
        Customer rs = new Customer();
        rs.setDistrictName(Utils.getData(row, CustomerUtils.DISTRICT, map) + "");
        rs.setStatus(Utils.getData(row, CustomerUtils.STATUS, map) + "");
        rs.setBldcode(Utils.getData(row, CustomerUtils.BLD_CODE, map) + "");
        rs.setBldcodefinal(Utils.getData(row, CustomerUtils.BLDCODE_FINAL, map) + "");
        rs.setBldcodefinalupdated(Utils.getData(row, CustomerUtils.BLDCODE_FINAL, map) + "");
        rs.setActualtariff(Utils.getData(row, CustomerUtils.ActualTariff, map) + "");
        rs.setAddressonbill(Utils.getData(row, CustomerUtils.AddressOnBill, map) + "");
        rs.setApproximatetotalratingofac(Utils.getData(row, CustomerUtils.APPROXIMATETOTALRATINGOFAC, map) + "");
        rs.setBillingtype(Utils.getData(row, CustomerUtils.BILLINGTYPE, map) + "");
        rs.setBuildingcodeid(Utils.getData(row, CustomerUtils.BuildingCodeID, map) + "");
        rs.setCustomernameonbill(Utils.getData(row, CustomerUtils.CUSTOMERNAMEonBILL, map) + "");
        rs.setCustomeraccountno(Utils.getData(row, CustomerUtils.CustomerACCOUNTNO, map) + "");
        rs.setCustomerid(Utils.getData(row, CustomerUtils.CustomerID, map) + "");
        rs.setCustomerrelationid(Utils.getData(row, CustomerUtils.CustomerRelationID, map) + "");
        rs.setCustomernumber(Utils.getData(row, CustomerUtils.CUSTOMERNUMBER, map) + "");
        rs.setCustomerphoneno(Utils.getData(row, CustomerUtils.CUSTOMERPHONENO, map) + "");
        rs.setCutoutsize(Utils.getData(row, CustomerUtils.CUTOUTSIZE, map) + "");
        rs.setCableupriserid(Utils.getData(row, CustomerUtils.CableUpriserID, map) + "");
        rs.setCallbackno(Utils.getData(row, CustomerUtils.CALL_BACK_NO, map) + "");
        rs.setCin(Utils.getData(row, CustomerUtils.CIN, map) + "");
        rs.setCity(Utils.getData(row, CustomerUtils.CITY, map) + "");
        rs.setComment(Utils.getData(row, CustomerUtils.COMMENT, map) + "");
        rs.setConnectiontype(Utils.getData(row, CustomerUtils.ConnectionType, map) + "");
        rs.setCtratio(Utils.getData(row, CustomerUtils.CTRATIO, map) + "");
        rs.setDials(Utils.getData(row, CustomerUtils.DIALS, map) + "");
        rs.setDiscoid(Utils.getData(row, CustomerUtils.DiscoID, map) + "");
        rs.setDone(false);
        rs.setEdservicepointoid(Utils.getData(row, CustomerUtils.EDServicePointOID, map) + "");
        rs.setEmailaddress(Utils.getData(row, CustomerUtils.EMAILADDRESS, map) + "");
        rs.setFeedername(Utils.getData(row, CustomerUtils.FeederName, map) + "");
        rs.setFeederid(Utils.getData(row, CustomerUtils.FEEDERID, map) + "");
        rs.setGpscoordinate(Utils.getData(row, CustomerUtils.GPSCOORDINATE, map) + "");
        rs.setHtpoleid(Utils.getData(row, CustomerUtils.HTPoleID, map) + "");
        rs.setHouseno(Utils.getData(row, CustomerUtils.HouseNo, map) + "");
        rs.setInjectionsubstationid(Utils.getData(row, CustomerUtils.INJECTIONSUBSTATIONID, map) + "");
        rs.setNameofdatacapturer(Utils.getData(row, CustomerUtils.NAME_OF_DATA_CAPTURER, map) + "");
        rs.setNatureofuseelectricity(Utils.getData(row, CustomerUtils.NatureOfUseElectricity, map) + "");
        rs.setNumberofaircondictioner(Utils.getData(row, CustomerUtils.NUMBEROFAIRCONDICTIONER, map) + "");
        rs.setMeterbypass(Utils.getData(row, CustomerUtils.METERBYPASS, map) + "");
        rs.setMeterdesigntype(Utils.getData(row, CustomerUtils.METERDESIGNTYPE, map) + "");
        rs.setMeterno(Utils.getData(row, CustomerUtils.METERNO, map) + "");
        rs.setMeterreading(Utils.getData(row, CustomerUtils.METERREADING, map) + "");
        rs.setMetersealno(Utils.getData(row, CustomerUtils.METERSEALNO, map) + "");
        rs.setMeterstatus(Utils.getData(row, CustomerUtils.METERSTATUS, map) + "");
        rs.setMultiplierfactoronmeter(Utils.getData(row, CustomerUtils.MULTIPLIERFACTORONMETER, map) + "");
        rs.setPhasedesignation(Utils.getData(row, CustomerUtils.PHASEDESIGNATION, map) + "");
        rs.setPhysicaladdress(Utils.getData(row, CustomerUtils.Physical_Address, map) + "");
        rs.setPlot(Utils.getData(row, CustomerUtils.PLOT, map) + "");
        rs.setPowertrasformerid(Utils.getData(row, CustomerUtils.PowerTrasformerID, map) + "");
        rs.setPremisestype(Utils.getData(row, CustomerUtils.PREMISESTYPE, map) + "");
        rs.setPrintcount(0);
        rs.setPrinted(false);
        rs.setPtratio(Utils.getData(row, CustomerUtils.PTRATIO, map) + "");
        rs.setServicewireno(Utils.getData(row, CustomerUtils.ServiceWireNo, map) + "");
        rs.setStreet(Utils.getData(row, CustomerUtils.Street, map) + "");
        rs.setSubdiscoid(Utils.getData(row, CustomerUtils.SUBDISCOID, map) + "");
        rs.setSupplystructureid(Utils.getData(row, CustomerUtils.SUPPLYSTRUCTUREID, map) + "");
        rs.setSupplytype(Utils.getData(row, CustomerUtils.SUPPLYTYPE, map) + "");
        rs.setTariff(Utils.getData(row, CustomerUtils.TARIFF, map) + "");
        rs.setTransfomerid(Utils.getData(row, CustomerUtils.TransfomerID, map) + "");
        rs.setTransformername(Utils.getData(row, CustomerUtils.TRANSFORMERNAME, map) + "");
        rs.setLandlordname(Utils.getData(row, CustomerUtils.LANDLORDNAME, map) + "");
        rs.setLandmark(Utils.getData(row, CustomerUtils.landmark, map) + "");
        rs.setLat(Utils.getData(row, CustomerUtils.LAT, map) + "");
        rs.setLongs(Utils.getData(row, CustomerUtils.LONG, map) + "");
        rs.setLtpoleid(Utils.getData(row, CustomerUtils.LTPOLEID, map) + "");
        rs.setContractorid(contractor);

        List<Customer> b = service.getCustomerRepo().findByAccountNumber(rs.getCustomeraccountno());
        if (!b.isEmpty()) {
            Customer db = b.get(0);
            rs.setId(db.getId());
            rs.setLastmodified(new Date());
            rs.setDone(db.getDone());
            rs.setPastedby(db.getPastedby());
            rs.setPrintcount(db.getPrintcount());
            rs.setPrinted(db.getPrinted());
            rs.setDone(db.getDone());
            rs.setId(db.getId());
            rs.setPasteddate(db.getPasteddate());
            rs.setLogindate(db.getLogindate());
            rs.setDateUploaded(db.getDateUploaded());
            rs.setLastmodified(new Date());

        } else {
            rs.setDatecreated(new Date());
            rs.setLastmodified(new Date());
            rs.setDateUploaded(new Date());
            rs.setDone(false);
        }
        if(rs.getStatus() !=null && !rs.getStatus().trim().equalsIgnoreCase("NEW TAG")){
            Calendar cl = Calendar.getInstance();
            cl.add(Calendar.YEAR,-3);
            rs.setDatecreated(cl.getTime());
            rs.setLastmodified(new Date());
            rs.setDateUploaded(cl.getTime());
        }
        if(!doneFeeders().contains(rs.getFeedername().toUpperCase()) && rs.getStatus().equalsIgnoreCase("NEW TAG")){
            rs.setLogindate(null);
            rs.setDone(false);
            rs.setPastedby(null);
            rs.setPasteddate(null);
        }
        service.getCustomerRepo().save(rs);
    }
    LinkedList<String> doneFeeders(){
        return new LinkedList<>(Arrays.asList("ADMIRALTY","JAZZ 38","VGC ROAD 2","SPG","VGC ROAD 3",
                "VGC ROAD 4","IKOTA PRECAST FEEDER"));

    }
}
