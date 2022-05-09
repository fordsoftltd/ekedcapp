/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forsoft.tech.app.dto;

import com.fasterxml.jackson.annotation.JsonRootName;

import java.io.Serializable;
import java.util.List;

/**
 *
 * @author JIDEX
 */
@JsonRootName("timsoftresponse")
public class TimsoftResponse implements Serializable{
    private List<Usermodeldto> data;
    private String message;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
    

    public List<Usermodeldto> getData() {
        return data;
    }

    public void setData(List<Usermodeldto> data) {
        this.data = data;
    }
    
}
