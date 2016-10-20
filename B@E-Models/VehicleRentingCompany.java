package com.vms.models;

public class VehicleRentingCompany {
    
    private String name;
    private String address;
    private String contactNo;
    private String email;
    private String Description;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getContactNo() {
        return contactNo;
    }

    public void setContactNo(String contactNo) {
        this.contactNo = contactNo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String Description) {
        this.Description = Description;
    }

    @Override
    public String toString() {
        return "VehicleRentingCompany{" + "name=" + name + ", address=" + address + ", contactNo=" + contactNo + ", email=" + email + ", Description=" + Description + '}';
    }
    
    
}
