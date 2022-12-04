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
public class Ticket {
    private String id;
    private double payValue;
    private String type;

    public Ticket() {
    }

    public Ticket(double payValue, String type) {
        this.payValue = payValue;
        this.type = type;
    }

    public void toObject(JSONObject ticketJSON){
        this.id=ticketJSON.get("id").toString();
        this.payValue=(Double)ticketJSON.get("payValue");
        this.type=(String)ticketJSON.get("type");
    }
    /**
     * @return the payValue
     */
    public double getPayValue() {
        return payValue;
    }

    /**
     * @param payValue the payValue to set
     */
    public void setPayValue(double payValue) {
        this.payValue = payValue;
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
    
    
    
}
