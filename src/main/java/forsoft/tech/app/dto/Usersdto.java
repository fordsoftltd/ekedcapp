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

@ManagedBean
@SessionScoped
public class Usersdto implements Dto {
    private Integer id;
    
    private String username;
    
    private String email;
    
    private String password;
    private String confirmpassword;
    
    
    private Date datecreated;
    
     private String contractorid;
    private Date lastmodify;
    
    
    private String createdby;
    
  
    private Date lastlogin;
    
    private List<Polesdto> polesList;
    
    
    private Userrolesdto rolesid;
    
    
    private Staffdto staffid;
    
    private List<Customerdto> customerList;

    public Usersdto() {
    }

    public Usersdto(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public String getContractorid() {
        return contractorid;
    }

    public void setContractorid(String contractorid) {
        this.contractorid = contractorid;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getConfirmpassword() {
        return confirmpassword;
    }

    public void setConfirmpassword(String confirmpassword) {
        this.confirmpassword = confirmpassword;
    }

    public Date getDatecreated() {
        return datecreated;
    }

    public void setDatecreated(Date datecreated) {
        this.datecreated = datecreated;
    }

    public Date getLastmodify() {
        return lastmodify;
    }

    public void setLastmodify(Date lastmodify) {
        this.lastmodify = lastmodify;
    }

    public String getCreatedby() {
        return createdby;
    }

    public void setCreatedby(String createdby) {
        this.createdby = createdby;
    }

    public Date getLastlogin() {
        return lastlogin;
    }

    public void setLastlogin(Date lastlogin) {
        this.lastlogin = lastlogin;
    }

    
    public List<Polesdto> getPolesList() {
        return polesList;
    }

    public void setPolesList(List<Polesdto> polesList) {
        this.polesList = polesList;
    }

    public Userrolesdto getRolesid() {
        return rolesid;
    }

    public void setRolesid(Userrolesdto rolesid) {
        this.rolesid = rolesid;
    }

    public Staffdto getStaffid() {
        return staffid;
    }

    public void setStaffid(Staffdto staffid) {
        this.staffid = staffid;
    }

    
    public List<Customerdto> getCustomerList() {
        return customerList;
    }

    public void setCustomerList(List<Customerdto> customerList) {
        this.customerList = customerList;
    }

    
    
}
