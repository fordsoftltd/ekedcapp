/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forsoft.tech.app.model;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author JIDEX
 */
@Entity
@Table(name = "applog")
public class Applog implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Column(name = "institution")
    private Integer institution;
    @Lob
    @Size(max = 65535)
    @Column(name = "description")
    private String description;
    @Size(max = 50)
    @Column(name = "activatorname")
    private String activatorname;
    @Column(name = "activatorid")
    private Integer activatorid;
    @Column(name = "datelog")
    @Temporal(TemporalType.TIMESTAMP)
    private Date datelog;

    public Applog() {
    }

    public Applog(Integer id) {
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

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Applog)) {
            return false;
        }
        Applog other = (Applog) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.studentmix.model.Applog[ id=" + id + " ]";
    }
    
}
