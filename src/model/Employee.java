/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import org.json.simple.JSONObject;

/**
 *
 * @author sergi
 */
public class Employee {
    String id;
    String name;
    String password;
    String userName;

    public Employee(String id, String name, String password, String userName) {
        this.id = id;
        this.name = name;
        this.password = password;
        this.userName = userName;
    }

    public Employee() {
    }
    
    
    public void toObject(JSONObject employeeJSON){
        this.id=(String)employeeJSON.get("_id");
        this.name=(String)employeeJSON.get("name");
        this.password=(String)employeeJSON.get("password");
        this.userName=(String)employeeJSON.get("userName");
        
        
    }
    
    
    
}
