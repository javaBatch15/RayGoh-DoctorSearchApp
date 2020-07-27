package com.java.model;

import lombok.Data;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.Digits;
import javax.validation.constraints.Size;
import java.util.Date;
import java.util.Set;

@Data
@Entity
public class Doctor {

    @Id
    @GeneratedValue
    private int id;

    @NotEmpty(message = "First name cannot be empty")
    @Size(min = 2, max = 50, message = "Error: FirstName lesser than 2 or more than 50 characters")
    private String firstname;

    @NotEmpty(message = "Last name cannot be empty")
    @Size(min = 2, max = 50, message = "Error: LastName lesser than 2 or more than 50 characters")
    private String lastname;

    @NotEmpty(message = "Street cannot be empty")
    @Size(min = 2, max = 50, message = "Error: address STREET lesser than 2 or more than 50 characters")
    private String street;

    @NotEmpty(message = "City cannot be empty")
    @Size(min = 2, max = 50, message = "Error: address CITY lesser than 2 or more than 50 characters")
    private String city;

    @NotEmpty(message = "State cannot be empty")
    @Size(min = 2, max = 50, message = "Error: address STATE lesser than 2 or more than 50 characters")
    private String state;

    @NotEmpty(message = "zipcode cannot be empty")
    @Size(min = 5, max = 9, message="Error: address ZIPCODE lesser than 5 or more then 9 digits")
    private String zipcode;

    @Size(min = 1, max = 2, message="Error: please enter a rating less than 10 or more than 1")
    private String rating;

//    @ElementCollection
//    private Set<Date> dates;

    //    @ElementCollection
//    private Set<String> specialty;
    private String specialty;

    //Getters and setters following this

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    public int getId() {
        return id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

//    public Set<Date> getDates() {
//        return dates;
//    }
//
//    public void setDates(Set<Date> dates) {
//        this.dates = dates;
//    }

}
