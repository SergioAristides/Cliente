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
public class Function {
    private String id;
    private long hour;
    private String date;
    private Movie refMovie;
    private LivingRoom refLivingRoom;
    private LinkedList<Ticket>ListTicket;

    public Function() {
    }

    public Function(long hour, String date) {
        this.hour = hour;
        this.date = date;
        this.ListTicket= new LinkedList<>();
    }
    
    public void toObject(JSONObject functionJSON){
        this.id=functionJSON.get("id").toString();
        this.hour=(int)functionJSON.get("hour");
        this.refMovie=(Movie)functionJSON.get("function");
        //this.refLivingRoom=(LivingRoom)functionJSON.get("livingRoom");
        //this.listicket
        
        
    }

    /**
     * @return the hour
     */
    public long getHour() {
        return hour;
    }

    /**
     * @param hour the hour to set
     */
    public void setHour(long hour) {
        this.hour = hour;
    }

    /**
     * @return the refMovie
     */
    public Movie getRefMovie() {
        return refMovie;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    /**
     * @param refMovie the refMovie to set
     */
    public void setRefMovie(Movie refMovie) {
        this.refMovie = refMovie;
    }

    /**
     * @return the refLivingRoom
     */
    public LivingRoom getRefLivingRoom() {
        return refLivingRoom;
    }

    /**
     * @param refLivingRoom the refLivingRoom to set
     */
    public void setRefLivingRoom(LivingRoom refLivingRoom) {
        this.refLivingRoom = refLivingRoom;
    }

    /**
     * @return the ListTicket
     */
    public LinkedList<Ticket> getListTicket() {
        return ListTicket;
    }

    /**
     * @param ListTicket the ListTicket to set
     */
    public void setListTicket(LinkedList<Ticket> ListTicket) {
        this.ListTicket = ListTicket;
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
