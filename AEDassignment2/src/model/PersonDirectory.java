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
public class PersonDirectory {
    private ArrayList<Person> persons;
    
    public PersonDirectory(){
        this.persons = new ArrayList<Person> ();
    }

    public ArrayList<Person> getPersons() {
        return persons;
    }

    public void setPersons(ArrayList<Person> persons) {
        this.persons = persons;
    }
    
    public Person addnewperson(){
       Person emp = new Person();
       persons.add(emp);
       return emp;
   }
   public Person updateperson(int id){
       for(Person e:persons){
           if(persons.indexOf(e) == id){
               persons.set(id,e);
           }
           return e;
           }
           return null;
       }
    
    public void deleteperson(Person p){
        persons.remove(p);
    }
}
