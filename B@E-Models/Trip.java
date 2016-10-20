package com.vms.models;

public class Trip {
    private String timeout;
    private String timeIn;
    private String from;
    private String to;
    private String placeVisited;
    private String route;
    private float mileage;

    public String getTimeout() {
        return timeout;
    }

    public void setTimeout(String timeout) {
        this.timeout = timeout;
    }

    public String getTimeIn() {
        return timeIn;
    }

    public void setTimeIn(String timeIn) {
        this.timeIn = timeIn;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public String getPlaceVisited() {
        return placeVisited;
    }

    public void setPlaceVisited(String placeVisited) {
        this.placeVisited = placeVisited;
    }

    public String getRoute() {
        return route;
    }

    public void setRoute(String route) {
        this.route = route;
    }

    public float getMileage() {
        return mileage;
    }

    public void setMileage(float mileage) {
        this.mileage = mileage;
    }

    @Override
    public String toString() {
        return "Trip{" + "timeout=" + timeout + ", timeIn=" + timeIn + ", from=" + from + ", to=" + to + ", placeVisited=" + placeVisited + ", route=" + route + ", mileage=" + mileage + '}';
    }
    
    
    
}
