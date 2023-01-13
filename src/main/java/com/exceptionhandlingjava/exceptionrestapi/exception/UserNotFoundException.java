package com.exceptionhandlingjava.exceptionrestapi.exception;

public class UserNotFoundException extends Exception{

    public UserNotFoundException(String message) {
        super(message);
    }

}
