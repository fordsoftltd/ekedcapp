/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forsoft.tech.app.dto;

import java.util.List;

/**
 *
 * @author JIDEX
 */
public class LtPoleTransformerData {
   private List<String> tranformerList;
   private List<Ltpolesdto> dataList;

    public List<String> getTranformerList() {
        return tranformerList;
    }

    public void setTranformerList(List<String> tranformerList) {
        this.tranformerList = tranformerList;
    }

    public List<Ltpolesdto> getDataList() {
        return dataList;
    }

    public void setDataList(List<Ltpolesdto> dataList) {
        this.dataList = dataList;
    }


}
