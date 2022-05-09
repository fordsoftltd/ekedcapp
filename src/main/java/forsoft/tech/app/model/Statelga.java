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
@Table(name = "statelga")
public class Statelga implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "LgaId")
    private Integer lgaId;
    @Size(max = 100)
    @Column(name = "Description")
    private String description;
    @Basic(optional = false)
    @NotNull
    @Column(name = "DateCreated")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateCreated;
    @Size(max = 20)
    @Column(name = "statecode")
    private String statecode;
    @Size(max = 20)
    @Column(name = "lgacode")
    private String lgacode;
    @JoinColumn(name = "State", referencedColumnName = "stateId")
    @ManyToOne
    private State state;

    public Statelga() {
    }

    public Statelga(Integer lgaId) {
        this.lgaId = lgaId;
    }

    public Statelga(Integer lgaId, Date dateCreated) {
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

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (lgaId != null ? lgaId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Statelga)) {
            return false;
        }
        Statelga other = (Statelga) object;
        if ((this.lgaId == null && other.lgaId != null) || (this.lgaId != null && !this.lgaId.equals(other.lgaId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.studentmix.model.Statelga[ lgaId=" + lgaId + " ]";
    }
    
}
