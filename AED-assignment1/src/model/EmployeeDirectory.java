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
public class EmployeeDirectory {
    
    private ArrayList<Employee> directory;
    
    public EmployeeDirectory() {
        this.directory = new ArrayList<Employee>();
    }

    public ArrayList<Employee> getDirectory() {
        return directory;
    }

    public void setDirectory(ArrayList<Employee> directory) {
        this.directory = directory;
    }
    
   public Employee addnewEmployees(){
       Employee emp = new Employee();
       directory.add(emp);
       return emp;
   }
   public void deleteEmployee(Employee emp){
        directory.remove(emp);
    }
   
   public Employee updateEmployee(int id){
       for(Employee e:directory){
           if(directory.indexOf(e) == id){
               directory.set(id,e);
           }
           return e;
           }
           return null;
       }

   
}
