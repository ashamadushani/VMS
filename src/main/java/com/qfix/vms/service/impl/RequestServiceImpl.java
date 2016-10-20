/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.qfix.vms.service.impl;

import com.qfix.vms.dao.RequestDao;
import com.qfix.vms.model.Request;
import com.qfix.vms.service.RequestService;
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
public class RequestServiceImpl implements RequestService{

    @Autowired
    private RequestDao requestDao;
    
    @Override
    public void saveRequest(Request request) {
        requestDao.saveRequest(request);
    }

    @Override
    public Request getRequestByID(int id) {
        return requestDao.getRequestByID(id);
    }

    @Override
    public void deleteRequest(Request request) {
        requestDao.deleteRequest(request);
    }

    @Override
    public void updateRequest(Request request) {
        requestDao.updateRequest(request);
    }

    @Override
    public List<Request> getRequestList() {
        return requestDao.getRequestList();
    }
    
}
