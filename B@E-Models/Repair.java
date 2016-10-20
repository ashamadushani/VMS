package com.vms.models;

public class Repair {
    
    
    private String date;
    private String outDate;
    private float amount;
    private String description;

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getOutDate() {
        return outDate;
    }

    public void setOutDate(String outDate) {
        this.outDate = outDate;
    }

    public float getAmount() {
        return amount;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Repair{" + "date=" + date + ", outDate=" + outDate + ", amount=" + amount + ", description=" + description + '}';
    }
    
    
}
