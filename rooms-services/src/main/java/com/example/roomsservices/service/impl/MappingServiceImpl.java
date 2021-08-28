package com.example.roomsservices.service.impl;

import com.example.roomsservices.dto.RoomDTO;
import com.example.roomsservices.entity.Category;
import com.example.roomsservices.entity.Room;
import com.example.roomsservices.service.MappingService;
import org.springframework.stereotype.Service;

import java.util.Objects;
@Service
public class MappingServiceImpl implements MappingService {

    @Override
    public Room getRoomData(RoomDTO roomDTO, Room room) {
        Long roomNumber = roomDTO.getRoomNumber();
        if (Objects.nonNull(roomNumber)) {
            room.setRoomNumber(roomNumber);
        }
        Long maxOccupancy = roomDTO.getMaxOccupancy();
        if (Objects.nonNull(maxOccupancy)) {
            room.setMaxOccupancy(maxOccupancy);
        }
        Long price = roomDTO.getPrice();
        if (Objects.nonNull(price)) {
            room.setPrice(price);
        }
        Category category = Category.valueOf(roomDTO.getCategory());
        if (Objects.nonNull(roomNumber)) {
            room.setCategory(category);
        }

        return room;
    }
}
