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
public class HtPoleTransformerData {
   private List<String> tranformerList;
   private List<Polesdto> dataList;

    public List<String> getTranformerList() {
        return tranformerList;
    }

    public void setTranformerList(List<String> tranformerList) {
        this.tranformerList = tranformerList;
    }

    public List<Polesdto> getDataList() {
        return dataList;
    }

    public void setDataList(List<Polesdto> dataList) {
        this.dataList = dataList;
    }


}
