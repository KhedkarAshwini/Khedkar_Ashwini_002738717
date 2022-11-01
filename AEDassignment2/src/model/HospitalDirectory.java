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
public class HospitalDirectory {
    private ArrayList<Hospital> hospitals;
    
    public HospitalDirectory(){
        this.hospitals = new ArrayList<Hospital>();
    }

    public ArrayList<Hospital> getHospitals() {
        return hospitals;
    }

    public void setHospitals(ArrayList<Hospital> hospitals) {
        this.hospitals = hospitals;
    }
    
    public Hospital addnewhospital(Hospital h){
       
       hospitals.add(h);
       return h;
   }
   public ArrayList<Hospital> fetchHospitalbyZipCode(String zip){
       ArrayList<Hospital> hosp = new ArrayList<>();
        for(Hospital hos : hospitals){
            if(hos.getZipcode().equals(zip)){
                hosp.add(hos);
            }
        }
        return hosp;
    }
}
