package com.example.roomsservices.controller.assembler;

import com.example.roomsservices.controller.RoomController;
import com.example.roomsservices.dto.RoomDTO;
import com.example.roomsservices.controller.model.RoomModel;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.mvc.RepresentationModelAssemblerSupport;
import org.springframework.stereotype.Component;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.linkTo;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.methodOn;

@Component
public class RoomAssembler extends RepresentationModelAssemblerSupport<RoomDTO, RoomModel> {


    public static final String GET_REL = "get_room";

    public RoomAssembler() {
        super(RoomController.class, RoomModel.class);
    }

    @Override
    public RoomModel toModel(RoomDTO entity) {
        RoomModel roomModel = new RoomModel(entity);
        Link get = linkTo(methodOn(RoomController.class).getRoom(entity.getRoomNumber())).withRel(GET_REL);
        roomModel.add(get);
        return roomModel;
    }
}
