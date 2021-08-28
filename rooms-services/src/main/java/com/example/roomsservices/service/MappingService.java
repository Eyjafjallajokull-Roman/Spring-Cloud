package com.example.roomsservices.service;

import com.example.roomsservices.dto.RoomDTO;
import com.example.roomsservices.entity.Room;

public interface MappingService {

    Room getRoomData(RoomDTO roomDTO, Room room);

}
