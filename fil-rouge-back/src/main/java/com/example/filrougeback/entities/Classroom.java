package com.example.filrougeback.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Classroom {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private int campusId;

    private int roomNumber;

    // notAvailableDates : array

    // Constructor

    public Classroom() {

    }

    public Classroom(int campusId, int roomNumber) {
        this.campusId = campusId;
        this.roomNumber = roomNumber;
    }


    // Getter and Setter


    public int getId() {

        return id;
    }

    public void setId(int id) {

        this.id = id;
    }

    public int getCampusId() {

        return campusId;
    }

    public void setCampusId(int campusId) {

        this.campusId = campusId;
    }

    public int getRoomNumber() {

        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {

        this.roomNumber = roomNumber;
    }

    @Override
    public String toString() {
        return "Classroom{" +
                "campusId=" + campusId +
                ", roomNumber=" + roomNumber +
                '}';
    }
}
