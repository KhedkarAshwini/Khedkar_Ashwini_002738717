/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author ashwini
 */
public class VitalSigns {
    private double temperature;
    private double bloodpressure;
    private double pulse;
    private double weight;
    private double height;
    private String visitdate;
    private double heartrate;
    private double respiratoryrate;
    
    public VitalSigns(){
        this.height = 0;
        this.weight =0;
        this.temperature = 0;
        this.bloodpressure = 0;
        this.pulse = 0;
        this.heartrate = 0;
        this.respiratoryrate = 0;
    }
    public VitalSigns(double temp,double bp,double pul,double w,double h,String visit,double heart,double res){
        this.temperature = temp;
        this.bloodpressure = bp;
        this.pulse = pul;
        this.weight = w;
        this.height = h;
        this.visitdate =visit;
        this.heartrate = heart;
        this.respiratoryrate = res;
    }
    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    public double getBloodpressure() {
        return bloodpressure;
    }

    public void setBloodpressure(double bloodpressure) {
        this.bloodpressure = bloodpressure;
    }

    public double getPulse() {
        return pulse;
    }

    public void setPulse(double pulse) {
        this.pulse = pulse;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public String getVisitdate() {
        return visitdate;
    }

    public void setVisitdate(String visitdate) {
        this.visitdate = visitdate;
    } 

    public double getHeartrate() {
        return heartrate;
    }

    public void setHeartrate(double heartrate) {
        this.heartrate = heartrate;
    }

    public double getRespiratoryrate() {
        return respiratoryrate;
    }

    public void setRespiratoryrate(double respiratoryrate) {
        this.respiratoryrate = respiratoryrate;
    }
    
    
}
