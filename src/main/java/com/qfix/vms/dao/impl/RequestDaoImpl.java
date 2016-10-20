/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.qfix.vms.dao.impl;

import com.qfix.vms.dao.AbstractDao;
import com.qfix.vms.dao.RequestDao;
import com.qfix.vms.model.Request;
import java.io.Serializable;
import java.util.List;
import org.hibernate.Criteria;
import org.springframework.stereotype.Repository;

/**
 *
 * @author M Asha Madushani
 */

@Repository
public class RequestDaoImpl extends AbstractDao<Serializable, Request> implements RequestDao{

    @Override
    public void saveRequest(Request request) {
        persist(request);
    }

    @Override
    public Request getRequestByID(int id) {
        return getByKey(id);
    }

    @Override
    public void deleteRequest(Request request) {
        delete(request);
    }

    @Override
    public void updateRequest(Request request) {
        update(request);
    }

    @Override
    public List<Request> getRequestList() {
        Criteria criteria=createEntityCriteria();
        return (List<Request>) criteria.list();
    }
    
}
