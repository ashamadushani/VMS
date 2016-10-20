package com.vms.models;

import java.sql.Date;

public class Vehicle {
    private String registrationNo;
    private Date dateOfRegistration;
    private String makeAndType;
    private Date purchasedDate;
    private float purchasePrice;
    private String chassisNo;
    private String engineNo ;
    private int horsePower;
    private int stroke;
    private String bodyType;

    public String getRegistrationNo() {
        return registrationNo;
    }

    public void setRegistrationNo(String registrationNo) {
        this.registrationNo = registrationNo;
    }

    public Date getDateOfRegistration() {
        return dateOfRegistration;
    }

    public void setDateOfRegistration(Date dateOfRegistration) {
        this.dateOfRegistration = dateOfRegistration;
    }

    public String getMakeAndType() {
        return makeAndType;
    }

    public void setMakeAndType(String makeAndType) {
        this.makeAndType = makeAndType;
    }

    public Date getPurchasedDate() {
        return purchasedDate;
    }

    public void setPurchasedDate(Date purchasedDate) {
        this.purchasedDate = purchasedDate;
    }

    public float getPurchasePrice() {
        return purchasePrice;
    }

    public void setPurchasePrice(float purchasePrice) {
        this.purchasePrice = purchasePrice;
    }

    public String getChassisNo() {
        return chassisNo;
    }

    public void setChassisNo(String chassisNo) {
        this.chassisNo = chassisNo;
    }

    public String getEngineNo() {
        return engineNo;
    }

    public void setEngineNo(String engineNo) {
        this.engineNo = engineNo;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }

    public int getStroke() {
        return stroke;
    }

    public void setStroke(int stroke) {
        this.stroke = stroke;
    }

    public String getBodyType() {
        return bodyType;
    }

    public void setBodyType(String bodyType) {
        this.bodyType = bodyType;
    }

    @Override
    public String toString() {
        return "Vehicle{" + "registrationNo=" + registrationNo + ", dateOfRegistration=" + dateOfRegistration + ", makeAndType=" + makeAndType + ", purchasedDate=" + purchasedDate + ", purchasePrice=" + purchasePrice + ", chassisNo=" + chassisNo + ", engineNo=" + engineNo + ", horsePower=" + horsePower + ", stroke=" + stroke + ", bodyType=" + bodyType + '}';
    }
    
    
}
