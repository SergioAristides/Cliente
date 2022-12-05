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
    private Function function ;
    private Chair chair;
    private User user;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Function getFunction() {
        return function;
    }

    public void setFunction(Function function) {
        this.function = function;
    }

    public Chair getChair() {
        return chair;
    }

    public void setChair(Chair chair) {
        this.chair = chair;
    }

    public Ticket() {
        chair = new Chair();
        function= new Function();
        user = new User();
    }

    public Ticket(String id,double payValue, String type) {
        this.id = id;
        this.payValue = payValue;
        this.type = type;
    }
     public Ticket(double payValue, String type) {
        this.payValue = payValue;
        this.type = type;
    }

    public void toObject(JSONObject ticketJSON){
        
        this.id=(String)ticketJSON.get("_id");
        this.payValue=(double)ticketJSON.get("value");
        this.type=(String)ticketJSON.get("type");
        this.chair.toObject((JSONObject) ticketJSON.get("chair"));
        this.function.toObject((JSONObject) ticketJSON.get("function"));
        this.user.toObject((JSONObject)ticketJSON.get("user"));
        
    }
     public JSONObject toJSON() {
        JSONObject ticketJSON=new JSONObject();
        //ticketJSON.put("_id", this.id);
        ticketJSON.put("value", this.payValue);
        ticketJSON.put("type", this.getType());
        ticketJSON.put("function", this.function.toJSON());
        ticketJSON.put("chair", this.chair.toJSON());
        ticketJSON.put("user", this.user.toJSON());
        return ticketJSON;
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
