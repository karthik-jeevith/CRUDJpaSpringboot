package com.exceptionhandlingjava.exceptionrestapi.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor(staticName = "build")
@NoArgsConstructor
public class UserRequest {

   // this is the model be used in postman/ front end application
    private String name;
    private String email;
    private String mobile;
    private String gender;
    private int age;
    private String nationality;

}
