package com.exceptionhandlingjava.exceptionrestapi.advice;

import com.exceptionhandlingjava.exceptionrestapi.exception.UserNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.HashMap;
import java.util.Map;

//used for handling global exception
@RestControllerAdvice
public class RestExceptionHandling {

    // inbuilt class exception
    // @ExceptionHandler is used to handle the specific exception and sending the
    // custom responses to the client.
    @ExceptionHandler(MethodArgumentNotValidException.class)
    public Map<String, String> handleMethodArgumentNotValid(MethodArgumentNotValidException ex) {
        Map<String, String> errorMap = new HashMap<>();
        ex.getBindingResult().getFieldErrors().forEach(error -> {

            // updating the hash map..
            errorMap.put(error.getField(), error.getDefaultMessage());
        });

        // Iterating HashMap through for loop
        System.out.println("Elements of hash map");
        for (Map.Entry<String, String> errorSet : errorMap.entrySet()) {

            // Printing all elements of a Map
            System.out.println(errorSet.getKey() + " = " + errorSet.getValue());
        }
        return errorMap;

    }

    // custom define class exceptions
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    @ExceptionHandler(UserNotFoundException.class)
    public Map<String, String> handleUserNotfound(UserNotFoundException ex) {
        Map<String, String> userMap = new HashMap<>();
        userMap.put("error message", ex.getMessage());
        return userMap;
    }
}
