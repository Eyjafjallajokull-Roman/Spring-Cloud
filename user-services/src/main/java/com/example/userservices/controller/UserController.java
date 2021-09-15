package com.example.userservices.controller;

import com.example.userservices.api.UserApi;
import com.example.userservices.client.RoomService;
import com.example.userservices.controller.assembler.UserAssembler;
import com.example.userservices.controller.model.UserModel;
import com.example.userservices.dto.ResponseVO;
import com.example.userservices.dto.UserDTO;
import com.example.userservices.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController implements UserApi {
    @Autowired
    UserAssembler userAssembler;
    @Autowired
    UserService userService;
    @Autowired
    RoomService roomService;

    @Override
    public UserModel getUser(String email) {
        return userAssembler.toModel(userService.getUser(email));
    }

    @Override
    public ResponseVO getUserWithRoom(String email, Long roomNumber) {
        ResponseVO responseVO = new ResponseVO();
        responseVO.setRoomModel(roomService.getRoom(roomNumber));
        responseVO.setUserModel(userAssembler.toModel(userService.getUser(email)));
        return responseVO;
    }

    @Override
    public UserModel createUser(UserDTO dto) {
        return userAssembler.toModel(userService.createUser(dto));
    }

    @Override
    public UserModel updateUser(UserDTO dto, String email) {
        return userAssembler.toModel(userService.updateUser(dto, email));
    }

    @Override
    public ResponseEntity<Void> delete(String email) {
        userService.deleteUser(email);
        return ResponseEntity.noContent().build();
    }
}
