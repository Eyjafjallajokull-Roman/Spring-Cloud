package com.example.roomsservices.repository;

import com.example.roomsservices.entity.Room;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoomRepository extends JpaRepository<Long, Room> {

}
