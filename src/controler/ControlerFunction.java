/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controler;

import java.util.LinkedList;
import model.Function;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import service.Service;

/**
 *
 * @author sergi
 */
public class ControlerFunction {
    Service serviceFunction;

    public ControlerFunction() {
    }

    public ControlerFunction(Service serviceFunction) {
        this.serviceFunction = serviceFunction;
    }
    
             public boolean create(Function theFunction) {
        boolean respuesta = false;
        return respuesta;
    }

    public Function watch(String id) {
        Function theFunction = null;
        String response = serviceFunction.GET("functions/" + id);
        try {
            JSONParser parser = new JSONParser();
            JSONObject functionJSON = (JSONObject) parser.parse(response);
            theFunction = new Function();
            theFunction.toObject(functionJSON);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return theFunction;
    }
    
        public LinkedList<Function> toList() {
        LinkedList<Function> listFunction = new LinkedList<>();
        String response = serviceFunction.GET("functions");
        try {
            JSONParser parser = new JSONParser();
            JSONArray moviesJSON = (JSONArray) parser.parse(response);
            for (Object function : moviesJSON) {
                Function theFunction = new Function();
                theFunction.toObject((JSONObject)function);
                listFunction.add(theFunction);
            }
        } catch (Exception e) {
            System.out.println("error " + e);
        }
        return listFunction;
    }
        
        public boolean edit(Function theFunction) {
        boolean response = false;

        return response;
    }

    public boolean delete(Function theFunction) {
        boolean response = false;

        return response;
    }
}
