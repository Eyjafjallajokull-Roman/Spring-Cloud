package com.example.roomsservices.service.impl;

import com.example.roomsservices.dto.RoomDTO;
import com.example.roomsservices.entity.Room;
import com.example.roomsservices.exception.RoomNotFoundException;
import com.example.roomsservices.repository.RoomRepository;
import com.example.roomsservices.service.MappingService;
import com.example.roomsservices.service.RoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.ConversionService;
import org.springframework.stereotype.Service;

@Service
public class RoomServiceImpl implements RoomService {

    @Autowired
    RoomRepository roomRepository;
    @Autowired
    ConversionService conversionService;
    @Autowired
    MappingService mappingService;


    @Override
    public void delete(Long roomNumber) {
      Room room = roomRepository.findByRoomNumber(roomNumber).orElseThrow();
        roomRepository.deleteById(room.getRoomId());
    }

    @Override
    public RoomDTO getRoom(Long roomId) {
        Room room = roomRepository.findById(roomId).orElseThrow(RoomNotFoundException::new);
        return conversionService.convert(room, RoomDTO.class);

    }

    @Override
    public RoomDTO getRoomByNumber(Long roomNumber) {
        Room room = roomRepository.findByRoomNumber(roomNumber).orElseThrow(RoomNotFoundException::new);
        return conversionService.convert(room, RoomDTO.class);
    }

    @Override
    public RoomDTO createRoom(RoomDTO dto) {
        Room room = conversionService.convert(dto, Room.class);
        roomRepository.save(room);
        return conversionService.convert(room, RoomDTO.class);
    }

    @Override
    public RoomDTO updateRoom(RoomDTO dto, Long roomNumber) {
        Room roomToUpdate = roomRepository.findByRoomNumber(roomNumber).orElseThrow(RoomNotFoundException::new);
        Room room = mappingService.getRoomData(dto, roomToUpdate);
        roomRepository.save(room);
        return conversionService.convert(room, RoomDTO.class);
    }
}
