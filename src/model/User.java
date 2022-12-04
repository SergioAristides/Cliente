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
public class User {
    private String id;
    private Ticket ticket;
    private String name;
    private String ident;
    private String birthDate;

    public User() {
    }

    public User( String name, String ident, String birthDate) {
        this.name = name;
        this.ident = ident;
        this.birthDate = birthDate;
    }

  
    
    public void toObject(JSONObject userJSON){
        this.id=(String)userJSON.get("_id");
        this.name=(String)userJSON.get("name");
        this.ident=(String)userJSON.get("identification");
        this.birthDate=(String)userJSON.get("born_date");
    }
        public JSONObject toJSON() {
        JSONObject userJSON=new JSONObject();
        userJSON.put("name", this.getName());
        userJSON.put("born_date", this.getBirthDate());
        userJSON.put("identification", this.getIdent());
        return userJSON;
    }

    
    
    /**
     * @return the ticket
     */
    public Ticket getTicket() {
        return ticket;
    }

    /**
     * @param ticket the ticket to set
     */
    public void setTicket(Ticket ticket) {
        this.ticket = ticket;
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
     * @return the ident
     */
    public String getIdent() {
        return ident;
    }

    /**
     * @param ident the ident to set
     */
    public void setIdent(String ident) {
        this.ident = ident;
    }

    /**
     * @return the birthDate
     */
    public String getBirthDate() {
        return birthDate;
    }

    /**
     * @param birthDate the birthDate to set
     */
    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }
    
}
