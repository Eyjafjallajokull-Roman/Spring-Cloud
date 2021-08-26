package com.example.roomsservices.convertor.toDTO;

import com.example.roomsservices.dto.RoomDTO;
import com.example.roomsservices.entity.Room;
import org.springframework.core.convert.converter.Converter;

public class RoomToDTOConvertor implements Converter<Room, RoomDTO> {
    @Override
    public RoomDTO convert(Room room) {
        return new RoomDTO()
                .setRoomNumber(room.getRoomNumber())
                .setCategory(room.getCategory())
                .setMaxOccupancy(room.getMaxOccupancy())
                .setPrice(room.getPrice())
                .setReserved(room.isReserved());
    }
}
