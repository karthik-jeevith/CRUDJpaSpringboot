package com.exceptionhandlingjava.exceptionrestapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.exceptionhandlingjava.exceptionrestapi.entity.User;

// JpaRepository< model, type of primary key>
public  interface UserRepository extends JpaRepository<User, Integer>{

    //custom method that is why declared here.
    User findByuserId(int id);

}