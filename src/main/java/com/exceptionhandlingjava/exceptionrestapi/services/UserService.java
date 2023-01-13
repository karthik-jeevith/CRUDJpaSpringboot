package com.exceptionhandlingjava.exceptionrestapi.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.exceptionhandlingjava.exceptionrestapi.dto.UserRequest;
import com.exceptionhandlingjava.exceptionrestapi.entity.User;
import com.exceptionhandlingjava.exceptionrestapi.exception.UserNotFoundException;
import com.exceptionhandlingjava.exceptionrestapi.repository.UserRepository;
import com.exceptionhandlingjava.exceptionrestapi.exception.UserNotFoundException;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public User saveUser(UserRequest userRequest) {

        User user = User.builder()
                .name(userRequest.getName())
                .email(userRequest.getEmail())
                .mobile(userRequest.getMobile())
                .gender(userRequest.getGender())
                .age(userRequest.getAge())
                .nationality(userRequest.getNationality()).build();


        // Normal way of assinging values into the object.
        // User user1 = new User();
        // user1.setName(userRequest.getName());
        // user1.setEmail(userRequest.getEmail());
        // user1.setMobile(userRequest.getMobile());
        // user1.setGender(userRequest.getGender());
        // user1.setAge(userRequest.getAge());
        // user1.setNationality(userRequest.getNationality());


        return userRepository.save(user);

    }


    public List<User> findAlluser()
    {
        return userRepository.findAll();
    }

    public User findUser(int Id) throws UserNotFoundException{

        // create custom method findBy followed by entity/model property in JPA. ex:findBy+ userId(model property)
        User user = userRepository.findByuserId(Id);
        if (user != null)
        {
            return user;
        }
        else{
            throw new UserNotFoundException("user not found with the ID = "+Id);
        }
 
    }

}
