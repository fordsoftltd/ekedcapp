/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forsoft.tech.app.dto;

import com.fasterxml.jackson.annotation.JsonRootName;

import java.io.Serializable;

/**
 *
 * @author JIDEX
 */
@JsonRootName("dataresponse")
public class DataResponse implements Serializable{
    private Integer id;
    private String feeder;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFeeder() {
        return feeder;
    }

    public void setFeeder(String feeder) {
        this.feeder = feeder;
    }
    
}
