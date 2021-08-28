package com.example.roomsservices.dto;

import com.example.roomsservices.entity.Category;
import lombok.Data;

@Data
public class RoomDTO {
    private Long roomNumber;
    private String category;
    private Long maxOccupancy;
    private Long price;
    private boolean isReserved;

    public Long getRoomNumber() {
        return roomNumber;
    }

    public RoomDTO setRoomNumber(Long roomNumber) {
        this.roomNumber = roomNumber;
        return this;
    }

    public String getCategory() {
        return category;
    }

    public RoomDTO setCategory(String category) {
        this.category = category;
        return this;
    }

    public Long getMaxOccupancy() {
        return maxOccupancy;
    }

    public RoomDTO setMaxOccupancy(Long maxOccupancy) {
        this.maxOccupancy = maxOccupancy;
        return this;
    }

    public Long getPrice() {
        return price;
    }

    public RoomDTO setPrice(Long price) {
        this.price = price;
        return this;
    }

    public boolean isReserved() {
        return isReserved;
    }

    public RoomDTO setReserved(boolean reserved) {
        isReserved = reserved;
        return this;
    }
}
