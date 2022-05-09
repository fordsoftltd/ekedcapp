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
public class Applogdto implements Dto {

    
    private Integer id;
    
    private Integer institution;
    
    
    
    private String description;
    
    
    private String activatorname;
    
    private Integer activatorid;
    
    
    private Date datelog;

    public Applogdto() {
    }

    public Applogdto(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getInstitution() {
        return institution;
    }

    public void setInstitution(Integer institution) {
        this.institution = institution;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getActivatorname() {
        return activatorname;
    }

    public void setActivatorname(String activatorname) {
        this.activatorname = activatorname;
    }

    public Integer getActivatorid() {
        return activatorid;
    }

    public void setActivatorid(Integer activatorid) {
        this.activatorid = activatorid;
    }

    public Date getDatelog() {
        return datelog;
    }

    public void setDatelog(Date datelog) {
        this.datelog = datelog;
    }

    
    
    public String toString() {
        return "com.studentmix.model.Applog[ id=" + id + " ]";
    }
    
}
