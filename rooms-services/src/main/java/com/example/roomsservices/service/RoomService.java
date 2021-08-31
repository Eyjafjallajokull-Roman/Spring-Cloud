package com.example.roomsservices.service;

import com.example.roomsservices.dto.RoomDTO;

public interface RoomService {

    void delete(Long roomId);

    RoomDTO getRoom(Long roomNumber);

    RoomDTO createRoom(RoomDTO room);

    RoomDTO updateRoom(RoomDTO roomDTO, Long roomNumber);

    RoomDTO getRoomByNumber(Long roomNumber);


}
