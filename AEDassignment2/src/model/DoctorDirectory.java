/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author ashwini
 */
public class DoctorDirectory {
    private ArrayList<Doctor> doctor;
    
    public DoctorDirectory(){
        this.doctor = new ArrayList<Doctor>();
    }

    public ArrayList<Doctor> getDoctor() {
        return doctor;
    }

    public void setDoctor(ArrayList<Doctor> doctor) {
        this.doctor = doctor;
    }
    public Doctor addnewdoctor(Person p){
        Doctor d = new Doctor(p);
        doctor.add(d);
        return d;
   }
    
    public Doctor updatedoctor(int id){
       for(Doctor e:doctor){
           if(doctor.indexOf(e) == id){
               doctor.set(id,e);
           }
           return e;
           }
           return null;
       }
    
    public void deletedoctor(Doctor d){
        doctor.remove(d);
    }
    
}
