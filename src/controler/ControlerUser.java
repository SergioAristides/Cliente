/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controler;

import java.util.LinkedList;
import model.User;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import service.Service;

/**
 *
 * @author sergi
 */
public class ControlerUser {
    Service serviceUser;

    public ControlerUser(Service serviceUser) {
        this.serviceUser = serviceUser;
    }
        public boolean create(User theUser) {
        boolean creado = false;
       String respuesta=serviceUser.POST("users",theUser.toJSON());
               try {
            JSONParser parser = new JSONParser();
            JSONObject userJSON = (JSONObject) parser.parse(respuesta);
            theUser = new User();
            theUser.toObject(userJSON);
            creado=true;
        } catch (Exception e) {
            System.out.println("error " + e);
        }
        
        return creado;
    }

    public User watch(String id) {
        User theUser = null;
        String response = serviceUser.GET("users/"+id);
        try {
            JSONParser parser = new JSONParser();
            JSONObject userJSON = (JSONObject) parser.parse(response);
            theUser = new User();
            theUser.toObject(userJSON);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return theUser;
    }
    
        public LinkedList<User> toList() {
        LinkedList<User> listUsers = new LinkedList<>();
        String response = serviceUser.GET("users");
        try {
            JSONParser parser = new JSONParser();
            JSONArray usersJSON = (JSONArray) parser.parse(response);
            for (Object user : usersJSON) {
                User theUser = new User();
                theUser.toObject((JSONObject)user);
                listUsers.add(theUser);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return listUsers;
    }
        
        public boolean update(User theUser) {
        boolean edit = false;
                try {
            String respuesta= serviceUser.PUT("users/"+theUser.getId(),theUser.toJSON());
            JSONParser parser = new JSONParser();
            JSONObject estudianteJSON = (JSONObject) parser.parse(respuesta);
            theUser = new User();
            theUser.toObject(estudianteJSON);
            edit=true;
        } catch (Exception e) {
            System.out.println("error " + e);
        }

        return edit;
    }

    public boolean delete(User thetUser) {
        boolean eliminado = false;
        String respuesta=serviceUser.DELETE("users/"+thetUser.getId());
       try {
            eliminado=true;
        } catch (Exception e) {
            System.out.println("error " + e);
        }
        return eliminado;
    }

    
}
