/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.qfix.vms.dao.impl;

import com.qfix.vms.dao.AbstractDao;
import com.qfix.vms.dao.DriverDao;
import com.qfix.vms.model.Driver;
import java.io.Serializable;
import java.security.NoSuchAlgorithmException;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Hibernate;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Tishan Madhawa
 */
@Repository("driverDao")
public class DriverDaoImpl extends AbstractDao<Serializable, Driver> implements DriverDao{
    @SuppressWarnings("unchecked")
    @Override
    public List<Driver> findAllDrivers() {
        Criteria criteria=createEntityCriteria().addOrder(Order.asc("name"));
        criteria.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY);
        List<Driver> drivers= (List<Driver>) criteria.list();
        return drivers;
    }
    
    @Override
    public void saveDriver(Driver driver){
        persist(driver);
        
    }

    @Override
    public Driver findByempID(String empID) {
       System.out.println("empID:"+empID);
       Criteria crit= createEntityCriteria();
       crit.add(Restrictions.eq("empID", empID));
       Driver driver = (Driver)crit.uniqueResult();
       return driver;
        
    }

    @Override
    public Driver findByID(Integer id) {
        Driver driver= getByKey(id);
        return driver;
        
    }

    @Override
    public void deleteByEmpID(String empId) {
        Criteria crit = createEntityCriteria();
        crit.add(Restrictions.eq("empID",empId));
        Driver driver = (Driver)crit.uniqueResult();
        delete(driver);
        
    }

}
