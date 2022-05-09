/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forsoft.tech.app.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author JIDEX
 */
@Entity
@Table(name = "ltpolesviewraw")
public class Ltpolesviewraw implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Column(name = "id")
    @Id
    private int id;
    @Size(max = 50)
    @Column(name = "contractorid")
    private String contractorid;
    @Size(max = 50)
    @Column(name = "username")
    private String username;
    @Column(name = "userid")
    private Integer userid;
    @Basic(optional = false)
    @NotNull
    @Column(name = "staffid")
    private int staffid;
    @Size(max = 200)
    @Column(name = "fullname")
    private String fullname;
    @Column(name = "datepasted")
    @Temporal(TemporalType.TIMESTAMP)
    private Date datepasted;
    @Column(name = "logindate")
    @Temporal(TemporalType.TIMESTAMP)
    private Date logindate;

    public Ltpolesviewraw() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public int getStaffid() {
        return staffid;
    }

    public void setStaffid(int staffid) {
        this.staffid = staffid;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public Date getDatepasted() {
        return datepasted;
    }

    public void setDatepasted(Date datepasted) {
        this.datepasted = datepasted;
    }

    public Date getLogindate() {
        return logindate;
    }

    public void setLogindate(Date logindate) {
        this.logindate = logindate;
    }
    
}
