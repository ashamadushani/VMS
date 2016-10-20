/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.qfix.vms.dao.impl;

import com.qfix.vms.dao.AbstractDao;
import com.qfix.vms.dao.VehicleDao;
import com.qfix.vms.model.Vehicle;
import java.io.Serializable;
import java.util.List;
import org.hibernate.Criteria;
import org.springframework.stereotype.Repository;

/**
 *
 * @author M Asha Madushani
 */

@Repository
public class VehicleDaoImpl extends AbstractDao<Serializable, Vehicle> implements VehicleDao{

    @Override
    public void saveVehicle(Vehicle vehicle) {
        persist(vehicle);
    }

    @Override
    public Vehicle getVehicleByID(int id) {
        return getByKey(id);
    }

    @Override
    public void deleteVehicle(Vehicle vehicle) {
        delete(vehicle);
    }

    @Override
    public void updateVehicle(Vehicle vehicle) {
        update(vehicle);
    }

    @Override
    public List<Vehicle> getVehicleList() {
        Criteria criteria=createEntityCriteria();
        return (List<Vehicle>) criteria.list();
    }
    
}
