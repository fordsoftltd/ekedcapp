/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forsoft.tech.app.dto;

import java.math.BigInteger;
import java.util.List;

/**
 *
 * @author JIDEX
 */
public class Reportdata {

    private BigInteger done;
    private BigInteger notdone;
    private Long total;
    private List<Progressmodel> dataList;
    private List<Rawdata> rawDataList;

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

    public Long getTotal() {
        return total;
    }

    public void setTotal(Long total) {
        this.total = total;
    }

    public List<Progressmodel> getDataList() {
        return dataList;
    }

    public void setDataList(List<Progressmodel> dataList) {
        this.dataList = dataList;
    }

    public List<Rawdata> getRawDataList() {
        return rawDataList;
    }

    public void setRawDataList(List<Rawdata> rawDataList) {
        this.rawDataList = rawDataList;
    }

}
