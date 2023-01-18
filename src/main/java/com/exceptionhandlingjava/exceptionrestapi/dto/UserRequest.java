package com.exceptionhandlingjava.exceptionrestapi.dto;

import javax.validation.constraints.Email;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor(staticName = "build")
@NoArgsConstructor
public class UserRequest {

   // this is the model be used in postman/ front end application

    @NotNull(message = "User name should not be NULL")
    private String name;
    @Email
    private String email;
    @NotNull
    private String mobile;
    private String gender;
    @Min(18)
    private int age;
    @NotBlank
    private String nationality;

}
