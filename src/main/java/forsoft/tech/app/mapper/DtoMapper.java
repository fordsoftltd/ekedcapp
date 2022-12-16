/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forsoft.tech.app.mapper;

import forsoft.tech.app.dto.*;
import forsoft.tech.app.model.*;
import org.apache.poi.ss.usermodel.DateUtil;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

/**
 *
 *
 */
public class DtoMapper {
////////////////dashboard object mapping

    public static List<Rawdata> maptoRawLtpoledata(List<Ltpolesviewraw> mapfrom) {
        
        List<Rawdata> list = new ArrayList<>();
        mapfrom.stream().forEach(rs -> {
            Rawdata data = new Rawdata();
            data.setContractorid(rs.getContractorid());
            data.setDatepasted(rs.getDatepasted());
            data.setFullname(rs.getFullname());
            data.setId(rs.getId());
            data.setLogindate(rs.getLogindate());
            data.setStaffid(rs.getStaffid());
            data.setUserid(rs.getUserid());
            data.setUsername(rs.getUsername());
            list.add(data);
        });
        return list;
    }

    public static List<Rawdata> maptoRawHtpoledata(List<Htpolesviewraw> mapfrom) {
        
        List<Rawdata> list = new ArrayList<>();
        mapfrom.stream().forEach(rs -> {
            Rawdata data = new Rawdata();
            data.setContractorid(rs.getContractorid());
            data.setDatepasted(rs.getDatepasted());
            data.setFullname(rs.getFullname());
            data.setId(rs.getId());
            data.setLogindate(rs.getLogindate());
            data.setStaffid(rs.getStaffid());
            data.setUserid(rs.getUserid());
            data.setUsername(rs.getUsername());
            list.add(data);
        });
        return list;
    }

    public static List<Rawdata> maptoRawCustomerdata(List<Customerviewraw> mapfrom) {
        
        List<Rawdata> list = new ArrayList<>();
        mapfrom.stream().forEach(rs -> {
            Rawdata data = new Rawdata();
            data.setContractorid(rs.getContractorid());
            data.setDatepasted(rs.getDatepasted());
            data.setFullname(rs.getFullname());
            data.setId(rs.getId());
            data.setLogindate(rs.getLogindate());
            data.setStaffid(rs.getStaffid());
            data.setUserid(rs.getUserid());
            data.setUsername(rs.getUsername());
            list.add(data);
        });
        return list;
    }
    
    public static List<Contractors> maptoContractorsCustomer(List<Customercontractor> mapfrom) {
        if (mapfrom == null) {
            return null;
        }
        List<Contractors> list = new ArrayList<>();
        mapfrom.stream().forEach(rs -> {
            Contractors ct = new Contractors();
            ct.setContractorid(rs.getContractorid());
            ct.setDone(rs.getDone());
            ct.setId(rs.getId());
            ct.setNotdone(rs.getNotdone());
            ct.setTotal(rs.getTotal());
            list.add(ct);
        });
        return list;
    }

    public static List<Contractors> maptoContractorsHtpole(List<Htpolescontractor> mapfrom) {
        if (mapfrom == null) {
            return null;
        }
        List<Contractors> list = new ArrayList<>();
        mapfrom.stream().forEach(rs -> {
            Contractors ct = new Contractors();
            ct.setContractorid(rs.getContractorid());
            ct.setDone(rs.getDone());
            ct.setId(rs.getId());
            ct.setNotdone(rs.getNotdone());
            ct.setTotal(rs.getTotal());
            list.add(ct);
        });
        return list;
    }

    public static List<Contractors> maptoContractorsLtpole(List<Ltpolescontractor> mapfrom) {
        if (mapfrom == null) {
            return null;
        }
        List<Contractors> list = new ArrayList<>();
        mapfrom.stream().forEach(rs -> {
            Contractors ct = new Contractors();
            ct.setContractorid(rs.getContractorid());
            ct.setDone(rs.getDone());
            ct.setId(rs.getId());
            ct.setNotdone(rs.getNotdone());
            ct.setTotal(rs.getTotal());
            list.add(ct);
        });
        return list;
    }

    public static List<Progressmodel> maptoHtpoleDashboard(List<Polesview> mapfrom) {
        if (mapfrom == null) {
            return null;
        }
        List<Progressmodel> list = new ArrayList<>();
        mapfrom.stream().forEach((rs) -> {
            Progressmodel p = new Progressmodel();
            p.setFrequency(rs.getFrequency());
            p.setFullname(rs.getFullname());
            p.setId(rs.getId());
            p.setUsername(rs.getUsername());
            p.setDatepasted(rs.getDatepasted());
            p.setContractorid(rs.getContractorid());
            list.add(p);
        });
        return list;
    }
    
    public static List<Progressmodel> maptoLtpoleDashboard(List<Ltpolesview> mapfrom) {
        if (mapfrom == null) {
            return null;
        }
        List<Progressmodel> list = new ArrayList<>();
        mapfrom.stream().forEach((rs) -> {
            Progressmodel p = new Progressmodel();
            p.setFrequency(rs.getFrequency());
            p.setFullname(rs.getFullname());
            p.setId(rs.getId());
            p.setUsername(rs.getUsername());
            p.setDatepasted(rs.getDatepasted());
            p.setContractorid(rs.getContractorid());
            list.add(p);
        });
        return list;
    }
    
    public static List<Progressmodel> maptoCustomerDashboard(List<Customerview> mapfrom) {
        if (mapfrom == null) {
            return null;
        }
        List<Progressmodel> list = new ArrayList<>();
        mapfrom.stream().forEach((rs) -> {
            Progressmodel p = new Progressmodel();
            p.setFrequency(rs.getFrequency());
            p.setFullname(rs.getFullname());
            p.setId(rs.getId());
            p.setUsername(rs.getUsername());
            p.setDatepasted(rs.getDatepasted());
            p.setContractorid(rs.getContractorid());
            list.add(p);
        });
        return list;
    }

   static String getConvert(String result) {
        String pos[] = result.split("-");
        Calendar cl = Calendar.getInstance();
        cl.set(Calendar.YEAR, Integer.valueOf(pos[0]));
        cl.set(Calendar.MONTH, Integer.valueOf(pos[1]));
        cl.set(Calendar.DAY_OF_MONTH, Integer.valueOf(pos[2]));
        
        Double value = DateUtil.getExcelDate(cl.getTime());
        return value.toString();
    }

    public static Ltpoles maptoLtpoles(Ltpolesdto mapfrom) {
        if (mapfrom == null) {
            return null;
        }
        Ltpoles mapto = new Ltpoles();
        mapto.setContractorid(mapfrom.getContractorid());
        mapto.setLongitude(mapfrom.getLongitude());
        mapto.setLatitude(mapfrom.getLatitude());
        if (mapfrom.getLatitude().contains("-")) {
            mapto.setLatitude(getConvert(mapfrom.getLatitude()));
        }        
        if (mapfrom.getLongitude().contains("-")) {
            mapto.setLongitude(getConvert(mapfrom.getLongitude()));
        }
        
        mapto.setDone(mapfrom.getDone());
        mapto.setPastedby(maptoUsers(mapfrom.getPastedby()));
        mapto.setDatepasted(mapfrom.getDatepasted());
        mapto.setAnchorguyindicator(mapfrom.getAnchorguyindicator());
        mapto.setBasestatus(mapfrom.getBasestatus());
        mapto.setCableupriserid(mapfrom.getCableUpriserID());
        mapto.setComments(mapfrom.getComments());
        mapto.setConnectednetwork(mapfrom.getConnectednetwork());
        mapto.setConsultant(mapfrom.getConsultant());
        mapto.setContractno(mapfrom.getContractno());
        mapto.setContractor(mapfrom.getContractor());
        mapto.setCreationuser(mapfrom.getCreationuser());
        mapto.setCrossarmindicator(mapfrom.getCrossArmIndicator());
        mapto.setCrossarmtiecondition(mapfrom.getCrossArmTieCondition());
        mapto.setCrossarmtype(mapfrom.getCrossArmType());
        mapto.setDangerplateavailability(mapfrom.getDangerplateavailability());
        mapto.setDatasource(mapfrom.getDatasource());
        mapto.setDatecreated(mapfrom.getDatecreated());
        mapto.setDatemodified(mapfrom.getDatemodified());
        mapto.setDatepasted(mapfrom.getDatepasted());
        mapto.setDone(mapfrom.getDone());
        mapto.setEarthingtype(mapfrom.getEarthingtype());
        mapto.setEnabled(mapfrom.getEnabled());
        mapto.setFacilityid(mapfrom.getFacilityid());
        mapto.setFeederid(mapfrom.getFeederid());
        mapto.setFoundationtype(mapfrom.getFoundationtype());
        mapto.setGroundsize(mapfrom.getGroundsize());
        mapto.setGroundconnected(mapfrom.getGroundconnected());
        mapto.setGroundedindicator(mapfrom.getGroundedindicator());
        mapto.setHtsupportstructureno(mapfrom.getHTSupportStructureNO());
        mapto.setHeight(mapfrom.getHeight());
        mapto.setHyperlink(mapfrom.getHyperLink());
        mapto.setId(mapfrom.getId());
        mapto.setInjectionsubstation(mapfrom.getInjectionSubstation());
        mapto.setInstallationdate(mapfrom.getInstallationdate());
        mapto.setInsulatorcleaness(mapfrom.getInsulatorcleaness());
        mapto.setInsulatormaterial(mapfrom.getInsulatormaterial());
        mapto.setInsulatorstatus(mapfrom.getInsulatorstatus());
        mapto.setInsulatortype(mapfrom.getInsulatortype());
        mapto.setManufacturer(mapfrom.getManufacturer());
        mapto.setManufacturingyear(mapfrom.getManufacturingyear());
        mapto.setMaterial(mapfrom.getMaterial());
        mapto.setLtpoleid(mapfrom.getLTPoleID());
        mapto.setLtsupportstructureno(mapfrom.getLTSupportStructureNO());
        mapto.setLandownership(mapfrom.getLandownership());
        mapto.setLastmaintenancedate(mapfrom.getLastmaintenancedate());
        mapto.setLastuser(mapfrom.getLastuser());
        mapto.setLocationid(mapfrom.getLocationID());
        mapto.setPastedby(maptoUsers(mapfrom.getPastedby()));
        mapto.setPolecount(mapfrom.getPolecount());
        mapto.setPolestatus(mapfrom.getPolestatus());
        mapto.setPoletype(mapfrom.getPoletype());
        mapto.setPrint(mapfrom.getPrint());
        mapto.setPrintcount(mapfrom.getPrintcount());
        mapto.setProtectionpinavailability(mapfrom.getProtectionpinavailability());
        mapto.setStatus(mapfrom.getStatus());
        mapto.setStreetlightindicator(mapfrom.getStreetlightindicator());
        mapto.setSubtypecd(mapfrom.getSubtypecd());
        mapto.setSupportstructureid(mapfrom.getSupportStructureID());
        mapto.setSymbolrotation(mapfrom.getSymbolrotation());
        mapto.setTietrapcondition(mapfrom.getTieTrapCondition());
        mapto.setTietrapindicator(mapfrom.getTieTrapIndicator());
        mapto.setTransformer(mapfrom.getTransformer());
        mapto.setTreatmenttype(mapfrom.getTreatmenttype());
        mapto.setLogindate(mapfrom.getLogindate());
        
        return mapto;
    }
    
    public static void selfPoledto(Ltpolesdto mapfrom, Ltpolesdto mapto) {
        mapto.setContractorid(mapfrom.getContractorid());
        mapto.setDone(mapfrom.getDone());
        mapto.setLongitude(mapfrom.getLongitude());
        mapto.setLatitude(mapfrom.getLatitude());
        mapto.setPastedby(mapfrom.getPastedby());
        mapto.setDatepasted(mapfrom.getDatepasted());
        mapto.setAnchorguyindicator(mapfrom.getAnchorguyindicator());
        mapto.setBasestatus(mapfrom.getBasestatus());
        mapto.setCableUpriserID(mapfrom.getCableUpriserID());
        mapto.setComments(mapfrom.getComments());
        mapto.setConnectednetwork(mapfrom.getConnectednetwork());
        mapto.setConsultant(mapfrom.getConsultant());
        mapto.setContractno(mapfrom.getContractno());
        mapto.setContractor(mapfrom.getContractor());
        mapto.setCreationuser(mapfrom.getCreationuser());
        mapto.setCrossArmIndicator(mapfrom.getCrossArmIndicator());
        mapto.setCrossArmTieCondition(mapfrom.getCrossArmTieCondition());
        mapto.setCrossArmType(mapfrom.getCrossArmType());
        mapto.setDangerplateavailability(mapfrom.getDangerplateavailability());
        mapto.setDatasource(mapfrom.getDatasource());
        mapto.setDatecreated(mapfrom.getDatecreated());
        mapto.setDatemodified(mapfrom.getDatemodified());
        mapto.setDatepasted(mapfrom.getDatepasted());
        mapto.setDone(mapfrom.getDone());
        mapto.setEarthingtype(mapfrom.getEarthingtype());
        mapto.setEnabled(mapfrom.getEnabled());
        mapto.setFacilityid(mapfrom.getFacilityid());
        mapto.setFeederid(mapfrom.getFeederid());
        mapto.setFoundationtype(mapfrom.getFoundationtype());
        mapto.setGroundsize(mapfrom.getGroundsize());
        mapto.setGroundconnected(mapfrom.getGroundconnected());
        mapto.setGroundedindicator(mapfrom.getGroundedindicator());
        mapto.setHTSupportStructureNO(mapfrom.getHTSupportStructureNO());
        mapto.setHeight(mapfrom.getHeight());
        mapto.setHyperLink(mapfrom.getHyperLink());
        mapto.setId(mapfrom.getId());
        mapto.setInjectionSubstation(mapfrom.getInjectionSubstation());
        mapto.setInstallationdate(mapfrom.getInstallationdate());
        mapto.setInsulatorcleaness(mapfrom.getInsulatorcleaness());
        mapto.setInsulatormaterial(mapfrom.getInsulatormaterial());
        mapto.setInsulatorstatus(mapfrom.getInsulatorstatus());
        mapto.setInsulatortype(mapfrom.getInsulatortype());
        mapto.setManufacturer(mapfrom.getManufacturer());
        mapto.setManufacturingyear(mapfrom.getManufacturingyear());
        mapto.setMaterial(mapfrom.getMaterial());
        mapto.setLTPoleID(mapfrom.getLTPoleID());
        mapto.setLTSupportStructureNO(mapfrom.getLTSupportStructureNO());
        mapto.setLandownership(mapfrom.getLandownership());
        mapto.setLastmaintenancedate(mapfrom.getLastmaintenancedate());
        mapto.setLastuser(mapfrom.getLastuser());
        mapto.setLocationID(mapfrom.getLocationID());
        mapto.setPastedby(mapfrom.getPastedby());
        mapto.setPolecount(mapfrom.getPolecount());
        mapto.setPolestatus(mapfrom.getPolestatus());
        mapto.setPoletype(mapfrom.getPoletype());
        mapto.setPrint(mapfrom.getPrint());
        mapto.setPrintcount(mapfrom.getPrintcount());
        mapto.setProtectionpinavailability(mapfrom.getProtectionpinavailability());
        mapto.setStatus(mapfrom.getStatus());
        mapto.setStreetlightindicator(mapfrom.getStreetlightindicator());
        mapto.setSubtypecd(mapfrom.getSubtypecd());
        mapto.setSupportStructureID(mapfrom.getSupportStructureID());
        mapto.setSymbolrotation(mapfrom.getSymbolrotation());
        mapto.setTieTrapCondition(mapfrom.getTieTrapCondition());
        mapto.setTieTrapIndicator(mapfrom.getTieTrapIndicator());
        mapto.setTransformer(mapfrom.getTransformer());
        mapto.setTreatmenttype(mapfrom.getTreatmenttype());
        mapto.setLogindate(mapfrom.getLogindate());
    }
    
    public static Ltpolesdto maptoLtpolesdto(Ltpoles mapfrom) {
        if (mapfrom == null) {
            return null;
        }
        Ltpolesdto mapto = new Ltpolesdto();
        mapto.setNewltpoleno(mapfrom.getLtpoleid());
        mapto.setNewupriser(mapfrom.getCableupriserid());
        mapto.setContractorid(mapfrom.getContractorid());
        mapto.setLogindate(mapfrom.getLogindate());
        mapto.setLongitude(mapfrom.getLongitude());
        mapto.setLatitude(mapfrom.getLatitude());
        if (mapfrom.getLatitude().contains("-")) {
            mapto.setLatitude(getConvert(mapfrom.getLatitude()));
        }        
        if (mapfrom.getLongitude().contains("-")) {
            mapto.setLongitude(getConvert(mapfrom.getLongitude()));
        }
        mapto.setDone(mapfrom.getDone());
        mapto.setPastedby(maptoUsersdto(mapfrom.getPastedby()));
        mapto.setDatepasted(mapfrom.getDatepasted());
        mapto.setAnchorguyindicator(mapfrom.getAnchorguyindicator());
        mapto.setBasestatus(mapfrom.getBasestatus());
        mapto.setCableUpriserID(mapfrom.getCableupriserid());
        mapto.setComments(mapfrom.getComments());
        mapto.setConnectednetwork(mapfrom.getConnectednetwork());
        mapto.setConsultant(mapfrom.getConsultant());
        mapto.setContractno(mapfrom.getContractno());
        mapto.setContractor(mapfrom.getContractor());
        mapto.setCreationuser(mapfrom.getCreationuser());
        mapto.setCrossArmIndicator(mapfrom.getCrossarmindicator());
        mapto.setCrossArmTieCondition(mapfrom.getCrossarmtiecondition());
        mapto.setCrossArmType(mapfrom.getCrossarmtype());
        mapto.setDangerplateavailability(mapfrom.getDangerplateavailability());
        mapto.setDatasource(mapfrom.getDatasource());
        mapto.setDatecreated(mapfrom.getDatecreated());
        mapto.setDatemodified(mapfrom.getDatemodified());
        mapto.setDatepasted(mapfrom.getDatepasted());
        mapto.setDone(mapfrom.getDone());
        mapto.setEarthingtype(mapfrom.getEarthingtype());
        mapto.setEnabled(mapfrom.getEnabled());
        mapto.setFacilityid(mapfrom.getFacilityid());
        mapto.setFeederid(mapfrom.getFeederid());
        mapto.setFoundationtype(mapfrom.getFoundationtype());
        mapto.setGroundsize(mapfrom.getGroundsize());
        mapto.setGroundconnected(mapfrom.getGroundconnected());
        mapto.setGroundedindicator(mapfrom.getGroundedindicator());
        mapto.setHTSupportStructureNO(mapfrom.getHtsupportstructureno());
        mapto.setHeight(mapfrom.getHeight());
        mapto.setHyperLink(mapfrom.getHyperlink());
        mapto.setId(mapfrom.getId());
        mapto.setInjectionSubstation(mapfrom.getInjectionsubstation());
        mapto.setInstallationdate(mapfrom.getInstallationdate());
        mapto.setInsulatorcleaness(mapfrom.getInsulatorcleaness());
        mapto.setInsulatormaterial(mapfrom.getInsulatormaterial());
        mapto.setInsulatorstatus(mapfrom.getInsulatorstatus());
        mapto.setInsulatortype(mapfrom.getInsulatortype());
        mapto.setManufacturer(mapfrom.getManufacturer());
        mapto.setManufacturingyear(mapfrom.getManufacturingyear());
        mapto.setMaterial(mapfrom.getMaterial());
        mapto.setLTPoleID(mapfrom.getLtpoleid());
        mapto.setLTSupportStructureNO(mapfrom.getLtsupportstructureno());
        mapto.setLandownership(mapfrom.getLandownership());
        mapto.setLastmaintenancedate(mapfrom.getLastmaintenancedate());
        mapto.setLastuser(mapfrom.getLastuser());
        mapto.setLocationID(mapfrom.getLocationid());
        mapto.setPastedby(maptoUsersdto(mapfrom.getPastedby()));
        mapto.setPolecount(mapfrom.getPolecount());
        mapto.setPolestatus(mapfrom.getPolestatus());
        mapto.setPoletype(mapfrom.getPoletype());
        mapto.setPrint(mapfrom.getPrint());
        mapto.setPrintcount(mapfrom.getPrintcount());
        mapto.setProtectionpinavailability(mapfrom.getProtectionpinavailability());
        mapto.setStatus(mapfrom.getStatus());
        mapto.setStreetlightindicator(mapfrom.getStreetlightindicator());
        mapto.setSubtypecd(mapfrom.getSubtypecd());
        mapto.setSupportStructureID(mapfrom.getSupportstructureid());
        mapto.setSymbolrotation(mapfrom.getSymbolrotation());
        mapto.setTieTrapCondition(mapfrom.getTietrapcondition());
        mapto.setTieTrapIndicator(mapfrom.getTietrapindicator());
        mapto.setTransformer(mapfrom.getTransformer());
        mapto.setTreatmenttype(mapfrom.getTreatmenttype());
        mapto.setLogindate(mapfrom.getLogindate());
        return mapto;
    }
    
    public static List<Ltpolesdto> maptoLtpolesdtoList(List<Ltpoles> mapfrom) {
        if (mapfrom == null) {
            return null;
        }
        List<Ltpolesdto> list = new ArrayList<>();
        mapfrom.forEach((rs) -> {
            list.add(maptoLtpolesdto(rs));
        });
        return list;
    }
    
    public static List<Ltpoles> maptoLtpolesList(List<Ltpolesdto> mapfrom) {
        if (mapfrom == null) {
            return null;
        }
        List<Ltpoles> list = new ArrayList<>();
        mapfrom.forEach((rs) -> {
            list.add(maptoLtpoles(rs));
        });
        return list;
    }
    
    public static Ltpoleshistory convertToLtpolesHistory(Ltpolesdto mapfrom, boolean status, String modifiedby) {
        if (mapfrom == null) {
            return null;
        }
        Ltpoleshistory mapto = new Ltpoleshistory();
        mapto.setContractorid(mapfrom.getContractorid());
        mapto.setLogindate(mapfrom.getLogindate());
        mapto.setLogindate(mapfrom.getLogindate());
        mapto.setLongitude(mapfrom.getLongitude());
        mapto.setLatitude(mapfrom.getLatitude());
        if (mapfrom.getLatitude().contains("-")) {
            mapto.setLatitude(getConvert(mapfrom.getLatitude()));
        }        
        if (mapfrom.getLongitude().contains("-")) {
            mapto.setLongitude(getConvert(mapfrom.getLongitude()));
        }
        mapto.setDone(mapfrom.getDone());
        mapto.setParent(maptoLtpoles(mapfrom));
        mapto.setPastedby(mapfrom.getPastedby() == null ? null : mapfrom.getPastedby().getId());
        mapto.setDatepasted(mapfrom.getDatepasted());
        mapto.setDone(mapfrom.getDone());
        mapto.setDatepasted(mapfrom.getDatepasted());
        mapto.setAnchorguyindicator(mapfrom.getAnchorguyindicator());
        mapto.setBasestatus(mapfrom.getBasestatus());
        mapto.setCableupriserid(mapfrom.getCableUpriserID());
        mapto.setComments(mapfrom.getComments());
        mapto.setConnectednetwork(mapfrom.getConnectednetwork());
        mapto.setConsultant(mapfrom.getConsultant());
        mapto.setContractno(mapfrom.getContractno());
        mapto.setContractor(mapfrom.getContractor());
        mapto.setCreationuser(mapfrom.getCreationuser());
        mapto.setCrossarmindicator(mapfrom.getCrossArmIndicator());
        mapto.setCrossarmtiecondition(mapfrom.getCrossArmTieCondition());
        mapto.setCrossarmtype(mapfrom.getCrossArmType());
        mapto.setDangerplateavailability(mapfrom.getDangerplateavailability());
        mapto.setDatasource(mapfrom.getDatasource());
        mapto.setDatecreated(mapfrom.getDatecreated());
        mapto.setDatemodified(mapfrom.getDatemodified());
        mapto.setDatepasted(mapfrom.getDatepasted());
        mapto.setDone(mapfrom.getDone());
        mapto.setEarthingtype(mapfrom.getEarthingtype());
        mapto.setEnabled(mapfrom.getEnabled());
        mapto.setFacilityid(mapfrom.getFacilityid());
        mapto.setFeederid(mapfrom.getFeederid());
        mapto.setFoundationtype(mapfrom.getFoundationtype());
        mapto.setGroundsize(mapfrom.getGroundsize());
        mapto.setGroundconnected(mapfrom.getGroundconnected());
        mapto.setGroundedindicator(mapfrom.getGroundedindicator());
        mapto.setHtsupportstructureno(mapfrom.getHTSupportStructureNO());
        mapto.setHeight(mapfrom.getHeight());
        mapto.setHyperlink(mapfrom.getHyperLink());
        mapto.setId(mapfrom.getId());
        mapto.setInjectionsubstation(mapfrom.getInjectionSubstation());
        mapto.setInstallationdate(mapfrom.getInstallationdate());
        mapto.setInsulatorcleaness(mapfrom.getInsulatorcleaness());
        mapto.setInsulatormaterial(mapfrom.getInsulatormaterial());
        mapto.setInsulatorstatus(mapfrom.getInsulatorstatus());
        mapto.setInsulatortype(mapfrom.getInsulatortype());
        mapto.setManufacturer(mapfrom.getManufacturer());
        mapto.setManufacturingyear(mapfrom.getManufacturingyear());
        mapto.setMaterial(mapfrom.getMaterial());
        mapto.setLtpoleid(mapfrom.getLTPoleID());
        mapto.setLtsupportstructureno(mapfrom.getLTSupportStructureNO());
        mapto.setLandownership(mapfrom.getLandownership());
        mapto.setLastmaintenancedate(mapfrom.getLastmaintenancedate());
        mapto.setLastuser(mapfrom.getLastuser());
        mapto.setLocationid(mapfrom.getLocationID());
        mapto.setPolecount(mapfrom.getPolecount());
        mapto.setPolestatus(mapfrom.getPolestatus());
        mapto.setPoletype(mapfrom.getPoletype());
        mapto.setPrint(mapfrom.getPrint());
        mapto.setPrintcount(mapfrom.getPrintcount());
        mapto.setProtectionpinavailability(mapfrom.getProtectionpinavailability());
        mapto.setStatus(mapfrom.getStatus());
        mapto.setStreetlightindicator(mapfrom.getStreetlightindicator());
        mapto.setSubtypecd(mapfrom.getSubtypecd());
        mapto.setSupportstructureid(mapfrom.getSupportStructureID());
        mapto.setSymbolrotation(mapfrom.getSymbolrotation());
        mapto.setTietrapcondition(mapfrom.getTieTrapCondition());
        mapto.setTietrapindicator(mapfrom.getTieTrapIndicator());
        mapto.setTransformer(mapfrom.getTransformer());
        mapto.setTreatmenttype(mapfrom.getTreatmenttype());
        return mapto;
    }
    
    public static Ltpoleshistory maptoLtpoleshistory(Ltpoleshistorydto mapfrom) {
        if (mapfrom == null) {
            return null;
        }
        Ltpoleshistory mapto = new Ltpoleshistory();
        mapto.setContractorid(mapfrom.getContractorid());        
        mapto.setLogindate(mapfrom.getLogindate());
        mapto.setLongitude(mapfrom.getLongitude());
        mapto.setLatitude(mapfrom.getLatitude());
        if (mapfrom.getLatitude().contains("-")) {
            mapto.setLatitude(getConvert(mapfrom.getLatitude()));
        }        
        if (mapfrom.getLongitude().contains("-")) {
            mapto.setLongitude(getConvert(mapfrom.getLongitude()));
        }
        mapto.setDone(mapfrom.getDone());
        mapto.setParent(maptoLtpoles(mapfrom.getParent()));
        mapto.setPastedby(mapfrom.getPastedby());
        mapto.setDatepasted(mapfrom.getDatepasted());
        mapto.setAnchorguyindicator(mapfrom.getAnchorguyindicator());
        mapto.setBasestatus(mapfrom.getBasestatus());
        mapto.setCableupriserid(mapfrom.getCableUpriserID());
        mapto.setComments(mapfrom.getComments());
        mapto.setConnectednetwork(mapfrom.getConnectednetwork());
        mapto.setConsultant(mapfrom.getConsultant());
        mapto.setContractno(mapfrom.getContractno());
        mapto.setContractor(mapfrom.getContractor());
        mapto.setCreationuser(mapfrom.getCreationuser());
        mapto.setCrossarmindicator(mapfrom.getCrossArmIndicator());
        mapto.setCrossarmtiecondition(mapfrom.getCrossArmTieCondition());
        mapto.setCrossarmtype(mapfrom.getCrossArmType());
        mapto.setDangerplateavailability(mapfrom.getDangerplateavailability());
        mapto.setDatasource(mapfrom.getDatasource());
        mapto.setDatecreated(mapfrom.getDatecreated());
        mapto.setDatemodified(mapfrom.getDatemodified());
        mapto.setDatepasted(mapfrom.getDatepasted());
        mapto.setDone(mapfrom.getDone());
        mapto.setEarthingtype(mapfrom.getEarthingtype());
        mapto.setEnabled(mapfrom.getEnabled());
        mapto.setFacilityid(mapfrom.getFacilityid());
        mapto.setFeederid(mapfrom.getFeederid());
        mapto.setFoundationtype(mapfrom.getFoundationtype());
        mapto.setGroundsize(mapfrom.getGroundsize());
        mapto.setGroundconnected(mapfrom.getGroundconnected());
        mapto.setGroundedindicator(mapfrom.getGroundedindicator());
        mapto.setHtsupportstructureno(mapfrom.getHTSupportStructureNO());
        mapto.setHeight(mapfrom.getHeight());
        mapto.setHyperlink(mapfrom.getHyperLink());
        mapto.setId(mapfrom.getId());
        mapto.setInjectionsubstation(mapfrom.getInjectionSubstation());
        mapto.setInstallationdate(mapfrom.getInstallationdate());
        mapto.setInsulatorcleaness(mapfrom.getInsulatorcleaness());
        mapto.setInsulatormaterial(mapfrom.getInsulatormaterial());
        mapto.setInsulatorstatus(mapfrom.getInsulatorstatus());
        mapto.setInsulatortype(mapfrom.getInsulatortype());
        mapto.setManufacturer(mapfrom.getManufacturer());
        mapto.setManufacturingyear(mapfrom.getManufacturingyear());
        mapto.setMaterial(mapfrom.getMaterial());
        mapto.setLtpoleid(mapfrom.getLTPoleID());
        mapto.setLtsupportstructureno(mapfrom.getLTSupportStructureNO());
        mapto.setLandownership(mapfrom.getLandownership());
        mapto.setLastmaintenancedate(mapfrom.getLastmaintenancedate());
        mapto.setLastuser(mapfrom.getLastuser());
        mapto.setLocationid(mapfrom.getLocationID());
        mapto.setPolecount(mapfrom.getPolecount());
        mapto.setPolestatus(mapfrom.getPolestatus());
        mapto.setPoletype(mapfrom.getPoletype());
        mapto.setPrint(mapfrom.getPrint());
        mapto.setPrintcount(mapfrom.getPrintcount());
        mapto.setProtectionpinavailability(mapfrom.getProtectionpinavailability());
        mapto.setStatus(mapfrom.getStatus());
        mapto.setStreetlightindicator(mapfrom.getStreetlightindicator());
        mapto.setSubtypecd(mapfrom.getSubtypecd());
        mapto.setSupportstructureid(mapfrom.getSupportStructureID());
        mapto.setSymbolrotation(mapfrom.getSymbolrotation());
        mapto.setTietrapcondition(mapfrom.getTieTrapCondition());
        mapto.setTietrapindicator(mapfrom.getTieTrapIndicator());
        mapto.setTransformer(mapfrom.getTransformer());
        mapto.setTreatmenttype(mapfrom.getTreatmenttype());
        return mapto;
    }
    
    public static Ltpoleshistorydto maptoLtpoleshistorydto(Ltpoleshistory mapfrom) {
        if (mapfrom == null) {
            return null;
        }
        Ltpoleshistorydto mapto = new Ltpoleshistorydto();
        mapto.setContractorid(mapfrom.getContractorid());
        mapto.setLogindate(mapfrom.getLogindate());
        mapto.setLongitude(mapfrom.getLongitude());
        
        mapto.setLatitude(mapfrom.getLatitude());
        if (mapfrom.getLatitude().contains("-")) {
            mapto.setLatitude(getConvert(mapfrom.getLatitude()));
        }        
        if (mapfrom.getLongitude().contains("-")) {
            mapto.setLongitude(getConvert(mapfrom.getLongitude()));
        }
        mapto.setDone(mapfrom.getDone());
        mapto.setParent(maptoLtpolesdto(mapfrom.getParent()));
        mapto.setPastedby(mapfrom.getPastedby());
        mapto.setDatepasted(mapfrom.getDatepasted());
        mapto.setAnchorguyindicator(mapfrom.getAnchorguyindicator());
        mapto.setBasestatus(mapfrom.getBasestatus());
        mapto.setCableUpriserID(mapfrom.getCableupriserid());
        mapto.setComments(mapfrom.getComments());
        mapto.setConnectednetwork(mapfrom.getConnectednetwork());
        mapto.setConsultant(mapfrom.getConsultant());
        mapto.setContractno(mapfrom.getContractno());
        mapto.setContractor(mapfrom.getContractor());
        mapto.setCreationuser(mapfrom.getCreationuser());
        mapto.setCrossArmIndicator(mapfrom.getCrossarmindicator());
        mapto.setCrossArmTieCondition(mapfrom.getCrossarmtiecondition());
        mapto.setCrossArmType(mapfrom.getCrossarmtype());
        mapto.setDangerplateavailability(mapfrom.getDangerplateavailability());
        mapto.setDatasource(mapfrom.getDatasource());
        mapto.setDatecreated(mapfrom.getDatecreated());
        mapto.setDatemodified(mapfrom.getDatemodified());
        mapto.setDatepasted(mapfrom.getDatepasted());
        mapto.setDone(mapfrom.getDone());
        mapto.setEarthingtype(mapfrom.getEarthingtype());
        mapto.setEnabled(mapfrom.getEnabled());
        mapto.setFacilityid(mapfrom.getFacilityid());
        mapto.setFeederid(mapfrom.getFeederid());
        mapto.setFoundationtype(mapfrom.getFoundationtype());
        mapto.setGroundsize(mapfrom.getGroundsize());
        mapto.setGroundconnected(mapfrom.getGroundconnected());
        mapto.setGroundedindicator(mapfrom.getGroundedindicator());
        mapto.setHTSupportStructureNO(mapfrom.getHtsupportstructureno());
        mapto.setHeight(mapfrom.getHeight());
        mapto.setHyperLink(mapfrom.getHyperlink());
        mapto.setId(mapfrom.getId());
        mapto.setInjectionSubstation(mapfrom.getInjectionsubstation());
        mapto.setInstallationdate(mapfrom.getInstallationdate());
        mapto.setInsulatorcleaness(mapfrom.getInsulatorcleaness());
        mapto.setInsulatormaterial(mapfrom.getInsulatormaterial());
        mapto.setInsulatorstatus(mapfrom.getInsulatorstatus());
        mapto.setInsulatortype(mapfrom.getInsulatortype());
        mapto.setManufacturer(mapfrom.getManufacturer());
        mapto.setManufacturingyear(mapfrom.getManufacturingyear());
        mapto.setMaterial(mapfrom.getMaterial());
        mapto.setLTPoleID(mapfrom.getLtpoleid());
        mapto.setLTSupportStructureNO(mapfrom.getLtsupportstructureno());
        mapto.setLandownership(mapfrom.getLandownership());
        mapto.setLastmaintenancedate(mapfrom.getLastmaintenancedate());
        mapto.setLastuser(mapfrom.getLastuser());
        mapto.setLocationID(mapfrom.getLocationid());
        mapto.setPolecount(mapfrom.getPolecount());
        mapto.setPolestatus(mapfrom.getPolestatus());
        mapto.setPoletype(mapfrom.getPoletype());
        mapto.setPrint(mapfrom.getPrint());
        mapto.setPrintcount(mapfrom.getPrintcount());
        mapto.setProtectionpinavailability(mapfrom.getProtectionpinavailability());
        mapto.setStatus(mapfrom.getStatus());
        mapto.setStreetlightindicator(mapfrom.getStreetlightindicator());
        mapto.setSubtypecd(mapfrom.getSubtypecd());
        mapto.setSupportStructureID(mapfrom.getSupportstructureid());
        mapto.setSymbolrotation(mapfrom.getSymbolrotation());
        mapto.setTieTrapCondition(mapfrom.getTietrapcondition());
        mapto.setTieTrapIndicator(mapfrom.getTietrapindicator());
        mapto.setTransformer(mapfrom.getTransformer());
        mapto.setTreatmenttype(mapfrom.getTreatmenttype());
        return mapto;
    }
    
    public static List<Ltpoleshistorydto> maptoLtpoleshistorydtoList(List<Ltpoleshistory> mapfrom) {
        if (mapfrom == null) {
            return null;
        }
        List<Ltpoleshistorydto> list = new ArrayList<>();
        mapfrom.forEach((rs) -> {
            list.add(maptoLtpoleshistorydto(rs));
        });
        return list;
    }
    
    public static List<Ltpoleshistory> maptoLtpoleshistoryList(List<Ltpoleshistorydto> mapfrom) {
        if (mapfrom == null) {
            return null;
        }
        List<Ltpoleshistory> list = new ArrayList<>();
        mapfrom.forEach((rs) -> {
            list.add(maptoLtpoleshistory(rs));
        });
        return list;
    }
    
    public static Poles maptoPoles(Polesdto mapfrom) {
        if (mapfrom == null) {
            return null;
        }
        Poles mapto = new Poles();
        mapto.setContractorid(mapfrom.getContractorid());
        mapto.setLogindate(mapfrom.getLogindate());
        mapto.setLongitude(mapfrom.getLongitude());
        
        mapto.setLatitude(mapfrom.getLatitude());
        if (mapfrom.getLatitude()!=null && mapfrom.getLatitude().contains("-")) {
            mapto.setLatitude(getConvert(mapfrom.getLatitude()));
        }        
        if (mapfrom.getLongitude()!=null && mapfrom.getLongitude().contains("-")) {
            mapto.setLongitude(getConvert(mapfrom.getLongitude()));
        }
        mapto.setDone(mapfrom.getDone());
        mapto.setPastedby(maptoUsers(mapfrom.getPastedby()));
        mapto.setDatepasted(mapfrom.getDatepasted());
        mapto.setAnchorguyindicator(mapfrom.getAnchorguyindicator());
        mapto.setBasestatus(mapfrom.getBasestatus());
        mapto.setCableupriserid(mapfrom.getCableUpriserID());
        mapto.setComments(mapfrom.getComments());
        mapto.setConnectednetwork(mapfrom.getConnectednetwork());
        mapto.setConsultant(mapfrom.getConsultant());
        mapto.setContractno(mapfrom.getContractno());
        mapto.setContractor(mapfrom.getContractor());
        mapto.setCreationuser(mapfrom.getCreationuser());
        mapto.setCrossarmindicator(mapfrom.getCrossArmIndicator());
        mapto.setCrossarmtiecondition(mapfrom.getCrossArmTieCondition());
        mapto.setCrossarmtype(mapfrom.getCrossArmType());
        mapto.setDangerplateavailability(mapfrom.getDangerplateavailability());
        mapto.setDatasource(mapfrom.getDatasource());
        mapto.setDatecreated(mapfrom.getDatecreated());
        mapto.setDatemodified(mapfrom.getDatemodified());
        mapto.setDatepasted(mapfrom.getDatepasted());
        mapto.setDone(mapfrom.getDone());
        mapto.setEarthingtype(mapfrom.getEarthingtype());
        mapto.setEnabled(mapfrom.getEnabled());
        mapto.setFacilityid(mapfrom.getFacilityid());
        mapto.setFeederid(mapfrom.getFeederid());
        mapto.setFoundationtype(mapfrom.getFoundationtype());
        mapto.setGroundsize(mapfrom.getGroundsize());
        mapto.setGroundconnected(mapfrom.getGroundconnected());
        mapto.setGroundedindicator(mapfrom.getGroundedindicator());
        mapto.setHtsupportstructureno(mapfrom.getHTSupportStructureNO());
        mapto.setHeight(mapfrom.getHeight());
        mapto.setHyperlink(mapfrom.getHyperLink());
        mapto.setId(mapfrom.getId());
        mapto.setInjectionsubstation(mapfrom.getInjectionSubstation());
        mapto.setInstallationdate(mapfrom.getInstallationdate());
        mapto.setInsulatorcleaness(mapfrom.getInsulatorcleaness());
        mapto.setInsulatormaterial(mapfrom.getInsulatormaterial());
        mapto.setInsulatorstatus(mapfrom.getInsulatorstatus());
        mapto.setInsulatortype(mapfrom.getInsulatortype());
        mapto.setManufacturer(mapfrom.getManufacturer());
        mapto.setManufacturingyear(mapfrom.getManufacturingyear());
        mapto.setMaterial(mapfrom.getMaterial());
        mapto.setLtpoleid(mapfrom.getLTPoleID());
        mapto.setLtsupportstructureno(mapfrom.getLTSupportStructureNO());
        mapto.setLandownership(mapfrom.getLandownership());
        mapto.setLastmaintenancedate(mapfrom.getLastmaintenancedate());
        mapto.setLastuser(mapfrom.getLastuser());
        mapto.setLocationid(mapfrom.getLocationID());
        mapto.setPastedby(maptoUsers(mapfrom.getPastedby()));
        mapto.setPolecount(mapfrom.getPolecount());
        mapto.setPolestatus(mapfrom.getPolestatus());
        mapto.setPoletype(mapfrom.getPoletype());
        mapto.setPrint(mapfrom.getPrint());
        mapto.setPrintcount(mapfrom.getPrintcount());
        mapto.setProtectionpinavailability(mapfrom.getProtectionpinavailability());
        mapto.setStatus(mapfrom.getStatus());
        mapto.setStreetlightindicator(mapfrom.getStreetlightindicator());
        mapto.setSubtypecd(mapfrom.getSubtypecd());
        mapto.setSupportstructureid(mapfrom.getSupportStructureID());
        mapto.setSymbolrotation(mapfrom.getSymbolrotation());
        mapto.setTietrapcondition(mapfrom.getTieTrapCondition());
        mapto.setTietrapindicator(mapfrom.getTieTrapIndicator());
        mapto.setTransformer(mapfrom.getTransformer());
        mapto.setTreatmenttype(mapfrom.getTreatmenttype());
        
        return mapto;
    }
    
    public static void selfPoledto(Polesdto mapfrom, Polesdto mapto) {
        mapto.setContractorid(mapfrom.getContractorid());
        mapto.setLogindate(mapfrom.getLogindate());
        mapto.setDone(mapfrom.getDone());
        mapto.setLongitude(mapfrom.getLongitude());
        mapto.setLatitude(mapfrom.getLatitude());
        mapto.setPastedby(mapfrom.getPastedby());
        mapto.setDatepasted(mapfrom.getDatepasted());
        mapto.setAnchorguyindicator(mapfrom.getAnchorguyindicator());
        mapto.setBasestatus(mapfrom.getBasestatus());
        mapto.setCableUpriserID(mapfrom.getCableUpriserID());
        mapto.setComments(mapfrom.getComments());
        mapto.setConnectednetwork(mapfrom.getConnectednetwork());
        mapto.setConsultant(mapfrom.getConsultant());
        mapto.setContractno(mapfrom.getContractno());
        mapto.setContractor(mapfrom.getContractor());
        mapto.setCreationuser(mapfrom.getCreationuser());
        mapto.setCrossArmIndicator(mapfrom.getCrossArmIndicator());
        mapto.setCrossArmTieCondition(mapfrom.getCrossArmTieCondition());
        mapto.setCrossArmType(mapfrom.getCrossArmType());
        mapto.setDangerplateavailability(mapfrom.getDangerplateavailability());
        mapto.setDatasource(mapfrom.getDatasource());
        mapto.setDatecreated(mapfrom.getDatecreated());
        mapto.setDatemodified(mapfrom.getDatemodified());
        mapto.setDatepasted(mapfrom.getDatepasted());
        mapto.setDone(mapfrom.getDone());
        mapto.setEarthingtype(mapfrom.getEarthingtype());
        mapto.setEnabled(mapfrom.getEnabled());
        mapto.setFacilityid(mapfrom.getFacilityid());
        mapto.setFeederid(mapfrom.getFeederid());
        mapto.setFoundationtype(mapfrom.getFoundationtype());
        mapto.setGroundsize(mapfrom.getGroundsize());
        mapto.setGroundconnected(mapfrom.getGroundconnected());
        mapto.setGroundedindicator(mapfrom.getGroundedindicator());
        mapto.setHTSupportStructureNO(mapfrom.getHTSupportStructureNO());
        mapto.setHeight(mapfrom.getHeight());
        mapto.setHyperLink(mapfrom.getHyperLink());
        mapto.setId(mapfrom.getId());
        mapto.setInjectionSubstation(mapfrom.getInjectionSubstation());
        mapto.setInstallationdate(mapfrom.getInstallationdate());
        mapto.setInsulatorcleaness(mapfrom.getInsulatorcleaness());
        mapto.setInsulatormaterial(mapfrom.getInsulatormaterial());
        mapto.setInsulatorstatus(mapfrom.getInsulatorstatus());
        mapto.setInsulatortype(mapfrom.getInsulatortype());
        mapto.setManufacturer(mapfrom.getManufacturer());
        mapto.setManufacturingyear(mapfrom.getManufacturingyear());
        mapto.setMaterial(mapfrom.getMaterial());
        mapto.setLTPoleID(mapfrom.getLTPoleID());
        mapto.setLTSupportStructureNO(mapfrom.getLTSupportStructureNO());
        mapto.setLandownership(mapfrom.getLandownership());
        mapto.setLastmaintenancedate(mapfrom.getLastmaintenancedate());
        mapto.setLastuser(mapfrom.getLastuser());
        mapto.setLocationID(mapfrom.getLocationID());
        mapto.setPastedby(mapfrom.getPastedby());
        mapto.setPolecount(mapfrom.getPolecount());
        mapto.setPolestatus(mapfrom.getPolestatus());
        mapto.setPoletype(mapfrom.getPoletype());
        mapto.setPrint(mapfrom.getPrint());
        mapto.setPrintcount(mapfrom.getPrintcount());
        mapto.setProtectionpinavailability(mapfrom.getProtectionpinavailability());
        mapto.setStatus(mapfrom.getStatus());
        mapto.setStreetlightindicator(mapfrom.getStreetlightindicator());
        mapto.setSubtypecd(mapfrom.getSubtypecd());
        mapto.setSupportStructureID(mapfrom.getSupportStructureID());
        mapto.setSymbolrotation(mapfrom.getSymbolrotation());
        mapto.setTieTrapCondition(mapfrom.getTieTrapCondition());
        mapto.setTieTrapIndicator(mapfrom.getTieTrapIndicator());
        mapto.setTransformer(mapfrom.getTransformer());
        mapto.setTreatmenttype(mapfrom.getTreatmenttype());
    }
    
    public static Polesdto maptoPolesdto(Poles mapfrom) {
        if (mapfrom == null) {
            return null;
        }
        Polesdto mapto = new Polesdto();
        mapto.setNewpoleno(mapfrom.getLtpoleid());
        mapto.setContractorid(mapfrom.getContractorid());
        mapto.setLogindate(mapfrom.getLogindate());
        mapto.setLongitude(mapfrom.getLongitude());
        mapto.setLatitude(mapfrom.getLatitude());
        if (mapfrom.getLatitude()!=null && mapfrom.getLatitude().contains("-")) {
            mapto.setLatitude(getConvert(mapfrom.getLatitude()));
        }        
        if (mapfrom.getLongitude()!=null && mapfrom.getLongitude().contains("-")) {
            mapto.setLongitude(getConvert(mapfrom.getLongitude()));
        }
        mapto.setDone(mapfrom.getDone());
        mapto.setPastedby(maptoUsersdto(mapfrom.getPastedby()));
        mapto.setDatepasted(mapfrom.getDatepasted());
        mapto.setAnchorguyindicator(mapfrom.getAnchorguyindicator());
        mapto.setBasestatus(mapfrom.getBasestatus());
        mapto.setCableUpriserID(mapfrom.getCableupriserid());
        mapto.setComments(mapfrom.getComments());
        mapto.setConnectednetwork(mapfrom.getConnectednetwork());
        mapto.setConsultant(mapfrom.getConsultant());
        mapto.setContractno(mapfrom.getContractno());
        mapto.setContractor(mapfrom.getContractor());
        mapto.setCreationuser(mapfrom.getCreationuser());
        mapto.setCrossArmIndicator(mapfrom.getCrossarmindicator());
        mapto.setCrossArmTieCondition(mapfrom.getCrossarmtiecondition());
        mapto.setCrossArmType(mapfrom.getCrossarmtype());
        mapto.setDangerplateavailability(mapfrom.getDangerplateavailability());
        mapto.setDatasource(mapfrom.getDatasource());
        mapto.setDatecreated(mapfrom.getDatecreated());
        mapto.setDatemodified(mapfrom.getDatemodified());
        mapto.setDatepasted(mapfrom.getDatepasted());
        mapto.setDone(mapfrom.getDone());
        mapto.setEarthingtype(mapfrom.getEarthingtype());
        mapto.setEnabled(mapfrom.getEnabled());
        mapto.setFacilityid(mapfrom.getFacilityid());
        mapto.setFeederid(mapfrom.getFeederid());
        mapto.setFoundationtype(mapfrom.getFoundationtype());
        mapto.setGroundsize(mapfrom.getGroundsize());
        mapto.setGroundconnected(mapfrom.getGroundconnected());
        mapto.setGroundedindicator(mapfrom.getGroundedindicator());
        mapto.setHTSupportStructureNO(mapfrom.getHtsupportstructureno());
        mapto.setHeight(mapfrom.getHeight());
        mapto.setHyperLink(mapfrom.getHyperlink());
        mapto.setId(mapfrom.getId());
        mapto.setInjectionSubstation(mapfrom.getInjectionsubstation());
        mapto.setInstallationdate(mapfrom.getInstallationdate());
        mapto.setInsulatorcleaness(mapfrom.getInsulatorcleaness());
        mapto.setInsulatormaterial(mapfrom.getInsulatormaterial());
        mapto.setInsulatorstatus(mapfrom.getInsulatorstatus());
        mapto.setInsulatortype(mapfrom.getInsulatortype());
        mapto.setManufacturer(mapfrom.getManufacturer());
        mapto.setManufacturingyear(mapfrom.getManufacturingyear());
        mapto.setMaterial(mapfrom.getMaterial());
        mapto.setLTPoleID(mapfrom.getLtpoleid());
        mapto.setLTSupportStructureNO(mapfrom.getLtsupportstructureno());
        mapto.setLandownership(mapfrom.getLandownership());
        mapto.setLastmaintenancedate(mapfrom.getLastmaintenancedate());
        mapto.setLastuser(mapfrom.getLastuser());
        mapto.setLocationID(mapfrom.getLocationid());
        mapto.setPastedby(maptoUsersdto(mapfrom.getPastedby()));
        mapto.setPolecount(mapfrom.getPolecount());
        mapto.setPolestatus(mapfrom.getPolestatus());
        mapto.setPoletype(mapfrom.getPoletype());
        mapto.setPrint(mapfrom.getPrint());
        mapto.setPrintcount(mapfrom.getPrintcount());
        mapto.setProtectionpinavailability(mapfrom.getProtectionpinavailability());
        mapto.setStatus(mapfrom.getStatus());
        mapto.setStreetlightindicator(mapfrom.getStreetlightindicator());
        mapto.setSubtypecd(mapfrom.getSubtypecd());
        mapto.setSupportStructureID(mapfrom.getSupportstructureid());
        mapto.setSymbolrotation(mapfrom.getSymbolrotation());
        mapto.setTieTrapCondition(mapfrom.getTietrapcondition());
        mapto.setTieTrapIndicator(mapfrom.getTietrapindicator());
        mapto.setTransformer(mapfrom.getTransformer());
        mapto.setTreatmenttype(mapfrom.getTreatmenttype());
        
        return mapto;
    }
    
    public static List<Polesdto> maptoPolesdtoList(List<Poles> mapfrom) {
        if (mapfrom == null) {
            return null;
        }
        List<Polesdto> list = new ArrayList<>();
        mapfrom.forEach((rs) -> {
            list.add(maptoPolesdto(rs));
        });
        return list;
    }
    
    public static List<Poles> maptoPolesList(List<Polesdto> mapfrom) {
        if (mapfrom == null) {
            return null;
        }
        List<Poles> list = new ArrayList<>();
        mapfrom.forEach((rs) -> {
            list.add(maptoPoles(rs));
        });
        return list;
    }
    
    public static Poleshistory convertToPolesHistory(Polesdto mapfrom, boolean status, String modifiedby) {
        if (mapfrom == null) {
            return null;
        }
        Poleshistory mapto = new Poleshistory();
        mapto.setContractorid(mapfrom.getContractorid());
        mapto.setLogindate(mapfrom.getLogindate());
        mapto.setLongitude(mapfrom.getLongitude());
        mapto.setLatitude(mapfrom.getLatitude());
        if (mapfrom.getLatitude().contains("-")) {
            mapto.setLatitude(getConvert(mapfrom.getLatitude()));
        }        
        if (mapfrom.getLongitude().contains("-")) {
            mapto.setLongitude(getConvert(mapfrom.getLongitude()));
        }
        mapto.setDone(mapfrom.getDone());
        mapto.setParent(maptoPoles(mapfrom));
        mapto.setPastedby(mapfrom.getPastedby() == null ? null : mapfrom.getPastedby().getId());
        mapto.setDatepasted(mapfrom.getDatepasted());
        mapto.setDone(mapfrom.getDone());
        mapto.setDatepasted(mapfrom.getDatepasted());
        mapto.setAnchorguyindicator(mapfrom.getAnchorguyindicator());
        mapto.setBasestatus(mapfrom.getBasestatus());
        mapto.setCableupriserid(mapfrom.getCableUpriserID());
        mapto.setComments(mapfrom.getComments());
        mapto.setConnectednetwork(mapfrom.getConnectednetwork());
        mapto.setConsultant(mapfrom.getConsultant());
        mapto.setContractno(mapfrom.getContractno());
        mapto.setContractor(mapfrom.getContractor());
        mapto.setCreationuser(mapfrom.getCreationuser());
        mapto.setCrossarmindicator(mapfrom.getCrossArmIndicator());
        mapto.setCrossarmtiecondition(mapfrom.getCrossArmTieCondition());
        mapto.setCrossarmtype(mapfrom.getCrossArmType());
        mapto.setDangerplateavailability(mapfrom.getDangerplateavailability());
        mapto.setDatasource(mapfrom.getDatasource());
        mapto.setDatecreated(mapfrom.getDatecreated());
        mapto.setDatemodified(mapfrom.getDatemodified());
        mapto.setDatepasted(mapfrom.getDatepasted());
        mapto.setDone(mapfrom.getDone());
        mapto.setEarthingtype(mapfrom.getEarthingtype());
        mapto.setEnabled(mapfrom.getEnabled());
        mapto.setFacilityid(mapfrom.getFacilityid());
        mapto.setFeederid(mapfrom.getFeederid());
        mapto.setFoundationtype(mapfrom.getFoundationtype());
        mapto.setGroundsize(mapfrom.getGroundsize());
        mapto.setGroundconnected(mapfrom.getGroundconnected());
        mapto.setGroundedindicator(mapfrom.getGroundedindicator());
        mapto.setHtsupportstructureno(mapfrom.getHTSupportStructureNO());
        mapto.setHeight(mapfrom.getHeight());
        mapto.setHyperlink(mapfrom.getHyperLink());
        mapto.setId(mapfrom.getId());
        mapto.setInjectionsubstation(mapfrom.getInjectionSubstation());
        mapto.setInstallationdate(mapfrom.getInstallationdate());
        mapto.setInsulatorcleaness(mapfrom.getInsulatorcleaness());
        mapto.setInsulatormaterial(mapfrom.getInsulatormaterial());
        mapto.setInsulatorstatus(mapfrom.getInsulatorstatus());
        mapto.setInsulatortype(mapfrom.getInsulatortype());
        mapto.setManufacturer(mapfrom.getManufacturer());
        mapto.setManufacturingyear(mapfrom.getManufacturingyear());
        mapto.setMaterial(mapfrom.getMaterial());
        mapto.setLtpoleid(mapfrom.getLTPoleID());
        mapto.setLtsupportstructureno(mapfrom.getLTSupportStructureNO());
        mapto.setLandownership(mapfrom.getLandownership());
        mapto.setLastmaintenancedate(mapfrom.getLastmaintenancedate());
        mapto.setLastuser(mapfrom.getLastuser());
        mapto.setLocationid(mapfrom.getLocationID());
        mapto.setPolecount(mapfrom.getPolecount());
        mapto.setPolestatus(mapfrom.getPolestatus());
        mapto.setPoletype(mapfrom.getPoletype());
        mapto.setPrint(mapfrom.getPrint());
        mapto.setPrintcount(mapfrom.getPrintcount());
        mapto.setProtectionpinavailability(mapfrom.getProtectionpinavailability());
        mapto.setStatus(mapfrom.getStatus());
        mapto.setStreetlightindicator(mapfrom.getStreetlightindicator());
        mapto.setSubtypecd(mapfrom.getSubtypecd());
        mapto.setSupportstructureid(mapfrom.getSupportStructureID());
        mapto.setSymbolrotation(mapfrom.getSymbolrotation());
        mapto.setTietrapcondition(mapfrom.getTieTrapCondition());
        mapto.setTietrapindicator(mapfrom.getTieTrapIndicator());
        mapto.setTransformer(mapfrom.getTransformer());
        mapto.setTreatmenttype(mapfrom.getTreatmenttype());
        return mapto;
    }
    
    public static Poleshistory maptoPoleshistory(Poleshistorydto mapfrom) {
        if (mapfrom == null) {
            return null;
        }
        Poleshistory mapto = new Poleshistory();
        mapto.setContractorid(mapfrom.getContractorid());
        mapto.setLogindate(mapfrom.getLogindate());
        mapto.setLongitude(mapfrom.getLongitude());
        mapto.setLatitude(mapfrom.getLatitude());
        if (mapfrom.getLatitude().contains("-")) {
            mapto.setLatitude(getConvert(mapfrom.getLatitude()));
        }        
        if (mapfrom.getLongitude().contains("-")) {
            mapto.setLongitude(getConvert(mapfrom.getLongitude()));
        }
        mapto.setDone(mapfrom.getDone());
        mapto.setParent(maptoPoles(mapfrom.getParent()));
        mapto.setPastedby(mapfrom.getPastedby());
        mapto.setDatepasted(mapfrom.getDatepasted());
        mapto.setAnchorguyindicator(mapfrom.getAnchorguyindicator());
        mapto.setBasestatus(mapfrom.getBasestatus());
        mapto.setCableupriserid(mapfrom.getCableUpriserID());
        mapto.setComments(mapfrom.getComments());
        mapto.setConnectednetwork(mapfrom.getConnectednetwork());
        mapto.setConsultant(mapfrom.getConsultant());
        mapto.setContractno(mapfrom.getContractno());
        mapto.setContractor(mapfrom.getContractor());
        mapto.setCreationuser(mapfrom.getCreationuser());
        mapto.setCrossarmindicator(mapfrom.getCrossArmIndicator());
        mapto.setCrossarmtiecondition(mapfrom.getCrossArmTieCondition());
        mapto.setCrossarmtype(mapfrom.getCrossArmType());
        mapto.setDangerplateavailability(mapfrom.getDangerplateavailability());
        mapto.setDatasource(mapfrom.getDatasource());
        mapto.setDatecreated(mapfrom.getDatecreated());
        mapto.setDatemodified(mapfrom.getDatemodified());
        mapto.setDatepasted(mapfrom.getDatepasted());
        mapto.setDone(mapfrom.getDone());
        mapto.setEarthingtype(mapfrom.getEarthingtype());
        mapto.setEnabled(mapfrom.getEnabled());
        mapto.setFacilityid(mapfrom.getFacilityid());
        mapto.setFeederid(mapfrom.getFeederid());
        mapto.setFoundationtype(mapfrom.getFoundationtype());
        mapto.setGroundsize(mapfrom.getGroundsize());
        mapto.setGroundconnected(mapfrom.getGroundconnected());
        mapto.setGroundedindicator(mapfrom.getGroundedindicator());
        mapto.setHtsupportstructureno(mapfrom.getHTSupportStructureNO());
        mapto.setHeight(mapfrom.getHeight());
        mapto.setHyperlink(mapfrom.getHyperLink());
        mapto.setId(mapfrom.getId());
        mapto.setInjectionsubstation(mapfrom.getInjectionSubstation());
        mapto.setInstallationdate(mapfrom.getInstallationdate());
        mapto.setInsulatorcleaness(mapfrom.getInsulatorcleaness());
        mapto.setInsulatormaterial(mapfrom.getInsulatormaterial());
        mapto.setInsulatorstatus(mapfrom.getInsulatorstatus());
        mapto.setInsulatortype(mapfrom.getInsulatortype());
        mapto.setManufacturer(mapfrom.getManufacturer());
        mapto.setManufacturingyear(mapfrom.getManufacturingyear());
        mapto.setMaterial(mapfrom.getMaterial());
        mapto.setLtpoleid(mapfrom.getLTPoleID());
        mapto.setLtsupportstructureno(mapfrom.getLTSupportStructureNO());
        mapto.setLandownership(mapfrom.getLandownership());
        mapto.setLastmaintenancedate(mapfrom.getLastmaintenancedate());
        mapto.setLastuser(mapfrom.getLastuser());
        mapto.setLocationid(mapfrom.getLocationID());
        mapto.setPolecount(mapfrom.getPolecount());
        mapto.setPolestatus(mapfrom.getPolestatus());
        mapto.setPoletype(mapfrom.getPoletype());
        mapto.setPrint(mapfrom.getPrint());
        mapto.setPrintcount(mapfrom.getPrintcount());
        mapto.setProtectionpinavailability(mapfrom.getProtectionpinavailability());
        mapto.setStatus(mapfrom.getStatus());
        mapto.setStreetlightindicator(mapfrom.getStreetlightindicator());
        mapto.setSubtypecd(mapfrom.getSubtypecd());
        mapto.setSupportstructureid(mapfrom.getSupportStructureID());
        mapto.setSymbolrotation(mapfrom.getSymbolrotation());
        mapto.setTietrapcondition(mapfrom.getTieTrapCondition());
        mapto.setTietrapindicator(mapfrom.getTieTrapIndicator());
        mapto.setTransformer(mapfrom.getTransformer());
        mapto.setTreatmenttype(mapfrom.getTreatmenttype());
        return mapto;
    }
    
    public static Poleshistorydto maptoPoleshistorydto(Poleshistory mapfrom) {
        if (mapfrom == null) {
            return null;
        }
        Poleshistorydto mapto = new Poleshistorydto();
        mapto.setContractorid(mapfrom.getContractorid());        
        mapto.setLogindate(mapfrom.getLogindate());
        mapto.setLongitude(mapfrom.getLongitude());
        mapto.setLatitude(mapfrom.getLatitude());
        if (mapfrom.getLatitude().contains("-")) {
            mapto.setLatitude(getConvert(mapfrom.getLatitude()));
        }        
        if (mapfrom.getLongitude().contains("-")) {
            mapto.setLongitude(getConvert(mapfrom.getLongitude()));
        }
        mapto.setDone(mapfrom.getDone());
        mapto.setParent(maptoPolesdto(mapfrom.getParent()));
        mapto.setPastedby(mapfrom.getPastedby());
        mapto.setDatepasted(mapfrom.getDatepasted());
        mapto.setAnchorguyindicator(mapfrom.getAnchorguyindicator());
        mapto.setBasestatus(mapfrom.getBasestatus());
        mapto.setCableUpriserID(mapfrom.getCableupriserid());
        mapto.setComments(mapfrom.getComments());
        mapto.setConnectednetwork(mapfrom.getConnectednetwork());
        mapto.setConsultant(mapfrom.getConsultant());
        mapto.setContractno(mapfrom.getContractno());
        mapto.setContractor(mapfrom.getContractor());
        mapto.setCreationuser(mapfrom.getCreationuser());
        mapto.setCrossArmIndicator(mapfrom.getCrossarmindicator());
        mapto.setCrossArmTieCondition(mapfrom.getCrossarmtiecondition());
        mapto.setCrossArmType(mapfrom.getCrossarmtype());
        mapto.setDangerplateavailability(mapfrom.getDangerplateavailability());
        mapto.setDatasource(mapfrom.getDatasource());
        mapto.setDatecreated(mapfrom.getDatecreated());
        mapto.setDatemodified(mapfrom.getDatemodified());
        mapto.setDatepasted(mapfrom.getDatepasted());
        mapto.setDone(mapfrom.getDone());
        mapto.setEarthingtype(mapfrom.getEarthingtype());
        mapto.setEnabled(mapfrom.getEnabled());
        mapto.setFacilityid(mapfrom.getFacilityid());
        mapto.setFeederid(mapfrom.getFeederid());
        mapto.setFoundationtype(mapfrom.getFoundationtype());
        mapto.setGroundsize(mapfrom.getGroundsize());
        mapto.setGroundconnected(mapfrom.getGroundconnected());
        mapto.setGroundedindicator(mapfrom.getGroundedindicator());
        mapto.setHTSupportStructureNO(mapfrom.getHtsupportstructureno());
        mapto.setHeight(mapfrom.getHeight());
        mapto.setHyperLink(mapfrom.getHyperlink());
        mapto.setId(mapfrom.getId());
        mapto.setInjectionSubstation(mapfrom.getInjectionsubstation());
        mapto.setInstallationdate(mapfrom.getInstallationdate());
        mapto.setInsulatorcleaness(mapfrom.getInsulatorcleaness());
        mapto.setInsulatormaterial(mapfrom.getInsulatormaterial());
        mapto.setInsulatorstatus(mapfrom.getInsulatorstatus());
        mapto.setInsulatortype(mapfrom.getInsulatortype());
        mapto.setManufacturer(mapfrom.getManufacturer());
        mapto.setManufacturingyear(mapfrom.getManufacturingyear());
        mapto.setMaterial(mapfrom.getMaterial());
        mapto.setLTPoleID(mapfrom.getLtpoleid());
        mapto.setLTSupportStructureNO(mapfrom.getLtsupportstructureno());
        mapto.setLandownership(mapfrom.getLandownership());
        mapto.setLastmaintenancedate(mapfrom.getLastmaintenancedate());
        mapto.setLastuser(mapfrom.getLastuser());
        mapto.setLocationID(mapfrom.getLocationid());
        mapto.setPolecount(mapfrom.getPolecount());
        mapto.setPolestatus(mapfrom.getPolestatus());
        mapto.setPoletype(mapfrom.getPoletype());
        mapto.setPrint(mapfrom.getPrint());
        mapto.setPrintcount(mapfrom.getPrintcount());
        mapto.setProtectionpinavailability(mapfrom.getProtectionpinavailability());
        mapto.setStatus(mapfrom.getStatus());
        mapto.setStreetlightindicator(mapfrom.getStreetlightindicator());
        mapto.setSubtypecd(mapfrom.getSubtypecd());
        mapto.setSupportStructureID(mapfrom.getSupportstructureid());
        mapto.setSymbolrotation(mapfrom.getSymbolrotation());
        mapto.setTieTrapCondition(mapfrom.getTietrapcondition());
        mapto.setTieTrapIndicator(mapfrom.getTietrapindicator());
        mapto.setTransformer(mapfrom.getTransformer());
        mapto.setTreatmenttype(mapfrom.getTreatmenttype());
        return mapto;
    }
    
    public static List<Poleshistorydto> maptoPoleshistorydtoList(List<Poleshistory> mapfrom) {
        if (mapfrom == null) {
            return null;
        }
        List<Poleshistorydto> list = new ArrayList<>();
        mapfrom.forEach((rs) -> {
            list.add(maptoPoleshistorydto(rs));
        });
        return list;
    }
    
    public static List<Poleshistory> maptoPoleshistoryList(List<Poleshistorydto> mapfrom) {
        if (mapfrom == null) {
            return null;
        }
        List<Poleshistory> list = new ArrayList<>();
        mapfrom.forEach((rs) -> {
            list.add(maptoPoleshistory(rs));
        });
        return list;
    }
    
    public static Customerhistory maptoCustomerhistory(Customerhistorydto mapfrom) {
        if (mapfrom == null) {
            return null;
        }
        Customerhistory mapto = new Customerhistory();
        mapto.setComments(mapfrom.getComments());
        mapto.setCapturedby(mapfrom.getCapturedby());
        mapto.setCaptureddate(mapfrom.getCaptureddate());
        mapto.setContractorid(mapfrom.getContractorid());
        mapto.setLogindate(mapfrom.getLogindate());
        mapto.setMeternonew(mapfrom.getMeternonew());
        mapto.setCustomeraccountnonew(mapfrom.getCustomeraccountnonew());
        mapto.setDone(mapfrom.getDone());
        mapto.setPastedby(mapfrom.getPastedby());
        mapto.setActualtariff(mapfrom.getActualTariff());
        mapto.setAddressonbill(mapfrom.getAddressOnBill());
        mapto.setApproximatetotalratingofac(mapfrom.getApproximatetotalratingofac());
        mapto.setBillingtype(mapfrom.getBillingtype());
        mapto.setBuildingcodeid(mapfrom.getBuildingCodeID());
        mapto.setCustomernameonbill(mapfrom.getCUSTOMERNAMEonBILL());
        mapto.setCableupriserid(mapfrom.getCableUpriserID());
        mapto.setCallbackno(mapfrom.getCallBackNo());
        mapto.setCin(mapfrom.getCin());
        mapto.setCity(mapfrom.getCity());
        mapto.setComment(mapfrom.getComment());
        mapto.setConnectiontype(mapfrom.getConnectionType());
        mapto.setCtratio(mapfrom.getCtratio());
        mapto.setCustomeraccountno(mapfrom.getCustomerACCOUNTNO());
        mapto.setCustomerid(mapfrom.getCustomerID());
        mapto.setCustomerrelationid(mapfrom.getCustomerRelationID());
        mapto.setCustomernumber(mapfrom.getCustomernumber());
        mapto.setCustomerphoneno(mapfrom.getCustomerphoneno());
        mapto.setCutoutsize(mapfrom.getCutoutsize());
        mapto.setDials(mapfrom.getDials());
        mapto.setDiscoid(mapfrom.getDiscoID());
        mapto.setDone(mapfrom.getDone());
        mapto.setEdservicepointoid(mapfrom.getEDServicePointOID());
        mapto.setEmailaddress(mapfrom.getEMailaddress());
        mapto.setFeedername(mapfrom.getFeederName());
        mapto.setFeederid(mapfrom.getFeederid());
        mapto.setGpscoordinate(mapfrom.getGpscoordinate());
        mapto.setHtpoleid(mapfrom.getHTPoleID());
        mapto.setHouseno(mapfrom.getHouseNo());
        mapto.setId(mapfrom.getId());
        mapto.setInjectionsubstationid(mapfrom.getInjectionsubstationid());
        mapto.setNameofdatacapturer(mapfrom.getNameOfDataCapturer());
        mapto.setNatureofuseelectricity(mapfrom.getNatureOfUseElectricity());
        mapto.setNumberofaircondictioner(mapfrom.getNumberofaircondictioner());
        mapto.setMeterbypass(mapfrom.getMeterbyPass());
        mapto.setMeterdesigntype(mapfrom.getMeterdesigntype());
        mapto.setMeterno(mapfrom.getMeterno());
        mapto.setMeterreading(mapfrom.getMeterreading());
        mapto.setMetersealno(mapfrom.getMetersealno());
        mapto.setMeterstatus(mapfrom.getMeterstatus());
        mapto.setMultiplierfactoronmeter(mapfrom.getMultiplierfactoronmeter());
        mapto.setParent(maptoCustomer(mapfrom.getParent()));
        mapto.setPastedby(mapfrom.getPastedby());
        mapto.setPasteddate(mapfrom.getPasteddate());
        mapto.setPhasedesignation(mapfrom.getPhasedesignation());
        mapto.setPhysicaladdress(mapfrom.getPhysicalAddress());
        mapto.setPlot(mapfrom.getPlot());
        mapto.setPowertrasformerid(mapfrom.getPowerTrasformerID());
        mapto.setPremisestype(mapfrom.getPremisestype());
        mapto.setPrintcount(mapfrom.getPrintcount());
        mapto.setPrinted(mapfrom.getPrinted());
        mapto.setPtratio(mapfrom.getPtratio());
        mapto.setServicewireno(mapfrom.getServiceWireNo());
        mapto.setStreet(mapfrom.getStreet());
        mapto.setSubdiscoid(mapfrom.getSubdiscoid());
        mapto.setSupplystructureid(mapfrom.getSupplystructureid());
        mapto.setSupplytype(mapfrom.getSupplytype());
        mapto.setTariff(mapfrom.getTariff());
        mapto.setTransfomerid(mapfrom.getTransfomerID());
        mapto.setTransformername(mapfrom.getTransformername());
        mapto.setLat(mapfrom.getLat());
        mapto.setLongs(mapfrom.getLongs());
        return mapto;
    }
    
    public static Customerhistorydto maptoCustomerhistorydto(Customerhistory mapfrom) {
        if (mapfrom == null) {
            return null;
        }
        Customerhistorydto mapto = new Customerhistorydto();
        mapto.setComments(mapfrom.getComments());
        mapto.setCaptureddate(mapfrom.getCaptureddate());
        mapto.setCapturedby(mapfrom.getCapturedby());        
        mapto.setContractorid(mapfrom.getContractorid());
        mapto.setLogindate(mapfrom.getLogindate());
        mapto.setLat(mapfrom.getLat());
        mapto.setLongs(mapfrom.getLongs());
        mapto.setMeternonew(mapfrom.getMeternonew());
        mapto.setCustomeraccountnonew(mapfrom.getCustomeraccountnonew());
        mapto.setDone(mapfrom.getDone());
        mapto.setPastedby(mapfrom.getPastedby());
        mapto.setActualTariff(mapfrom.getActualtariff());
        mapto.setAddressOnBill(mapfrom.getAddressonbill());
        mapto.setApproximatetotalratingofac(mapfrom.getApproximatetotalratingofac());
        mapto.setBillingtype(mapfrom.getBillingtype());
        mapto.setBuildingCodeID(mapfrom.getBuildingcodeid());
        mapto.setCUSTOMERNAMEonBILL(mapfrom.getCustomernameonbill());
        mapto.setCableUpriserID(mapfrom.getCableupriserid());
        mapto.setCallBackNo(mapfrom.getCallbackno());
        mapto.setCin(mapfrom.getCin());
        mapto.setCity(mapfrom.getCity());
        mapto.setComment(mapfrom.getComment());
        mapto.setConnectionType(mapfrom.getConnectiontype());
        mapto.setCtratio(mapfrom.getCtratio());
        mapto.setCustomerACCOUNTNO(mapfrom.getCustomerphoneno());
        mapto.setCustomerID(mapfrom.getCustomerid());
        mapto.setCustomerRelationID(mapfrom.getCustomerrelationid());
        mapto.setCustomernumber(mapfrom.getCustomernumber());
        mapto.setCustomerphoneno(mapfrom.getCustomerphoneno());
        mapto.setCutoutsize(mapfrom.getCutoutsize());
        mapto.setDials(mapfrom.getDials());
        mapto.setDiscoID(mapfrom.getDiscoid());
        mapto.setDone(mapfrom.getDone());
        mapto.setEDServicePointOID(mapfrom.getEdservicepointoid());
        mapto.setEMailaddress(mapfrom.getEmailaddress());
        mapto.setFeederName(mapfrom.getFeedername());
        mapto.setFeederid(mapfrom.getFeederid());
        mapto.setGpscoordinate(mapfrom.getGpscoordinate());
        mapto.setHTPoleID(mapfrom.getHtpoleid());
        mapto.setHouseNo(mapfrom.getHouseno());
        mapto.setId(mapfrom.getId());
        mapto.setInjectionsubstationid(mapfrom.getInjectionsubstationid());
        mapto.setNameOfDataCapturer(mapfrom.getNameofdatacapturer());
        mapto.setNatureOfUseElectricity(mapfrom.getNatureofuseelectricity());
        mapto.setNumberofaircondictioner(mapfrom.getNumberofaircondictioner());
        mapto.setMeterbyPass(mapfrom.getMeterbypass());
        mapto.setMeterdesigntype(mapfrom.getMeterdesigntype());
        mapto.setMeterno(mapfrom.getMeterno());
        mapto.setMeterreading(mapfrom.getMeterreading());
        mapto.setMetersealno(mapfrom.getMetersealno());
        mapto.setMeterstatus(mapfrom.getMeterstatus());
        mapto.setMultiplierfactoronmeter(mapfrom.getMultiplierfactoronmeter());
        mapto.setParent(maptoCustomerdto(mapfrom.getParent()));
        mapto.setPastedby(mapfrom.getPastedby());
        mapto.setPasteddate(mapfrom.getPasteddate());
        mapto.setPhasedesignation(mapfrom.getPhasedesignation());
        mapto.setPhysicalAddress(mapfrom.getPhysicaladdress());
        mapto.setPlot(mapfrom.getPlot());
        mapto.setPowerTrasformerID(mapfrom.getPowertrasformerid());
        mapto.setPremisestype(mapfrom.getPremisestype());
        mapto.setPrintcount(mapfrom.getPrintcount());
        mapto.setPrinted(mapfrom.getPrinted());
        mapto.setPtratio(mapfrom.getPtratio());
        mapto.setServiceWireNo(mapfrom.getServicewireno());
        mapto.setStreet(mapfrom.getStreet());
        mapto.setSubdiscoid(mapfrom.getSubdiscoid());
        mapto.setSupplystructureid(mapfrom.getSupplystructureid());
        mapto.setSupplytype(mapfrom.getSupplytype());
        mapto.setTariff(mapfrom.getTariff());
        mapto.setTransfomerID(mapfrom.getTransfomerid());
        mapto.setTransformername(mapfrom.getTransformername());
        
        return mapto;
    }
    
    public static List<Customerhistorydto> maptoCustomerhistorydtoList(List<Customerhistory> mapfrom) {
        if (mapfrom == null) {
            return null;
        }
        List<Customerhistorydto> list = new ArrayList<>();
        for (Customerhistory rs : mapfrom) {
            list.add(maptoCustomerhistorydto(rs));
        }
        return list;
    }
    
    public static List<Customerhistory> maptoCustomerhistoryList(List<Customerhistorydto> mapfrom) {
        if (mapfrom == null) {
            return null;
        }
        List<Customerhistory> list = new ArrayList<>();
        for (Customerhistorydto rs : mapfrom) {
            list.add(maptoCustomerhistory(rs));
        }
        return list;
    }
    
    public static Customerhistory convertToCustomerhistory(Customerdto mapfrom,
            boolean g, String modifiedb) {
        if (mapfrom == null) {
            return null;
        }
        Customerhistory mapto = new Customerhistory();
        mapto.setComments(mapfrom.getComments());
        mapto.setCaptureddate(mapfrom.getCaptureddate());
        mapto.setCapturedby(mapfrom.getCapturedby());        
        mapto.setContractorid(mapfrom.getContractorid());        
        mapto.setLogindate(mapfrom.getLogindate());
        mapto.setLat(mapfrom.getLat());
        mapto.setLongs(mapfrom.getLongs());
        mapto.setMeternonew(mapfrom.getMeternonew());
        mapto.setCustomeraccountnonew(mapfrom.getCustomeraccountnonew());
        mapto.setDone(mapfrom.getDone());
        mapto.setPastedby(mapfrom.getPastedby() == null ? null : mapfrom.getPastedby().getId());
        mapto.setActualtariff(mapfrom.getActualTariff());
        mapto.setAddressonbill(mapfrom.getAddressOnBill());
        mapto.setApproximatetotalratingofac(mapfrom.getApproximatetotalratingofac());
        mapto.setBillingtype(mapfrom.getBillingtype());
        mapto.setBuildingcodeid(mapfrom.getBuildingCodeID());
        mapto.setCustomernameonbill(mapfrom.getCUSTOMERNAMEonBILL());
        mapto.setCableupriserid(mapfrom.getCableUpriserID());
        mapto.setCallbackno(mapfrom.getCallBackNo());
        mapto.setCin(mapfrom.getCin());
        mapto.setCity(mapfrom.getCity());
        mapto.setComment(mapfrom.getComment());
        mapto.setConnectiontype(mapfrom.getConnectionType());
        mapto.setCtratio(mapfrom.getCtratio());
        mapto.setCustomeraccountno(mapfrom.getCustomerACCOUNTNO());
        mapto.setCustomerid(mapfrom.getCustomerID());
        mapto.setCustomerrelationid(mapfrom.getCustomerRelationID());
        mapto.setCustomernumber(mapfrom.getCustomernumber());
        mapto.setCustomerphoneno(mapfrom.getCustomerphoneno());
        mapto.setCutoutsize(mapfrom.getCutoutsize());
        mapto.setDials(mapfrom.getDials());
        mapto.setDiscoid(mapfrom.getDiscoID());
        mapto.setDone(mapfrom.getDone());
        mapto.setEdservicepointoid(mapfrom.getEDServicePointOID());
        mapto.setEmailaddress(mapfrom.getEMailaddress());
        mapto.setFeedername(mapfrom.getFeederName());
        mapto.setFeederid(mapfrom.getFeederid());
        mapto.setGpscoordinate(mapfrom.getGpscoordinate());
        mapto.setHtpoleid(mapfrom.getHTPoleID());
        mapto.setHouseno(mapfrom.getHouseNo());
       // mapto.setId(mapfrom.getId());
        mapto.setInjectionsubstationid(mapfrom.getInjectionsubstationid());
        mapto.setNameofdatacapturer(mapfrom.getNameOfDataCapturer());
        mapto.setNatureofuseelectricity(mapfrom.getNatureOfUseElectricity());
        mapto.setNumberofaircondictioner(mapfrom.getNumberofaircondictioner());
        mapto.setMeterbypass(mapfrom.getMeterbyPass());
        mapto.setMeterdesigntype(mapfrom.getMeterdesigntype());
        mapto.setMeterno(mapfrom.getMeterno());
        mapto.setMeterreading(mapfrom.getMeterreading());
        mapto.setMetersealno(mapfrom.getMetersealno());
        mapto.setMeterstatus(mapfrom.getMeterstatus());
        mapto.setMultiplierfactoronmeter(mapfrom.getMultiplierfactoronmeter());
        mapto.setParent(maptoCustomer(mapfrom));
        mapto.setPastedby(mapfrom.getPastedby() == null ? null : mapfrom.getPastedby().getId());
        mapto.setPasteddate(mapfrom.getPasteddate());
        mapto.setPhasedesignation(mapfrom.getPhasedesignation());
        mapto.setPhysicaladdress(mapfrom.getPhysicalAddress());
        mapto.setPlot(mapfrom.getPlot());
        mapto.setPowertrasformerid(mapfrom.getPowerTrasformerID());
        mapto.setPremisestype(mapfrom.getPremisestype());
        mapto.setPrintcount(mapfrom.getPrintcount());
        mapto.setPrinted(mapfrom.getPrinted());
        mapto.setPtratio(mapfrom.getPtratio());
        mapto.setServicewireno(mapfrom.getServiceWireNo());
        mapto.setStreet(mapfrom.getStreet());
        mapto.setSubdiscoid(mapfrom.getSubdiscoid());
        mapto.setSupplystructureid(mapfrom.getSupplystructureid());
        mapto.setSupplytype(mapfrom.getSupplytype());
        mapto.setTariff(mapfrom.getTariff());
        mapto.setTransfomerid(mapfrom.getTransfomerID());
        mapto.setTransformername(mapfrom.getTransformername());
        mapto.setLtpoleid(mapfrom.getLtpoleid());
        return mapto;
    }
    public static Customerhistory convertToCustomerhistory(Customer mapfrom,
            boolean g, String modifiedb) {
        if (mapfrom == null) {
            return null;
        }
        Customerhistory mapto = new Customerhistory();
        mapto.setComments(mapfrom.getComments());
        mapto.setCaptureddate(mapfrom.getCaptureddate());
        mapto.setCapturedby(mapfrom.getCapturedby());        
        mapto.setContractorid(mapfrom.getContractorid());        
        mapto.setLogindate(mapfrom.getLogindate());
        mapto.setLat(mapfrom.getLat());
        mapto.setLongs(mapfrom.getLongs());
        mapto.setMeternonew(mapfrom.getMeternonew());
        mapto.setCustomeraccountnonew(mapfrom.getCustomeraccountnonew());
        mapto.setDone(mapfrom.getDone());
        mapto.setPastedby(mapfrom.getPastedby() == null ? null : mapfrom.getPastedby().getId());
        mapto.setActualtariff(mapfrom.getActualtariff());
        mapto.setAddressonbill(mapfrom.getAddressonbill());
        mapto.setApproximatetotalratingofac(mapfrom.getApproximatetotalratingofac());
        mapto.setBillingtype(mapfrom.getBillingtype());
        mapto.setBuildingcodeid(mapfrom.getBuildingcodeid());
        mapto.setCustomernameonbill(mapfrom.getCustomernameonbill());
        mapto.setCableupriserid(mapfrom.getCableupriserid());
        mapto.setCallbackno(mapfrom.getCallbackno());
        mapto.setCin(mapfrom.getCin());
        mapto.setCity(mapfrom.getCity());
        mapto.setComment(mapfrom.getComment());
        mapto.setConnectiontype(mapfrom.getConnectiontype());
        mapto.setCtratio(mapfrom.getCtratio());
        mapto.setCustomeraccountno(mapfrom.getCustomeraccountno());
        mapto.setCustomerid(mapfrom.getCustomerid());
        mapto.setCustomerrelationid(mapfrom.getCustomerrelationid());
        mapto.setCustomernumber(mapfrom.getCustomernumber());
        mapto.setCustomerphoneno(mapfrom.getCustomerphoneno());
        mapto.setCutoutsize(mapfrom.getCutoutsize());
        mapto.setDials(mapfrom.getDials());
        mapto.setDiscoid(mapfrom.getDiscoid());
        mapto.setDone(mapfrom.getDone());
        mapto.setEdservicepointoid(mapfrom.getEdservicepointoid());
        mapto.setEmailaddress(mapfrom.getEmailaddress());
        mapto.setFeedername(mapfrom.getFeedername());
        mapto.setFeederid(mapfrom.getFeederid());
        mapto.setGpscoordinate(mapfrom.getGpscoordinate());
        mapto.setHtpoleid(mapfrom.getHtpoleid());
        mapto.setHouseno(mapfrom.getHouseno());
        mapto.setInjectionsubstationid(mapfrom.getInjectionsubstationid());
        mapto.setNameofdatacapturer(mapfrom.getNameofdatacapturer());
        mapto.setNatureofuseelectricity(mapfrom.getNatureofuseelectricity());
        mapto.setNumberofaircondictioner(mapfrom.getNumberofaircondictioner());
        mapto.setMeterbypass(mapfrom.getMeterbypass());
        mapto.setMeterdesigntype(mapfrom.getMeterdesigntype());
        mapto.setMeterno(mapfrom.getMeterno());
        mapto.setMeterreading(mapfrom.getMeterreading());
        mapto.setMetersealno(mapfrom.getMetersealno());
        mapto.setMeterstatus(mapfrom.getMeterstatus());
        mapto.setMultiplierfactoronmeter(mapfrom.getMultiplierfactoronmeter());
        mapto.setParent(mapfrom);
        mapto.setPastedby(mapfrom.getPastedby() == null ? null : mapfrom.getPastedby().getId());
        mapto.setPasteddate(mapfrom.getPasteddate());
        mapto.setPhasedesignation(mapfrom.getPhasedesignation());
        mapto.setPhysicaladdress(mapfrom.getPhysicaladdress());
        mapto.setPlot(mapfrom.getPlot());
        mapto.setPowertrasformerid(mapfrom.getPowertrasformerid());
        mapto.setPremisestype(mapfrom.getPremisestype());
        mapto.setPrintcount(mapfrom.getPrintcount());
        mapto.setPrinted(mapfrom.getPrinted());
        mapto.setPtratio(mapfrom.getPtratio());
        mapto.setServicewireno(mapfrom.getServicewireno());
        mapto.setStreet(mapfrom.getStreet());
        mapto.setSubdiscoid(mapfrom.getSubdiscoid());
        mapto.setSupplystructureid(mapfrom.getSupplystructureid());
        mapto.setSupplytype(mapfrom.getSupplytype());
        mapto.setTariff(mapfrom.getTariff());
        mapto.setTransfomerid(mapfrom.getTransfomerid());
        mapto.setTransformername(mapfrom.getTransformername());
        mapto.setLtpoleid(mapfrom.getLtpoleid());
        return mapto;
    }
    public static Customerhistory convertToCustomerhistory(Customerbk mapfrom,
            boolean g, String modifiedb) {
        if (mapfrom == null) {
            return null;
        }
        Customerhistory mapto = new Customerhistory();
        mapto.setComments(mapfrom.getComments());
        mapto.setCaptureddate(mapfrom.getCaptureddate());
        mapto.setCapturedby(mapfrom.getCapturedby());        
        mapto.setContractorid(mapfrom.getContractorid());        
        mapto.setLogindate(mapfrom.getLogindate());
        mapto.setLat(mapfrom.getLat());
        mapto.setLongs(mapfrom.getLongs());
        mapto.setMeternonew(mapfrom.getMeternonew());
        mapto.setCustomeraccountnonew(mapfrom.getCustomeraccountnonew());
        mapto.setDone(mapfrom.getDone());
        mapto.setPastedby(mapfrom.getPastedby() == null ? null : mapfrom.getPastedby().getId());
        mapto.setActualtariff(mapfrom.getActualtariff());
        mapto.setAddressonbill(mapfrom.getAddressonbill());
        mapto.setApproximatetotalratingofac(mapfrom.getApproximatetotalratingofac());
        mapto.setBillingtype(mapfrom.getBillingtype());
        mapto.setBuildingcodeid(mapfrom.getBuildingcodeid());
        mapto.setCustomernameonbill(mapfrom.getCustomernameonbill());
        mapto.setCableupriserid(mapfrom.getCableupriserid());
        mapto.setCallbackno(mapfrom.getCallbackno());
        mapto.setCin(mapfrom.getCin());
        mapto.setCity(mapfrom.getCity());
        mapto.setComment(mapfrom.getComment());
        mapto.setConnectiontype(mapfrom.getConnectiontype());
        mapto.setCtratio(mapfrom.getCtratio());
        mapto.setCustomeraccountno(mapfrom.getCustomeraccountno());
        mapto.setCustomerid(mapfrom.getCustomerid());
        mapto.setCustomerrelationid(mapfrom.getCustomerrelationid());
        mapto.setCustomernumber(mapfrom.getCustomernumber());
        mapto.setCustomerphoneno(mapfrom.getCustomerphoneno());
        mapto.setCutoutsize(mapfrom.getCutoutsize());
        mapto.setDials(mapfrom.getDials());
        mapto.setDiscoid(mapfrom.getDiscoid());
        mapto.setDone(mapfrom.getDone());
        mapto.setEdservicepointoid(mapfrom.getEdservicepointoid());
        mapto.setEmailaddress(mapfrom.getEmailaddress());
        mapto.setFeedername(mapfrom.getFeedername());
        mapto.setFeederid(mapfrom.getFeederid());
        mapto.setGpscoordinate(mapfrom.getGpscoordinate());
        mapto.setHtpoleid(mapfrom.getHtpoleid());
        mapto.setHouseno(mapfrom.getHouseno());
        mapto.setInjectionsubstationid(mapfrom.getInjectionsubstationid());
        mapto.setNameofdatacapturer(mapfrom.getNameofdatacapturer());
        mapto.setNatureofuseelectricity(mapfrom.getNatureofuseelectricity());
        mapto.setNumberofaircondictioner(mapfrom.getNumberofaircondictioner());
        mapto.setMeterbypass(mapfrom.getMeterbypass());
        mapto.setMeterdesigntype(mapfrom.getMeterdesigntype());
        mapto.setMeterno(mapfrom.getMeterno());
        mapto.setMeterreading(mapfrom.getMeterreading());
        mapto.setMetersealno(mapfrom.getMetersealno());
        mapto.setMeterstatus(mapfrom.getMeterstatus());
        mapto.setMultiplierfactoronmeter(mapfrom.getMultiplierfactoronmeter());
        mapto.setParent(new Customer(mapfrom.getId()));
        mapto.setPastedby(mapfrom.getPastedby() == null ? null : mapfrom.getPastedby().getId());
        mapto.setPasteddate(mapfrom.getPasteddate());
        mapto.setPhasedesignation(mapfrom.getPhasedesignation());
        mapto.setPhysicaladdress(mapfrom.getPhysicaladdress());
        mapto.setPlot(mapfrom.getPlot());
        mapto.setPowertrasformerid(mapfrom.getPowertrasformerid());
        mapto.setPremisestype(mapfrom.getPremisestype());
        mapto.setPrintcount(mapfrom.getPrintcount());
        mapto.setPrinted(mapfrom.getPrinted());
        mapto.setPtratio(mapfrom.getPtratio());
        mapto.setServicewireno(mapfrom.getServicewireno());
        mapto.setStreet(mapfrom.getStreet());
        mapto.setSubdiscoid(mapfrom.getSubdiscoid());
        mapto.setSupplystructureid(mapfrom.getSupplystructureid());
        mapto.setSupplytype(mapfrom.getSupplytype());
        mapto.setTariff(mapfrom.getTariff());
        mapto.setTransfomerid(mapfrom.getTransfomerid());
        mapto.setTransformername(mapfrom.getTransformername());
        mapto.setLtpoleid(mapfrom.getLtpoleid());

        return mapto;
    }
    
    public static Customer maptoCustomer(Customerdto mapfrom) {
        if (mapfrom == null) {
            return null;
        }
        Customer mapto = new Customer();
        mapto.setStatus(mapfrom.getStatus());

        mapto.setLastmodified(mapfrom.getLastmodified());
        mapto.setDateUploaded(mapfrom.getDateUploaded());
        mapto.setDatecreated(mapfrom.getDatecreated());
        mapto.setDistrictName(mapfrom.getDistrictName());
        mapto.setComments(mapfrom.getComments());
        mapto.setCaptureddate(mapfrom.getCaptureddate());
        mapto.setCapturedby(mapfrom.getCapturedby());        
        mapto.setContractorid(mapfrom.getContractorid());
        mapto.setLogindate(mapfrom.getLogindate());
        mapto.setLat(mapfrom.getLat());
        mapto.setBldcode(mapfrom.getBldcode());
        mapto.setBldcodefinal(mapfrom.getBldcodefinal());
        mapto.setBldcodefinalupdated(mapfrom.getBldcodefinalupdated());
        mapto.setLongs(mapfrom.getLongs());
        if (mapfrom.getLat().contains("-")) {
            mapto.setLat(getConvert(mapfrom.getLat()));
        }        
        if (mapfrom.getLongs().contains("-")) {
            mapto.setLongs(getConvert(mapfrom.getLongs()));
        }
        mapto.setMeternonew(mapfrom.getMeternonew());
        mapto.setCustomeraccountnonew(mapfrom.getCustomeraccountnonew());
        mapto.setDone(mapfrom.getDone());
        mapto.setPastedby(maptoUsers(mapfrom.getPastedby()));
        mapto.setActualtariff(mapfrom.getActualTariff());
        mapto.setAddressonbill(mapfrom.getAddressOnBill());
        mapto.setApproximatetotalratingofac(mapfrom.getApproximatetotalratingofac());
        mapto.setBillingtype(mapfrom.getBillingtype());
        mapto.setBuildingcodeid(mapfrom.getBuildingCodeID());
        mapto.setCustomernameonbill(mapfrom.getCUSTOMERNAMEonBILL());
        mapto.setCableupriserid(mapfrom.getCableUpriserID());
        mapto.setCallbackno(mapfrom.getCallBackNo());
        mapto.setCin(mapfrom.getCin());
        mapto.setCity(mapfrom.getCity());
        mapto.setComment(mapfrom.getComment());
        mapto.setConnectiontype(mapfrom.getConnectionType());
        mapto.setCtratio(mapfrom.getCtratio());
        mapto.setCustomeraccountno(mapfrom.getCustomerACCOUNTNO());
        mapto.setCustomerid(mapfrom.getCustomerID());
        mapto.setCustomerrelationid(mapfrom.getCustomerRelationID());
        mapto.setCustomernumber(mapfrom.getCustomernumber());
        mapto.setCustomerphoneno(mapfrom.getCustomerphoneno());
        mapto.setCutoutsize(mapfrom.getCutoutsize());
        mapto.setDials(mapfrom.getDials());
        mapto.setDiscoid(mapfrom.getDiscoID());
        mapto.setDone(mapfrom.getDone());
        mapto.setEdservicepointoid(mapfrom.getEDServicePointOID());
        mapto.setEmailaddress(mapfrom.getEMailaddress());
        mapto.setFeedername(mapfrom.getFeederName());
        mapto.setFeederid(mapfrom.getFeederid());
        mapto.setGpscoordinate(mapfrom.getGpscoordinate());
        mapto.setHtpoleid(mapfrom.getHTPoleID());
        mapto.setHouseno(mapfrom.getHouseNo());
        mapto.setId(mapfrom.getId());
        mapto.setInjectionsubstationid(mapfrom.getInjectionsubstationid());
        mapto.setNameofdatacapturer(mapfrom.getNameOfDataCapturer());
        mapto.setNatureofuseelectricity(mapfrom.getNatureOfUseElectricity());
        mapto.setNumberofaircondictioner(mapfrom.getNumberofaircondictioner());
        mapto.setMeterbypass(mapfrom.getMeterbyPass());
        mapto.setMeterdesigntype(mapfrom.getMeterdesigntype());
        mapto.setMeterno(mapfrom.getMeterno());
        mapto.setMeterreading(mapfrom.getMeterreading());
        mapto.setMetersealno(mapfrom.getMetersealno());
        mapto.setMeterstatus(mapfrom.getMeterstatus());
        mapto.setMultiplierfactoronmeter(mapfrom.getMultiplierfactoronmeter());
        mapto.setPasteddate(mapfrom.getPasteddate());
        mapto.setPhasedesignation(mapfrom.getPhasedesignation());
        mapto.setPhysicaladdress(mapfrom.getPhysicalAddress());
        mapto.setPlot(mapfrom.getPlot());
        mapto.setPowertrasformerid(mapfrom.getPowerTrasformerID());
        mapto.setPremisestype(mapfrom.getPremisestype());
        mapto.setPrintcount(mapfrom.getPrintcount());
        mapto.setPrinted(mapfrom.getPrinted());
        mapto.setPtratio(mapfrom.getPtratio());

        mapto.setServicewireno(mapfrom.getServiceWireNo());
        mapto.setStreet(mapfrom.getStreet());
        mapto.setSubdiscoid(mapfrom.getSubdiscoid());
        mapto.setSupplystructureid(mapfrom.getSupplystructureid());
        mapto.setSupplytype(mapfrom.getSupplytype());
        mapto.setTariff(mapfrom.getTariff());
        mapto.setTransfomerid(mapfrom.getTransfomerID());
        mapto.setTransformername(mapfrom.getTransformername());
        mapto.setLtpoleid(mapfrom.getLtpoleid());
        mapto.setBldcodefinal(mapfrom.getBldcodefinal());
        mapto.setBldcodefinalupdated(mapfrom.getBldcodefinalupdated());
        mapto.setBldcode(mapfrom.getBldcode());
        mapto.setDistrictName(mapfrom.getDistrictName());
mapto.setPasteddate(mapfrom.getPasteddate());
mapto.setDone(mapfrom.getDone());
mapto.setPastedby(maptoUsers(mapfrom.getPastedby()));
mapto.setLogindate(mapfrom.getLogindate());
mapto.setComments(mapfrom.getComments());
mapto.setComment(mapfrom.getComment());
        return mapto;
    }
    
    public static Customerdto maptoCustomerdto(Customer mapfrom) {
        if (mapfrom == null) {
            return null;
        }
        Customerdto mapto = new Customerdto();
        mapto.setStatus(mapfrom.getStatus());
        mapto.setLastmodified(mapfrom.getLastmodified());
        mapto.setDateUploaded(mapfrom.getDateUploaded());
        mapto.setDatecreated(mapfrom.getDatecreated());
        mapto.setComments(mapfrom.getComments());
        mapto.setCaptureddate(mapfrom.getCaptureddate());        
        mapto.setCapturedby(mapfrom.getCapturedby());
        mapto.setContractorid(mapfrom.getContractorid());
        mapto.setLogindate(mapfrom.getLogindate());
        mapto.setLat(mapfrom.getLat());
        mapto.setLongs(mapfrom.getLongs());
        if (mapfrom.getLat() !=null &&mapfrom.getLat().contains("-")) {
            mapto.setLat(getConvert(mapfrom.getLat()));
        }        
        if (mapfrom.getLongs()!=null && mapfrom.getLongs().contains("-")) {
            mapto.setLongs(getConvert(mapfrom.getLongs()));
        }
        mapto.setMeternonew(mapfrom.getMeternonew());
        
        mapto.setCustomeraccountnonew(mapfrom.getCustomeraccountnonew());
        mapto.setDone(mapfrom.getDone());
        mapto.setPastedby(maptoUsersdto(mapfrom.getPastedby()));
        mapto.setActualTariff(mapfrom.getActualtariff());
        mapto.setAddressOnBill(mapfrom.getAddressonbill());
        mapto.setApproximatetotalratingofac(mapfrom.getApproximatetotalratingofac());
        mapto.setBillingtype(mapfrom.getBillingtype());
        mapto.setBuildingCodeID(mapfrom.getBuildingcodeid());
        mapto.setCUSTOMERNAMEonBILL(mapfrom.getCustomernameonbill());
        mapto.setCableUpriserID(mapfrom.getCableupriserid());
        mapto.setCallBackNo(mapfrom.getCallbackno());
        mapto.setCin(mapfrom.getCin());
        mapto.setCity(mapfrom.getCity());
        mapto.setComment(mapfrom.getComment());
        mapto.setConnectionType(mapfrom.getConnectiontype());
        mapto.setCtratio(mapfrom.getCtratio());
        mapto.setCustomerACCOUNTNO(mapfrom.getCustomeraccountno());
        mapto.setCustomerID(mapfrom.getCustomerid());
        mapto.setCustomerRelationID(mapfrom.getCustomerrelationid());
        mapto.setCustomernumber(mapfrom.getCustomernumber());
        mapto.setCustomerphoneno(mapfrom.getCustomerphoneno());
        mapto.setCutoutsize(mapfrom.getCutoutsize());
        mapto.setDials(mapfrom.getDials());
        mapto.setDiscoID(mapfrom.getDiscoid());
        mapto.setDone(mapfrom.getDone());
        mapto.setEDServicePointOID(mapfrom.getEdservicepointoid());
        mapto.setEMailaddress(mapfrom.getEmailaddress());
        mapto.setFeederName(mapfrom.getFeedername());
        mapto.setFeederid(mapfrom.getFeederid());
        mapto.setGpscoordinate(mapfrom.getGpscoordinate());
        mapto.setHTPoleID(mapfrom.getHtpoleid());
        mapto.setHouseNo(mapfrom.getHouseno());
        mapto.setId(mapfrom.getId());
        mapto.setInjectionsubstationid(mapfrom.getInjectionsubstationid());
        mapto.setNameOfDataCapturer(mapfrom.getNameofdatacapturer());
        mapto.setNatureOfUseElectricity(mapfrom.getNatureofuseelectricity());
        mapto.setNumberofaircondictioner(mapfrom.getNumberofaircondictioner());
        mapto.setMeterbyPass(mapfrom.getMeterbypass());
        mapto.setMeterdesigntype(mapfrom.getMeterdesigntype());
        mapto.setMeterno(mapfrom.getMeterno());
        mapto.setMeterreading(mapfrom.getMeterreading());
        mapto.setMetersealno(mapfrom.getMetersealno());
        mapto.setMeterstatus(mapfrom.getMeterstatus());
        mapto.setMultiplierfactoronmeter(mapfrom.getMultiplierfactoronmeter());
        mapto.setPasteddate(mapfrom.getPasteddate());
        mapto.setPhasedesignation(mapfrom.getPhasedesignation());
        mapto.setPhysicalAddress(mapfrom.getPhysicaladdress());
        mapto.setPlot(mapfrom.getPlot());
        mapto.setPowerTrasformerID(mapfrom.getPowertrasformerid());
        mapto.setPremisestype(mapfrom.getPremisestype());
        mapto.setPrintcount(mapfrom.getPrintcount());
        mapto.setPrinted(mapfrom.getPrinted());
        mapto.setPtratio(mapfrom.getPtratio());
        mapto.setServiceWireNo(mapfrom.getServicewireno());
        mapto.setStreet(mapfrom.getStreet());
        mapto.setSubdiscoid(mapfrom.getSubdiscoid());
        mapto.setSupplystructureid(mapfrom.getSupplystructureid());
        mapto.setSupplytype(mapfrom.getSupplytype());
        mapto.setTariff(mapfrom.getTariff());
        mapto.setDistrictName(mapfrom.getDistrictName());
        mapto.setTransfomerID(mapfrom.getTransfomerid());
        mapto.setTransformername(mapfrom.getTransformername());
        mapto.setLtpoleid(mapfrom.getLtpoleid());
        mapto.setDistrictName(mapfrom.getDistrictName());
        mapto.setComments(mapfrom.getComments());
        mapto.setCaptureddate(mapfrom.getCaptureddate());
        mapto.setCapturedby(mapfrom.getCapturedby());
        mapto.setContractorid(mapfrom.getContractorid());
        mapto.setLogindate(mapfrom.getLogindate());
        mapto.setLat(mapfrom.getLat());
        mapto.setBldcode(mapfrom.getBldcode());
        mapto.setBldcodefinal(mapfrom.getBldcodefinal());
        mapto.setLongs(mapfrom.getLongs());
        if (mapfrom.getLat().contains("-")) {
            mapto.setLat(getConvert(mapfrom.getLat()));
        }
        if (mapfrom.getLongs().contains("-")) {
            mapto.setLongs(getConvert(mapfrom.getLongs()));
        }
        mapto.setMeternonew(mapfrom.getMeternonew());
        mapto.setCustomeraccountnonew(mapfrom.getCustomeraccountnonew());
        mapto.setDone(mapfrom.getDone());

        mapto.setActualTariff(mapfrom.getActualtariff());
        mapto.setAddressOnBill(mapfrom.getAddressonbill());
        mapto.setApproximatetotalratingofac(mapfrom.getApproximatetotalratingofac());
        mapto.setBillingtype(mapfrom.getBillingtype());
        mapto.setBuildingCodeID(mapfrom.getBuildingcodeid());
        mapto.setCUSTOMERNAMEonBILL(mapfrom.getCustomernameonbill());
        mapto.setCableUpriserID(mapfrom.getCableupriserid());
        mapto.setCallBackNo(mapfrom.getCallbackno());
        mapto.setCin(mapfrom.getCin());
        mapto.setCity(mapfrom.getCity());
        mapto.setComment(mapfrom.getComment());
        mapto.setConnectionType(mapfrom.getConnectiontype());
        mapto.setCtratio(mapfrom.getCtratio());
        mapto.setCustomerACCOUNTNO(mapfrom.getCustomeraccountno());
        mapto.setCustomerID(mapfrom.getCustomerid());
        mapto.setCustomerRelationID(mapfrom.getCustomerrelationid());
        mapto.setCustomernumber(mapfrom.getCustomernumber());
        mapto.setCustomerphoneno(mapfrom.getCustomerphoneno());
        mapto.setCutoutsize(mapfrom.getCutoutsize());
        mapto.setDials(mapfrom.getDials());

        mapto.setFeederName(mapfrom.getFeedername());
        mapto.setFeederid(mapfrom.getFeederid());
        mapto.setGpscoordinate(mapfrom.getGpscoordinate());
        mapto.setHTPoleID(mapfrom.getHtpoleid());
        mapto.setHouseNo(mapfrom.getHouseno());
        mapto.setId(mapfrom.getId());
        mapto.setInjectionsubstationid(mapfrom.getInjectionsubstationid());
        mapto.setNameOfDataCapturer(mapfrom.getNameofdatacapturer());
        mapto.setNatureOfUseElectricity(mapfrom.getNatureofuseelectricity());
        mapto.setNumberofaircondictioner(mapfrom.getNumberofaircondictioner());
        mapto.setMeterbyPass(mapfrom.getMeterbypass());
        mapto.setMeterdesigntype(mapfrom.getMeterdesigntype());
        mapto.setMeterno(mapfrom.getMeterno());
        mapto.setMeterreading(mapfrom.getMeterreading());
        mapto.setMetersealno(mapfrom.getMetersealno());
        mapto.setMeterstatus(mapfrom.getMeterstatus());
        mapto.setMultiplierfactoronmeter(mapfrom.getMultiplierfactoronmeter());
        mapto.setPasteddate(mapfrom.getPasteddate());
        mapto.setPhasedesignation(mapfrom.getPhasedesignation());
        mapto.setPhysicalAddress(mapfrom.getPhysicaladdress());
        mapto.setPlot(mapfrom.getPlot());
        mapto.setPowerTrasformerID(mapfrom.getPowertrasformerid());
        mapto.setPremisestype(mapfrom.getPremisestype());
        mapto.setPrintcount(mapfrom.getPrintcount());
        mapto.setPrinted(mapfrom.getPrinted());
        mapto.setPtratio(mapfrom.getPtratio());
        mapto.setServiceWireNo(mapfrom.getServicewireno());
        mapto.setStreet(mapfrom.getStreet());
        mapto.setSubdiscoid(mapfrom.getSubdiscoid());
        mapto.setSupplystructureid(mapfrom.getSupplystructureid());
        mapto.setSupplytype(mapfrom.getSupplytype());
        mapto.setTariff(mapfrom.getTariff());
        mapto.setTransfomerID(mapfrom.getTransfomerid());
        mapto.setTransformername(mapfrom.getTransformername());
        mapto.setLtpoleid(mapfrom.getLtpoleid());
        mapto.setBldcodefinal(mapfrom.getBldcodefinal());
        mapto.setBldcodefinalupdated(mapfrom.getBldcodefinalupdated());
        mapto.setBldcode(mapfrom.getBldcode());
        mapto.setLastmodified(mapfrom.getLastmodified());
        mapto.setDateUploaded(mapfrom.getDateUploaded());
        mapto.setDatecreated(mapfrom.getDatecreated());
        mapto.setDistrictName(mapfrom.getDistrictName());
        mapto.setPasteddate(mapfrom.getPasteddate());
        mapto.setDone(mapfrom.getDone());
        mapto.setPastedby(maptoUsersdto(mapfrom.getPastedby()));
        mapto.setLogindate(mapfrom.getLogindate());
        mapto.setComment(mapfrom.getComment());
        mapto.setComments(mapfrom.getComments());
        mapto.setBldcodefinalupdated(mapfrom.getBldcodefinalupdated());
        return mapto;
    }
    
    public static void selfCustomerddto(Customerdto mapfrom, Customerdto mapto) {
        mapto.setBldcodefinalupdated(mapfrom.getBldcodefinalupdated());
        mapto.setLastmodified(mapfrom.getLastmodified());
        mapto.setDateUploaded(mapfrom.getDateUploaded());
        mapto.setDatecreated(mapfrom.getDatecreated());
        mapto.setBldcodefinal(mapfrom.getBldcodefinal());
        mapto.setBldcodefinalupdated(mapfrom.getBldcodefinalupdated());
        mapto.setBldcode(mapfrom.getBldcode());
        mapto.setComments(mapfrom.getComments());
        mapto.setCaptureddate(mapfrom.getCaptureddate());
        mapto.setCapturedby(mapfrom.getCapturedby());
        mapto.setUpriser(mapfrom.getUpriser());
        mapto.setContractorid(mapfrom.getContractorid());
        mapto.setLogindate(mapfrom.getLogindate());
        mapto.setLat(mapfrom.getLat());
        mapto.setLtpoleid(mapfrom.getLtpoleid());
        mapto.setLongs(mapfrom.getLongs());
        mapto.setMeternonew(mapfrom.getMeternonew());
        mapto.setCustomeraccountnonew(mapfrom.getCustomeraccountnonew());
        mapto.setDone(mapfrom.getDone());
        mapto.setPastedby(mapfrom.getPastedby());
        mapto.setActualTariff(mapfrom.getActualTariff());
        mapto.setAddressOnBill(mapfrom.getAddressOnBill());
        mapto.setApproximatetotalratingofac(mapfrom.getApproximatetotalratingofac());
        mapto.setBillingtype(mapfrom.getBillingtype());
        mapto.setBuildingCodeID(mapfrom.getBuildingCodeID());
        mapto.setCUSTOMERNAMEonBILL(mapfrom.getCUSTOMERNAMEonBILL());
        mapto.setCableUpriserID(mapfrom.getCableUpriserID());
        mapto.setCallBackNo(mapfrom.getCallBackNo());
        mapto.setCin(mapfrom.getCin());
        mapto.setCity(mapfrom.getCity());
        mapto.setComment(mapfrom.getComment());
        mapto.setConnectionType(mapfrom.getConnectionType());
        mapto.setCtratio(mapfrom.getCtratio());
        mapto.setCustomerACCOUNTNO(mapfrom.getCustomerACCOUNTNO());
        mapto.setCustomerID(mapfrom.getCustomerID());
        mapto.setCustomerRelationID(mapfrom.getCustomerRelationID());
        mapto.setCustomernumber(mapfrom.getCustomernumber());
        mapto.setCustomerphoneno(mapfrom.getCustomerphoneno());
        mapto.setCutoutsize(mapfrom.getCutoutsize());
        mapto.setDials(mapfrom.getDials());
        mapto.setDiscoID(mapfrom.getDiscoID());
        mapto.setDone(mapfrom.getDone());
        mapto.setEDServicePointOID(mapfrom.getEDServicePointOID());
        mapto.setEMailaddress(mapfrom.getEMailaddress());
        mapto.setFeederName(mapfrom.getFeederName());
        mapto.setFeederid(mapfrom.getFeederid());
        mapto.setGpscoordinate(mapfrom.getGpscoordinate());
        mapto.setHTPoleID(mapfrom.getHTPoleID());
        mapto.setHouseNo(mapfrom.getHouseNo());
        mapto.setId(mapfrom.getId());
        mapto.setInjectionsubstationid(mapfrom.getInjectionsubstationid());
        mapto.setNameOfDataCapturer(mapfrom.getNameOfDataCapturer());
        mapto.setNatureOfUseElectricity(mapfrom.getNatureOfUseElectricity());
        mapto.setNumberofaircondictioner(mapfrom.getNumberofaircondictioner());
        mapto.setMeterbyPass(mapfrom.getMeterbyPass());
        mapto.setMeterdesigntype(mapfrom.getMeterdesigntype());
        mapto.setMeterno(mapfrom.getMeterno());
        mapto.setMeterreading(mapfrom.getMeterreading());
        mapto.setMetersealno(mapfrom.getMetersealno());
        mapto.setMeterstatus(mapfrom.getMeterstatus());
        mapto.setMultiplierfactoronmeter(mapfrom.getMultiplierfactoronmeter());
        mapto.setPasteddate(mapfrom.getPasteddate());
        mapto.setPhasedesignation(mapfrom.getPhasedesignation());
        mapto.setPhysicalAddress(mapfrom.getPhysicalAddress());
        mapto.setPlot(mapfrom.getPlot());
        mapto.setPowerTrasformerID(mapfrom.getPowerTrasformerID());
        mapto.setPremisestype(mapfrom.getPremisestype());
        mapto.setPrintcount(mapfrom.getPrintcount());
        mapto.setPrinted(mapfrom.getPrinted());
        mapto.setPtratio(mapfrom.getPtratio());
        mapto.setServiceWireNo(mapfrom.getServiceWireNo());
        mapto.setStreet(mapfrom.getStreet());
        mapto.setSubdiscoid(mapfrom.getSubdiscoid());
        mapto.setSupplystructureid(mapfrom.getSupplystructureid());
        mapto.setSupplytype(mapfrom.getSupplytype());
        mapto.setTariff(mapfrom.getTariff());
        mapto.setTransfomerID(mapfrom.getTransfomerID());
        mapto.setTransformername(mapfrom.getTransformername());
        mapto.setLongs(mapfrom.getLongs());
        mapto.setLat(mapfrom.getLat());
        mapto.setDistrictName(mapfrom.getDistrictName());
    }
    
    public static List<Customerdto> maptoCustomerdtoList(List<Customer> mapfrom) {
        if (mapfrom == null) {
            return null;
        }
        List<Customerdto> list = new ArrayList<>();
        for (Customer rs : mapfrom) {
            list.add(maptoCustomerdto(rs));
        }
        return list;
    }
    
    public static List<Customer> maptoCustomerList(List<Customerdto> mapfrom) {
        if (mapfrom == null) {
            return null;
        }
        List<Customer> list = new ArrayList<>();
        for (Customerdto rs : mapfrom) {
            
            list.add(maptoCustomer(rs));
        }
        return list;
    }
    
    public static Users maptoUsers(Usersdto mapfrom) {
        if (mapfrom == null) {
            return null;
        }
        Users mapto = new Users();
        mapto.setEmail(mapfrom.getEmail());
        mapto.setId(mapfrom.getId());
        mapto.setPassword(mapfrom.getPassword());
        mapto.setRolesid(maptoUserroles(mapfrom.getRolesid()));
        mapto.setUsername(mapfrom.getUsername());
        mapto.setDatecreated(mapfrom.getDatecreated());
        mapto.setLastmodify(mapfrom.getLastmodify());
        mapto.setLastlogin(mapfrom.getLastlogin());
        mapto.setCreatedby(mapfrom.getCreatedby());
        mapto.setStaffid(maptoStaff(mapfrom.getStaffid()));
        mapto.setContractorid(mapfrom.getContractorid());
        return mapto;
    }
    
    public static Usersdto maptoUsersdto(Users mapfrom) {
        if (mapfrom == null) {
            return null;
        }
        Usersdto mapto = new Usersdto();
        mapto.setEmail(mapfrom.getEmail());
        mapto.setId(mapfrom.getId());
        mapto.setPassword(mapfrom.getPassword());
        mapto.setRolesid(maptoUserrolesdto(mapfrom.getRolesid()));
        mapto.setUsername(mapfrom.getUsername());
        mapto.setDatecreated(mapfrom.getDatecreated());
        mapto.setLastmodify(mapfrom.getLastmodify());
        mapto.setLastlogin(mapfrom.getLastlogin());
        mapto.setCreatedby(mapfrom.getCreatedby());
        mapto.setStaffid(maptoStaffdto(mapfrom.getStaffid()));
        mapto.setContractorid(mapfrom.getContractorid());
        return mapto;
    }
    
    public static List<Usersdto> maptoUsersdtoList(List<Users> mapfrom) {
        if (mapfrom == null) {
            return null;
        }
        List<Usersdto> list = new ArrayList<>();
        for (Users rs : mapfrom) {
            list.add(maptoUsersdto(rs));
        }
        return list;
    }
    
    public static List<Users> maptoUsersList(List<Usersdto> mapfrom) {
        if (mapfrom == null) {
            return null;
        }
        List<Users> list = new ArrayList<>();
        for (Usersdto rs : mapfrom) {
            list.add(maptoUsers(rs));
        }
        return list;
    }
    
    public static Userroles maptoUserroles(Userrolesdto mapfrom) {
        if (mapfrom == null) {
            return null;
        }
        Userroles mapto = new Userroles();
        mapto.setDatecreated(mapfrom.getDatecreated());
        mapto.setDescription(mapfrom.getDescription());
        mapto.setId(mapfrom.getId());
        mapto.setCanaddstaff(mapfrom.getCanaddstaff());
        mapto.setCanadduser(mapfrom.getCanadduser());
        mapto.setCandelete(mapfrom.getCandelete());
        mapto.setCanedit(mapfrom.getCanedit());
        mapto.setCanprint(mapfrom.getCanprint());
        mapto.setCanviewlog(mapfrom.getCanviewlog());
        return mapto;
    }
    
    public static Userrolesdto maptoUserrolesdto(Userroles mapfrom) {
        if (mapfrom == null) {
            return null;
        }
        Userrolesdto mapto = new Userrolesdto();
        mapto.setDatecreated(mapfrom.getDatecreated());
        mapto.setDescription(mapfrom.getDescription());
        mapto.setId(mapfrom.getId());
        mapto.setCanaddstaff(mapfrom.getCanaddstaff());
        mapto.setCanadduser(mapfrom.getCanadduser());
        mapto.setCandelete(mapfrom.getCandelete());
        mapto.setCanedit(mapfrom.getCanedit());
        mapto.setCanprint(mapfrom.getCanprint());
        mapto.setCanviewlog(mapfrom.getCanviewlog());
        return mapto;
    }
    
    public static List<Userrolesdto> maptoUserrolesdtoList(List<Userroles> mapfrom) {
        if (mapfrom == null) {
            return null;
        }
        List<Userrolesdto> list = new ArrayList<>();
        for (Userroles rs : mapfrom) {
            list.add(maptoUserrolesdto(rs));
        }
        return list;
    }
    
    public static Statelga maptoStatelga(Statelgadto mapfrom) {
        if (mapfrom == null) {
            return null;
        }
        Statelga mapto = new Statelga();
        mapto.setDateCreated(mapfrom.getDateCreated());
        mapto.setDescription(mapfrom.getDescription());
        mapto.setLgaId(mapfrom.getLgaId());
        mapto.setLgacode(mapfrom.getLgacode());
        mapto.setState(maptoState(mapfrom.getState()));
        mapto.setStatecode(mapfrom.getStatecode());
        return mapto;
    }
    
    public static Statelgadto maptoStatelgadto(Statelga mapfrom) {
        if (mapfrom == null) {
            return null;
        }
        Statelgadto mapto = new Statelgadto();
        mapto.setDateCreated(mapfrom.getDateCreated());
        mapto.setDescription(mapfrom.getDescription());
        mapto.setLgaId(mapfrom.getLgaId());
        mapto.setLgacode(mapfrom.getLgacode());
        mapto.setState(maptoStatedto(mapfrom.getState()));
        mapto.setStatecode(mapfrom.getStatecode());
        return mapto;
    }
    
    public static List<Statelgadto> maptoStatelgadtoList(List<Statelga> mapfrom) {
        if (mapfrom == null) {
            return null;
        }
        List<Statelgadto> list = new ArrayList<>();
        for (Statelga rs : mapfrom) {
            list.add(maptoStatelgadto(rs));
        }
        return list;
    }
    
    public static State maptoState(Statedto mapfrom) {
        if (mapfrom == null) {
            return null;
        }
        State mapto = new State();
        mapto.setDateCreated(mapfrom.getDateCreated());
        mapto.setDescription(mapfrom.getDescription());
        mapto.setStateId(mapfrom.getStateId());
        return mapto;
    }
    
    public static Statedto maptoStatedto(State mapfrom) {
        if (mapfrom == null) {
            return null;
        }
        Statedto mapto = new Statedto();
        mapto.setDateCreated(mapfrom.getDateCreated());
        mapto.setDescription(mapfrom.getDescription());
        mapto.setStateId(mapfrom.getStateId());
        return mapto;
    }
    
    public static List<Statedto> maptoStatedtoList(List<State> mapfrom) {
        if (mapfrom == null) {
            return null;
        }
        List<Statedto> list = new ArrayList<>();
        for (State rs : mapfrom) {
            list.add(maptoStatedto(rs));
        }
        return list;
    }
    
    public static List<State> maptoStateList(List<Statedto> mapfrom) {
        if (mapfrom == null) {
            return null;
        }
        List<State> list = new ArrayList<>();
        for (Statedto rs : mapfrom) {
            list.add(maptoState(rs));
        }
        return list;
    }
    
    public static Staff maptoStaff(Staffdto mapfrom) {
        if (mapfrom == null) {
            return null;
        }
        Staff mapto = new Staff();
        mapto.setContactemail(mapfrom.getContactemail());
        mapto.setContactmobile(mapfrom.getContactmobile());
        mapto.setFullname(mapfrom.getFullname());
        mapto.setGender(mapfrom.getGender());
        mapto.setId(mapfrom.getId());
        mapto.setDatecreated(mapfrom.getDatecreated());
        mapto.setLastmodify(mapfrom.getLastmodify());
        mapto.setCreatedby(mapfrom.getCreatedby());
        mapto.setStaffno(mapfrom.getStaffno());
        mapto.setContractorid(mapfrom.getContractorid());
        return mapto;
    }
    
    public static Staffdto maptoStaffdto(Staff mapfrom) {
        if (mapfrom == null) {
            return null;
        }
        Staffdto mapto = new Staffdto();
        mapto.setContactemail(mapfrom.getContactemail());
        mapto.setContactmobile(mapfrom.getContactmobile());
        mapto.setFullname(mapfrom.getFullname());
        mapto.setGender(mapfrom.getGender());
        mapto.setId(mapfrom.getId());
        mapto.setDatecreated(mapfrom.getDatecreated());
        mapto.setLastmodify(mapfrom.getLastmodify());
        mapto.setCreatedby(mapfrom.getCreatedby());
        mapto.setStaffno(mapfrom.getStaffno());
        mapto.setContractorid(mapfrom.getContractorid());
        return mapto;
    }
    
    public static List<Staffdto> maptoStaffdtoList(List<Staff> mapfrom) {
        if (mapfrom == null) {
            return null;
        }
        List<Staffdto> list = new ArrayList<>();
        for (Staff rs : mapfrom) {
            list.add(maptoStaffdto(rs));
        }
        return list;
    }
    
    public static List<Staff> maptoStaffList(List<Staffdto> mapfrom) {
        if (mapfrom == null) {
            return null;
        }
        List<Staff> list = new ArrayList<>();
        for (Staffdto rs : mapfrom) {
            list.add(maptoStaff(rs));
        }
        return list;
    }
    
    public static District maptoDistrict(Districtdto mapfrom) {
        if (mapfrom == null) {
            return null;
        }
        District mapto = new District();
        mapto.setDatecreated(mapfrom.getDatecreated());
        mapto.setDescription(mapfrom.getDescription());
        mapto.setId(mapfrom.getId());
        return mapto;
    }
    
    public static Districtdto maptoDistrictdto(District mapfrom) {
        if (mapfrom == null) {
            return null;
        }
        Districtdto mapto = new Districtdto();
        mapto.setDatecreated(mapfrom.getDatecreated());
        mapto.setDescription(mapfrom.getDescription());
        mapto.setId(mapfrom.getId());
        return mapto;
    }
    
    public static List<District> maptoDistrictList(List<Districtdto> mapfrom) {
        if (mapfrom == null) {
            return null;
        }
        List<District> list = new ArrayList<>();
        for (Districtdto rs : mapfrom) {
            list.add(maptoDistrict(rs));
        }
        return list;
    }
    
    public static List<Districtdto> maptoDistrictdtoList(List<District> mapfrom) {
        if (mapfrom == null) {
            return null;
        }
        List<Districtdto> list = new ArrayList<>();
        for (District rs : mapfrom) {
            list.add(maptoDistrictdto(rs));
        }
        return list;
    }
    
    public static Feeder maptoFeeder(Feederdto mapfrom) {
        if (mapfrom == null) {
            return null;
        }
        Feeder mapto = new Feeder();
        mapto.setDatecreated(mapfrom.getDatecreated());
        mapto.setDescription(mapfrom.getDescription());
        mapto.setId(mapfrom.getId());
        mapto.setBusinessunitid(maptoDistrict(mapfrom.getBusinessunitid()));
        mapto.setCategory(mapfrom.getCategory());
        return mapto;
    }
    
    public static Feederdto maptoFeederdto(Feeder mapfrom) {
        if (mapfrom == null) {
            return null;
        }
        Feederdto mapto = new Feederdto();
        mapto.setDatecreated(mapfrom.getDatecreated());
        mapto.setDescription(mapfrom.getDescription());
        mapto.setId(mapfrom.getId());
        mapto.setBusinessunitid(maptoDistrictdto(mapfrom.getBusinessunitid()));
        mapto.setCategory(mapfrom.getCategory());
        return mapto;
    }
    
    public static List<Feederdto> maptoFeederdtoList(List<Feeder> mapfrom) {
        if (mapfrom == null) {
            return null;
        }
        List<Feederdto> list = new ArrayList<>();
        for (Feeder rs : mapfrom) {
            list.add(maptoFeederdto(rs));
        }
        return list;
    }
    
    public static List<Feeder> maptoFeederList(List<Feederdto> mapfrom) {
        if (mapfrom == null) {
            return null;
        }
        List<Feeder> list = new ArrayList<>();
        for (Feederdto rs : mapfrom) {
            list.add(maptoFeeder(rs));
        }
        return list;
    }
    
    public static Applog maptoApplog(Applogdto mapfrom) {
        if (mapfrom == null) {
            return null;
        }
        Applog mapto = new Applog();
        mapto.setActivatorid(mapfrom.getActivatorid());
        mapto.setActivatorname(mapfrom.getActivatorname());
        mapto.setDatelog(mapfrom.getDatelog());
        mapto.setDescription(mapfrom.getDescription());
        mapto.setId(mapfrom.getId());
        mapto.setInstitution(mapfrom.getInstitution());
        return mapto;
    }
    
    public static Applogdto maptoApplogdto(Applog mapfrom) {
        if (mapfrom == null) {
            return null;
        }
        Applogdto mapto = new Applogdto();
        mapto.setActivatorid(mapfrom.getActivatorid());
        mapto.setActivatorname(mapfrom.getActivatorname());
        mapto.setDatelog(mapfrom.getDatelog());
        mapto.setDescription(mapfrom.getDescription());
        mapto.setId(mapfrom.getId());
        mapto.setInstitution(mapfrom.getInstitution());
        return mapto;
    }
    
    public static List<Applogdto> maptoApplogList(List<Applog> mapfrom) {
        if (mapfrom == null) {
            return null;
        }
        List<Applogdto> list = new ArrayList<>();
        for (Applog rs : mapfrom) {
            list.add(maptoApplogdto(rs));
        }
        return list;
    }
}
