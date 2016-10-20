package com.vms.models;

public class InsuranceRenewal {
    private float sumInsured;
    private float premium;
    private String fromDate;
    private String toDate;
    private String additionalCoverstaken;

    public float getSumInsured() {
        return sumInsured;
    }

    public void setSumInsured(float sumInsured) {
        this.sumInsured = sumInsured;
    }

    public float getPremium() {
        return premium;
    }

    public void setPremium(float premium) {
        this.premium = premium;
    }

    public String getFromDate() {
        return fromDate;
    }

    public void setFromDate(String fromDate) {
        this.fromDate = fromDate;
    }

    public String getToDate() {
        return toDate;
    }

    public void setToDate(String toDate) {
        this.toDate = toDate;
    }

    public String getAdditionalCoverstaken() {
        return additionalCoverstaken;
    }

    public void setAdditionalCoverstaken(String additionalCoverstaken) {
        this.additionalCoverstaken = additionalCoverstaken;
    }

    @Override
    public String toString() {
        return "InsuranceRenewal{" + "sumInsured=" + sumInsured + ", premium=" + premium + ", fromDate=" + fromDate + ", toDate=" + toDate + ", additionalCoverstaken=" + additionalCoverstaken + '}';
    }
    
    
}
