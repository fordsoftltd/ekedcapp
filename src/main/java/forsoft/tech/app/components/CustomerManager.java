/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forsoft.tech.app.components;

import forsoft.tech.app.model.Building;
import forsoft.tech.app.model.CustomerMeta;
import forsoft.tech.app.service.AppService;
import forsoft.tech.app.utils.BuildingUtils;
import forsoft.tech.app.utils.CustomerUtils;
import forsoft.tech.app.utils.Utils;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
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
                //counter++;
                Row row = iterator.next();
                saveBuilding(row, map);
                System.out.println("Record done ..." + counter++);

            }
            System.out.println("Done with all the record");
        } catch (IOException ex) {
            Logger.getLogger(CustomerManager.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Async("asyncExecutor")
    public void saveCustomer(File f) {
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
                saveCustomer(row, map);
                System.out.println("Record done ..." + counter++);

            }
            System.out.println("Done with all the record");

        } catch (IOException ex) {
            Logger.getLogger(CustomerManager.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    void saveBuilding(Row row, Map<String, Integer> map) {

        Building rs = new Building();

        rs.setAddress(Utils.getData(row, BuildingUtils.ADDRESS, map) + "");
        rs.setAncillaryrole(Utils.getData(row, BuildingUtils.ANCILLARYROLE, map) + "");
        rs.setBldcode(Utils.getData(row, BuildingUtils.BLD_CODE, map) + "");
        rs.setBldcodefinal(Utils.getData(row, BuildingUtils.BLDCODE_FINAL, map) + "");

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
        rs.setVoltagelevelkv(Utils.getData(row, BuildingUtils.VOLTAGELEVELKV, map) + "");

        List<Building> b = service.getBuildingRepo().findByBldcodefinal(rs.getBldcodefinal());
        if (!b.isEmpty()) {
            Building db = b.get(0);
            rs.setId(db.getId());
            rs.setDatemodified(new Date());
        }else{
            rs.setDatecreated(new Date());
        }
        service.getBuildingRepo().save(rs);
    }

    void saveCustomer(Row row, Map<String, Integer> map) {
        CustomerMeta rs = new CustomerMeta();
        rs.setApproximatetotalratingofac(Utils.getData(row, CustomerUtils.APPROXIMATETOTALRATINGOFAC, map) + "");
        rs.setBillingtype(Utils.getData(row, CustomerUtils.BILLINGTYPE, map) + "");
        rs.setBldcode(Utils.getData(row, CustomerUtils.BLD_CODE, map) + "");
        rs.setBldcodefinal(Utils.getData(row, CustomerUtils.BLDCODE_FINAL, map) + "");
        rs.setBuildingcodeid(Utils.getData(row, CustomerUtils.BUILDINGCODEID, map) + "");
        rs.setCableupriserid(Utils.getData(row, CustomerUtils.CABLEUPRISERID, map) + "");
        rs.setCin(Utils.getData(row, CustomerUtils.CIN, map) + "");
        rs.setCity(Utils.getData(row, CustomerUtils.CITY, map) + "");
        rs.setComment(Utils.getData(row, CustomerUtils.COMMENT_, map) + "");
        rs.setConfirmdtid(Utils.getData(row, CustomerUtils.CONFIRM_DT_ID, map) + "");
        rs.setConnectiontype(Utils.getData(row, CustomerUtils.CONNECTIONTYPE, map) + "");
        rs.setCtratio(Utils.getData(row, CustomerUtils.CTRATIO, map) + "");
        rs.setCustomeraccountno(Utils.getData(row, CustomerUtils.CUSTOMERACCOUNTNO, map) + "");
        rs.setCustomernameonbill(Utils.getData(row, CustomerUtils.CUSTOMERNAMEONBILL, map) + "");
        rs.setCustomerno(Utils.getData(row, CustomerUtils.CUSTOMERNO, map) + "");
        rs.setCustomerphoneno(Utils.getData(row, CustomerUtils.CUSTOMERPHONENO, map) + "");
        rs.setCustomerrelationid(Utils.getData(row, CustomerUtils.CUSTOMERRELATIONID, map) + "");
        rs.setCutoutsize(Utils.getData(row, CustomerUtils.CUTOUTSIZE, map) + "");
        rs.setDials(Utils.getData(row, CustomerUtils.DIALS, map) + "");
        rs.setDiscoid(Utils.getData(row, CustomerUtils.DISCOID, map) + "");
        rs.setDistrict(Utils.getData(row, CustomerUtils.DISTRICT, map) + "");
        rs.setDistrictcode(Utils.getData(row, CustomerUtils.DISTRICT_CODE, map) + "");
        rs.setEdservicepointoid(Utils.getData(row, CustomerUtils.EDSERVICEPOINTOID, map) + "");
        rs.setEmailaddress(Utils.getData(row, CustomerUtils.E_MAILADDRESS, map) + "");
        rs.setFeedercode(Utils.getData(row, CustomerUtils.FEEDER_CODE, map) + "");
        rs.setFeederid(Utils.getData(row, CustomerUtils.FEEDERID, map) + "");
        rs.setGpscoordinate(Utils.getData(row, CustomerUtils.GPSCOORDINATE, map) + "");
        rs.setHouseno(Utils.getData(row, CustomerUtils.HOUSENO, map) + "");
        rs.setHtpoleid(Utils.getData(row, CustomerUtils.HTPOLEID, map) + "");
        rs.setInjectionsubstationid(Utils.getData(row, CustomerUtils.INJECTIONSUBSTATIONID, map) + "");
        rs.setLandlordname(Utils.getData(row, CustomerUtils.LANDLORDNAME, map) + "");
        rs.setLandmark(Utils.getData(row, CustomerUtils.LANDMARK, map) + "");
        rs.setLtpoleid(Utils.getData(row, CustomerUtils.LTPOLEID, map) + "");
        rs.setMeterbypass(Utils.getData(row, CustomerUtils.METERBYPASS, map) + "");
        rs.setMeterdesigntype(Utils.getData(row, CustomerUtils.METERDESIGNTYPE, map) + "");
        rs.setMeterreading(Utils.getData(row, CustomerUtils.METERREADING, map) + "");
        rs.setMetersealno(Utils.getData(row, CustomerUtils.METERSEALNO, map) + "");
        rs.setMeterstatus(Utils.getData(row, CustomerUtils.METERSTATUS, map) + "");
        rs.setMetreno(Utils.getData(row, CustomerUtils.METERNO, map) + "");
        rs.setMultiplierfactoronmeter(Utils.getData(row, CustomerUtils.MULTIPLIERFACTORONMETER, map) + "");
        rs.setNatureofuseelectricity(Utils.getData(row, CustomerUtils.NATUREOFUSEELECTRICITY, map) + "");
        rs.setNumberofairconditioner(Utils.getData(row, CustomerUtils.NUMBEROFAIRCONDICTIONER, map) + "");
        rs.setObjectid(Utils.getData(row, CustomerUtils.OBJECTID, map) + "");
        rs.setPhasedesignation(Utils.getData(row, CustomerUtils.PHASEDESIGNATION, map) + "");
        rs.setPlot(Utils.getData(row, CustomerUtils.PLOT, map) + "");
        rs.setPowertransformerid(Utils.getData(row, CustomerUtils.POWERTRANSFORMERID, map) + "");
        rs.setPremisestype(Utils.getData(row, CustomerUtils.PREMISESTYPE, map) + "");
        rs.setPtratio(Utils.getData(row, CustomerUtils.PTRATIO, map) + "");
        rs.setServicewireno(Utils.getData(row, CustomerUtils.SERVICEWIRENO, map) + "");
        rs.setStreet(Utils.getData(row, CustomerUtils.STREET, map) + "");
        rs.setSubdiscoid(Utils.getData(row, CustomerUtils.SUBDISCOID, map) + "");
        rs.setSupplystructureid(Utils.getData(row, CustomerUtils.SUPPLYSTRUCTUREID, map) + "");
        rs.setSupplytype(Utils.getData(row, CustomerUtils.SUPPLYTYPE, map) + "");
        rs.setTariff(Utils.getData(row, CustomerUtils.TARIFF, map) + "");
        rs.setTransformerid(Utils.getData(row, CustomerUtils.TRANSFORMERID, map) + "");
        rs.setTransformername(Utils.getData(row, CustomerUtils.TRANSFORMERNAME, map) + "");

//        List<CustomerMeta> b = service.getCustomerMetaRepo().findByCin(rs.getCin());
//        if (!b.isEmpty()) {
//            CustomerMeta db = b.get(0);
//            rs.setId(db.getId());
//            rs.setLastmodified(new Date());
//
//        } else {
//            rs.setDatecreated(new Date());
//            rs.setLastmodified(new Date());
//        }
//        service.getCustomerMetaRepo().save(rs);
    }
}
