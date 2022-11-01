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
public class Encounterhistory {
    private ArrayList<Encounter> history;
    //private PatientDirectory patients;
    
    
    public Encounterhistory(){
        this.history = new ArrayList<Encounter>();
    }

    public ArrayList<Encounter> getHistory() {
        return history;
    }

    public void setHistory(ArrayList<Encounter> history) {
        this.history = history;
    }
    
    
    public Encounter addnewencounter(Encounter p){
       history.add(p);
       return p;
   }
   
    
    public void deleteEncounter(Encounter p){
        history.remove(p);
    }
    
    public Encounter fetchEncounter(int id){
        for(Encounter p : history){
            if(p.getEncounterid() == id){
                return p;
            }
        }
        return null;
    }
    public ArrayList<Encounter> fetchEncounterforDoctor(int id){
        ArrayList<Encounter> enc = new ArrayList<>();
        for(Encounter e:history){
            if(e.doctor.getId() == id){
                enc.add(e);
            }
        }
        return enc;
    }
    public ArrayList<Encounter> fetchEncounterforPatient(int id){
        ArrayList<Encounter> enc = new ArrayList<>();
        for(Encounter e:history){
            if(e.p.getId() == id){
                enc.add(e);
            }
        }
        return enc;
    }
}
