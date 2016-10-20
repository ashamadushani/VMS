package com.vms.models;

public class Replacement {
    private String date;
    private String replacedParts;
    private float price;
    private String descriptions;

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getReplacedParts() {
        return replacedParts;
    }

    public void setReplacedParts(String replacedParts) {
        this.replacedParts = replacedParts;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getDescriptions() {
        return descriptions;
    }

    public void setDescriptions(String descriptions) {
        this.descriptions = descriptions;
    }
    
    
}
