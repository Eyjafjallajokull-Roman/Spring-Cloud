package com.example.roomsservices.exception.model;

import com.example.roomsservices.dto.RoomDTO;
import com.fasterxml.jackson.annotation.JsonUnwrapped;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.hateoas.RepresentationModel;
@Data
@EqualsAndHashCode(callSuper = false)
@AllArgsConstructor
public class RoomModel extends RepresentationModel<RoomModel> {



    @JsonUnwrapped
    private RoomDTO roomDTO;
}
