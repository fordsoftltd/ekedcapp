/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forsoft.tech.app.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author odofintimothy
 */
@Entity
@Table(name = "building")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Building.findAll", query = "SELECT b FROM Building b")})
public class Building implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Long id;
    @Column(name = "ancillaryrole")
    private String ancillaryrole;
    @Column(name = "enabled")
    private String enabled;
    @Column(name = "feederid")
    private String feederid;
    @Column(name = "feederid2")
    private String feederid2;
    @Column(name = "feederinfo")
    private String feederinfo;
    @Column(name = "electrictraceweight")
    private String electrictraceweight;
    @Column(name = "creationuser")
    private String creationuser;
    @Column(name = "datecreated")
    @Temporal(TemporalType.TIMESTAMP)
    private Date datecreated;
    @Column(name = "datemodified")
    @Temporal(TemporalType.TIMESTAMP)
    private Date datemodified;
    @Column(name = "lastuser")
    private String lastuser;
    @Column(name = "datasource")
    private String datasource;
    @Lob
    @Column(name = "comments")
    private String comments;
    @Column(name = "locationid")
    private String locationid;
    @Column(name = "hyperlink")
    private String hyperlink;
    @Column(name = "subtypecd")
    private String subtypecd;
    @Column(name = "consultant")
    private String consultant;
    @Column(name = "contractor")
    private String contractor;
    @Column(name = "installationdate")
    private String installationdate;
    @Column(name = "energizationdate")
    private String energizationdate;
    
    @Column(name = "lastmaintenancedate")
    private String lastmaintenancedate;
    @Column(name = "status")
    private String status;
    @Column(name = "facilityid")
    private String facilityid;
    @Column(name = "phasedesignation")
    private String phasedesignation;
    @Column(name = "connectiontype")
    private String connectiontype;
    @Column(name = "cutoutsize")
    private String cutoutsize;
    @Column(name = "demanddkw")
    private String demanddkw;
    @Column(name = "voltagelevelkv")
    private String voltagelevelkv;
    @Column(name = "address")
    private String address;
    @Column(name = "servicecurrentrating")
    private String servicecurrentrating;
    @Column(name = "operatingvoltage")
    private String operatingvoltage;
    @Column(name = "symbolrotation")
    private String symbolrotation;
    @Column(name = "customerrelationid")
    private String customerrelationid;
    @Column(name = "edservicepointoid")
    private String edservicepointoid;
    @Column(name = "cableupriserid")
    private String cableupriserid;
    @Column(name = "ltpoleid")
    private String ltpoleid;
    @Column(name = "servicewireno")
    private Integer servicewireno;
    @Column(name = "transformername")
    private String transformername;
    @Column(name = "districtcode")
    private String districtcode;
    @Column(name = "feedercode")
    private String feedercode;
    @Column(name = "bldcode")
    private String bldcode;
    @Column(name = "bldcodefinal")
    private String bldcodefinal;
    @Column(name = "buildingcol")
    private String buildingcol;
    @Column(name = "objectid")
    private String objectid;

    @Transient
    private List<CustomerMeta> customers;
    public Building() {
    }

    public Building(Long id) {
        this.id = id;
    }

    public List<CustomerMeta> getCustomers() {
        return customers;
    }

    public void setCustomers(List<CustomerMeta> customers) {
        this.customers = customers;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAncillaryrole() {
        return ancillaryrole;
    }

    public void setAncillaryrole(String ancillaryrole) {
        this.ancillaryrole = ancillaryrole;
    }

    public String getEnabled() {
        return enabled;
    }

    public void setEnabled(String enabled) {
        this.enabled = enabled;
    }

    public String getFeederid() {
        return feederid;
    }

    public void setFeederid(String feederid) {
        this.feederid = feederid;
    }

    public String getFeederid2() {
        return feederid2;
    }

    public void setFeederid2(String feederid2) {
        this.feederid2 = feederid2;
    }

    public String getFeederinfo() {
        return feederinfo;
    }

    public void setFeederinfo(String feederinfo) {
        this.feederinfo = feederinfo;
    }

    public String getElectrictraceweight() {
        return electrictraceweight;
    }

    public void setElectrictraceweight(String electrictraceweight) {
        this.electrictraceweight = electrictraceweight;
    }

    public String getCreationuser() {
        return creationuser;
    }

    public void setCreationuser(String creationuser) {
        this.creationuser = creationuser;
    }

    public Date getDatecreated() {
        return datecreated;
    }

    public void setDatecreated(Date datecreated) {
        this.datecreated = datecreated;
    }

    public Date getDatemodified() {
        return datemodified;
    }

    public void setDatemodified(Date datemodified) {
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

    public String getLocationid() {
        return locationid;
    }

    public void setLocationid(String locationid) {
        this.locationid = locationid;
    }

    public String getHyperlink() {
        return hyperlink;
    }

    public void setHyperlink(String hyperlink) {
        this.hyperlink = hyperlink;
    }

    public String getSubtypecd() {
        return subtypecd;
    }

    public void setSubtypecd(String subtypecd) {
        this.subtypecd = subtypecd;
    }

    public String getConsultant() {
        return consultant;
    }

    public void setConsultant(String consultant) {
        this.consultant = consultant;
    }

    public String getContractor() {
        return contractor;
    }

    public void setContractor(String contractor) {
        this.contractor = contractor;
    }

    public String getInstallationdate() {
        return installationdate;
    }

    public void setInstallationdate(String installationdate) {
        this.installationdate = installationdate;
    }

    public String getEnergizationdate() {
        return energizationdate;
    }

    public void setEnergizationdate(String energizationdate) {
        this.energizationdate = energizationdate;
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

    public String getFacilityid() {
        return facilityid;
    }

    public void setFacilityid(String facilityid) {
        this.facilityid = facilityid;
    }

    public String getPhasedesignation() {
        return phasedesignation;
    }

    public void setPhasedesignation(String phasedesignation) {
        this.phasedesignation = phasedesignation;
    }

    public String getConnectiontype() {
        return connectiontype;
    }

    public void setConnectiontype(String connectiontype) {
        this.connectiontype = connectiontype;
    }

    public String getCutoutsize() {
        return cutoutsize;
    }

    public void setCutoutsize(String cutoutsize) {
        this.cutoutsize = cutoutsize;
    }

    public String getDemanddkw() {
        return demanddkw;
    }

    public void setDemanddkw(String demanddkw) {
        this.demanddkw = demanddkw;
    }

    public String getVoltagelevelkv() {
        return voltagelevelkv;
    }

    public void setVoltagelevelkv(String voltagelevelkv) {
        this.voltagelevelkv = voltagelevelkv;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getServicecurrentrating() {
        return servicecurrentrating;
    }

    public void setServicecurrentrating(String servicecurrentrating) {
        this.servicecurrentrating = servicecurrentrating;
    }

    public String getOperatingvoltage() {
        return operatingvoltage;
    }

    public void setOperatingvoltage(String operatingvoltage) {
        this.operatingvoltage = operatingvoltage;
    }

    public String getSymbolrotation() {
        return symbolrotation;
    }

    public void setSymbolrotation(String symbolrotation) {
        this.symbolrotation = symbolrotation;
    }

    public String getCustomerrelationid() {
        return customerrelationid;
    }

    public void setCustomerrelationid(String customerrelationid) {
        this.customerrelationid = customerrelationid;
    }

    public String getEdservicepointoid() {
        return edservicepointoid;
    }

    public void setEdservicepointoid(String edservicepointoid) {
        this.edservicepointoid = edservicepointoid;
    }

    public String getCableupriserid() {
        return cableupriserid;
    }

    public void setCableupriserid(String cableupriserid) {
        this.cableupriserid = cableupriserid;
    }

    public String getLtpoleid() {
        return ltpoleid;
    }

    public void setLtpoleid(String ltpoleid) {
        this.ltpoleid = ltpoleid;
    }

    public Integer getServicewireno() {
        return servicewireno;
    }

    public void setServicewireno(Integer servicewireno) {
        this.servicewireno = servicewireno;
    }

    public String getTransformername() {
        return transformername;
    }

    public void setTransformername(String transformername) {
        this.transformername = transformername;
    }

    public String getDistrictcode() {
        return districtcode;
    }

    public void setDistrictcode(String districtcode) {
        this.districtcode = districtcode;
    }

    public String getFeedercode() {
        return feedercode;
    }

    public void setFeedercode(String feedercode) {
        this.feedercode = feedercode;
    }

    public String getBldcode() {
        return bldcode;
    }

    public void setBldcode(String bldcode) {
        this.bldcode = bldcode;
    }

    public String getBldcodefinal() {
        return bldcodefinal;
    }

    public void setBldcodefinal(String bldcodefinal) {
        this.bldcodefinal = bldcodefinal;
    }

    public String getBuildingcol() {
        return buildingcol;
    }

    public void setBuildingcol(String buildingcol) {
        this.buildingcol = buildingcol;
    }

    public String getObjectid() {
        return objectid;
    }

    public void setObjectid(String objectid) {
        this.objectid = objectid;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Building)) {
            return false;
        }
        Building other = (Building) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "forsoft.tech.app.model.Building[ id=" + id + " ]";
    }
    
}
