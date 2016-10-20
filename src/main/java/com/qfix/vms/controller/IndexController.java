/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.qfix.vms.controller;

import com.qfix.vms.model.Login;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author M Asha Madushani
 */
@Controller
public class IndexController {

    @RequestMapping(value = "/index")
    public String getIndex(HttpServletRequest request) {
        request.setAttribute("login", new Login());
        return "index";
    }

    @RequestMapping(value = "/forgetPassword")
    public String forgetPW() {
        return "forgetPassword";
    }

    @RequestMapping(value = "/logout")
    public String logOut(HttpSession session) {
        if (session != null) {
            session.invalidate();
        }
        return "redirect:/";
    }

}
