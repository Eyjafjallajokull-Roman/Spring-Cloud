package com.example.roomsservices.convertor.fromDTO;

import com.example.roomsservices.dto.RoomDTO;
import com.example.roomsservices.entity.Category;
import com.example.roomsservices.entity.Room;
import org.springframework.core.convert.converter.Converter;

public class RoomFromDTOConvertor implements Converter<RoomDTO, Room> {
    @Override
    public Room convert(RoomDTO dto) {
        return new Room()
                .setRoomNumber(dto.getRoomNumber())
                .setCategory(Category.valueOf(dto.getCategory()))
                .setMaxOccupancy(dto.getMaxOccupancy())
                .setPrice(dto.getPrice())
                .setReserved(dto.isReserved());
    }
}
