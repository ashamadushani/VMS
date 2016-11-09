/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.qfix.vms.dao;
import com.qfix.vms.model.Driver;
import java.util.List;

/**
 *
 * @author Tishan Madhawa
 */
public interface DriverDao {
    
    List<Driver> findAllDrivers();
    
    void saveDriver(Driver driver);

    Driver findByempID(String empID);

    Driver findByID(Integer id);

    void deleteByEmpID(String empID);
}
