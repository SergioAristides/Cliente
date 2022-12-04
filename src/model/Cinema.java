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
public class Cinema {
    private String id;
    private String name;
    private LinkedList<LivingRoom>listSalas;
    private LinkedList<Employee>listEmpleados;

    public Cinema() {
    }

    
    
    public Cinema(String name) {
        this.name = name;
        this.listSalas = new LinkedList<>();
        this.listEmpleados=new LinkedList<>();
    }
    
          public void toObject(JSONObject cinemaJSON){
        this.name=cinemaJSON.get("id").toString();
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
     * @return the listSalas
     */
    public LinkedList<LivingRoom> getListSalas() {
        return listSalas;
    }

    /**
     * @param listSalas the listSalas to set
     */
    public void setListSalas(LinkedList<LivingRoom> listSalas) {
        this.listSalas = listSalas;
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

    public LinkedList<Employee> getListEmpleados() {
        return listEmpleados;
    }

    public void setListEmpleados(LinkedList<Employee> listEmpleados) {
        this.listEmpleados = listEmpleados;
    }
    
    
    
    
}
