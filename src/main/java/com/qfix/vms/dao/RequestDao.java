/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.qfix.vms.dao;

import com.qfix.vms.model.Request;
import java.util.List;

/**
 *
 * @author M Asha Madushani
 */
public interface RequestDao {
    void saveRequest(Request request);
    Request getRequestByID(int id);
    void deleteRequest(Request request);
    void updateRequest(Request request);
    List<Request> getRequestList();
}
