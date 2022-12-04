/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exceptions;

import java.io.IOException;

/**
 *
 * @author sergi
 */
public class notFoundException extends Exception{
    public notFoundException(){}
    public notFoundException(String msj_error){
        super(msj_error);
    }
}
