/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forsoft.tech.app.dto;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import java.util.Date;

@ManagedBean
@ViewScoped
public class Progressmodel implements Dto {

    private int id;

    private long frequency;

    private String username;

    private String fullname;
    private Date datepasted;
    private String contractorid;

    public Progressmodel() {
    }

    public String getContractorid() {
        return contractorid;
    }

    public void setContractorid(String contractorid) {
        this.contractorid = contractorid;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
