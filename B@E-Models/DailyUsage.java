package com.vms.models;

public class DailyUsage {
    private String date;
    private float beginReading;
    private float endReading;
    private float fuelConsumption;

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public float getBeginReading() {
        return beginReading;
    }

    public void setBeginReading(float beginReading) {
        this.beginReading = beginReading;
    }

    public float getEndReading() {
        return endReading;
    }

    public void setEndReading(float endReading) {
        this.endReading = endReading;
    }

    public float getFuelConsumption() {
        return fuelConsumption;
    }

    public void setFuelConsumption(float fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }

    @Override
    public String toString() {
        return "DailyUsage{" + "date=" + date + ", beginReading=" + beginReading + ", endReading=" + endReading + ", fuelConsumption=" + fuelConsumption + '}';
    }
    
    
    
    
}
