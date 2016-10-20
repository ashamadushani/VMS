package com.qfix.vms.model;
 
import java.sql.Date;
import java.sql.Time;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "request" ,catalog = "vms")
public class Request {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private Date datePlaced;
    private boolean recommnedation;
    private boolean authrization;
    private Date date;
    private Time time;
    private int periodHrs;
    private String starting_point;
    private String destination;
    private String purpose;
    private int noOfPersons;
    private String description;
    private String vehicle_type;
    
//    @ManyToOne
//    @JoinColumn(name="registrationNo", nullable=false)
//    private Vehicle vehicleRequired;
//    @ManyToOne
//    @JoinColumn(name="email")
//    private User user;

    public Request() {
    }

    public Request(int id, Date datePlaced, boolean recommnedation, boolean authrization, Date date, Time time, int periodHrs, String starting_point, String destination, String purpose, int noOfPersons, String description, String vehicle_type) {
        this.id = id;
        this.datePlaced = datePlaced;
        this.recommnedation = recommnedation;
        this.authrization = authrization;
        this.date = date;
        this.time = time;
        this.periodHrs = periodHrs;
        this.starting_point = starting_point;
        this.destination = destination;
        this.purpose = purpose;
        this.noOfPersons = noOfPersons;
        this.description = description;
        this.vehicle_type = vehicle_type;
        
    }
    
    
    

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

    
//    public Vehicle getVehicleRequired() {
//        return vehicleRequired;
//    }
//
//    public void setVehicleRequired(Vehicle vehicleRequired) {
//        this.vehicleRequired = vehicleRequired;
//    }

//    @Override
//    public String toString() {
//        return "Request{" + "datePlaced=" + datePlaced + ", recommnedation=" + recommnedation + ", authrization=" + authrization + ", date=" + date + ", time=" + time + ", periodHrs=" + periodHrs + ", destination=" + destination + ", purpose=" + purpose + ", noOfPersons=" + noOfPersons + ", description=" + description + ", vehicleRequired=" + vehicleRequired + '}';
//    }
//   

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
     * @return the starting_point
     */
    public String getStarting_point() {
        return starting_point;
    }

    /**
     * @param starting_point the starting_point to set
     */
    public void setStarting_point(String starting_point) {
        this.starting_point = starting_point;
    }

    /**
     * @return the user
     */
//    public User getUser() {
//        return user;
//    }
//
//    /**
//     * @param user the user to set
//     */
//    public void setUser(User user) {
//        this.user = user;
//    }

    /**
     * @return the vehicle_type
     */
    public String getVehicle_type() {
        return vehicle_type;
    }

    /**
     * @param vehicle_type the vehicle_type to set
     */
    public void setVehicle_type(String vehicle_type) {
        this.vehicle_type = vehicle_type;
    }
    
}
