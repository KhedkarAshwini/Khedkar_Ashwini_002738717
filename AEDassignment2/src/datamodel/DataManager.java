package datamodel;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ashwini
 */



import com.google.gson.*;
import java.io.*;
import java.util.*;
import org.apache.commons.io.*;
import java.nio.charset.StandardCharsets;
import model.*;


public class DataManager {
    private DataManager() {}
    
    public static DataManager shared = new DataManager();
    
    public PatientDirectory patients = new PatientDirectory();
    public DoctorDirectory doctors = new DoctorDirectory();
    public HospitalDirectory hospitals = new HospitalDirectory();
    public Encounterhistory history = new Encounterhistory();
    public int currentuserId;
    
}


