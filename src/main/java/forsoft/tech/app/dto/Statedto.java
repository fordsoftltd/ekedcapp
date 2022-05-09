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
public class Statedto implements Dto {

    private static final long serialVersionUID = 1L;
    
    
    
    
    private Integer stateId;
    
    
    private String description;
    
    
    
    
    private Date dateCreated;
    
    private List<Statelgadto> statelgaList;

    public Statedto() {
    }

    public Statedto(Integer stateId) {
        this.stateId = stateId;
    }

    public Statedto(Integer stateId, Date dateCreated) {
        this.stateId = stateId;
        this.dateCreated = dateCreated;
    }

    public Integer getStateId() {
        return stateId;
    }

    public void setStateId(Integer stateId) {
        this.stateId = stateId;
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

    
    public List<Statelgadto> getStatelgaList() {
        return statelgaList;
    }

    public void setStatelgaList(List<Statelgadto> statelgaList) {
        this.statelgaList = statelgaList;
    }

    
}
