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
public class TransformerData {
   private List<String> tranformerList;
   private List<Customerdto> customerList;
   private List<BuildingRequest> buildingList;

    public List<String> getTranformerList() {
        return tranformerList;
    }

    public void setTranformerList(List<String> tranformerList) {
        this.tranformerList = tranformerList;
    }

    public List<Customerdto> getCustomerList() {
        return customerList;
    }

    public void setCustomerList(List<Customerdto> customerList) {
        this.customerList = customerList;
    }

    public List<BuildingRequest> getBuildingList() {
        return buildingList;
    }

    public void setBuildingList(List<BuildingRequest> buildingList) {
        this.buildingList = buildingList;
    }
}
