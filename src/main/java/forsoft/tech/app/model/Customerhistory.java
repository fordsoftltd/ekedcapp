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
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
/**
 *
 * @author JIDEX
 */
@Entity
@Table(name = "customerhistory")
public class Customerhistory implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    
    //(max = 65535)
    @Column(name = "transformername")
    private String transformername;
    
    //(max = 65535)
    @Column(name = "discoid")
    private String discoid;
    
    //(max = 65535)
    @Column(name = "subdiscoid")
    private String subdiscoid;
    
    //(max = 65535)
    @Column(name = "supplystructureid")
    private String supplystructureid;
    
    //(max = 65535)
    @Column(name = "injectionsubstationid")
    private String injectionsubstationid;
    
    //(max = 65535)
    @Column(name = "powertrasformerid")
    private String powertrasformerid;
    
    //(max = 65535)
    @Column(name = "feederid")
    private String feederid;
    @Column(name="capturedby")
    private String capturedby;
     @Column(name = "captureddate")
    @Temporal(TemporalType.TIMESTAMP)
    private Date captureddate;
    
    //(max = 65535)
    @Column(name = "htpoleid")
    private String htpoleid;
    
    //(max = 65535)
    @Column(name = "transfomerid")
    private String transfomerid;
     @Column(name="comments")
    private String comments;
    
    //(max = 65535)
    @Column(name = "cableupriserid")
    private String cableupriserid;
    
    //(max = 65535)
    @Column(name = "ltpoleid")
    private String ltpoleid;
    
    //(max = 65535)
    @Column(name = "servicewireno")
    private String servicewireno;
    
    //(max = 65535)
    @Column(name = "customerid")
    private String customerid;
    
    //(max = 65535)
    @Column(name = "cin")
    private String cin;
    
    //(max = 65535)
    @Column(name = "buildingcodeid")
    private String buildingcodeid;
    
    //(max = 65535)
    @Column(name = "connectiontype")
    private String connectiontype;
    
    //(max = 65535)
    @Column(name = "customernumber")
    private String customernumber;
    
    //(max = 65535)
    @Column(name = "supplytype")
    private String supplytype;
    
    //(max = 65535)
    @Column(name = "premisestype")
    private String premisestype;
    
    //(max = 65535)
    @Column(name = "natureofuseelectricity")
    private String natureofuseelectricity;
    
    //(max = 65535)
    @Column(name = "landlordname")
    private String landlordname;
    
    //(max = 65535)
    @Column(name = "customernameonbill")
    private String customernameonbill;
    
    //(max = 65535)
    @Column(name = "customerphoneno")
    private String customerphoneno;
    
    //(max = 65535)
    @Column(name = "emailaddress")
    private String emailaddress;
    
    //(max = 65535)
    @Column(name = "customeraccountno")
    private String customeraccountno;
    //(max = 50)
    @Column(name = "customeraccountnonew")
    private String customeraccountnonew;
    
    //(max = 65535)
    @Column(name = "plot")
    private String plot;
    
    //(max = 65535)
    @Column(name = "houseno")
    private String houseno;
    
    //(max = 65535)
    @Column(name = "street")
    private String street;
    
    //(max = 65535)
    @Column(name = "landmark")
    private String landmark;
    
    //(max = 65535)
    @Column(name = "city")
    private String city;
    
    //(max = 65535)
    @Column(name = "tariff")
    private String tariff;
    
    //(max = 65535)
    @Column(name = "meterno")
    private String meterno;
    //(max = 50)
    @Column(name = "meternonew")
    private String meternonew;
    
    //(max = 65535)
    @Column(name = "meterbypass")
    private String meterbypass;
    
    //(max = 65535)
    @Column(name = "meterdesigntype")
    private String meterdesigntype;
    
    //(max = 65535)
    @Column(name = "meterstatus")
    private String meterstatus;
    
    //(max = 65535)
    @Column(name = "metersealno")
    private String metersealno;
    
    //(max = 65535)
    @Column(name = "meterreading")
    private String meterreading;
    
    //(max = 65535)
    @Column(name = "dials")
    private String dials;
    
    //(max = 65535)
    @Column(name = "multiplierfactoronmeter")
    private String multiplierfactoronmeter;
    
    //(max = 65535)
    @Column(name = "ctratio")
    private String ctratio;
    
    //(max = 65535)
    @Column(name = "ptratio")
    private String ptratio;
    
    //(max = 65535)
    @Column(name = "gpscoordinate")
    private String gpscoordinate;
    
    //(max = 65535)
    @Column(name = "billingtype")
    private String billingtype;
    
    //(max = 65535)
    @Column(name = "phasedesignation")
    private String phasedesignation;
    
    //(max = 65535)
    @Column(name = "cutoutsize")
    private String cutoutsize;
    
    //(max = 65535)
    @Column(name = "numberofaircondictioner")
    private String numberofaircondictioner;
    
    //(max = 65535)
    @Column(name = "approximatetotalratingofac")
    private String approximatetotalratingofac;
    
    //(max = 65535)
    @Column(name = "comment")
    private String comment;
    
    //(max = 65535)
    @Column(name = "edservicepointoid")
    private String edservicepointoid;
    
    //(max = 65535)
    @Column(name = "customerrelationid")
    private String customerrelationid;
    
    //(max = 65535)
    @Column(name = "feedername")
    private String feedername;
    
    //(max = 65535)
    @Column(name = "physicaladdress")
    private String physicaladdress;
    
    //(max = 65535)
    @Column(name = "addressonbill")
    private String addressonbill;
    
    //(max = 65535)
    @Column(name = "actualtariff")
    private String actualtariff;
    
    //(max = 65535)
    @Column(name = "nameofdatacapturer")
    private String nameofdatacapturer;
    
    //(max = 65535)
    @Column(name = "callbackno")
    private String callbackno;
    
    //(max = 65535)
    @Column(name = "lat")
    private String lat;
    
    //(max = 65535)
    @Column(name = "longs")
    private String longs;
    @Column(name = "done")
    private Boolean done;
    @Column(name = "pastedby")
    private Integer pastedby;
    @Column(name = "printed")
    private Boolean printed;
    @Column(name = "printcount")
    private Integer printcount;
    @Column(name = "pasteddate")
    @Temporal(TemporalType.TIMESTAMP)
    private Date pasteddate;
    //(max = 50)
    @Column(name = "contractorid")
    private String contractorid;
    @Column(name = "logindate")
    @Temporal(TemporalType.TIMESTAMP)
    private Date logindate;
    @JoinColumn(name = "parent", referencedColumnName = "id")
    @ManyToOne
    private Customer parent;

    public Customerhistory() {
    }

    public Customerhistory(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTransformername() {
        return transformername;
    }

    public void setTransformername(String transformername) {
        this.transformername = transformername;
    }

    public Date getCaptureddate() {
        return captureddate;
    }

    public void setCaptureddate(Date captureddate) {
        this.captureddate = captureddate;
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

    public String getPowertrasformerid() {
        return powertrasformerid;
    }

    public void setPowertrasformerid(String powertrasformerid) {
        this.powertrasformerid = powertrasformerid;
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

    public String getTransfomerid() {
        return transfomerid;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public String getCapturedby() {
        return capturedby;
    }

    public void setCapturedby(String capturedby) {
        this.capturedby = capturedby;
    }

    public void setTransfomerid(String transfomerid) {
        this.transfomerid = transfomerid;
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

    public String getCustomerid() {
        return customerid;
    }

    public void setCustomerid(String customerid) {
        this.customerid = customerid;
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

    public String getCustomernumber() {
        return customernumber;
    }

    public void setCustomernumber(String customernumber) {
        this.customernumber = customernumber;
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

    public String getCustomeraccountnonew() {
        return customeraccountnonew;
    }

    public void setCustomeraccountnonew(String customeraccountnonew) {
        this.customeraccountnonew = customeraccountnonew;
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

    public String getMeterno() {
        return meterno;
    }

    public void setMeterno(String meterno) {
        this.meterno = meterno;
    }

    public String getMeternonew() {
        return meternonew;
    }

    public void setMeternonew(String meternonew) {
        this.meternonew = meternonew;
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

    public String getNumberofaircondictioner() {
        return numberofaircondictioner;
    }

    public void setNumberofaircondictioner(String numberofaircondictioner) {
        this.numberofaircondictioner = numberofaircondictioner;
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

    public String getFeedername() {
        return feedername;
    }

    public void setFeedername(String feedername) {
        this.feedername = feedername;
    }

    public String getPhysicaladdress() {
        return physicaladdress;
    }

    public void setPhysicaladdress(String physicaladdress) {
        this.physicaladdress = physicaladdress;
    }

    public String getAddressonbill() {
        return addressonbill;
    }

    public void setAddressonbill(String addressonbill) {
        this.addressonbill = addressonbill;
    }

    public String getActualtariff() {
        return actualtariff;
    }

    public void setActualtariff(String actualtariff) {
        this.actualtariff = actualtariff;
    }

    public String getNameofdatacapturer() {
        return nameofdatacapturer;
    }

    public void setNameofdatacapturer(String nameofdatacapturer) {
        this.nameofdatacapturer = nameofdatacapturer;
    }

    public String getCallbackno() {
        return callbackno;
    }

    public void setCallbackno(String callbackno) {
        this.callbackno = callbackno;
    }

    public String getLat() {
        return lat;
    }

    public void setLat(String lat) {
        this.lat = lat;
    }

    public String getLongs() {
        return longs;
    }

    public void setLongs(String longs) {
        this.longs = longs;
    }

    public Boolean getDone() {
        return done;
    }

    public void setDone(Boolean done) {
        this.done = done;
    }

    public Integer getPastedby() {
        return pastedby;
    }

    public void setPastedby(Integer pastedby) {
        this.pastedby = pastedby;
    }

    public Boolean getPrinted() {
        return printed;
    }

    public void setPrinted(Boolean printed) {
        this.printed = printed;
    }

    public Integer getPrintcount() {
        return printcount;
    }

    public void setPrintcount(Integer printcount) {
        this.printcount = printcount;
    }

    public Date getPasteddate() {
        return pasteddate;
    }

    public void setPasteddate(Date pasteddate) {
        this.pasteddate = pasteddate;
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

    public Customer getParent() {
        return parent;
    }

    public void setParent(Customer parent) {
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
        if (!(object instanceof Customerhistory)) {
            return false;
        }
        Customerhistory other = (Customerhistory) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.studentmix.model.Customerhistory[ id=" + id + " ]";
    }
    
}
