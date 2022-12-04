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
public class Movie {
    private String id;
    private String name;
    private long year;
    private String type;
    private LinkedList<Function>listFunciones;

    public Movie() {
    } 
    
    public Movie( String name,long age, String type) {
        this.name = name;
        this.year = age;
        this.type = type;
        this.listFunciones = new LinkedList<>();
    }
    
    public JSONObject toJSON() {
        JSONObject movieJSON=new JSONObject();
        movieJSON.put("name", this.getName());
        movieJSON.put("year", this.getYear());
        movieJSON.put("type", this.getType());
        return movieJSON;
    }
    
       public void toObject(JSONObject movieJSON){
        this.id=(String)movieJSON.get("_id");
        this.year=(long)movieJSON.get("year");
        this.name=(String)movieJSON.get("name");
        this.type=(String)movieJSON.get("type");
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

    public long getYear() {
        return year;
    }

    /**
     * @return the year
     */
    public void setYear(long year) {    
        this.year = year;
    }

    /**
     * @return the type
     */
    public String getType() {
        return type;
    }

    /**
     * @param type the type to set
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * @return the listFunciones
     */
    public LinkedList<Function> getListFunciones() {
        return listFunciones;
    }

  

    
    /**
     * @param listFunciones the listFunciones to set
     */
    public void setListFunciones(LinkedList<Function> listFunciones) {
        this.listFunciones = listFunciones;
    }
    
    
    
    
    
    
    
}
