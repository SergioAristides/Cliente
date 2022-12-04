/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controler;

import model.Cinema;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import service.Service;

/**
 *
 * 
 * @author sergi
 */
public class ControlerCinema {
    Service serviceCinema;

    public ControlerCinema(Service serviceCinema) {
        this.serviceCinema = serviceCinema;
    }
    
    
    public boolean Create(Cinema cinema){
        boolean response = false;
        return response;  
    }
    
  

    public Cinema watch(String id){
        Cinema theCinema=null;
        String response = serviceCinema.GET("cinemas/" + id);
        try{
            JSONParser parser = new JSONParser();
            JSONObject cinemaObject =(JSONObject)parser.parse(response);
            theCinema= new Cinema();
            theCinema.toObject(cinemaObject);
        }catch(Exception e){
            e.printStackTrace();
        }
        return theCinema;
    }

    
    
    
}
