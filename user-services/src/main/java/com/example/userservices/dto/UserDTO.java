package com.example.userservices.dto;

import lombok.Data;

@Data
public class UserDTO {
    private String email;
    private String password;
    private String name;
    private String surname;
    private String confirmPassword;

    public UserDTO setEmail(String email) {
        this.email = email;
        return this;
    }

    public UserDTO setPassword(String password) {
        this.password = password;
        return this;
    }

    public UserDTO setName(String name) {
        this.name = name;
        return this;
    }

    public UserDTO setSurname(String surname) {
        this.surname = surname;
        return this;
    }

    public UserDTO setConfirmPassword(String confirmPassword) {
        this.confirmPassword = confirmPassword;
        return this;
    }
}
