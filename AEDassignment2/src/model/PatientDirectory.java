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
    
    public PatientDirectory(){
        this.patients = new ArrayList<Patient>();      
    }

    public ArrayList<Patient> getPatient() {
        return patients;
    }
    
    public Patient addnewpatient(Patient p){
       patients.add(p);
       return p;
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
    
     public Patient fetchPatient(String name){
        for(Patient p : patients){
            if(p.getName().equals(name)){
                System.out.print(p.getName());
                return p;
            }
        }
        return null;
    }
     public Patient fetchPatientbyID(int id){
        for(Patient p : patients){
            if(p.getId() == id){
                return p;
            }
        }
        return null;
    }
}
