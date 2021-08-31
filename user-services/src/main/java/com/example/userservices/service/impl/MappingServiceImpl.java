package com.example.userservices.service.impl;

import com.example.userservices.dto.UserDTO;
import com.example.userservices.entity.User;
import com.example.userservices.service.MappingService;
import org.springframework.stereotype.Service;

import java.util.Objects;

@Service
public class MappingServiceImpl implements MappingService {
    @Override
    public User getUserData(UserDTO dto, User user) {
        String surname = dto.getSurname();
        if (Objects.nonNull(surname)) {
            user.setSurname(surname);
        }
        String name = dto.getName();
        if (Objects.nonNull(name)) {
            user.setName(name);
        }
        String password = dto.getPassword();
        if (Objects.nonNull(password)) {
            user.setPassword(password);
        }
        return user;
    }
}
