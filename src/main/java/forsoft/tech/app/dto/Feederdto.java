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
public class Feederdto implements Dto {
    private Integer id;
    
    
    private String description;
    
    
    private Date datecreated;
    
    
    private String category;
    
    
    private Districtdto businessunitid;

    public Feederdto() {
    }

    public Feederdto(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getDatecreated() {
        return datecreated;
    }

    public void setDatecreated(Date datecreated) {
        this.datecreated = datecreated;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Districtdto getBusinessunitid() {
        return businessunitid;
    }

    public void setBusinessunitid(Districtdto businessunitid) {
        this.businessunitid = businessunitid;
    }

    
    
    
}
