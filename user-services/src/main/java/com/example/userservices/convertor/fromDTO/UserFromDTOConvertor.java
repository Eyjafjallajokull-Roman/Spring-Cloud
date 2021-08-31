package com.example.userservices.convertor.fromDTO;

import com.example.userservices.dto.UserDTO;
import com.example.userservices.entity.User;
import org.springframework.core.convert.converter.Converter;

public class UserFromDTOConvertor implements Converter<UserDTO, User> {

    @Override
    public User convert(UserDTO dto) {
        return new User()
                .setEmail(dto.getEmail())
                .setName(dto.getName())
                .setPassword(dto.getPassword())
                .setSurname(dto.getSurname());
    }
}
