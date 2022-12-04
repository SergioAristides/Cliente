/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controler;

import java.util.LinkedList;
import model.Chair;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import service.Service;

/**
 *
 * @author sergi
 */
public class ControlerChair {
    Service serviceChair;

    public ControlerChair(Service serviceChair) {
        this.serviceChair = serviceChair;
    }
                 public boolean create(Chair theChair) {
        boolean respuesta = false;
        return respuesta;
    }

    public Chair watch(String id) {
        Chair theChair = null;
        String response = serviceChair.GET("chairs/" + id);
        try {
            JSONParser parser = new JSONParser();
            JSONObject chairJSON = (JSONObject) parser.parse(response);
            theChair = new Chair();
            theChair.toObject(chairJSON);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return theChair;
    }
    
        public LinkedList<Chair> toList() {
        LinkedList<Chair> listChairs = new LinkedList<>();
        String response = serviceChair.GET("chairs");
        try {
            JSONParser parser = new JSONParser();
            JSONArray chairsJSON = (JSONArray) parser.parse(response);
            for (Object chair : chairsJSON) {
                Chair theFunction = new Chair();
                theFunction.toObject((JSONObject)chair);
                listChairs.add(theFunction);
            }
        } catch (Exception e) {
            System.out.println("error " + e);
        }
        return listChairs;
    }
        
        public boolean edit(Chair theChair) {
        boolean response = false;

        return response;
    }

    public boolean delete(Chair theChair) {
        boolean response = false;

        return response;
    }
}
