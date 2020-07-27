package com.java.dao;

import com.java.model.Doctor;
import com.java.model.DoctorSearchModel;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;

import javax.persistence.Query;
import java.util.List;

public class DoctorDAOImpl {

    public DoctorDAOImpl() {
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

    public List getAllDoctors(){
        Session s1 = sf.openSession();// connection
        Query q = s1.createQuery("from Doctor");
        List results = q.getResultList();
        s1.close();

        return results;
    }


    public List getDoctor(DoctorSearchModel d){

        Session s1 = sf.openSession();// connection
        Transaction tx=s1.beginTransaction();

        Criteria cr = s1.createCriteria(Doctor.class);
        //add more criteria
        if(!d.getFirstname().isEmpty()){
            System.out.println("Restriction added"+d.getFirstname());
            cr.add(Restrictions.like("firstname", "%"+d.getFirstname()+"%").ignoreCase());
        }

        if(!d.getLastname().isEmpty()){
            System.out.println("Restriction added"+d.getFirstname());
            cr.add(Restrictions.like("lastname", "%"+d.getLastname()+"%").ignoreCase());
        }

        if(!d.getStreet().isEmpty()){
            System.out.println("Restriction added"+d.getFirstname());
            cr.add(Restrictions.like("street", "%"+d.getStreet()+"%").ignoreCase());
        }

        if(!d.getCity().isEmpty()){
            System.out.println("Restriction added"+d.getFirstname());
            cr.add(Restrictions.like("city", "%"+d.getCity()+"%").ignoreCase());
        }

        if(!d.getState().isEmpty()){
            System.out.println("Restriction added"+d.getFirstname());
            cr.add(Restrictions.like("state", "%"+d.getState()+"%").ignoreCase());
        }

        if(!d.getZipcode().isEmpty()){
            System.out.println("Restriction added"+d.getFirstname());
            cr.add(Restrictions.eq("zipcode", d.getZipcode()).ignoreCase());
        }

        if(!d.getRating().isEmpty()){
            System.out.println("Restriction added"+d.getFirstname());
            cr.add(Restrictions.gt("rating", d.getRating()).ignoreCase());
        }

        List results = cr.list();

        tx.commit();
        s1.close();

        return results;
    }
}
