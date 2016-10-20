/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.qfix.vms.service;

import com.qfix.vms.model.Vehicle;
import java.util.List;

/**
 *
 * @author M Asha Madushani
 */
public interface VehicleService {

    void saveVehicle(Vehicle vehicle);

    Vehicle getVehicleByID(int id);

    void deleteVehicle(Vehicle vehicle);

    void updateVehicle(Vehicle vehicle);

    List<Vehicle> geVehicleList();
}
