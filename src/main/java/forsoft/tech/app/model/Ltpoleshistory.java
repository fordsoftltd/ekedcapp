/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forsoft.tech.app.model;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author JIDEX
 */
@Entity
@Table(name = "ltpoleshistory")
public class Ltpoleshistory implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Lob
    @Size(max = 65535)
    @Column(name = "creationuser")
    private String creationuser;
    @Lob
    @Size(max = 65535)
    @Column(name = "datecreated")
    private String datecreated;
    @Lob
    @Size(max = 65535)
    @Column(name = "datemodified")
    private String datemodified;
    @Lob
    @Size(max = 65535)
    @Column(name = "lastuser")
    private String lastuser;
    @Lob
    @Size(max = 65535)
    @Column(name = "datasource")
    private String datasource;
    @Lob
    @Size(max = 65535)
    @Column(name = "comments")
    private String comments;
    @Lob
    @Size(max = 65535)
    @Column(name = "facilityid")
    private String facilityid;
    @Lob
    @Size(max = 65535)
    @Column(name = "subtypecd")
    private String subtypecd;
    @Lob
    @Size(max = 65535)
    @Column(name = "contractno")
    private String contractno;
    @Lob
    @Size(max = 65535)
    @Column(name = "contractor")
    private String contractor;
    @Lob
    @Size(max = 65535)
    @Column(name = "consultant")
    private String consultant;
    @Lob
    @Size(max = 65535)
    @Column(name = "installationdate")
    private String installationdate;
    @Lob
    @Size(max = 65535)
    @Column(name = "lastmaintenancedate")
    private String lastmaintenancedate;
    @Lob
    @Size(max = 65535)
    @Column(name = "status")
    private String status;
    @Lob
    @Size(max = 65535)
    @Column(name = "locationid")
    private String locationid;
    @Lob
    @Size(max = 65535)
    @Column(name = "hyperlink")
    private String hyperlink;
    @Lob
    @Size(max = 65535)
    @Column(name = "manufacturer")
    private String manufacturer;
    @Lob
    @Size(max = 65535)
    @Column(name = "material")
    private String material;
    @Lob
    @Size(max = 65535)
    @Column(name = "earthingtype")
    private String earthingtype;
    @Lob
    @Size(max = 65535)
    @Column(name = "foundationtype")
    private String foundationtype;
    @Lob
    @Size(max = 65535)
    @Column(name = "polecount")
    private String polecount;
    @Lob
    @Size(max = 65535)
    @Column(name = "poletype")
    private String poletype;
    @Lob
    @Size(max = 65535)
    @Column(name = "groundedindicator")
    private String groundedindicator;
    @Lob
    @Size(max = 65535)
    @Column(name = "height")
    private String height;
    @Lob
    @Size(max = 65535)
    @Column(name = "manufacturingyear")
    private String manufacturingyear;
    @Lob
    @Size(max = 65535)
    @Column(name = "streetlightindicator")
    private String streetlightindicator;
    @Lob
    @Size(max = 65535)
    @Column(name = "treatmenttype")
    private String treatmenttype;
    @Lob
    @Size(max = 65535)
    @Column(name = "anchorguyindicator")
    private String anchorguyindicator;
    @Lob
    @Size(max = 65535)
    @Column(name = "symbolrotation")
    private String symbolrotation;
    @Lob
    @Size(max = 65535)
    @Column(name = "polestatus")
    private String polestatus;
    @Lob
    @Size(max = 65535)
    @Column(name = "basestatus")
    private String basestatus;
    @Lob
    @Size(max = 65535)
    @Column(name = "groundconnected")
    private String groundconnected;
    @Lob
    @Size(max = 65535)
    @Column(name = "groundsize")
    private String groundsize;
    @Lob
    @Size(max = 65535)
    @Column(name = "dangerplateavailability")
    private String dangerplateavailability;
    @Lob
    @Size(max = 65535)
    @Column(name = "protectionpinavailability")
    private String protectionpinavailability;
    @Lob
    @Size(max = 65535)
    @Column(name = "landownership")
    private String landownership;
    @Lob
    @Size(max = 65535)
    @Column(name = "insulatortype")
    private String insulatortype;
    @Lob
    @Size(max = 65535)
    @Column(name = "insulatormaterial")
    private String insulatormaterial;
    @Lob
    @Size(max = 65535)
    @Column(name = "insulatorstatus")
    private String insulatorstatus;
    @Lob
    @Size(max = 65535)
    @Column(name = "insulatorcleaness")
    private String insulatorcleaness;
    @Lob
    @Size(max = 65535)
    @Column(name = "connectednetwork")
    private String connectednetwork;
    @Lob
    @Size(max = 65535)
    @Column(name = "enabled")
    private String enabled;
    @Lob
    @Size(max = 65535)
    @Column(name = "transformer")
    private String transformer;
    @Lob
    @Size(max = 65535)
    @Column(name = "feederid")
    private String feederid;
    @Lob
    @Size(max = 65535)
    @Column(name = "ltpoleid")
    private String ltpoleid;
    @Lob
    @Size(max = 65535)
    @Column(name = "cableupriserid")
    private String cableupriserid;
    @Lob
    @Size(max = 65535)
    @Column(name = "crossarmindicator")
    private String crossarmindicator;
    @Lob
    @Size(max = 65535)
    @Column(name = "tietrapindicator")
    private String tietrapindicator;
    @Lob
    @Size(max = 65535)
    @Column(name = "supportstructureid")
    private String supportstructureid;
    @Lob
    @Size(max = 65535)
    @Column(name = "crossarmtiecondition")
    private String crossarmtiecondition;
    @Lob
    @Size(max = 65535)
    @Column(name = "crossarmtype")
    private String crossarmtype;
    @Lob
    @Size(max = 65535)
    @Column(name = "tietrapcondition")
    private String tietrapcondition;
    @Lob
    @Size(max = 65535)
    @Column(name = "injectionsubstation")
    private String injectionsubstation;
    @Lob
    @Size(max = 65535)
    @Column(name = "htsupportstructureno")
    private String htsupportstructureno;
    @Lob
    @Size(max = 65535)
    @Column(name = "ltsupportstructureno")
    private String ltsupportstructureno;
    @Column(name = "done")
    private Boolean done;
    @Column(name = "datepasted")
    @Temporal(TemporalType.TIMESTAMP)
    private Date datepasted;
    @Column(name = "pastedby")
    private Integer pastedby;
    @Column(name = "print")
    private Boolean print;
    @Column(name = "printcount")
    private Integer printcount;
    @Size(max = 40)
    @Column(name = "longitude")
    private String longitude;
    @Size(max = 40)
    @Column(name = "latitude")
    private String latitude;
    @Size(max = 50)
    @Column(name = "contractorid")
    private String contractorid;
    @Column(name = "logindate")
    @Temporal(TemporalType.TIMESTAMP)
    private Date logindate;
    @JoinColumn(name = "parent", referencedColumnName = "id")
    @ManyToOne
    private Ltpoles parent;

    public Ltpoleshistory() {
    }

    public Ltpoleshistory(Integer id) {
        this.id = id;
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

    public String getLtpoleid() {
        return ltpoleid;
    }

    public void setLtpoleid(String ltpoleid) {
        this.ltpoleid = ltpoleid;
    }

    public String getCableupriserid() {
        return cableupriserid;
    }

    public void setCableupriserid(String cableupriserid) {
        this.cableupriserid = cableupriserid;
    }

    public String getCrossarmindicator() {
        return crossarmindicator;
    }

    public void setCrossarmindicator(String crossarmindicator) {
        this.crossarmindicator = crossarmindicator;
    }

    public String getTietrapindicator() {
        return tietrapindicator;
    }

    public void setTietrapindicator(String tietrapindicator) {
        this.tietrapindicator = tietrapindicator;
    }

    public String getSupportstructureid() {
        return supportstructureid;
    }

    public void setSupportstructureid(String supportstructureid) {
        this.supportstructureid = supportstructureid;
    }

    public String getCrossarmtiecondition() {
        return crossarmtiecondition;
    }

    public void setCrossarmtiecondition(String crossarmtiecondition) {
        this.crossarmtiecondition = crossarmtiecondition;
    }

    public String getCrossarmtype() {
        return crossarmtype;
    }

    public void setCrossarmtype(String crossarmtype) {
        this.crossarmtype = crossarmtype;
    }

    public String getTietrapcondition() {
        return tietrapcondition;
    }

    public void setTietrapcondition(String tietrapcondition) {
        this.tietrapcondition = tietrapcondition;
    }

    public String getInjectionsubstation() {
        return injectionsubstation;
    }

    public void setInjectionsubstation(String injectionsubstation) {
        this.injectionsubstation = injectionsubstation;
    }

    public String getHtsupportstructureno() {
        return htsupportstructureno;
    }

    public void setHtsupportstructureno(String htsupportstructureno) {
        this.htsupportstructureno = htsupportstructureno;
    }

    public String getLtsupportstructureno() {
        return ltsupportstructureno;
    }

    public void setLtsupportstructureno(String ltsupportstructureno) {
        this.ltsupportstructureno = ltsupportstructureno;
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

    public Integer getPastedby() {
        return pastedby;
    }

    public void setPastedby(Integer pastedby) {
        this.pastedby = pastedby;
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

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getContractorid() {
        return contractorid;
    }

    public void setContractorid(String contractorid) {
        this.contractorid = contractorid;
    }

    public Date getLogindate() {
        return logindate;
    }

    public void setLogindate(Date logindate) {
        this.logindate = logindate;
    }

    public Ltpoles getParent() {
        return parent;
    }

    public void setParent(Ltpoles parent) {
        this.parent = parent;
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
        if (!(object instanceof Ltpoleshistory)) {
            return false;
        }
        Ltpoleshistory other = (Ltpoleshistory) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.studentmix.model.Ltpoleshistory[ id=" + id + " ]";
    }
    
}
