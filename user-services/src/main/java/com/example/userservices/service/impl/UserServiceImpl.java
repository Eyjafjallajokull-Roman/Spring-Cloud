package com.example.userservices.service.impl;

import com.example.userservices.dto.UserDTO;
import com.example.userservices.entity.Role;
import com.example.userservices.entity.User;
import com.example.userservices.exception.UserNotFoundException;
import com.example.userservices.repository.UserRepository;
import com.example.userservices.service.MappingService;
import com.example.userservices.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.ConversionService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepository userRepository;
    @Autowired
    MappingService mappingService;
    @Autowired
    ConversionService conversionService;

    @Override
    public UserDTO getUser(String email) {
        User user = userRepository.findUserByEmail(email).orElseThrow(UserNotFoundException::new);
        return conversionService.convert(user, UserDTO.class);
    }

    @Override
    public UserDTO createUser(UserDTO userDTO) {
        User user = conversionService.convert(userDTO, User.class);
        user.setRole(Role.CLIENT);
        userRepository.save(user);
        return conversionService.convert(user, UserDTO.class);
    }

    @Override
    public UserDTO updateUser(UserDTO userDTO, String email) {
        User userToUpdate = userRepository.findUserByEmail(email).orElseThrow(UserNotFoundException::new);
        User user = mappingService.getUserData(userDTO, userToUpdate);
        userRepository.save(user);
        return conversionService.convert(user, UserDTO.class);
    }

    @Override
    public void deleteUser(String email) {
       User user = userRepository.findUserByEmail(email).orElseThrow(UserNotFoundException::new);
        userRepository.deleteById(user.getUserId());
    }
}
