package forsoft.tech.app.dto;

import com.fasterxml.jackson.annotation.JsonRootName;

@JsonRootName("data")
public class Data {
    private String username;
    private String password;
    private Integer response;
private Integer resp;
    public String getUsername() {
        return username;
    }

    public Integer getResp() {
        return resp;
    }

    public void setResp(Integer resp) {
        this.resp = resp;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getResponse() {
        return response;
    }

    public void setResponse(Integer response) {
        this.response = response;
    }
    
}
