/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controler;

import java.util.LinkedList;
import model.LivingRoom;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import service.Service;

/**
 *
 * @author sergi
 */
public class ControlerLivingRoom {
    Service serviceLivingRoom;

    public ControlerLivingRoom() {
    }

    public ControlerLivingRoom(Service serviceLivingRoom) {
        this.serviceLivingRoom = serviceLivingRoom;
    }
    
        public boolean create(LivingRoom theLivingRoom) {
        boolean respuesta = false;
        return respuesta;
    }

    public LivingRoom watch(String id) {
        LivingRoom theLivingRoom = null;
        String response = serviceLivingRoom.GET("livingRooms/" + id);
        try {
            JSONParser parser = new JSONParser();
            JSONObject livingRoomJSON = (JSONObject) parser.parse(response);
            theLivingRoom = new LivingRoom();
            theLivingRoom.toObject(livingRoomJSON);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return theLivingRoom;
    }
    
        public LinkedList<LivingRoom> toList() {
        LinkedList<LivingRoom> lisLivingRooms = new LinkedList<>();
        String response = serviceLivingRoom.GET("livingRooms");
        try {
            JSONParser parser = new JSONParser();
            JSONArray livingRoomsJSON = (JSONArray) parser.parse(response);
            for (Object livingRoom : livingRoomsJSON) {
                LivingRoom theLivingRoom = new LivingRoom();
                theLivingRoom.toObject((JSONObject)livingRoom);
                lisLivingRooms.add(theLivingRoom);
            }
        } catch (Exception e) {
            System.out.println("error " + e);
        }
        return lisLivingRooms;
    }
        
           public boolean edit(LivingRoom theLivingRoom) {
        boolean response = false;

        return response;
    }

    public boolean delete(LivingRoom theLivingRoom) {
        boolean response = false;

        return response;
    }
    
    
    
}
