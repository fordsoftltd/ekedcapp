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
public class UpriserData {
   private List<String> upriser;
   private List<Customerdto> customerList;

    public List<String> getUpriser() {
        return upriser;
    }

    public void setUpriser(List<String> upriser) {
        this.upriser = upriser;
    }

    public List<Customerdto> getCustomerList() {
        return customerList;
    }

    public void setCustomerList(List<Customerdto> customerList) {
        this.customerList = customerList;
    }
   
}
