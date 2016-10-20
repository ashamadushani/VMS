/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.qfix.vms.dao.impl;

import com.qfix.vms.dao.AbstractDao;
import com.qfix.vms.dao.UserDao;
import com.qfix.vms.model.User;
import java.io.Serializable;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.hibernate.Criteria;
import org.hibernate.Query;
import org.springframework.stereotype.Repository;

/**
 *
 * @author M Asha Madushani
 */
@Repository
public class UserDaoImpl extends AbstractDao<Serializable, User> implements UserDao{

    @Override
    public void saveUser(User user) {
        try {
            String password=getSHA(user.getPassword());
            
            user.setPassword(password);
            persist(user);
        } catch (NoSuchAlgorithmException ex) {
            Logger.getLogger(UserDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public User getUserByID(int id) {
        return getByKey(id);
    }

    @Override
    public void deleteUser(User user) {
        delete(user);
    }
    //Update query have to complete before use
    @Override
    public void updateUser(User user) {
        update(user);
    }

    
    @Override
    public List<User> getUserList() {
        Criteria criteria=createEntityCriteria();
        return (List<User>) criteria.list();
    }

    @Override
    public User login(String email, String password) {
        try {
            password=getSHA(password);
        } catch (NoSuchAlgorithmException ex) {
            Logger.getLogger(UserDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        Query query = getSession().createSQLQuery("select * from system_user where email=:email and password=:password");
        query.setProperties(User.class);
        query.setString("email", email);
        query.setString("password", password);
        List list = query.list();
        User user = null;
        for (Iterator it = list.iterator(); it.hasNext();) {
            User u = (User) it.next();
            user = new User(u.getUsername(),u.getEmail(), u.getPassword());
            
        }
        return user;
        
    }

    @Override
    public boolean checklogins(String email, String password) {
        try {
            password=getSHA(password);
        } catch (NoSuchAlgorithmException ex) {
            Logger.getLogger(UserDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        boolean userFound = false;
        Query query = getSession().createSQLQuery("select * from system_user where email=:email and password=:password");
        query.setString("email", email);
        query.setString("password", password);
        List list = query.list();
        if ((list != null) && (list.size() > 0)) {
            userFound = true;
        }
        return userFound;
    }
    
    public static String getSHA(String data) throws NoSuchAlgorithmException {
        MessageDigest messageDigest = MessageDigest.getInstance("SHA1");

        messageDigest.update(data.getBytes());
        byte[] digest = messageDigest.digest();
        StringBuffer sb = new StringBuffer();
        for (byte b : digest) {
            sb.append(Integer.toHexString((int) (b & 0xff)));
        }
        return sb.toString();
    }

}
