/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controler;

import java.util.LinkedList;
import model.Ticket;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import service.Service;

/**
 *
 * @author sergi
 */
public class ControlerTicket {
    Service serviceTicket;

    public ControlerTicket(Service serviceTicket) {
        this.serviceTicket = serviceTicket;
    }
    
               public boolean create(Ticket theTicket) {
        boolean respuesta = false;
        return respuesta;
    }

    public Ticket watch(String id) {
        Ticket theTicket = null;
        String response = serviceTicket.GET("functions/" + id);
        try {
            JSONParser parser = new JSONParser();
            JSONObject ticketJSON = (JSONObject) parser.parse(response);
            theTicket = new Ticket();
            theTicket.toObject(ticketJSON);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return theTicket;
    }
    
        public LinkedList<Ticket> toList() {
        LinkedList<Ticket> listTickets = new LinkedList<>();
        String response = serviceTicket.GET("tickets");
        try {
            JSONParser parser = new JSONParser();
            JSONArray ticketsJSON = (JSONArray) parser.parse(response);
            for (Object ticket : ticketsJSON) {
                Ticket theTicket = new Ticket();
                theTicket.toObject((JSONObject)ticket);
                listTickets.add(theTicket);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return listTickets;
    }
        
        public boolean edit(Ticket theTicket) {
        boolean response = false;

        return response;
    }

    public boolean delete(Ticket thetTicket) {
        boolean response = false;

        return response;
    }
}
    

