package com.example.filrougeback.entities;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Campus {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;

    private String city;

    @OneToMany(mappedBy = "campus")
    private List<Session> sessionList;

    @OneToMany(mappedBy = "campus")
    private List<Classroom> classroomList;

    // Constructor

    public Campus() {

    }

    public Campus(String name, String city, List<Session> sessionList, List<Classroom> classroomList) {
        this.name = name;
        this.city = city;
        this.sessionList = sessionList;
        this.classroomList = classroomList;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public List<Session> getSessionList() {
        return sessionList;
    }

    public void setSessionList(List<Session> sessionList) {
        this.sessionList = sessionList;
    }

    public List<Classroom> getClassroomList() {
        return classroomList;
    }

    public void setClassroomList(List<Classroom> classroomList) {
        this.classroomList = classroomList;
    }

    @Override
    public String toString() {
        return "Campus{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", city='" + city + '\'' +
                ", sessionList=" + sessionList +
                ", classroomList=" + classroomList +
                '}';
    }
}
