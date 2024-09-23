package com.example.test.Entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
public class PolicyUser {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String email;
    private String password;
    private int age;
    @Column(length = 1000)
    private String medicalConditions;  // Store as a comma-separated string

    // Getters and setters


    public PolicyUser() {
    }

    public PolicyUser(Long id, String name, String email, String password, int age, String medicalConditions) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.password = password;
        this.age = age;
        this.medicalConditions = medicalConditions;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", age=" + age +
                ", medicalConditions='" + medicalConditions + '\'' +
                '}';
    }
}

