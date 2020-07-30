package com.java.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class Appointment {

    private String doctor_id;

    private String apptDate;

    public int getAppointmentID() {
        return appointmentID;
    }

    @Id
    @GeneratedValue
    private int appointmentID;

    private String eightToTen;

    private String tenToTwelve;

    private String TwelveToTwo;

    private String TwoToFour;

    private String FourToSix;

    public String getDoctor_id() {
        return doctor_id;
    }

    public void setDoctor_id(String doctor_id) {
        this.doctor_id = doctor_id;
    }

    public String getEightToTen() {
        return eightToTen;
    }

    public void setEightToTen(String eightToTen) {
        this.eightToTen = eightToTen;
    }

    public String getTenToTwelve() {
        return tenToTwelve;
    }

    public void setTenToTwelve(String tenToTwelve) {
        this.tenToTwelve = tenToTwelve;
    }

    public String getTwelveToTwo() {
        return TwelveToTwo;
    }

    public void setTwelveToTwo(String twelveToTwo) {
        TwelveToTwo = twelveToTwo;
    }

    public String getTwoToFour() {
        return TwoToFour;
    }

    public void setTwoToFour(String twoToFour) {
        TwoToFour = twoToFour;
    }

    public String getFourToSix() {
        return FourToSix;
    }

    public void setFourToSix(String fourToSix) {
        FourToSix = fourToSix;
    }

    public String getApptDate() {
        return apptDate;
    }

    public void setApptDate(String apptDate) {
        this.apptDate = apptDate;
    }
}
