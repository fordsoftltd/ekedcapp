/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forsoft.tech.app.controller;

import forsoft.tech.app.api.dto.LoginRequest;
import forsoft.tech.app.model.Building;
import forsoft.tech.app.model.CustomerMeta;
import forsoft.tech.app.service.AppService;
import forsoft.tech.app.utils.FacesUtils;
import forsoft.tech.app.utils.MessageUtil;
import java.io.IOException;
import java.io.Serializable;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.enterprise.context.ApplicationScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpSession;
import org.primefaces.event.CellEditEvent;
import org.primefaces.event.RowEditEvent;
import org.primefaces.event.TabChangeEvent;
import org.primefaces.event.TabCloseEvent;
import org.primefaces.model.DefaultTreeNode;
import org.primefaces.model.TreeNode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 *
 * @author odofintimothy
 */
@Component
@ApplicationScoped
public class LoginController implements Serializable {

    @Autowired
    AppService service;
    private TreeNode root;
    private CustomerMeta customer;
    private LoginRequest user;
private String description;
    @PostConstruct
    public void init() {
        user = new LoginRequest();
     
    }

    public void login() throws IOException {
        if (user.getUsername().equals("admin") && user.getPassword().equals("admin")) {
            storeToSession("login", "admin");
           String  ls=(String) getSession().getAttribute("ld");
           
           List<Building> blist = service.getBuildingRepo().findByBldcodefinal(ls);
            
            if(blist.isEmpty()){
                
              FacesUtils.getExternalContext().redirect(FacesUtils.getServletContext().getContextPath() + "/invalid.xhtml");
            }else{
                createTree(blist.get(0));
                 FacesUtils.getExternalContext().redirect(FacesUtils.getServletContext().getContextPath() + "/qr_code.xhtml");
            }
           
        } else {
            log("Invlaid login credential", MessageUtil.ERROR, MessageUtil.ERROR_TAG);
        }
    }

    public HttpSession getSession() {
        HttpSession session = FacesUtils.getHttpSession(false);
        return session;
    }

    public void logoutAdmin() {
        try {
            getSession().setAttribute("login", null);
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
        List<CustomerMeta> cmlist = service.getCustomerMetaRepo().findByBldcodefinal(b.getBldcodefinal());
        this.description="Code: "+b.getBldcodefinal()+" Transformer: "+ b.getTransformername()+" Feeder: "+ b.getFeederid();
        System.out.println(description);
        root = new DefaultTreeNode(new CustomerMeta(b.getDistrictcode(), b.getFeedercode(), b.getTransformername()), null);
        for (CustomerMeta rs : cmlist) {
            new DefaultTreeNode(rs, root);
        }
    }

    public void onRowEdit(RowEditEvent<TreeNode> event) {
        FacesMessage msg = new FacesMessage("Document Edited", event.getObject().toString());
        FacesContext.getCurrentInstance().addMessage(null, msg);
    }

    public void onTabChange(TabChangeEvent event) {
        FacesMessage msg = new FacesMessage("Tab Changed", "Active Tab: " + event.getTab().getTitle());
        FacesContext.getCurrentInstance().addMessage(null, msg);
    }

     public void onTabClose(TabCloseEvent event) {
        FacesMessage msg = new FacesMessage("Tab Closed", "Closed tab: " + event.getTab().getTitle());
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public CustomerMeta getCustomer() {
        return customer;
    }

    public void setCustomer(CustomerMeta customer) {
        this.customer = customer;
    }

}
