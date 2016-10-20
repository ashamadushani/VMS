/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.qfix.vms.controller;

import com.qfix.vms.model.Login;
import com.qfix.vms.model.User;
import com.qfix.vms.service.UserService;
import java.util.HashMap;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *This UserController class is used to operate the activities related to a User
 * @author Qfix
 * @version 1.0
 * @since 2016-06-04
 */
@Controller
public class UserController {

    @Autowired
    private UserService service;//Inject UserService object to this object

    public void initBinder(WebDataBinder dataBinder){
        dataBinder.setDisallowedFields(new String[]{"userType","requests"});
    }
    /** 
     * This method start when a jsp pass a string "/signup" 
     * @param model
     * @return String (name of the jsp)
    */
    @RequestMapping(value = {"/signup"}, method = RequestMethod.GET)
    public String newUser(ModelMap model) {
        User user = new User();
        model.addAttribute("user", user);
        return "user_reg";
    }

    
    @RequestMapping(value = {"/signup"}, method = RequestMethod.POST)
    public String saveMamber(User user, ModelMap model) {
        service.saveUser(user);
        model.addAttribute("success", "User " + user.getEmail() + " Added Succesfully");
        return "redirect:/";
    }
    
    @RequestMapping(value = {"/signin"}, method = RequestMethod.POST)
    public String signinProcess(@Valid @ModelAttribute("loginForm") User user, BindingResult result, ModelMap map, HttpSession session,HttpServletRequest request) {
        if (result.hasErrors()) {
            HashMap<String, String> errors = new HashMap<String, String>();
            for (FieldError error : result.getFieldErrors()) {
                errors.put(error.getField(), error.getDefaultMessage());
            }
            map.put("errors", errors);
            return "redirect:/";
        }
        
        boolean find = service.checklogins(user.getEmail(), user.getPassword());
        
        if (find) {
            
            map.put("email", user.getEmail());
            return "home";
        } else {
            map.addAttribute("error", "Invalid Email Address Or Password");
            request.setAttribute("login", new Login());
            return "index";
        }
    }
}
