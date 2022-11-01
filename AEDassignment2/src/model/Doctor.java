/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;


/**
 *
 * @author ashwini
 */
public class Doctor extends Person{
    VitalSigns vsigns;
    private String diagnosis;
    private String medication;
    private String hospname;
    
    public Doctor(){
       
    }
 
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

    public String getHospname() {
        return hospname;
    }

    public void setHospname(String hospname) {
        this.hospname = hospname;
    }
    
    @Override
    public String toString(){
        return getName();
    }
    
}
