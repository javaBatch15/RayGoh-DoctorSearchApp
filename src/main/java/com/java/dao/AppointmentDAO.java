package com.java.dao;

import com.java.model.Appointment;
import com.java.model.Doctor;
import com.java.model.DoctorSearchModel;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;
import org.springframework.ui.Model;

import javax.persistence.Query;
import java.util.List;

public class AppointmentDAO {

    public AppointmentDAO() {
        Configuration cfg = new Configuration();
        cfg.configure("hibernate-config.xml");// validate ur xml
        this.sf = cfg.buildSessionFactory();// connection pool: create ur schema.
    }

    private SessionFactory sf;

    public void addDoctor(Doctor d){
        Session s1 = sf.openSession();// connection
        Transaction tx=s1.beginTransaction();

        s1.save(d);
        tx.commit();
        s1.close();
    }

    public Appointment getDoctor(String doctorID, String apptDate){

        Session s1 = sf.openSession();// connection
        Transaction tx=s1.beginTransaction();

        Criteria cr = s1.createCriteria(Appointment.class);
        //add more criteria
        cr.add(Restrictions.eq("doctor_id",doctorID));
        cr.add(Restrictions.eq("apptDate",apptDate));

        Appointment availability = (Appointment) cr.uniqueResult();

        if(cr.uniqueResult() == null) {
            Appointment newAppt = new Appointment();
            newAppt.setDoctor_id(doctorID);
            newAppt.setApptDate(apptDate);
            s1.save(newAppt);
            tx.commit();
            availability = (Appointment) cr.uniqueResult();
        }

//        tx.commit();
        s1.close();

        return availability;
    }

    public void setAppointment(String apptID, String timeSlot){
        Session s1 = sf.openSession();// connection
        Transaction tx=s1.beginTransaction();

        Appointment apptDay = s1.load(Appointment.class, Integer.valueOf(apptID));
        switch(timeSlot) {

            case "1":
                apptDay.setEightToTen("Booked");
                break;
            case "2":
                apptDay.setTenToTwelve("Booked");
                break;
            case "3":
                apptDay.setTwelveToTwo("Booked");
                break;
            case "4":
                apptDay.setTwoToFour("Booked");
                break;
            case "5":
                apptDay.setFourToSix("Booked");
                break;
        }

        tx.commit();
        s1.close();
    }
}
