package com.example.roomsservices.controller;

import com.example.roomsservices.api.RoomApi;
import com.example.roomsservices.dto.RoomDTO;
import com.example.roomsservices.exception.assembler.RoomAssembler;
import com.example.roomsservices.exception.model.RoomModel;
import com.example.roomsservices.service.RoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RoomController implements RoomApi {

    @Autowired
    private RoomAssembler roomAssembler;
    @Autowired
    private RoomService roomService;

    @Override
    public RoomModel getRoom(Long id) {
        return roomAssembler.toModel(roomService.getRoom(id));
    }

    @Override
    public RoomModel createRoom(@RequestBody RoomDTO dto) {
        return roomAssembler.toModel(roomService.createRoom(dto));
    }

    @Override
    public RoomModel updateActivity(RoomDTO dto, Long id) {
        return roomAssembler.toModel(roomService.updateRoom(dto, id));
    }

    @Override
    public ResponseEntity<Void> delete(Long id) {
        roomService.delete(id);
        return ResponseEntity.noContent().build();
    }


}
