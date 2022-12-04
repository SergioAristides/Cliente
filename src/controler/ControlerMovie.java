/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controler;

import exceptions.notFoundException;
import java.io.IOException;
import java.util.LinkedList;
import model.Movie;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import service.Service;

/**
 *
 * @author sergi
 */
public class ControlerMovie {
    Service serviceMovie;

    public ControlerMovie() {
    }

    public ControlerMovie(Service serviceMovie) {
        this.serviceMovie = serviceMovie;
    }
    
         public boolean create(Movie theMovie) {
        boolean creado = false;

        try {
            String respuesta = serviceMovie.POST("movies",theMovie.toJSON());
            JSONParser parser = new JSONParser();
            JSONObject movieJSON = (JSONObject) parser.parse(respuesta);
            theMovie = new Movie();
            theMovie.toObject(movieJSON);
            creado=true;
        } catch (Exception e) {
            System.out.println("error " + e);
        }
        return creado;
    }

    public Movie watch(String id){
        Movie theMovie = null;
        String response = serviceMovie.GET("movies/"+id);
        try {
            JSONParser parser = new JSONParser();
            JSONObject movieJSON = (JSONObject) parser.parse(response);
            theMovie = new Movie();
            theMovie.toObject(movieJSON);

         } catch (Exception e) {
            e.printStackTrace();
        }

        return theMovie;
    }
    
        public LinkedList<Movie> toList() {
        LinkedList<Movie> listMovie = new LinkedList<>();
        String response = serviceMovie.GET("movies");
        try {
            JSONParser parser = new JSONParser();
            JSONArray moviesJSON = (JSONArray) parser.parse(response);
            for (Object movie : moviesJSON) {
                Movie theMovie = new Movie();
                theMovie.toObject((JSONObject)movie);
                listMovie.add(theMovie);
            }
        } catch (Exception e) {
            System.out.println("error " + e);
        }
        return listMovie;
    }
        
        public boolean update(Movie theMovie) {
        boolean editado = false;
        String respuesta = serviceMovie.PUT("movies/"+theMovie.getId(),theMovie.toJSON());
        try {
            JSONParser parser = new JSONParser();
            JSONObject estudianteJSON = (JSONObject) parser.parse(respuesta);
            theMovie = new Movie();
            theMovie.toObject(estudianteJSON);
            editado=true;
        } catch (Exception e) {
            System.out.println("error " + e);
        }
        return editado;
    }

    public boolean delete(Movie theMovie) {
         boolean eliminado = false;
        String respuesta = serviceMovie.DELETE("movies/"+theMovie.getId());
        try {
            eliminado=true;
        } catch (Exception e) {
            System.out.println("error " + e);
        }
        return eliminado;
    

    }
}
