package com.example.roomsservices.repository;

import com.example.roomsservices.entity.Room;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;


@Repository
public interface RoomRepository extends JpaRepository<Room, Long> {

    Optional<Room> findByRoomId(Long roomId);

    Optional<Room> findByRoomNumber(Long roomNumber);


}
