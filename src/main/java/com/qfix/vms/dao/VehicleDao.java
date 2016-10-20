/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.qfix.vms.dao;

import com.qfix.vms.model.Vehicle;
import java.util.List;

/**
 *
 * @author M Asha Madushani
 */
public interface VehicleDao {
    void saveVehicle(Vehicle vehicle);
    Vehicle getVehicleByID(int id);
    void deleteVehicle(Vehicle vehicle);
    void updateVehicle(Vehicle vehicle);
    List<Vehicle> getVehicleList();
}
