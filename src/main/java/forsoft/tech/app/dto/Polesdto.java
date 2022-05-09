/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forsoft.tech.app.dto;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import java.util.Date;
import java.util.List;

/**
 *
 * 
 */




 
@ManagedBean
@SessionScoped 
public class Polesdto implements Dto {

    private Integer id;
    private String newpoleno;
    private String contractorid;
    private String latitude;
    private String longitude;
    private String creationuser;
    
    private Date logindate;
    
    private String datecreated;
    
    
    
    private String datemodified;
    
    
    
    private String lastuser;
    
    
    
    private String datasource;
    
    
    
    private String comments;
    
    
    
    private String facilityid;
    
    
    
    private String subtypecd;
    
    
    
    private String contractno;
    
    
    
    private String contractor;
    
    
    
    private String consultant;
    
    
    
    private String installationdate;
    
    
    
    private String lastmaintenancedate;
    
    
    
    private String status;
    
    
    
    private String locationID;
    
    
    
    private String hyperLink;
    
    
    
    private String manufacturer;
    
    
    
    private String material;
    
    
    
    private String earthingtype;
    
    
    
    private String foundationtype;
    
    
    
    private String polecount;
    
    
    
    private String poletype;
    
    
    
    private String groundedindicator;
    
    
    
    private String height;
    
    
    
    private String manufacturingyear;
    
    
    
    private String streetlightindicator;
    
    
    
    private String treatmenttype;
    
    
    
    private String anchorguyindicator;
    
    
    
    private String symbolrotation;
    
    
    
    private String polestatus;
    
    
    
    private String basestatus;
    
    
    
    private String groundconnected;
    
    
    
    private String groundsize;
    
    
    
    private String dangerplateavailability;
    
    
    
    private String protectionpinavailability;
    
    
    
    private String landownership;
    
    
    
    private String insulatortype;
    
    
    
    private String insulatormaterial;
    
    
    
    private String insulatorstatus;
    
    
    
    private String insulatorcleaness;
    
    
    
    private String connectednetwork;
    
    
    
    private String enabled;
    
    
    
    private String transformer;
    
    
    
    private String feederid;
    
    
    
    private String lTPoleID;
    
    
    
    private String cableUpriserID;
    
    
    
    private String crossArmIndicator;
    
    
    
    private String tieTrapIndicator;
    
    
    
    private String supportStructureID;
    
    
    
    private String crossArmTieCondition;
    
    
    
    private String crossArmType;
    
    
    
    private String tieTrapCondition;
    
    
    
    private String injectionSubstation;
    
    
    
    private String hTSupportStructureNO;
    
    
    
    private String lTSupportStructureNO;
    
    private Boolean done;
    
    
    private Date datepasted;
    
    private Boolean print;
    
    private Integer printcount;
    
    
    private Usersdto pastedby;
    
    private List<Poleshistorydto> poleshistoryList;

    public Polesdto() {
    }

    public Polesdto(Integer id) {
        this.id = id;
    }

    public String getContractorid() {
        return contractorid;
    }

    public void setContractorid(String contractorid) {
        this.contractorid = contractorid;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCreationuser() {
        return creationuser;
    }

    public void setCreationuser(String creationuser) {
        this.creationuser = creationuser;
    }

    public String getDatecreated() {
        return datecreated;
    }

    public void setDatecreated(String datecreated) {
        this.datecreated = datecreated;
    }

    public String getDatemodified() {
        return datemodified;
    }

    public void setDatemodified(String datemodified) {
        this.datemodified = datemodified;
    }

    public String getLastuser() {
        return lastuser;
    }

    public void setLastuser(String lastuser) {
        this.lastuser = lastuser;
    }

    public String getDatasource() {
        return datasource;
    }

    public void setDatasource(String datasource) {
        this.datasource = datasource;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public String getFacilityid() {
        return facilityid;
    }

    public void setFacilityid(String facilityid) {
        this.facilityid = facilityid;
    }

    public String getSubtypecd() {
        return subtypecd;
    }

    public void setSubtypecd(String subtypecd) {
        this.subtypecd = subtypecd;
    }

    public String getContractno() {
        return contractno;
    }

    public void setContractno(String contractno) {
        this.contractno = contractno;
    }

    public String getContractor() {
        return contractor;
    }

    public void setContractor(String contractor) {
        this.contractor = contractor;
    }

    public String getConsultant() {
        return consultant;
    }

    public void setConsultant(String consultant) {
        this.consultant = consultant;
    }

    public String getInstallationdate() {
        return installationdate;
    }

    public void setInstallationdate(String installationdate) {
        this.installationdate = installationdate;
    }

    public String getLastmaintenancedate() {
        return lastmaintenancedate;
    }

    public void setLastmaintenancedate(String lastmaintenancedate) {
        this.lastmaintenancedate = lastmaintenancedate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }


    public String getLocationID() {
        return locationID;
    }

    public void setLocationID(String locationID) {
        this.locationID = locationID;
    }

    public String getHyperLink() {
        return hyperLink;
    }

    public void setHyperLink(String hyperLink) {
        this.hyperLink = hyperLink;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getEarthingtype() {
        return earthingtype;
    }

    public void setEarthingtype(String earthingtype) {
        this.earthingtype = earthingtype;
    }

    public String getFoundationtype() {
        return foundationtype;
    }

    public void setFoundationtype(String foundationtype) {
        this.foundationtype = foundationtype;
    }

    public String getPolecount() {
        return polecount;
    }

    public void setPolecount(String polecount) {
        this.polecount = polecount;
    }

    public String getPoletype() {
        return poletype;
    }

    public void setPoletype(String poletype) {
        this.poletype = poletype;
    }

    public String getGroundedindicator() {
        return groundedindicator;
    }

    public void setGroundedindicator(String groundedindicator) {
        this.groundedindicator = groundedindicator;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public String getManufacturingyear() {
        return manufacturingyear;
    }

    public void setManufacturingyear(String manufacturingyear) {
        this.manufacturingyear = manufacturingyear;
    }

    public String getStreetlightindicator() {
        return streetlightindicator;
    }

    public void setStreetlightindicator(String streetlightindicator) {
        this.streetlightindicator = streetlightindicator;
    }

    public String getTreatmenttype() {
        return treatmenttype;
    }

    public void setTreatmenttype(String treatmenttype) {
        this.treatmenttype = treatmenttype;
    }

    public String getAnchorguyindicator() {
        return anchorguyindicator;
    }

    public void setAnchorguyindicator(String anchorguyindicator) {
        this.anchorguyindicator = anchorguyindicator;
    }

    public String getSymbolrotation() {
        return symbolrotation;
    }

    public void setSymbolrotation(String symbolrotation) {
        this.symbolrotation = symbolrotation;
    }

    public String getPolestatus() {
        return polestatus;
    }

    public void setPolestatus(String polestatus) {
        this.polestatus = polestatus;
    }

    public String getBasestatus() {
        return basestatus;
    }

    public void setBasestatus(String basestatus) {
        this.basestatus = basestatus;
    }

    public String getGroundconnected() {
        return groundconnected;
    }

    public void setGroundconnected(String groundconnected) {
        this.groundconnected = groundconnected;
    }

    public String getGroundsize() {
        return groundsize;
    }

    public void setGroundsize(String groundsize) {
        this.groundsize = groundsize;
    }

    public String getDangerplateavailability() {
        return dangerplateavailability;
    }

    public void setDangerplateavailability(String dangerplateavailability) {
        this.dangerplateavailability = dangerplateavailability;
    }

    public String getProtectionpinavailability() {
        return protectionpinavailability;
    }

    public void setProtectionpinavailability(String protectionpinavailability) {
        this.protectionpinavailability = protectionpinavailability;
    }

    public String getLandownership() {
        return landownership;
    }

    public void setLandownership(String landownership) {
        this.landownership = landownership;
    }

    public String getInsulatortype() {
        return insulatortype;
    }

    public void setInsulatortype(String insulatortype) {
        this.insulatortype = insulatortype;
    }

    public String getInsulatormaterial() {
        return insulatormaterial;
    }

    public void setInsulatormaterial(String insulatormaterial) {
        this.insulatormaterial = insulatormaterial;
    }

    public String getInsulatorstatus() {
        return insulatorstatus;
    }

    public void setInsulatorstatus(String insulatorstatus) {
        this.insulatorstatus = insulatorstatus;
    }

    public String getInsulatorcleaness() {
        return insulatorcleaness;
    }

    public void setInsulatorcleaness(String insulatorcleaness) {
        this.insulatorcleaness = insulatorcleaness;
    }

    public String getConnectednetwork() {
        return connectednetwork;
    }

    public void setConnectednetwork(String connectednetwork) {
        this.connectednetwork = connectednetwork;
    }

    public String getEnabled() {
        return enabled;
    }

    public void setEnabled(String enabled) {
        this.enabled = enabled;
    }

    public String getTransformer() {
        return transformer;
    }

    public void setTransformer(String transformer) {
        this.transformer = transformer;
    }

    public String getFeederid() {
        return feederid;
    }

    public void setFeederid(String feederid) {
        this.feederid = feederid;
    }

    public String getLTPoleID() {
        return lTPoleID;
    }

    public void setLTPoleID(String lTPoleID) {
        this.lTPoleID = lTPoleID;
    }

    public String getCableUpriserID() {
        return cableUpriserID;
    }

    public void setCableUpriserID(String cableUpriserID) {
        this.cableUpriserID = cableUpriserID;
    }

    public String getCrossArmIndicator() {
        return crossArmIndicator;
    }

    public void setCrossArmIndicator(String crossArmIndicator) {
        this.crossArmIndicator = crossArmIndicator;
    }

    public String getNewpoleno() {
        return newpoleno;
    }

    public void setNewpoleno(String newpoleno) {
        this.newpoleno = newpoleno;
    }

    public String getlTPoleID() {
        return lTPoleID;
    }

    public void setlTPoleID(String lTPoleID) {
        this.lTPoleID = lTPoleID;
    }

    public String gethTSupportStructureNO() {
        return hTSupportStructureNO;
    }

    public void sethTSupportStructureNO(String hTSupportStructureNO) {
        this.hTSupportStructureNO = hTSupportStructureNO;
    }

    public String getlTSupportStructureNO() {
        return lTSupportStructureNO;
    }

    public void setlTSupportStructureNO(String lTSupportStructureNO) {
        this.lTSupportStructureNO = lTSupportStructureNO;
    }

    public String getTieTrapIndicator() {
        return tieTrapIndicator;
    }

    public void setTieTrapIndicator(String tieTrapIndicator) {
        this.tieTrapIndicator = tieTrapIndicator;
    }

    public String getSupportStructureID() {
        return supportStructureID;
    }

    public void setSupportStructureID(String supportStructureID) {
        this.supportStructureID = supportStructureID;
    }

    public String getCrossArmTieCondition() {
        return crossArmTieCondition;
    }

    public void setCrossArmTieCondition(String crossArmTieCondition) {
        this.crossArmTieCondition = crossArmTieCondition;
    }

    public String getCrossArmType() {
        return crossArmType;
    }

    public void setCrossArmType(String crossArmType) {
        this.crossArmType = crossArmType;
    }

    public String getTieTrapCondition() {
        return tieTrapCondition;
    }

    public void setTieTrapCondition(String tieTrapCondition) {
        this.tieTrapCondition = tieTrapCondition;
    }

    public String getInjectionSubstation() {
        return injectionSubstation;
    }

    public void setInjectionSubstation(String injectionSubstation) {
        this.injectionSubstation = injectionSubstation;
    }

    public String getHTSupportStructureNO() {
        return hTSupportStructureNO;
    }

    public void setHTSupportStructureNO(String hTSupportStructureNO) {
        this.hTSupportStructureNO = hTSupportStructureNO;
    }

    public String getLTSupportStructureNO() {
        return lTSupportStructureNO;
    }

    public void setLTSupportStructureNO(String lTSupportStructureNO) {
        this.lTSupportStructureNO = lTSupportStructureNO;
    }

    public Boolean getDone() {
        return done;
    }

    public void setDone(Boolean done) {
        this.done = done;
    }

    public Date getDatepasted() {
        return datepasted;
    }

    public void setDatepasted(Date datepasted) {
        this.datepasted = datepasted;
    }

    public Boolean getPrint() {
        return print;
    }

    public void setPrint(Boolean print) {
        this.print = print;
    }

    public Integer getPrintcount() {
        return printcount;
    }

    public void setPrintcount(Integer printcount) {
        this.printcount = printcount;
    }

    public Usersdto getPastedby() {
        return pastedby;
    }

    public void setPastedby(Usersdto pastedby) {
        this.pastedby = pastedby;
    }

    
    public List<Poleshistorydto> getPoleshistoryList() {
        return poleshistoryList;
    }

    public void setPoleshistoryList(List<Poleshistorydto> poleshistoryList) {
        this.poleshistoryList = poleshistoryList;
    }

    public Date getLogindate() {
        return logindate;
    }

    public void setLogindate(Date logindate) {
        this.logindate = logindate;
    }

    
    
}
