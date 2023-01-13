package com.exceptionhandlingjava.exceptionrestapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.exceptionhandlingjava.exceptionrestapi.dto.UserRequest;
import com.exceptionhandlingjava.exceptionrestapi.entity.User;
import com.exceptionhandlingjava.exceptionrestapi.services.UserService;




// @RestController itself contains controller and It also contains Responsebody. hence no need of method level annotation. 
//if @controller only be used, then all the method should be annotated with @responsebody.
@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;
    

    @PostMapping("/signup")
    // @RequestBody is being used to map the data (JSON or XML) which came from payload postman, 
    //to our Method parameter.
    public ResponseEntity<User> saveUser(@RequestBody UserRequest userRequest)
    {
        return new ResponseEntity<>(userService.saveUser(userRequest),HttpStatus.CREATED); 
    }

    @GetMapping("/fetchAllUsers")
    public ResponseEntity<List<User>> getAllUsers(){

        return ResponseEntity.ok(userService.findAlluser());

    }


    @GetMapping("/fetchUserById/{id}")
    public ResponseEntity<User> getUser(@PathVariable int id){

        return ResponseEntity.ok(userService.findUser(id));

    }
    
}
