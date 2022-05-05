/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forsoft.tech.app.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
/**
 *
 * @author JIDEX
 */
@Entity
@Table(name = "userroles")
public class Userroles implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    
    //(max = 65535)
    @Column(name = "description")
    private String description;
    @Column(name = "datecreated")
    @Temporal(TemporalType.TIMESTAMP)
    private Date datecreated;
    @Column(name = "candelete")
    private Boolean candelete;
    @Column(name = "canedit")
    private Boolean canedit;
    @Column(name = "canprint")
    private Boolean canprint;
    @Column(name = "canaddstaff")
    private Boolean canaddstaff;
    @Column(name = "canadduser")
    private Boolean canadduser;
    @Column(name = "canviewlog")
    private Boolean canviewlog;
    @OneToMany(mappedBy = "rolesid")
    private List<Users> usersList;

    public Userroles() {
    }

    public Userroles(Integer id) {
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


    public List<Users> getUsersList() {
        return usersList;
    }

    public void setUsersList(List<Users> usersList) {
        this.usersList = usersList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Userroles)) {
            return false;
        }
        Userroles other = (Userroles) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.studentmix.model.Userroles[ id=" + id + " ]";
    }
    
}
