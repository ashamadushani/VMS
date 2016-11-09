/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.qfix.vms.service.impl;
import com.qfix.vms.dao.DriverDao;
import com.qfix.vms.model.Driver;
import com.qfix.vms.service.DriverService;
import static com.sun.corba.se.spi.presentation.rmi.StubAdapter.request;

import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



/**
 *
 * @author Tishan Madhawa
 */
@Service
@Transactional
public class DriverServiceImpl implements DriverService{
    @Autowired
    private DriverDao driverDao;
    
    @Override
    public List<Driver> findAllDrivers(){
        return driverDao.findAllDrivers();
    }
    
    @Override
    public void saveDriver(Driver driver){
        driverDao.saveDriver(driver);
    }

    @Override
    public Driver findByempID(String empID){
        Driver driver = driverDao.findByempID(empID);
        return driver;
    }

   
    @Override
    public void updateDriver(Driver driver){
        Driver entity = driverDao.findByID(driver.getID());
        if(entity!=null){
   
            entity.setEmpID(driver.getEmpID());
            entity.setName(driver.getName());
            entity.setLicenceNo(driver.getLicenceNo());
            entity.setAddress(driver.getAddress());
            entity.setContactNo(driver.getContactNo());
            entity.setDateEmployed(driver.getDateEmployed());
            
            
        }
    }

    @Override
    public Driver findByID(Integer ID){
        return driverDao.findByID(ID);
    }

    @Override
    public void deleteByEmpID(String empID) {
        driverDao.deleteByEmpID(empID);
    }

    @Override
    public boolean isDriverEmpIDUnique(Integer id, String empID) {
        Driver driver= findByempID(empID);
        return (driver == null || ((id!= null) && (driver.getID()==id)));
    }

    
}
