package com.example.userservices.client;

import com.example.userservices.client.model.RoomModel;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class RoomService {

    private final RoomClient roomClient;

    public RoomModel getRoom(Long roomNumber) {
        return roomClient.getRoom(roomNumber);
    }

}
