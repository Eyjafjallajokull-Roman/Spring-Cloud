package com.example.userservices.controller.assembler;

import com.example.userservices.controller.UserController;
import com.example.userservices.controller.model.UserModel;
import com.example.userservices.dto.UserDTO;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.mvc.RepresentationModelAssemblerSupport;
import org.springframework.stereotype.Component;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.linkTo;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.methodOn;

@Component
public class UserAssembler extends RepresentationModelAssemblerSupport<UserDTO, UserModel> {

    public static final String GET_REL = "get_user";

    public UserAssembler() {
        super(UserController.class, UserModel.class);
    }


    @Override
    public UserModel toModel(UserDTO entity) {
        UserModel userModel = new UserModel(entity);
        Link get = linkTo(methodOn(UserController.class).getUser(entity.getEmail())).withRel(GET_REL);
        userModel.add(get);
        return userModel;
    }
}
