
package com.portafolio.back.exception;


public class UserNotFoundException extends RuntimeException{
    public UserNotFoundException(String mensaje){
        super(mensaje);
    }
}
