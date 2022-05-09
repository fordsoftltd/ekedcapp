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
/**
 *
 * @author JIDEX
 */
@Entity
@Table(name = "customer_house")
public class CustomerHouse implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Column(name = "id")
    @Id
    private int id;
    @Lob
    @Size(max = 65535)
    @Column(name = "premisestype")
    private String premisestype;

    public CustomerHouse() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPremisestype() {
        return premisestype;
    }

    public void setPremisestype(String premisestype) {
        this.premisestype = premisestype;
    }
    
}
