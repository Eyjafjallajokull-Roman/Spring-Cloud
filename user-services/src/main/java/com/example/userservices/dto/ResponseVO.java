package com.example.userservices.dto;

import com.example.userservices.client.model.RoomModel;
import com.example.userservices.controller.model.UserModel;
import lombok.Data;

@Data
public class ResponseVO {

    UserModel userModel;

    RoomModel roomModel;
}
