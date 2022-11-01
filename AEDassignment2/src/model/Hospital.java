/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import datamodel.*;
import java.util.ArrayList;

/**
 *
 * @author ashwini
 */
public class Hospital {
    private PatientDirectory patients;
    private PersonDirectory persons;
    private Encounterhistory hist;
    //private DoctorDirectory doctors;
    private String hosname;
    private String contact;
    private String email;
    private String zipcode;
    private String address;
    private String city;
    private String community;
    
   
    public Hospital(){
        this.patients = DataManager.shared.patients;
        //this.doctors = DataManager.shared.doctors;
        this.hist = DataManager.shared.history;
    }
    
    public PatientDirectory getPatients() {
        return patients;
    }

    public void setPatients(PatientDirectory patients) {
        this.patients = patients;
    }

    public PersonDirectory getPersons() {
        return persons;
    }

    public void setPersons(PersonDirectory persons) {
        this.persons = persons;
    }

    public Encounterhistory getHist() {
        return hist;
    }

    public void setHist(Encounterhistory hist) {
        this.hist = hist;
    }
    
    public ArrayList<Doctor> getDoctors() {
        return DataManager.shared.doctors.fetchDoctorbyHosName(hosname);
    }
    /**
    public void setDoctors(DoctorDirectory doctors) {
        this.doctors = doctors;
    }
   **/
    public String getHosname() {
        return hosname;
    }

    public void setHosname(String hosname) {
        this.hosname = hosname;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCommunity() {
        return community;
    }

    public void setCommunity(String community) {
        this.community = community;
    }
    
    @Override
    public String toString(){
        return hosname;
    }
}
