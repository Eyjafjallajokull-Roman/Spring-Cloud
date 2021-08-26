package com.example.roomsservices.entity;

import javax.persistence.*;

@Entity
public class Room {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long roomId;
    private Long roomNumber;
    private Category category;
    private Long maxOccupancy;
    private Long price;
    private boolean isReserved;

    public Long getRoomId() {
        return roomId;
    }

    public Room setRoomId(Long roomId) {
        this.roomId = roomId;
        return this;
    }

    public Long getRoomNumber() {
        return roomNumber;
    }

    public Room setRoomNumber(Long roomNumber) {
        this.roomNumber = roomNumber;
        return this;
    }

    public Category getCategory() {
        return category;
    }

    public Room setCategory(Category category) {
        this.category = category;
        return this;
    }

    public Long getMaxOccupancy() {
        return maxOccupancy;
    }

    public Room setMaxOccupancy(Long maxOccupancy) {
        this.maxOccupancy = maxOccupancy;
        return this;
    }

    public Long getPrice() {
        return price;
    }

    public Room setPrice(Long price) {
        this.price = price;
        return this;
    }

    public boolean isReserved() {
        return isReserved;
    }

    public Room setReserved(boolean reserved) {
        isReserved = reserved;
        return this;
    }
}
