package com.example.filrougeback.entities;


import jakarta.persistence.*;

import java.util.List;

@Entity
public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;

    private String description;

    @ManyToOne
    @JoinColumn(name = "CATEGORY_ID")
    private Category category;

    @OneToMany(mappedBy = "course")
    private List<Teacher> teacherList;

    @OneToMany(mappedBy = "course")
    private List<Session> sessionList;


    // Constructor

    public Course() {

    }

    public Course(String name, String description, Category category, List<Teacher> teacherList, List<Session> sessionList) {
        this.name = name;
        this.description = description;
        this.category = category;
        this.teacherList = teacherList;
        this.sessionList = sessionList;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public List<Teacher> getTeacherList() {
        return teacherList;
    }

    public void setTeacherList(List<Teacher> teacherList) {
        this.teacherList = teacherList;
    }

    public List<Session> getSessionList() {
        return sessionList;
    }

    public void setSessionList(List<Session> sessionList) {
        this.sessionList = sessionList;
    }

    @Override
    public String toString() {
        return "Course{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", category=" + category +
                ", teacherList=" + teacherList +
                ", sessionList=" + sessionList +
                '}';
    }
}
