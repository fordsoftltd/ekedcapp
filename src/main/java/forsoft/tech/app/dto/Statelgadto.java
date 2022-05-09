/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forsoft.tech.app.dto;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import java.util.Date;

/**
 *
 * 
 */




  
@ManagedBean
@ViewScoped  
public class Statelgadto implements Dto {
    private Integer lgaId;
    
    private String description;
    
    
    private Date dateCreated;
    
    
    private String statecode;
    
    
    private String lgacode;
    
    
    private Statedto state;

    public Statelgadto() {
    }

    public Statelgadto(Integer lgaId) {
        this.lgaId = lgaId;
    }

    public Statelgadto(Integer lgaId, Date dateCreated) {
        this.lgaId = lgaId;
        this.dateCreated = dateCreated;
    }

    public Integer getLgaId() {
        return lgaId;
    }

    public void setLgaId(Integer lgaId) {
        this.lgaId = lgaId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }

    public String getStatecode() {
        return statecode;
    }

    public void setStatecode(String statecode) {
        this.statecode = statecode;
    }

    public String getLgacode() {
        return lgacode;
    }

    public void setLgacode(String lgacode) {
        this.lgacode = lgacode;
    }

    public Statedto getState() {
        return state;
    }

    public void setState(Statedto state) {
        this.state = state;
    }

 
    
}
