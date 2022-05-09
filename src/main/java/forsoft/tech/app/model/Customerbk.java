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
import java.util.List;

/**
 *
 * @author JIDEX
 */
@Entity
@Table(name = "customer_bk")
public class Customerbk implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Lob

    @Column(name = "transformername")
    private String transformername;
    @Lob
    @Column(name = "discoid")
    private String discoid;
    @Lob
    @Column(name = "subdiscoid")
    private String subdiscoid;
    @Column(name="capturedby")
    private String capturedby;
    @Lob
    @Column(name = "supplystructureid")
    private String supplystructureid;
    @Lob
    @Column(name = "injectionsubstationid")
    private String injectionsubstationid;
    @Lob
    @Column(name = "powertrasformerid")
    private String powertrasformerid;
    @Lob
    @Column(name = "feederid")
    private String feederid;
    @Lob
    @Column(name = "htpoleid")
    private String htpoleid;
    @Lob
    @Column(name = "transfomerid")
    private String transfomerid;
    @Lob
    @Size(max = 65535)
    @Column(name = "cableupriserid")
    private String cableupriserid;
    @Column(name="comments")
    private String comments;
    @Lob
    @Size(max = 65535)
    @Column(name = "ltpoleid")
    private String ltpoleid;
    @Lob
    @Size(max = 65535)
    @Column(name = "servicewireno")
    private String servicewireno;
    @Lob
    @Size(max = 65535)
    @Column(name = "customerid")
    private String customerid;
    @Lob
    @Size(max = 65535)
    @Column(name = "cin")
    private String cin;
    @Lob
    @Size(max = 65535)
    @Column(name = "buildingcodeid")
    private String buildingcodeid;
    @Lob
    @Size(max = 65535)
    @Column(name = "connectiontype")
    private String connectiontype;
    @Lob
    @Size(max = 65535)
    @Column(name = "customernumber")
    private String customernumber;
    @Lob
    @Size(max = 65535)
    @Column(name = "supplytype")
    private String supplytype;
    @Lob
    @Size(max = 65535)
    @Column(name = "premisestype")
    private String premisestype;
    @Lob
    @Size(max = 65535)
    @Column(name = "natureofuseelectricity")
    private String natureofuseelectricity;
    @Lob
    @Size(max = 65535)
    @Column(name = "landlordname")
    private String landlordname;
    @Lob
    @Size(max = 65535)
    @Column(name = "customernameonbill")
    private String customernameonbill;
    @Lob
    @Size(max = 65535)
    @Column(name = "customerphoneno")
    private String customerphoneno;
    @Lob
    @Size(max = 65535)
    @Column(name = "emailaddress")
    private String emailaddress;
    @Lob
    @Size(max = 65535)
    @Column(name = "customeraccountno")
    private String customeraccountno;
    @Size(max = 30)
    @Column(name = "customeraccountnonew")
    private String customeraccountnonew;
    @Lob
    @Size(max = 65535)
    @Column(name = "plot")
    private String plot;
    @Lob
    @Size(max = 65535)
    @Column(name = "houseno")
    private String houseno;
    @Lob
    @Size(max = 65535)
    @Column(name = "street")
    private String street;
    @Lob
    @Size(max = 65535)
    @Column(name = "landmark")
    private String landmark;
    @Lob
    @Size(max = 65535)
    @Column(name = "city")
    private String city;
    @Lob
    @Size(max = 65535)
    @Column(name = "tariff")
    private String tariff;
    @Lob
    @Size(max = 65535)
    @Column(name = "meterno")
    private String meterno;
    @Size(max = 40)
    @Column(name = "meternonew")
    private String meternonew;
    @Lob
    @Size(max = 65535)
    @Column(name = "meterbypass")
    private String meterbypass;
    @Lob
    @Size(max = 65535)
    @Column(name = "meterdesigntype")
    private String meterdesigntype;
    @Lob
    @Size(max = 65535)
    @Column(name = "meterstatus")
    private String meterstatus;
    @Lob
    @Size(max = 65535)
    @Column(name = "metersealno")
    private String metersealno;
    @Lob
    @Size(max = 65535)
    @Column(name = "meterreading")
    private String meterreading;
    @Lob
    @Size(max = 65535)
    @Column(name = "dials")
    private String dials;
    @Lob
    @Size(max = 65535)
    @Column(name = "multiplierfactoronmeter")
    private String multiplierfactoronmeter;
    @Lob
    @Size(max = 65535)
    @Column(name = "ctratio")
    private String ctratio;
    @Lob
    @Size(max = 65535)
    @Column(name = "ptratio")
    private String ptratio;
    @Lob
    @Size(max = 65535)
    @Column(name = "gpscoordinate")
    private String gpscoordinate;
    @Lob
    @Size(max = 65535)
    @Column(name = "billingtype")
    private String billingtype;
    @Lob
    @Size(max = 65535)
    @Column(name = "phasedesignation")
    private String phasedesignation;
    @Lob
    @Size(max = 65535)
    @Column(name = "cutoutsize")
    private String cutoutsize;
    @Lob
    @Size(max = 65535)
    @Column(name = "numberofaircondictioner")
    private String numberofaircondictioner;
    @Lob
    @Size(max = 65535)
    @Column(name = "approximatetotalratingofac")
    private String approximatetotalratingofac;
    @Lob
    @Size(max = 65535)
    @Column(name = "comment")
    private String comment;
    @Lob
    @Size(max = 65535)
    @Column(name = "edservicepointoid")
    private String edservicepointoid;
    @Lob
    @Size(max = 65535)
    @Column(name = "customerrelationid")
    private String customerrelationid;
    @Lob
    @Size(max = 65535)
    @Column(name = "feedername")
    private String feedername;
    @Lob
    @Size(max = 65535)
    @Column(name = "physicaladdress")
    private String physicaladdress;
    @Lob
    @Size(max = 65535)
    @Column(name = "addressonbill")
    private String addressonbill;
    @Lob
    @Size(max = 65535)
    @Column(name = "actualtariff")
    private String actualtariff;
    @Lob
    @Size(max = 65535)
    @Column(name = "nameofdatacapturer")
    private String nameofdatacapturer;
    @Lob
    @Size(max = 65535)
    @Column(name = "callbackno")
    private String callbackno;
    @Lob
    @Size(max = 65535)
    @Column(name = "lat")
    private String lat;
    @Lob
    @Size(max = 65535)
    @Column(name = "longs")
    private String longs;
    @Column(name = "done")
    private Boolean done;
    @Column(name = "printed")
    private Boolean printed;
    @Column(name = "printcount")
    private Integer printcount;
    @Column(name = "pasteddate")
    @Temporal(TemporalType.TIMESTAMP)
    private Date pasteddate;
    @Size(max = 50)
    @Column(name = "contractorid")
    private String contractorid;
    @Column(name = "logindate")
    @Temporal(TemporalType.TIMESTAMP)
    private Date logindate;
     @Column(name = "captureddate")
    @Temporal(TemporalType.TIMESTAMP)
    private Date captureddate;
    @OneToMany(cascade = CascadeType.ALL,mappedBy = "parent")
    private List<Customerhistory> customerhistoryList;
    @JoinColumn(name = "pastedby", referencedColumnName = "id")
    @ManyToOne
    private Users pastedby;

    public Customerbk() {
    }

    public Customerbk(Integer id) {
        this.id = id;
    }

    public Date getCaptureddate() {
        return captureddate;
    }

    public void setCaptureddate(Date captureddate) {
        this.captureddate = captureddate;
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

    public String getCapturedby() {
        return capturedby;
    }

    public void setCapturedby(String capturedby) {
        this.capturedby = capturedby;
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

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
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


    public List<Customerhistory> getCustomerhistoryList() {
        return customerhistoryList;
    }

    public void setCustomerhistoryList(List<Customerhistory> customerhistoryList) {
        this.customerhistoryList = customerhistoryList;
    }

    public Users getPastedby() {
        return pastedby;
    }

    public void setPastedby(Users pastedby) {
        this.pastedby = pastedby;
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
        if (!(object instanceof Customerbk)) {
            return false;
        }
        Customerbk other = (Customerbk) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.studentmix.model.Customer[ id=" + id + " ]";
    }
    
}
