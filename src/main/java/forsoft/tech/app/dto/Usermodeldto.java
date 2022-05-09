/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forsoft.tech.app.dto;

import com.fasterxml.jackson.annotation.JsonRootName;

import java.io.Serializable;

/**
 *
 * @author JIDEX
 */
@JsonRootName("usermodel")
public class Usermodeldto implements Serializable{
   private String username;
   private String password;
   private String phone;
   private String name;
   private String contractorid;
   private String gender;
   private Integer roleid;
   private String rolename;
   private String datecaptured;

    public String getDatecaptured() {
        return datecaptured;
    }

    public void setDatecaptured(String datecaptured) {
        this.datecaptured = datecaptured;
    }
   

    public String getRolename() {
        return rolename;
    }

    public void setRolename(String rolename) {
        this.rolename = rolename;
    }
   

    public Integer getRoleid() {
        return roleid;
    }

    public void setRoleid(Integer roleid) {
        this.roleid = roleid;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
   

    public String getContractorid() {
        return contractorid;
    }

    public void setContractorid(String contractorid) {
        this.contractorid = contractorid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
   
}
