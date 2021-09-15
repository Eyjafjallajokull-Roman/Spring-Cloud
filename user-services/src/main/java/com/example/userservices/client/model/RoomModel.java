package com.example.userservices.client.model;

import lombok.Data;

@Data
public class RoomModel {
    private Long roomNumber;
    private String category;
    private Long maxOccupancy;
    private Long price;
    private boolean isReserved;

    public Long getRoomNumber() {
        return roomNumber;
    }

    public RoomModel setRoomNumber(Long roomNumber) {
        this.roomNumber = roomNumber;
        return this;
    }

    public String getCategory() {
        return category;
    }

    public RoomModel setCategory(String category) {
        this.category = category;
        return this;
    }

    public Long getMaxOccupancy() {
        return maxOccupancy;
    }

    public RoomModel setMaxOccupancy(Long maxOccupancy) {
        this.maxOccupancy = maxOccupancy;
        return this;
    }

    public Long getPrice() {
        return price;
    }

    public RoomModel setPrice(Long price) {
        this.price = price;
        return this;
    }

    public boolean isReserved() {
        return isReserved;
    }

    public RoomModel setReserved(boolean reserved) {
        isReserved = reserved;
        return this;
    }
}
