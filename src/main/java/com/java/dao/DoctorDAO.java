package com.java.dao;

import com.java.model.Doctor;

import java.util.List;

public interface DoctorDAO {

    public void addDoctor(Doctor d);
    public List<Doctor> getDoctors(Doctor d);
    public void removeDoctor(int id);
}
