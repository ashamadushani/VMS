package com.vms.models;
 
import java.sql.Date;
import java.sql.Time;

public class Request {
    private Date datePlaced;
    private boolean recommnedation;
    private boolean authrization;
    private Date date;
    private Time time;
    private int periodHrs;
    private String destination;
    private String purpose;
    private int noOfPersons;
    private String description;
    private Vehicle vehicleRequired;

    public Date getDatePlaced() {
        return datePlaced;
    }

    public void setDatePlaced(Date datePlaced) {
        this.datePlaced = datePlaced;
    }

    public boolean isRecommnedation() {
        return recommnedation;
    }

    public void setRecommnedation(boolean recommnedation) {
        this.recommnedation = recommnedation;
    }

    public boolean isAuthrization() {
        return authrization;
    }

    public void setAuthrization(boolean authrization) {
        this.authrization = authrization;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Time getTime() {
        return time;
    }

    public void setTime(Time time) {
        this.time = time;
    }

    public int getPeriodHrs() {
        return periodHrs;
    }

    public void setPeriodHrs(int periodHrs) {
        this.periodHrs = periodHrs;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getPurpose() {
        return purpose;
    }

    public void setPurpose(String purpose) {
        this.purpose = purpose;
    }

    public int getNoOfPersons() {
        return noOfPersons;
    }

    public void setNoOfPersons(int noOfPersons) {
        this.noOfPersons = noOfPersons;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Vehicle getVehicleRequired() {
        return vehicleRequired;
    }

    public void setVehicleRequired(Vehicle vehicleRequired) {
        this.vehicleRequired = vehicleRequired;
    }

    @Override
    public String toString() {
        return "Request{" + "datePlaced=" + datePlaced + ", recommnedation=" + recommnedation + ", authrization=" + authrization + ", date=" + date + ", time=" + time + ", periodHrs=" + periodHrs + ", destination=" + destination + ", purpose=" + purpose + ", noOfPersons=" + noOfPersons + ", description=" + description + ", vehicleRequired=" + vehicleRequired + '}';
    }
   
    
}
