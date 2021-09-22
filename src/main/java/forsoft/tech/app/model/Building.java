/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forsoft.tech.app.model;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.Date;
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
    private BigInteger enabled;
    @Column(name = "feederid")
    private BigInteger feederid;
    @Column(name = "feederid2")
    private BigInteger feederid2;
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
    private BigInteger lastuser;
    @Column(name = "datasource")
    private String datasource;
    @Lob
    @Column(name = "comments")
    private String comments;
    @Column(name = "locationid")
    private BigInteger locationid;
    @Column(name = "hyperlink")
    private String hyperlink;
    @Column(name = "subtypecd")
    private String subtypecd;
    @Column(name = "consultant")
    private String consultant;
    @Column(name = "contractor")
    private String contractor;
    @Column(name = "installationdate")
    @Temporal(TemporalType.TIMESTAMP)
    private Date installationdate;
    @Column(name = "energizationdate")
    @Temporal(TemporalType.TIMESTAMP)
    private Date energizationdate;
    
    @Column(name = "lastmaintenancedate")
    @Temporal(TemporalType.TIMESTAMP)
    private Date lastmaintenancedate;
    @Column(name = "status")
    private String status;
    @Column(name = "facilityid")
    private BigInteger facilityid;
    @Column(name = "phasedesignation")
    private String phasedesignation;
    @Column(name = "connectiontype")
    private BigInteger connectiontype;
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
    private BigInteger customerrelationid;
    @Column(name = "edservicepointoid")
    private BigInteger edservicepointoid;
    @Column(name = "cableupriserid")
    private BigInteger cableupriserid;
    @Column(name = "ltpoleid")
    private BigInteger ltpoleid;
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
    private BigInteger objectid;

    public Building() {
    }

    public Building(Long id) {
        this.id = id;
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

    public BigInteger getEnabled() {
        return enabled;
    }

    public void setEnabled(BigInteger enabled) {
        this.enabled = enabled;
    }

    public BigInteger getFeederid() {
        return feederid;
    }

    public void setFeederid(BigInteger feederid) {
        this.feederid = feederid;
    }

    public BigInteger getFeederid2() {
        return feederid2;
    }

    public void setFeederid2(BigInteger feederid2) {
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

    public BigInteger getLastuser() {
        return lastuser;
    }

    public void setLastuser(BigInteger lastuser) {
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

    public BigInteger getLocationid() {
        return locationid;
    }

    public void setLocationid(BigInteger locationid) {
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

    public Date getInstallationdate() {
        return installationdate;
    }

    public void setInstallationdate(Date installationdate) {
        this.installationdate = installationdate;
    }

    public Date getEnergizationdate() {
        return energizationdate;
    }

    public void setEnergizationdate(Date energizationdate) {
        this.energizationdate = energizationdate;
    }

    public Date getLastmaintenancedate() {
        return lastmaintenancedate;
    }

    public void setLastmaintenancedate(Date lastmaintenancedate) {
        this.lastmaintenancedate = lastmaintenancedate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public BigInteger getFacilityid() {
        return facilityid;
    }

    public void setFacilityid(BigInteger facilityid) {
        this.facilityid = facilityid;
    }

    public String getPhasedesignation() {
        return phasedesignation;
    }

    public void setPhasedesignation(String phasedesignation) {
        this.phasedesignation = phasedesignation;
    }

    public BigInteger getConnectiontype() {
        return connectiontype;
    }

    public void setConnectiontype(BigInteger connectiontype) {
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

    public BigInteger getCustomerrelationid() {
        return customerrelationid;
    }

    public void setCustomerrelationid(BigInteger customerrelationid) {
        this.customerrelationid = customerrelationid;
    }

    public BigInteger getEdservicepointoid() {
        return edservicepointoid;
    }

    public void setEdservicepointoid(BigInteger edservicepointoid) {
        this.edservicepointoid = edservicepointoid;
    }

    public BigInteger getCableupriserid() {
        return cableupriserid;
    }

    public void setCableupriserid(BigInteger cableupriserid) {
        this.cableupriserid = cableupriserid;
    }

    public BigInteger getLtpoleid() {
        return ltpoleid;
    }

    public void setLtpoleid(BigInteger ltpoleid) {
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

    public BigInteger getObjectid() {
        return objectid;
    }

    public void setObjectid(BigInteger objectid) {
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
