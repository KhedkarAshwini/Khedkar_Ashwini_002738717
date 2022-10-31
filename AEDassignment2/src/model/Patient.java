/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;


/**
 *
 * @author ashwini
 */
public class Patient {
    
    private Person patient;
    private Encounterhistory history;
    
    
    public Patient(Person p){
        this.patient = p;
    }
    public Patient(Person p , Encounterhistory e){
        patient = p;
        history = e;
    }
   

    public Person getPatient() {
        return patient;
    }

    public void setPatient(Person patient) {
        this.patient = patient;
    }

    public Encounterhistory getHistory() {
        return history;
    }

    public void setHistory(Encounterhistory history) {
        this.history = history;
    }
   /**
    public VitalSigns getVitalsigns() {
        return vitalsigns;
    }

    public void setVitalsigns(VitalSigns vitalsigns) {
        this.vitalsigns = vitalsigns;
    }
**/
    
    
    
    

    
    
    
    
}
