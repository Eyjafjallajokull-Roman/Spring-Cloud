package com.example.roomsservices.api;

import com.example.roomsservices.dto.RoomDTO;
import com.example.roomsservices.exception.model.RoomModel;
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
            @ApiImplicitParam(name = "id", paramType = "path", required = true, value = "Room id"),
    })
    @ApiOperation("Get Room")
    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    RoomModel getRoom(@PathVariable Long id);


    @ApiOperation("Create Room")
    @PostMapping("/")
    @ResponseStatus(HttpStatus.OK)
    RoomModel createRoom(@RequestBody RoomDTO dto);

    @ApiImplicitParams({
            @ApiImplicitParam(name = "id", paramType = "path", required = true, value = "Room id"),
    })
    @ApiOperation("Update Activity")
    @PatchMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    RoomModel updateActivity(@RequestBody RoomDTO dto, @PathVariable Long id);

    @ApiImplicitParams({
            @ApiImplicitParam(name = "id", paramType = "path", required = true, value = "Room Id"),
    })
    @ApiOperation("Delete Room")
    @DeleteMapping("/{id}")
    ResponseEntity<Void> delete(@PathVariable Long id);

}
