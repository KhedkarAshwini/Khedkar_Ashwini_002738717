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
public class Doctor {
    Person person;
    //private ArrayList<Encounterhistory> history;
    VitalSigns vsigns;
    private String diagnosis;
    private String medication;
    
    public Doctor(Person p){
        this.person = p;
       
        //this.history s= new ArrayList<Encounterhistory>();
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }
    /**
    public ArrayList<Encounterhistory> getHistory() {
        return history;
    }

    public void setHistory(ArrayList<Encounterhistory> history) {
        this.history = history;
    }
   **/
    public VitalSigns getVsigns() {
        return vsigns;
    }

    public void setVsigns(VitalSigns vsigns) {
        this.vsigns = vsigns;
    }

    public String getDiagnosis() {
        return diagnosis;
    }

    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }

    public String getMedication() {
        return medication;
    }

    public void setMedication(String medication) {
        this.medication = medication;
    }
    
    @Override
    public String toString(){
       return person.getName();
    }
}
