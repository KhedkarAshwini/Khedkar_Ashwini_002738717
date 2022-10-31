/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author ashwini
 */
public class Person {
    private String name;
    static int currentid = 1;
    private int id;
    private String gender;
    private int age;
    private String contact;
    private String email;
    private String address;
    private String city;
    
    public Person(){
        this.id = currentid;
        currentid++;
    }
    public Person(String pname,int id,String gen,int age,String con,String email,String add,String city){
        this.name = pname;
        this.id = id;
        this.age = age;
        this.gender = gen;
        this.contact = con;
        this.email = email;
        this.address = add;
        this.city = city;
        this.id = currentid;
        currentid++;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId(){
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    
    @Override
    public String toString() {
        return name; 
        
    }
}
