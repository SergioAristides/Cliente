/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.LinkedList;
import org.json.simple.JSONObject;

/**
 *
 * @author sergi
 */
public class LivingRoom {
    
    private String id;
    private String name;
    private boolean specialEfects;
    private LinkedList<Function>listFunction;
    private LinkedList<Chair>listChair;

    public LivingRoom() {
    }
    
    public LivingRoom(String id, String name, boolean specialEfects) {
        this.id = id;
        this.name = name;
        this.specialEfects = specialEfects;
        this.listFunction = new LinkedList<>();
        this.listChair = new LinkedList<>();
    }
    
        public void toObject(JSONObject livingRoomJSON){
        this.id=(String)livingRoomJSON.get("_id");
        this.name=(String)livingRoomJSON.get("name");
        this.specialEfects=(boolean)livingRoomJSON.get("special_effects");
        //this.listFunction
        //this.listChair
    }
        
        public JSONObject toJSON() {
        JSONObject roomJSON=new JSONObject();
        roomJSON.put("name", this.getName());
        roomJSON.put("special_effects", this.isSpecialEfects());
      return roomJSON;
    }

    /**
     * @return the id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the specialEfects
     */
    public boolean isSpecialEfects() {
        return specialEfects;
    }

    /**
     * @param specialEfects the specialEfects to set
     */
    public void setSpecialEfects(boolean specialEfects) {
        this.specialEfects = specialEfects;
    }

    /**
     * @return the listFunction
     */
    public LinkedList<Function> getListFunction() {
        return listFunction;
    }

    /**
     * @param listFunction the listFunction to set
     */
    public void setListFunction(LinkedList<Function> listFunction) {
        this.listFunction = listFunction;
    }

    /**
     * @return the listChair
     */
    public LinkedList<Chair> getListChair() {
        return listChair;
    }

    /**
     * @param listChair the listChair to set
     */
    public void setListChair(LinkedList<Chair> listChair) {
        this.listChair = listChair;
    }
    
    
    
}
