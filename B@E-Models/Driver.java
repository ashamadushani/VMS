
package com.vms.models;

import java.sql.Date;

public class Driver {
    private String empID;
    private String name;;
    private String licenceNo;
    private String contactNo;
    private String address;
    private Date dateEmployed;

    public String getEmpID() {
        return empID;
    }

    public void setEmpID(String empID) {
        this.empID = empID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLicenceNo() {
        return licenceNo;
    }

    public void setLicenceNo(String licenceNo) {
        this.licenceNo = licenceNo;
    }

    public String getContactNo() {
        return contactNo;
    }

    public void setContactNo(String contactNo) {
        this.contactNo = contactNo;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Date getDateEmployed() {
        return dateEmployed;
    }

    public void setDateEmployed(Date dateEmployed) {
        this.dateEmployed = dateEmployed;
    }

    @Override
    public String toString() {
        return "Driver{" + "empID=" + empID + ", name=" + name + ", licenceNo=" + licenceNo + ", contactNo=" + contactNo + ", address=" + address + ", dateEmployed=" + dateEmployed + '}';
    }
    
    
}
