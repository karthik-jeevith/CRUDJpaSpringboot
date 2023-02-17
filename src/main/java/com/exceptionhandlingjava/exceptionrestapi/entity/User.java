package com.exceptionhandlingjava.exceptionrestapi.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "USERS_TBL")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class User {     // entity class should not be revealed in outside of the world.

    @Id    //used for primary key
    @GeneratedValue(strategy = GenerationType.IDENTITY) // auto generated the value
    private int userId;
    private String name;
    private String email;
    private String mobile;
    private String gender;
    private int age;
    private String nationality;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof User)) return false;
        User user = (User) o;
        return userId == user.userId && age == user.age && Objects.equals(name, user.name) && Objects.equals(email, user.email) && Objects.equals(mobile, user.mobile) && Objects.equals(gender, user.gender) && Objects.equals(nationality, user.nationality);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userId, name, email, mobile, gender, age, nationality);
    }

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", mobile='" + mobile + '\'' +
                ", gender='" + gender + '\'' +
                ", age=" + age +
                ", nationality='" + nationality + '\'' +
                '}';
    }
}
