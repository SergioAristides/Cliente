/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controler;

import java.util.LinkedList;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Employee;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import service.Service;

/**
 *
 * @author sergi
 */
public class ControlerEmployee {
    Service serviceEmSployee;

    public ControlerEmployee() {
    }

    
    public ControlerEmployee(Service serviceEmSployee) {
        this.serviceEmSployee = serviceEmSployee;
    }
    
    public LinkedList<Employee> toList(){
        LinkedList<Employee> lisEmployee= new LinkedList<>();
        try {
            String response=serviceEmSployee.GET("employees");
            
            JSONParser parser= new JSONParser();
            JSONArray employeeJSON= (JSONArray) parser.parse(response);
            for(Object employee:employeeJSON){
                Employee theEmployee =new Employee();
                theEmployee.toObject((JSONObject)employee);
                lisEmployee.add(theEmployee);
                
            }
        } catch (ParseException ex) {
            ex.printStackTrace();
        }
        return lisEmployee;
    }
    
    
}
