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
public class Customerdto implements Dto {

    private Integer id;

    private Date captureddate;
    private Date logindate;
    private String upriser;
    private String transformername;

    private String discoID;

    private String subdiscoid;

    private String supplystructureid;

    private String injectionsubstationid;

    private String powerTrasformerID;

    private String feederid;

    private String hTPoleID;

    private String transfomerID;

    private String cableUpriserID;

    private String ltpoleid;

    private String serviceWireNo;

    private String customerID;

    private String cin;

    private String buildingCodeID;

    private String connectionType;

    private String customernumber;

    private String supplytype;

    private String premisestype;

    private String natureOfUseElectricity;

    private String landlordname;

    private String cUSTOMERNAMEonBILL;

    private String customerphoneno;

    private String eMailaddress;

    private String customerACCOUNTNO;

    private String plot;

    private String houseNo;

    private String street;

    private String landmark;

    private String city;

    private String tariff;

    private String meterno;

    private String meterbyPass;

    private String meterdesigntype;

    private String meterstatus;

    private String metersealno;

    private String meterreading;

    private String dials;

    private String multiplierfactoronmeter;

    private String ctratio;

    private String ptratio;

    private String gpscoordinate;

    private String billingtype;

    private String phasedesignation;

    private String cutoutsize;

    private String numberofaircondictioner;

    private String approximatetotalratingofac;

    private String comment;

    private String eDServicePointOID;

    private String customerRelationID;

    private String feederName;

    private String physicalAddress;

    private String addressOnBill;

    private String actualTariff;

    private String nameOfDataCapturer;

    private String callBackNo;

    private String lat;

    private String longs;

    private Boolean done;

    private Boolean printed;

    private Integer printcount;

    private Date pasteddate;
    private String contractorid;
    private List<Customerhistorydto> customerhistoryList;
    private String districtName;
    private Usersdto pastedby;
    private String meternonew;
    private String customeraccountnonew;
    private String capturedby;
     private String comments;
     private String newcustomerid;
     private String newservicewireno;
    private String bldcode;
    private String bldcodefinal;
    private String bldcodefinalupdated;

    public String getBldcodefinalupdated() {
        return bldcodefinalupdated;
    }

    public void setBldcodefinalupdated(String bldcodefinalupdated) {
        this.bldcodefinalupdated = bldcodefinalupdated;
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

    public String getNewcustomerid() {
        return newcustomerid;
    }

    public void setNewcustomerid(String newcustomerid) {
        this.newcustomerid = newcustomerid;
    }

    public String getNewservicewireno() {
        return newservicewireno;
    }

    public void setNewservicewireno(String newservicewireno) {
        this.newservicewireno = newservicewireno;
    }

     
    public Customerdto() {
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

    public String getCustomeraccountnonew() {
        return customeraccountnonew;
    }

    public Date getCaptureddate() {
        return captureddate;
    }

    public void setCaptureddate(Date captureddate) {
        this.captureddate = captureddate;
    }

    public void setCustomeraccountnonew(String customeraccountnonew) {
        this.customeraccountnonew = customeraccountnonew;
    }

    public String getMeternonew() {
        return meternonew;
    }

    public String getContractorid() {
        return contractorid;
    }

    public void setContractorid(String contractorid) {
        this.contractorid = contractorid;
    }

    public void setMeternonew(String meternonew) {
        this.meternonew = meternonew;
    }

    public Customerdto(Integer id) {
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

    public String getDiscoID() {
        return discoID;
    }

    public void setDiscoID(String discoID) {
        this.discoID = discoID;
    }

    public String getDistrictName() {
        return districtName;
    }

    public void setDistrictName(String districtName) {
        this.districtName = districtName;
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

    public String getPowerTrasformerID() {
        return powerTrasformerID;
    }

    public void setPowerTrasformerID(String powerTrasformerID) {
        this.powerTrasformerID = powerTrasformerID;
    }

    public String getFeederid() {
        return feederid;
    }

    public void setFeederid(String feederid) {
        this.feederid = feederid;
    }

    public String getHTPoleID() {
        return hTPoleID;
    }

    public void setHTPoleID(String hTPoleID) {
        this.hTPoleID = hTPoleID;
    }

    public String getTransfomerID() {
        return transfomerID;
    }

    public void setTransfomerID(String transfomerID) {
        this.transfomerID = transfomerID;
    }

    public String getCableUpriserID() {
        return cableUpriserID;
    }

    public void setCableUpriserID(String cableUpriserID) {
        this.cableUpriserID = cableUpriserID;
    }

    public String getLtpoleid() {
        return ltpoleid;
    }

    public void setLtpoleid(String ltpoleid) {
        this.ltpoleid = ltpoleid;
    }

    public String getServiceWireNo() {
        return serviceWireNo;
    }

    public void setServiceWireNo(String serviceWireNo) {
        this.serviceWireNo = serviceWireNo;
    }

    public String getCustomerID() {
        return customerID;
    }

    public void setCustomerID(String customerID) {
        this.customerID = customerID;
    }

    public String getCin() {
        return cin;
    }

    public void setCin(String cin) {
        this.cin = cin;
    }

    public String getBuildingCodeID() {
        return buildingCodeID;
    }

    public void setBuildingCodeID(String buildingCodeID) {
        this.buildingCodeID = buildingCodeID;
    }

    public String getConnectionType() {
        return connectionType;
    }

    public void setConnectionType(String connectionType) {
        this.connectionType = connectionType;
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

    public String getNatureOfUseElectricity() {
        return natureOfUseElectricity;
    }

    public void setNatureOfUseElectricity(String natureOfUseElectricity) {
        this.natureOfUseElectricity = natureOfUseElectricity;
    }

    public String getLandlordname() {
        return landlordname;
    }

    public void setLandlordname(String landlordname) {
        this.landlordname = landlordname;
    }

    public String getCUSTOMERNAMEonBILL() {
        return cUSTOMERNAMEonBILL;
    }

    public void setCUSTOMERNAMEonBILL(String cUSTOMERNAMEonBILL) {
        this.cUSTOMERNAMEonBILL = cUSTOMERNAMEonBILL;
    }

    public String getCustomerphoneno() {
        return customerphoneno;
    }

    public void setCustomerphoneno(String customerphoneno) {
        this.customerphoneno = customerphoneno;
    }

    public String getEMailaddress() {
        return eMailaddress;
    }

    public void setEMailaddress(String eMailaddress) {
        this.eMailaddress = eMailaddress;
    }

    public String getCustomerACCOUNTNO() {
        return customerACCOUNTNO;
    }

    public void setCustomerACCOUNTNO(String customerACCOUNTNO) {
        this.customerACCOUNTNO = customerACCOUNTNO;
    }

    public String getPlot() {
        return plot;
    }

    public void setPlot(String plot) {
        this.plot = plot;
    }

    public String getHouseNo() {
        return houseNo;
    }

    public void setHouseNo(String houseNo) {
        this.houseNo = houseNo;
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

    public String getMeterbyPass() {
        return meterbyPass;
    }

    public void setMeterbyPass(String meterbyPass) {
        this.meterbyPass = meterbyPass;
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

    public Date getLogindate() {
        return logindate;
    }

    public void setLogindate(Date logindate) {
        this.logindate = logindate;
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

    public String getEDServicePointOID() {
        return eDServicePointOID;
    }

    public void setEDServicePointOID(String eDServicePointOID) {
        this.eDServicePointOID = eDServicePointOID;
    }

    public String getCustomerRelationID() {
        return customerRelationID;
    }

    public void setCustomerRelationID(String customerRelationID) {
        this.customerRelationID = customerRelationID;
    }

    public String getFeederName() {
        return feederName;
    }

    public void setFeederName(String feederName) {
        this.feederName = feederName;
    }

    public String getPhysicalAddress() {
        return physicalAddress;
    }

    public void setPhysicalAddress(String physicalAddress) {
        this.physicalAddress = physicalAddress;
    }

    public String getUpriser() {
        return upriser;
    }

    public void setUpriser(String upriser) {
        this.upriser = upriser;
    }

    public String getAddressOnBill() {
        return addressOnBill;
    }

    public void setAddressOnBill(String addressOnBill) {
        this.addressOnBill = addressOnBill;
    }

    public String getActualTariff() {
        return actualTariff;
    }

    public void setActualTariff(String actualTariff) {
        this.actualTariff = actualTariff;
    }

    public String getNameOfDataCapturer() {
        return nameOfDataCapturer;
    }

    public void setNameOfDataCapturer(String nameOfDataCapturer) {
        this.nameOfDataCapturer = nameOfDataCapturer;
    }

    public String getCallBackNo() {
        return callBackNo;
    }

    public void setCallBackNo(String callBackNo) {
        this.callBackNo = callBackNo;
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

    public List<Customerhistorydto> getCustomerhistoryList() {
        return customerhistoryList;
    }

    public void setCustomerhistoryList(List<Customerhistorydto> customerhistoryList) {
        this.customerhistoryList = customerhistoryList;
    }

    public Usersdto getPastedby() {
        return pastedby;
    }

    public void setPastedby(Usersdto pastedby) {
        this.pastedby = pastedby;
    }

}
