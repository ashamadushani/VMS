/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.qfix.vms.dao;

import com.qfix.vms.model.User;
import java.util.List;

/**
 *
 * @author M Asha Madushani
 */
public interface UserDao {
    void saveUser(User user);
    User getUserByID(int id);
    boolean checklogins(String username,String password);
    User login(String username, String password);
    void deleteUser(User user);
    void updateUser(User user);
    List<User> getUserList();
}
