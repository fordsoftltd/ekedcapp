/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forsoft.tech.app.api;

import forsoft.tech.app.controller.LoginController;
import forsoft.tech.app.model.Building;
import forsoft.tech.app.service.AppService;
import forsoft.tech.app.utils.Utils;
import java.io.IOException;
import java.io.Serializable;
import java.util.List;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.primefaces.model.TreeNode;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 * @author JIDEX
 */
@Controller
@RequestMapping(value = "/verify", headers = "Accept=application/json")
public class VerificationController implements Serializable {

    @Autowired
    ServletContext context;
    @Autowired
    AppService service;
    
    @Autowired
    LoginController loginController;

    @GetMapping("/htpole")
    public void htole(@RequestParam(value = "poleno", required = true) String poleno, HttpSession session, HttpServletResponse response) throws IOException {
        session.setAttribute("data", Utils.HTPOLE + ":" + poleno);
        response.sendRedirect(context.getContextPath() + "/verification.htm");

    }

    @GetMapping("/ltpole")
    public void ltole(@RequestParam(value = "poleno", required = true) String poleno, HttpSession session, HttpServletResponse response) throws IOException {
        session.setAttribute("data", Utils.LTPOLE + ":" + poleno);
        response.sendRedirect(context.getContextPath() + "/verification.htm");

    }

    @GetMapping("/building")
    public void customer(@RequestParam(value = "bldcode", required = true) String bldcode, HttpSession session,
            HttpServletResponse response) throws IOException {
       
        List<Building> blist = service.getBuildingRepo().findByBldcodefinal(bldcode);
        if (blist.isEmpty()) {
            response.sendRedirect(context.getContextPath() + "/invalid.xhtml");
        } else {
             session.setAttribute("ld", bldcode);
           
            response.sendRedirect(context.getContextPath() + "/login.xhtml");
        }

    }

}
