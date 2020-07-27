package com.java.model;

import com.sun.istack.Nullable;

public class DoctorSearchModel {
    
    private String firstname;
      
    private String lastname;
      
    private String street;
      
    private String city;
      
    private String state;
      
    private String zipcode;
      
    private String rating;

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public String getStreet() {
        return street;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }

    public String getZipcode() {
        return zipcode;
    }

    public String getRating() {
        return rating;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }
    

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public void setZipcode(double zipcode) {
        this.zipcode = String.valueOf(zipcode);
    }

    public void setRating(double rating) {
        this.rating = String.valueOf(rating);
    }
}
