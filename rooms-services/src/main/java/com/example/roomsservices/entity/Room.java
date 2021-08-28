package com.example.roomsservices.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Room {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long roomId;
    @Column(unique = true)
    private Long roomNumber;
    @Enumerated(value = EnumType.STRING)
    private Category category;
    private Long maxOccupancy;
    private Long price;
    @Column(columnDefinition="tinyint(1)")
    private boolean isReserved;



    public Room setRoomId(Long roomId) {
        this.roomId = roomId;
        return this;
    }


    public Room setRoomNumber(Long roomNumber) {
        this.roomNumber = roomNumber;
        return this;
    }


    public Room setCategory(Category category) {
        this.category = category;
        return this;
    }


    public Room setMaxOccupancy(Long maxOccupancy) {
        this.maxOccupancy = maxOccupancy;
        return this;
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
