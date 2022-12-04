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
public class Chair {
    private String id;
    private String letter;
    private int number;

    public Chair() {
    }

    public Chair(String id, String letter, int number) {
        this.id = id;
        this.letter = letter;
        this.number = number;
    }
    
        public void toObject(JSONObject chairJSON){
        this.id=chairJSON.get("id").toString();
        this.letter=(String)chairJSON.get("letter");
        this.number=(int)chairJSON.get("number");
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
     * @return the letter
     */
    public String getLetter() {
        return letter;
    }

    /**
     * @param letter the letter to set
     */
    public void setLetter(String letter) {
        this.letter = letter;
    }

    /**
     * @return the number
     */
    public int getNumber() {
        return number;
    }

    /**
     * @param number the number to set
     */
    public void setNumber(int number) {
        this.number = number;
    }
    
    
}
