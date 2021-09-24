/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forsoft.tech.app.model;

import java.io.Serializable;
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
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author odofintimothy
 */
@Entity
@Table(name = "customer_meta")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "CustomerMeta.findAll", query = "SELECT c FROM CustomerMeta c")})
public class CustomerMeta implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Long id;
    @Column(name = "objectid")
    private String objectid;
    @Column(name = "transformername")
    private String transformername;
    @Column(name = "discoid")
    private String discoid;
    @Column(name = "subdiscoid")
    private String subdiscoid;
    @Column(name = "supplystructureid")
    private String supplystructureid;
    @Column(name = "injectionsubstationid")
    private String injectionsubstationid;
    @Column(name = "powertransformerid")
    private String powertransformerid;
    @Column(name = "feederid")
    private String feederid;
    @Column(name = "htpoleid")
    private String htpoleid;
    @Column(name = "transformerid")
    private String transformerid;
    @Column(name = "cableupriserid")
    private String cableupriserid;
    @Column(name = "ltpoleid")
    private String ltpoleid;
    @Column(name = "servicewireno")
    private String servicewireno;
    @Column(name = "cin")
    private String cin;
    @Column(name = "buildingcodeid")
    private String buildingcodeid;
    @Column(name = "connectiontype")
    private String connectiontype;
    @Column(name = "customerno")
    private String customerno;
    @Column(name = "supplytype")
    private String supplytype;
    @Column(name = "premisestype")
    private String premisestype;
    @Column(name = "natureofuseelectricity")
    private String natureofuseelectricity;
    @Column(name = "landlordname")
    private String landlordname;
    @Column(name = "customernameonbill")
    private String customernameonbill;
    @Column(name = "customerphoneno")
    private String customerphoneno;
    @Column(name = "emailaddress")
    private String emailaddress;
    @Column(name = "customeraccountno")
    private String customeraccountno;
    @Column(name = "plot")
    private String plot;
    @Column(name = "houseno")
    private String houseno;
    @Column(name = "street")
    private String street;
    @Column(name = "landmark")
    private String landmark;
    @Column(name = "city")
    private String city;
    @Column(name = "tariff")
    private String tariff;
    @Column(name = "metreno")
    private String metreno;
    @Column(name = "meterbypass")
    private String meterbypass;
    @Column(name = "meterdesigntype")
    private String meterdesigntype;
    @Column(name = "meterstatus")
    private String meterstatus;
    @Column(name = "metersealno")
    private String metersealno;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "meterreading")
    private String meterreading;
    @Column(name = "dials")
    private String dials;
    @Column(name = "multiplierfactoronmeter")
    private String multiplierfactoronmeter;
    @Column(name = "ctratio")
    private String ctratio;
    @Column(name = "ptratio")
    private String ptratio;
    @Column(name = "gpscoordinate")
    private String gpscoordinate;
    @Column(name = "billingtype")
    private String billingtype;
    @Column(name = "phasedesignation")
    private String phasedesignation;
    @Column(name = "cutoutsize")
    private String cutoutsize;
    @Column(name = "numberofairconditioner")
    private String numberofairconditioner;
    @Column(name = "approximatetotalratingofac")
    private String approximatetotalratingofac;
    @Lob
    @Column(name = "comment")
    private String comment;
    @Column(name = "edservicepointoid")
    private String edservicepointoid;
    @Column(name = "customerrelationid")
    private String customerrelationid;
    @Column(name = "district")
    private String district;
    @Column(name = "confirmdtid")
    private String confirmdtid;
    @Column(name = "districtcode")
    private String districtcode;
    @Column(name = "feedercode")
    private String feedercode;
    @Column(name = "bldcode")
    private String bldcode;
    @Column(name = "bldcodefinal")
    private String bldcodefinal;
    @Column(name="datecreated")
    @Temporal(javax.persistence.TemporalType.TIMESTAMP)
    private Date datecreated;
     @Column(name="lastmodified")
     @Temporal(javax.persistence.TemporalType.TIMESTAMP)
    private Date lastmodified;

    public CustomerMeta() {
    }
     public CustomerMeta(String cin, String customernameonbill, String landlordname) {
         this.cin= cin;
         this.customernameonbill=customernameonbill;
         this.landlordname=landlordname;
    }

    public CustomerMeta(Long id) {
        this.id = id;
    }

    public Date getDatecreated() {
        return datecreated;
    }

    public void setDatecreated(Date datecreated) {
        this.datecreated = datecreated;
    }

    public Date getLastmodified() {
        return lastmodified;
    }

    public void setLastmodified(Date lastmodified) {
        this.lastmodified = lastmodified;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getObjectid() {
        return objectid;
    }

    public void setObjectid(String objectid) {
        this.objectid = objectid;
    }

    public String getTransformername() {
        return transformername;
    }

    public void setTransformername(String transformername) {
        this.transformername = transformername;
    }

    public String getDiscoid() {
        return discoid;
    }

    public void setDiscoid(String discoid) {
        this.discoid = discoid;
    }

    public String getSubdiscoid() {
        return subdiscoid;
    }

    public void setSubdiscoid(String subdiscoid) {
        this.subdiscoid = subdiscoid;
    }

    public String getSupplystructureid() {
        return supplystructureid;
    }

    public void setSupplystructureid(String supplystructureid) {
        this.supplystructureid = supplystructureid;
    }

    public String getInjectionsubstationid() {
        return injectionsubstationid;
    }

    public void setInjectionsubstationid(String injectionsubstationid) {
        this.injectionsubstationid = injectionsubstationid;
    }

    public String getPowertransformerid() {
        return powertransformerid;
    }

    public void setPowertransformerid(String powertransformerid) {
        this.powertransformerid = powertransformerid;
    }

    public String getFeederid() {
        return feederid;
    }

    public void setFeederid(String feederid) {
        this.feederid = feederid;
    }

    public String getHtpoleid() {
        return htpoleid;
    }

    public void setHtpoleid(String htpoleid) {
        this.htpoleid = htpoleid;
    }

    public String getTransformerid() {
        return transformerid;
    }

    public void setTransformerid(String transformerid) {
        this.transformerid = transformerid;
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

    public String getServicewireno() {
        return servicewireno;
    }

    public void setServicewireno(String servicewireno) {
        this.servicewireno = servicewireno;
    }

    public String getCin() {
        return cin;
    }

    public void setCin(String cin) {
        this.cin = cin;
    }

    public String getBuildingcodeid() {
        return buildingcodeid;
    }

    public void setBuildingcodeid(String buildingcodeid) {
        this.buildingcodeid = buildingcodeid;
    }

    public String getConnectiontype() {
        return connectiontype;
    }

    public void setConnectiontype(String connectiontype) {
        this.connectiontype = connectiontype;
    }

    public String getCustomerno() {
        return customerno;
    }

    public void setCustomerno(String customerno) {
        this.customerno = customerno;
    }

    public String getSupplytype() {
        return supplytype;
    }

    public void setSupplytype(String supplytype) {
        this.supplytype = supplytype;
    }

    public String getPremisestype() {
        return premisestype;
    }

    public void setPremisestype(String premisestype) {
        this.premisestype = premisestype;
    }

    public String getNatureofuseelectricity() {
        return natureofuseelectricity;
    }

    public void setNatureofuseelectricity(String natureofuseelectricity) {
        this.natureofuseelectricity = natureofuseelectricity;
    }

    public String getLandlordname() {
        return landlordname;
    }

    public void setLandlordname(String landlordname) {
        this.landlordname = landlordname;
    }

    public String getCustomernameonbill() {
        return customernameonbill;
    }

    public void setCustomernameonbill(String customernameonbill) {
        this.customernameonbill = customernameonbill;
    }

    public String getCustomerphoneno() {
        return customerphoneno;
    }

    public void setCustomerphoneno(String customerphoneno) {
        this.customerphoneno = customerphoneno;
    }

    public String getEmailaddress() {
        return emailaddress;
    }

    public void setEmailaddress(String emailaddress) {
        this.emailaddress = emailaddress;
    }

    public String getCustomeraccountno() {
        return customeraccountno;
    }

    public void setCustomeraccountno(String customeraccountno) {
        this.customeraccountno = customeraccountno;
    }

    public String getPlot() {
        return plot;
    }

    public void setPlot(String plot) {
        this.plot = plot;
    }

    public String getHouseno() {
        return houseno;
    }

    public void setHouseno(String houseno) {
        this.houseno = houseno;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getLandmark() {
        return landmark;
    }

    public void setLandmark(String landmark) {
        this.landmark = landmark;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getTariff() {
        return tariff;
    }

    public void setTariff(String tariff) {
        this.tariff = tariff;
    }

    public String getMetreno() {
        return metreno;
    }

    public void setMetreno(String metreno) {
        this.metreno = metreno;
    }

    public String getMeterbypass() {
        return meterbypass;
    }

    public void setMeterbypass(String meterbypass) {
        this.meterbypass = meterbypass;
    }

    public String getMeterdesigntype() {
        return meterdesigntype;
    }

    public void setMeterdesigntype(String meterdesigntype) {
        this.meterdesigntype = meterdesigntype;
    }

    public String getMeterstatus() {
        return meterstatus;
    }

    public void setMeterstatus(String meterstatus) {
        this.meterstatus = meterstatus;
    }

    public String getMetersealno() {
        return metersealno;
    }

    public void setMetersealno(String metersealno) {
        this.metersealno = metersealno;
    }

    public String getMeterreading() {
        return meterreading;
    }

    public void setMeterreading(String meterreading) {
        this.meterreading = meterreading;
    }

    public String getDials() {
        return dials;
    }

    public void setDials(String dials) {
        this.dials = dials;
    }

    public String getMultiplierfactoronmeter() {
        return multiplierfactoronmeter;
    }

    public void setMultiplierfactoronmeter(String multiplierfactoronmeter) {
        this.multiplierfactoronmeter = multiplierfactoronmeter;
    }

    public String getCtratio() {
        return ctratio;
    }

    public void setCtratio(String ctratio) {
        this.ctratio = ctratio;
    }

    public String getPtratio() {
        return ptratio;
    }

    public void setPtratio(String ptratio) {
        this.ptratio = ptratio;
    }

    public String getGpscoordinate() {
        return gpscoordinate;
    }

    public void setGpscoordinate(String gpscoordinate) {
        this.gpscoordinate = gpscoordinate;
    }

    public String getBillingtype() {
        return billingtype;
    }

    public void setBillingtype(String billingtype) {
        this.billingtype = billingtype;
    }

    public String getPhasedesignation() {
        return phasedesignation;
    }

    public void setPhasedesignation(String phasedesignation) {
        this.phasedesignation = phasedesignation;
    }

    public String getCutoutsize() {
        return cutoutsize;
    }

    public void setCutoutsize(String cutoutsize) {
        this.cutoutsize = cutoutsize;
    }

    public String getNumberofairconditioner() {
        return numberofairconditioner;
    }

    public void setNumberofairconditioner(String numberofairconditioner) {
        this.numberofairconditioner = numberofairconditioner;
    }

    public String getApproximatetotalratingofac() {
        return approximatetotalratingofac;
    }

    public void setApproximatetotalratingofac(String approximatetotalratingofac) {
        this.approximatetotalratingofac = approximatetotalratingofac;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getEdservicepointoid() {
        return edservicepointoid;
    }

    public void setEdservicepointoid(String edservicepointoid) {
        this.edservicepointoid = edservicepointoid;
    }

    public String getCustomerrelationid() {
        return customerrelationid;
    }

    public void setCustomerrelationid(String customerrelationid) {
        this.customerrelationid = customerrelationid;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getConfirmdtid() {
        return confirmdtid;
    }

    public void setConfirmdtid(String confirmdtid) {
        this.confirmdtid = confirmdtid;
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

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CustomerMeta)) {
            return false;
        }
        CustomerMeta other = (CustomerMeta) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "forsoft.tech.app.model.CustomerMeta[ id=" + id + " ]";
    }
    
}
