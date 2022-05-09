/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forsoft.tech.app.dto;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import java.util.Date;
import java.util.List;

/**
 *
 * 
 */




   
@ManagedBean
@ViewScoped 
public class Districtdto implements Dto {
    private Integer id;
    
    
    private String description;
    
    
    private Date datecreated;
    
    private List<Feederdto> feederList;

    public Districtdto() {
    }

    public Districtdto(Integer id) {
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

    
    public List<Feederdto> getFeederList() {
        return feederList;
    }

    public void setFeederList(List<Feederdto> feederList) {
        this.feederList = feederList;
    }

    
}
