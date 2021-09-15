package com.example.userservices.client;

import com.example.userservices.client.model.RoomModel;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "ROOM-SERVICE", fallback = RoomFallBackService.class)
public interface RoomClient {

    @GetMapping("/api/v1/rooms/{roomNumber}")
    RoomModel getRoom(@PathVariable Long roomNumber);
}
