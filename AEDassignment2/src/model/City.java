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
public class City {
    
    private ArrayList<Community> community;
    
    public City(){
        this.community = new ArrayList<>();
    }

    public ArrayList<Community> getCommunity() {
        return community;
    }

    public void setCommunity(ArrayList<Community> community) {
        this.community = community;
    }

    
    
    
    
    
}
