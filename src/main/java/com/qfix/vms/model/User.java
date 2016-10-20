/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.qfix.vms.model;

import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *This User class is an Entity class to carry user data from database and to database
 * @author Qfix
 * @version 1.0
 * @since 2016-06-04
 */
@Entity
@Table(name = "system_user", catalog = "vms")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String username;
    @Column(unique = true)
    private String email;
    private String designation;
    private String department;
    private String password;
    private String telephone;
    private String userType;
//    @OneToMany(mappedBy = "user")
//    private Set<Request> requests;
    
    public User() {
    }

    public User(int id, String username, String email, String designation, String department, String password, String telephone) {
        this.id = id;
        this.username = username;
        this.email = email;
        this.designation = designation;
        this.department = department;
        this.password = password;
        this.telephone = telephone;
    }

//    public User(int id, String username, String email, String designation, String department, String password, String telephone, String userType, Set<Request> requests) {
//        this.id = id;
//        this.username = username;
//        this.email = email;
//        this.designation = designation;
//        this.department = department;
//        this.password = password;
//        this.telephone = telephone;
//        this.userType = userType;
//        this.requests = requests;
//    }

    
    
    public User(int id, String username, String email, String designation, String department, String password, String telephone, String userType) {
        this.id = id;
        this.username = username;
        this.email = email;
        this.designation = designation;
        this.department = department;
        this.password = password;
        this.telephone = telephone;
        this.userType = userType;
    }

    
    public User(String username, String email, String designation, String department, String password, String telephone) {
        this.username = username;
        this.email = email;
        this.designation = designation;
        this.department = department;
        this.password = password;
        this.telephone = telephone;
    }

    public User(String username, String email, String password) {
        this.username = username;
        this.email = email;
        this.password = password;
    }

    public User(String email, String password) {
        this.email = email;
        this.password = password;
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the user_name
     */
    public String getUsername() {
        return username;
    }

    /**
     * @param user_name the user_name to set
     */
    public void setUsername(String user_name) {
        this.username = user_name;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the designation
     */
    public String getDesignation() {
        return designation;
    }

    /**
     * @param designation the designation to set
     */
    public void setDesignation(String designation) {
        this.designation = designation;
    }

    /**
     * @return the department
     */
    public String getDepartment() {
        return department;
    }

    /**
     * @param department the department to set
     */
    public void setDepartment(String department) {
        this.department = department;
    }

    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }

    public String getTelephone() {
        return getPassword();
    }

    /**
     * @param password the password to set
     */
    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    /**
     * @return the userType
     */
    public String getUserType() {
        return userType;
    }

    /**
     * @param userType the userType to set
     */
    public void setUserType(String userType) {
        this.userType = userType;
    }

    /**
     * @return the requests
     */
//    public Set<Request> getRequests() {
//        return requests;
//    }
//
//    /**
//     * @param requests the requests to set
//     */
//    public void setRequests(Set<Request> requests) {
//        this.requests = requests;
//    }

}
