package com.example.userservices.api;

import com.example.userservices.controller.model.UserModel;
import com.example.userservices.dto.ResponseVO;
import com.example.userservices.dto.UserDTO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@Api(tags = "User management API")
@RequestMapping("/api/v1/users")
public interface UserApi {

    @ApiImplicitParams({
            @ApiImplicitParam(name = "id", paramType = "path", required = true, value = "User email"),
    })
    @ApiOperation("Get User")
    @GetMapping("/{email}")
    @ResponseStatus(HttpStatus.OK)
    UserModel getUser(@PathVariable String email);

    @GetMapping("/{email}/{roomNumber}")
    @ResponseStatus(HttpStatus.OK)
    ResponseVO getUserWithRoom(@PathVariable String email, @PathVariable Long roomNumber);

    @ApiOperation("Create User")
    @PostMapping("/")
    @ResponseStatus(HttpStatus.OK)
    UserModel createUser(@RequestBody UserDTO dto);

    @ApiImplicitParams({
            @ApiImplicitParam(name = "id", paramType = "path", required = true, value = "User email"),
    })
    @ApiOperation("Update User")
    @PatchMapping("/{email}")
    @ResponseStatus(HttpStatus.OK)
    UserModel updateUser(@RequestBody UserDTO dto, @PathVariable String email);

    @ApiImplicitParams({
            @ApiImplicitParam(name = "id", paramType = "path", required = true, value = "User email"),
    })
    @ApiOperation("Delete User")
    @DeleteMapping("/{email}")
    ResponseEntity<Void> delete(@PathVariable String email);

}
