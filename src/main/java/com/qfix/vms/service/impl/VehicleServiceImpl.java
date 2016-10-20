/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.qfix.vms.service.impl;

import com.qfix.vms.dao.VehicleDao;
import com.qfix.vms.model.Vehicle;
import com.qfix.vms.service.VehicleService;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author M Asha Madushani
 */
@Service
@Transactional
public class VehicleServiceImpl implements VehicleService{

    @Autowired
    VehicleDao vehicleDao;
    
    @Override
    public void saveVehicle(Vehicle vehicle) {
        vehicleDao.saveVehicle(vehicle);
    }

    @Override
    public Vehicle getVehicleByID(int id) {
        return vehicleDao.getVehicleByID(id);
    }

    @Override
    public void deleteVehicle(Vehicle vehicle) {
        vehicleDao.deleteVehicle(vehicle);
    }

    @Override
    public void updateVehicle(Vehicle vehicle) {
        vehicleDao.updateVehicle(vehicle);
    }

    @Override
    public List<Vehicle> geVehicleList() {
        return vehicleDao.getVehicleList();
    }
    
}
