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
import java.math.BigInteger;

/**
 *
 * @author JIDEX
 */
@Entity
@Table(name = "customercontractor")
public class Customercontractor implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Column(name = "id")
    @Id
    private int id;
    @Size(max = 50)
    @Column(name = "contractorid")
    private String contractorid;
    @Column(name = "done")
    private BigInteger done;
    @Column(name = "notdone")
    private BigInteger notdone;
    @Basic(optional = false)
    @NotNull
    @Column(name = "total")
    private long total;

    public Customercontractor() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getContractorid() {
        return contractorid;
    }

    public void setContractorid(String contractorid) {
        this.contractorid = contractorid;
    }

    public BigInteger getDone() {
        return done;
    }

    public void setDone(BigInteger done) {
        this.done = done;
    }

    public BigInteger getNotdone() {
        return notdone;
    }

    public void setNotdone(BigInteger notdone) {
        this.notdone = notdone;
    }

    public long getTotal() {
        return total;
    }

    public void setTotal(long total) {
        this.total = total;
    }
    
}
