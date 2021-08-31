package com.example.userservices.service;

import com.example.userservices.dto.UserDTO;
import com.example.userservices.entity.User;

public interface MappingService {

    User getUserData(UserDTO userDTO, User user);
}
