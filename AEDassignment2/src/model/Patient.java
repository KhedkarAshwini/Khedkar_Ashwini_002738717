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
    private VitalSigns vitalsigns;
    private Encounter encounter;
    
    
    public Patient(Person p , VitalSigns vs , Encounter e){
        patient = p;
        vitalsigns = vs;
        encounter = e;
    }
   

    public Person getPatient() {
        return patient;
    }

    public void setPatient(Person patient) {
        this.patient = patient;
    }

    public VitalSigns getVitalsigns() {
        return vitalsigns;
    }

    public void setVitalsigns(VitalSigns vitalsigns) {
        this.vitalsigns = vitalsigns;
    }

    public Encounter getEncounter() {
        return encounter;
    }

    public void setEncounter(Encounter encounter) {
        this.encounter = encounter;
    }
    
    
    

    
    
    
    
}
