/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controler;

import java.util.LinkedList;
import model.Ticket;
import model.User;
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
                  boolean creado = false;
       String respuesta=serviceTicket.POST("tickets",theTicket.toJSON());
               try {
            JSONParser parser = new JSONParser();
                   System.out.println("bien");
            JSONObject ticketJSON = (JSONObject) parser.parse(respuesta);
                   System.out.println("se leyo el json");
            theTicket = new Ticket();
                   System.out.println(ticketJSON);
            theTicket.toObject(ticketJSON);
                   System.out.println("se paso a objeto");
            creado=true;
        } catch (Exception e) {
            System.out.println("error " + e);
        }
        
        return creado; 
    }

    public Ticket watch(String id) {
        Ticket theTicket = null;
        String response = serviceTicket.GET("tickets/" + id);
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
            System.out.println("aun no hay elementos ");
        }
        return listTickets;
    }
        
      public boolean update(Ticket ticket) {
        boolean edit = false;
                try {
            String respuesta= serviceTicket.PUT("tickets/"+ticket.getId(),ticket.toJSON());
            JSONParser parser = new JSONParser();
            JSONObject estudianteJSON = (JSONObject) parser.parse(respuesta);
            ticket = new Ticket();
            ticket.toObject(estudianteJSON);
            edit=true;
        } catch (Exception e) {
            System.out.println("error " + e);
        }

        return edit;
    }

    public boolean delete(Ticket theTicket) {
         boolean delete = false;
      
       try {
             String respuesta=this.serviceTicket.DELETE("tickets/"+theTicket.getId());
            delete=true;
        } catch (Exception e) {
            System.out.println("error " + e);
        }
        return delete;
    }
}
    

