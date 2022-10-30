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
    
    public Encounterhistory(){
        this.history = new ArrayList<Encounter>();
    }

    public ArrayList<Encounter> getHistory() {
        return history;
    }

    public void setHistory(ArrayList<Encounter> history) {
        this.history = history;
    }
    
    public Encounter addnewencounter(VitalSigns vs){
       Encounter e = new Encounter(vs);
       history.add(e);
       return e;
   }
   public Encounter updateEncounter(int id){
       for(Encounter e:history){
           if(history.indexOf(e) == id){
               history.set(id,e);
           }
           return e;
           }
           return null;
       }
    
    public void deleteEncounter(Encounter p){
        history.remove(p);
    }
}
