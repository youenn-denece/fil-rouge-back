package com.example.filrougeback.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Data
@Entity
public class Classroom {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private int roomNumber;

    @JsonBackReference
    @ManyToOne
    @JoinColumn(name = "CAMPUS_ID")
    private Campus campus;

    @JsonManagedReference
    @OneToMany(mappedBy = "classroom")
    private List<Session> sessionList;

    // notAvailableDates : array

    // Constructor

    public Classroom() {

    }

    public Classroom(int roomNumber, Campus campus, List<Session> sessionList) {
        this.roomNumber = roomNumber;
        this.campus = campus;
        this.sessionList = sessionList;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public Campus getCampus() {
        return campus;
    }

    public void setCampus(Campus campus) {
        this.campus = campus;
    }

    public List<Session> getSessionList() {
        return sessionList;
    }

    public void setSessionList(List<Session> sessionList) {
        this.sessionList = sessionList;
    }

}
