package com.example.roomsservices.api;

import com.example.roomsservices.dto.RoomDTO;
import com.example.roomsservices.controller.model.RoomModel;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@Api(tags = "Room management API")
@RequestMapping("/api/v1/rooms")
public interface RoomApi {

    @ApiImplicitParams({
            @ApiImplicitParam(name = "roomNumber", paramType = "path", required = true, value = "Room number"),
    })
    @ApiOperation("Get Room")
    @GetMapping("/{roomNumber}")
    @ResponseStatus(HttpStatus.OK)
    RoomModel getRoom(@PathVariable Long roomNumber);


    @ApiOperation("Create Room")
    @PostMapping("/")
    @ResponseStatus(HttpStatus.OK)
    RoomModel createRoom(@RequestBody RoomDTO dto);

    @ApiImplicitParams({
            @ApiImplicitParam(name = "roomNumber", paramType = "path", required = true, value = "Room number"),
    })
    @ApiOperation("Update Activity")
    @PatchMapping("/{roomNumber}")
    @ResponseStatus(HttpStatus.OK)
    RoomModel updateRoom(@RequestBody RoomDTO dto, @PathVariable Long roomNumber);

    @ApiImplicitParams({
            @ApiImplicitParam(name = "roomNumber", paramType = "path", required = true, value = "Room number"),
    })
    @ApiOperation("Delete Room")
    @DeleteMapping("/{roomNumber}")
    ResponseEntity<Void> delete(@PathVariable Long roomNumber);

}
