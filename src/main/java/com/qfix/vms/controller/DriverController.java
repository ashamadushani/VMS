/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.qfix.vms.controller;
import java.lang.Exception;
import com.qfix.vms.model.Driver;
import com.qfix.vms.service.DriverService;
import java.util.List;
import java.lang.String;
import java.util.Locale;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;
/**
 *
 * @author T M Lakmal
 */
@Controller
public class DriverController {
    @Autowired
    private DriverService driverService;

    
    
    @RequestMapping(value={"/driverView"},method = RequestMethod.GET)
    public String viewDriver(ModelMap model) {
        
        List<Driver> drivers= driverService.findAllDrivers();
        model.addAttribute("drivers",drivers);
        return "driverView";
        
    }
    
    @RequestMapping(value = { "/addDriver" }, method = RequestMethod.GET)
	public String newDriver(ModelMap model){
            Driver driver = new Driver();
            model.addAttribute("driver", driver);

		return "addDriver";
	}
        
    @RequestMapping(value = { "/addDriver"},method = RequestMethod.POST)
        public String saveDriver(@Valid Driver driver,BindingResult result,
                ModelMap model){
            
            if(result.hasErrors()){
                return "addDriver";
            }
           
            
            if(driver!=null && (driverService.findByempID(driver.getEmpID())!= null)){
                driverService.deleteByEmpID(driver.getEmpID());
            }
            driverService.saveDriver(driver);
            return "home";
        }
        

        
    @RequestMapping(value = {  "/edit-driver-{empID}" }, method = RequestMethod.GET)
        public String editDriver(@PathVariable("empID") String empID,ModelMap model){
            Driver driver = driverService.findByempID(empID);
            model.addAttribute("driver",driver);
            model.addAttribute("edit",true);
            return "addDriver";
        }
        
    @RequestMapping(value = { "/edit-driver-{empID}" }, method = RequestMethod.POST)
    public String updateDriver(@Valid Driver driver,BindingResult result,
            ModelMap model, @PathVariable("empID") String empID){
        if(result.hasErrors()){
            return "addDriver";
        }
        driverService.updateDriver(driver);
        
        return "";
        
        
    }
    
    @RequestMapping(value={"/delete-driver-{empID}"},method = RequestMethod.GET)
    public String deleteUser(@PathVariable("empID") String empID){
        driverService.deleteByEmpID(empID);
        return "home";
    }
}
        
    
    

