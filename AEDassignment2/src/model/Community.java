/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author ashwini
 */
public class Community {
    private HospitalDirectory hospitals;
    
    public Community(HospitalDirectory hospitals){
        this.hospitals = hospitals;
    }

    public HospitalDirectory getHospitals() {
        return hospitals;
    }

    public void setHospitals(HospitalDirectory hospitals) {
        this.hospitals = hospitals;
    }
    
    
}
