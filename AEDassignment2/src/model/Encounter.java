/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author ashwini
 */
public class Encounter {
    private String visitdate;
    private int Encounterid;
    private String visittype;
    private String lastvisitdate;
    private String visitingdoctor;
    private VitalSigns signs;
    private String diagnosis;
    private String medication;
    
    
    public Encounter(VitalSigns vs){
        this.signs = vs;
    }
    
    public String getVisitdate() {
        return visitdate;
    }

    public void setVisitdate(String visitdate) {
        this.visitdate = visitdate;
    }

    public int getEncounterid() {
        return Encounterid;
    }

    public void setEncounterid(int Encounterid) {
        this.Encounterid = Encounterid;
    }

    public String getVisittype() {
        return visittype;
    }

    public void setVisittype(String visittype) {
        this.visittype = visittype;
    }

    public String getLastvisitdate() {
        return lastvisitdate;
    }

    public void setLastvisitdate(String lastvisitdate) {
        this.lastvisitdate = lastvisitdate;
    }

    public String getVisitingdoctor() {
        return visitingdoctor;
    }

    public void setVisitingdoctor(String visitingdoctor) {
        this.visitingdoctor = visitingdoctor;
    }

    public VitalSigns getSigns() {
        return signs;
    }

    public void setSigns(VitalSigns signs) {
        this.signs = signs;
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
    public String toString() {
        return visitdate; 
        
    }
}
