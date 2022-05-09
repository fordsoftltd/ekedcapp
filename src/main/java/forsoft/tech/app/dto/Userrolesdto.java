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
public class Userrolesdto implements Dto {
    
    private Integer id;
    
    private String description;
    
    
    private Date datecreated;
    
    private Boolean candelete;
    
    private Boolean canedit;
    
    private Boolean canprint;
    
    private Boolean canaddstaff;
    
    private Boolean canadduser;
    
    private Boolean canviewlog;
    

    public Userrolesdto() {
    }

    public Userrolesdto(Integer id) {
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

    public Boolean getCandelete() {
        return candelete;
    }

    public void setCandelete(Boolean candelete) {
        this.candelete = candelete;
    }

    public Boolean getCanedit() {
        return canedit;
    }

    public void setCanedit(Boolean canedit) {
        this.canedit = canedit;
    }

    public Boolean getCanprint() {
        return canprint;
    }

    public void setCanprint(Boolean canprint) {
        this.canprint = canprint;
    }

    public Boolean getCanaddstaff() {
        return canaddstaff;
    }

    public void setCanaddstaff(Boolean canaddstaff) {
        this.canaddstaff = canaddstaff;
    }

    public Boolean getCanadduser() {
        return canadduser;
    }

    public void setCanadduser(Boolean canadduser) {
        this.canadduser = canadduser;
    }

    public Boolean getCanviewlog() {
        return canviewlog;
    }

    public void setCanviewlog(Boolean canviewlog) {
        this.canviewlog = canviewlog;
    }

    
    
}
