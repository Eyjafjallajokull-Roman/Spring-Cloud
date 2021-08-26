package com.example.roomsservices.service;

import com.example.roomsservices.dto.RoomDTO;

public interface RoomService {

    void delete(Long roomId);

    RoomDTO getRoom(Long roomId);

    RoomDTO save(RoomDTO room);

    RoomDTO update(RoomDTO roomDTO, Long roomId);


}
