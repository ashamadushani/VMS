/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.qfix.vms.controller;

import com.qfix.vms.model.Request;
import com.qfix.vms.service.RequestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author M Asha Madushani
 */
@Controller
public class RequestController {
    @Autowired
    private RequestService requestService;
    
    @RequestMapping(value = {"/makerequest"}, method = RequestMethod.GET)
    public String newRequest(ModelMap model) {
        Request request=new Request();
        model.addAttribute("request", request);
        return "makeRequest";
    }
    
    @RequestMapping(value = {"/makerequest"}, method = RequestMethod.POST)
    public String saveRequest(Request request,ModelMap model){
        requestService.saveRequest(request);
        model.addAttribute("email", "asha");
        return "home";
    }
    
}
