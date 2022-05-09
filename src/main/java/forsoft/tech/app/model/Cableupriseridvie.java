/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forsoft.tech.app.model;

import javax.persistence.*;
import java.io.Serializable;

/**
 *
 * @author JIDEX
 */
@Entity
@Table(name = "cableupriseridvie")
public class Cableupriseridvie implements Serializable {

    private static final long serialVersionUID = 1L;
    @Column(name = "id")
    @Id
    private Integer id;
    @Lob
    @Column(name = "cableupriserid")
    private String cableupriserid;
    @Lob
    @Column(name = "transformer")
    private String transformer;
    @Basic(optional = false)
    @Column(name = "count(*)")
    private long count;

    public Cableupriseridvie() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCableupriserid() {
        return cableupriserid;
    }

    public void setCableupriserid(String cableupriserid) {
        this.cableupriserid = cableupriserid;
    }

    public String getTransformer() {
        return transformer;
    }

    public void setTransformer(String transformer) {
        this.transformer = transformer;
    }

    public long getCount() {
        return count;
    }

    public void setCount(long count) {
        this.count = count;
    }
    
}
