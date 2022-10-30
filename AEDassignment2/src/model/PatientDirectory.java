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
public class PatientDirectory {
    
    private ArrayList<Patient> patients;
    //private ArrayList<Encounterhistory> history;
    
    public PatientDirectory(){
        this.patients = new ArrayList <Patient> ();
        //this.history = new ArrayList<Encounterhistory>();        
    }

    public ArrayList<Patient> getPatient() {
        return patients;
    }

    public void setPatient(ArrayList<Patient> patient) {
        this.patients = patient;
    }
    
    
    public Patient addnewpatient(Person p, VitalSigns vs , Encounter e){
       Patient pa = new Patient(p,vs ,e);
       patients.add(pa);
       return pa;
   }
    
    public Patient updatepatient(int id){
       for(Patient e:patients){
           if(patients.indexOf(e) == id){
               patients.set(id,e);
           }
           return e;
           }
           return null;
       }
    
    public void deletepatient(Patient p){
        patients.remove(p);
    }
}
