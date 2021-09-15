package com.example.userservices.client;

import com.example.userservices.client.model.RoomModel;
import org.springframework.stereotype.Component;

@Component
public class RoomFallBackService implements RoomClient {

    @Override
    public RoomModel getRoom(Long roomNumber) {
        return null;
    }
}
