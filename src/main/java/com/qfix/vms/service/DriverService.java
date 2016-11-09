/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.qfix.vms.service;
import com.qfix.vms.model.Driver;
import java.util.List;
/**
 *
 * @author Tishan Madhawa
 */
public interface DriverService {
    
    List<Driver> findAllDrivers();
    
    void saveDriver(Driver driver);
    
    Driver findByID(Integer ID);

    Driver findByempID(String empID);

    void updateDriver(Driver driver);

    void deleteByEmpID(String empID);
    
    boolean isDriverEmpIDUnique(Integer id, String empID);
    
    
}
