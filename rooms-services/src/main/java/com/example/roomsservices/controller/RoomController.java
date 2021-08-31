package com.example.roomsservices.controller;

import com.example.roomsservices.api.RoomApi;
import com.example.roomsservices.dto.RoomDTO;
import com.example.roomsservices.controller.assembler.RoomAssembler;
import com.example.roomsservices.controller.model.RoomModel;
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
    public RoomModel getRoom(Long roomNumber) {
        return roomAssembler.toModel(roomService.getRoom(roomNumber));
    }

    @Override
    public RoomModel createRoom(@RequestBody RoomDTO dto) {
        return roomAssembler.toModel(roomService.createRoom(dto));
    }

    @Override
    public RoomModel updateRoom(RoomDTO dto, Long roomNumber) {
        return roomAssembler.toModel(roomService.updateRoom(dto, roomNumber));
    }

    @Override
    public ResponseEntity<Void> delete(Long roomNumber) {
        roomService.delete(roomNumber);
        return ResponseEntity.noContent().build();
    }


}
