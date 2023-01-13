package com.exceptionhandlingjava.exceptionrestapi.entity;

import javax.annotation.Generated;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "USERS_TBL")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class User {     // entity class should not be revealed in outside of the world.
     
    @Id    //used for primary key
    @GeneratedValue // auto generated the value
    private int userId;
    private String name;
    private String email;
    private String mobile;
    private String gender;
    private int age;
    private String nationality;

}
