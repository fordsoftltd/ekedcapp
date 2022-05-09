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
@Table(name = "polesview")
public class Polesview implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Column(name = "id")
    @Id
    private int id;
    @Size(max = 50)
    @Column(name = "contractorid")
    private String contractorid;
    @Basic(optional = false)
    @NotNull
    @Column(name = "frequency")
    private long frequency;
    @Size(max = 50)
    @Column(name = "username")
    private String username;
    @Size(max = 200)
    @Column(name = "fullname")
    private String fullname;
    @Column(name = "datepasted")
    @Temporal(TemporalType.DATE)
    private Date datepasted;

    public Polesview() {
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

    public long getFrequency() {
        return frequency;
    }

    public void setFrequency(long frequency) {
        this.frequency = frequency;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
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
    
}
