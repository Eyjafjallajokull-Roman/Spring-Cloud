package com.example.userservices.service;

import com.example.userservices.dto.UserDTO;

public interface UserService {

    UserDTO getUser(String email);

    UserDTO createUser(UserDTO userDTO);

    UserDTO updateUser(UserDTO userDTO, String email);

    void deleteUser(String email);
}
