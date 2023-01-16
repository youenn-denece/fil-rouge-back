package com.example.filrougeback.entities;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Classroom {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private int roomNumber;

    @ManyToOne
    @JoinColumn(name = "CAMPUS_ID")
    private Campus campus;

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

    @Override
    public String toString() {
        return "Classroom{" +
                "id=" + id +
                ", roomNumber=" + roomNumber +
                ", campus=" + campus +
                ", sessionList=" + sessionList +
                '}';
    }
}
