/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forsoft.tech.app.controller;

import forsoft.tech.app.dto.LoginRequest;
import forsoft.tech.app.dto.Usersdto;
import forsoft.tech.app.mapper.DtoMapper;
import forsoft.tech.app.model.Building;
import forsoft.tech.app.model.Customer;
import forsoft.tech.app.model.District;
import forsoft.tech.app.model.Users;
import forsoft.tech.app.service.AppService;
import forsoft.tech.app.utils.*;

import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.enterprise.context.ApplicationScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpSession;
import org.primefaces.event.CellEditEvent;
import org.primefaces.event.RowEditEvent;
import org.primefaces.model.DefaultTreeNode;
import org.primefaces.model.TreeNode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;

/**
 *
 * @author odofintimothy
 */
@Component
@Scope(value="session",  proxyMode = ScopedProxyMode.TARGET_CLASS)
public class LoginController implements Serializable {

    @Autowired
    AppService service;
    private TreeNode root;
    private LoginRequest user;
private String description;
    private List<District> districtList;
    private Building currentBuilding;
    List<Customer> cmlist;
    @PostConstruct
    public void init() {
        cmlist=new ArrayList<>();
        currentBuilding= new Building();
        districtList = new ArrayList<>();
        user = new LoginRequest();
     
    }

    public void printMessage(String message, String title, FacesMessage.Severity messageType) {
        FacesContext contexts = FacesContext.getCurrentInstance();
        contexts.addMessage(null, new FacesMessage(messageType, title, message));
    }
    public Users loginUser() {
        HttpSession session = (HttpSession) FacesUtils.getHttpSession(false);
        Users user = (Users) session.getAttribute(Utils.VERIFIED_USER);
        return user;

    }
    public String getBuildingCode() {
        HttpSession session = (HttpSession) FacesUtils.getHttpSession(false);
        String user = (String) session.getAttribute("ld");
        return user;

    }

    public void fetchDistrict(String contractor) {
        districtList = service.getDistrictRepo().listByContractor(contractor);
    }
    public void loadUserFromSession(List<Building> buildingList, Users loginUser) throws IOException {
        fetchDistrict(loginUser.getContractorid());
            currentBuilding=buildingList.get(0);
            createTree(buildingList.get(0));
           // FacesUtils.getExternalContext().redirect(FacesUtils.getServletContext().getContextPath() + "/secure/qr_code.xhtml");

    }

    public void login() throws IOException {
        List<Users> users = service.getUsersRepo().findByUsername(user.getUsername());
        if (users ==null || users.isEmpty()) {
            printMessage(AppUtil.ACCOUNT_NOT_FOUND, AppUtil.ERROR, AppUtil.ERROR_TAG);

        }else{
            Users loginUser = users.get(0);
            if (BCrypt.checkpw(user.getPassword(), loginUser.getPassword())) {
                storeToSession(Utils.VERIFIED_USER, loginUser);
                fetchDistrict(loginUser.getContractorid());
                String  ls=(String) getSession().getAttribute("ld");

                List<Building> buildingList = service.getBuildingRepo().findByBldcodefinal(ls);

                if(buildingList.isEmpty()){

                    FacesUtils.getExternalContext().redirect(FacesUtils.getServletContext().getContextPath() + "/invalid.xhtml");
                }else{

                    currentBuilding=buildingList.get(0);
                    if(currentBuilding.getDone()==null || !currentBuilding.getDone())
                        service.getCustomerRepo().updateLoginDate(new Date(),currentBuilding.getBuilding_code_updated());
                    createTree(buildingList.get(0));
                    FacesUtils.getExternalContext().redirect(FacesUtils.getServletContext().getContextPath() + "/secure/qr_code.xhtml");
                }
            }else{
                printMessage(AppUtil.ACCOUNT_NOT_FOUND, AppUtil.ERROR, AppUtil.ERROR_TAG);

            }
        }

    }

    public HttpSession getSession() {
        HttpSession session = FacesUtils.getHttpSession(false);
        return session;
    }

    public void logoutAdmin() {
        try {
            getSession().setAttribute("ld", null);
            FacesUtils.getExternalContext().redirect(FacesUtils.getServletContext().getContextPath());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void storeToSession(String name, Object t) {
        HttpSession session = FacesUtils.getHttpSession(false);
        session.setAttribute(name, t);
    }

    public void reset(String data) {
        FacesUtils.resetManagedBean(data);
    }

    public void log(String content, String title, FacesMessage.Severity sign) {
        FacesContext contexts = FacesContext.getCurrentInstance();
        contexts.addMessage(null, new FacesMessage(sign, title, content));
    }

    public void createTree(Building b) {
        cmlist = service.getCustomerRepo().findByBldcodefinal(b.getBuilding_code_updated());
        this.description="Building Code: "+b.getBuilding_code_updated()+ "; \n Feeder: "+ b.getFeedername()+"; \n Transformer: "+ b.getTransformername();
        root = new DefaultTreeNode(new Customer(b.getDistrictcode(), b.getFeedername(), b.getTransformername()), null);
        for (Customer rs : cmlist) {
            new DefaultTreeNode(rs, root);
        }
    }
public void updateCustomer(){
        if(!cmlist.isEmpty()){
            cmlist.forEach(rs->{
                rs.setDone(true);
                rs.setPastedby(loginUser());
                rs.setLogindate(new Date());
                rs.setPasteddate(new Date());
                service.getCustomerRepo().save(rs);
            });
        }
    cmlist = service.getCustomerRepo().findByBldcodefinal(currentBuilding.getBuilding_code_updated());

}
    public void onRowEdit(RowEditEvent<TreeNode> event) {
        FacesMessage msg = new FacesMessage("Document Edited", event.getObject().toString());
        FacesContext.getCurrentInstance().addMessage(null, msg);
    }

    public void onRowCancel(RowEditEvent<TreeNode> event) {
        FacesMessage msg = new FacesMessage("Edit Cancelled", event.getObject().toString());
        FacesContext.getCurrentInstance().addMessage(null, msg);
    }

    public void onCellEdit(CellEditEvent event) {
        Object oldValue = event.getOldValue();
        Object newValue = event.getNewValue();

        if (newValue != null && !newValue.equals(oldValue)) {
            FacesMessage msg = new FacesMessage(FacesMessage.SEVERITY_INFO, "Cell Changed", "Old: " + oldValue + ", New:" + newValue);
            FacesContext.getCurrentInstance().addMessage(null, msg);
        }
    }

    public TreeNode getRoot() {
        return root;
    }

    public void setRoot(TreeNode root) {
        this.root = root;
    }

    public AppService getService() {
        return service;
    }

    public void setService(AppService service) {
        this.service = service;
    }

    public LoginRequest getUser() {
        return user;
    }

    public void setUser(LoginRequest user) {
        this.user = user;
    }

    public List<District> getDistrictList() {
        return districtList;
    }

    public void setDistrictList(List<District> districtList) {
        this.districtList = districtList;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Building getCurrentBuilding() {
        return currentBuilding;
    }

    public void setCurrentBuilding(Building currentBuilding) {
        this.currentBuilding = currentBuilding;
    }
}
