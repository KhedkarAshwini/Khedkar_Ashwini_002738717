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
    public Patient p;
    private String visitdate;
    private int Encounterid;
    static int currentid = 1;
    private String visittype;
    public Doctor doctor;
    private VitalSigns signs;
    private String diagnosis;
    private String medication;
    
    public Encounter(){
        this.Encounterid = currentid;
        currentid++;
    }
    public Encounter(String vdate, int eid, String vtype, Doctor doc,Patient p,VitalSigns vs, String d, String med){
        this.visitdate = vdate;
        this.Encounterid = eid;
        this.visittype = vtype;
        this.doctor = doc;
        this.p = p;
        this.signs = vs;
        this.diagnosis = d;
        this.medication = med;
        this.Encounterid = currentid;
        currentid++;
    }
    public Encounter(VitalSigns vs){
        this.signs = vs;
        this.Encounterid = currentid;
        currentid++;
    }
    
    public Encounter(Patient p){
        this.p = p;
        this.Encounterid = currentid;
        currentid++;
    }
    
    public Encounter(Patient p,VitalSigns vs){
        this.signs = vs;
        this.p = p;
        this.Encounterid = currentid;
        currentid++;
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
