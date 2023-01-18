package com.example.filrougeback.entities;


import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.util.Collection;
import java.util.List;

@Entity
public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;

    @Column(columnDefinition="TEXT")
    private String description;

    @ManyToOne
    @JoinColumn(name = "CATEGORY_ID")
    private Category category;

    @OneToMany(mappedBy = "course")
    @JsonIgnore
    private Collection<Teacher> teacherList;

    @OneToMany(mappedBy = "course")
    @JsonIgnore
    private Collection<Session> sessionList;


    // Constructor

    public Course() {

    }

    public Course(String name, String description, Category category, Collection<Teacher> teacherList, Collection<Session> sessionList) {
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

    public Collection<Teacher> getTeacherList() {
        return teacherList;
    }

    public void setTeacherList(Collection<Teacher> teacherList) {
        this.teacherList = teacherList;
    }

    public Collection<Session> getSessionList() {
        return sessionList;
    }

    public void setSessionList(Collection<Session> sessionList) {
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
