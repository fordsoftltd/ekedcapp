/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forsoft.tech.app.dto;

import javax.faces.bean.ManagedBean;
import java.io.Serializable;
import java.math.BigInteger;
@ManagedBean
public class Contractors implements Serializable {
    private int id;
    private String contractorid;
    
    private BigInteger done;
    
    private BigInteger notdone;
    
    private long total;

    public Contractors() {
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
