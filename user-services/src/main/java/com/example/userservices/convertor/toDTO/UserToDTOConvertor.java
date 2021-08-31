package com.example.userservices.convertor.toDTO;

import com.example.userservices.dto.UserDTO;
import com.example.userservices.entity.User;
import org.springframework.core.convert.converter.Converter;

public class UserToDTOConvertor implements Converter<User, UserDTO> {
    @Override
    public UserDTO convert(User user) {
        return new UserDTO()
                .setEmail(user.getEmail())
                .setName(user.getName())
                .setSurname(user.getSurname());
    }
}
