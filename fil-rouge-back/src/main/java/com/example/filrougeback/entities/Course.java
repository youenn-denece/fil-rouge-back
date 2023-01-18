package com.example.filrougeback.entities;


import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.Data;
import lombok.ToString;

import java.util.Collection;
import java.util.List;

@Entity
@Data
public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;
    @Column(columnDefinition="TEXT")
    private String description;

    @JsonBackReference
    @ToString.Exclude
    @ManyToOne
    @JoinColumn(name = "CATEGORY_ID")
    private Category category;

    @JsonManagedReference
    @JsonIgnore
    @OneToMany(mappedBy = "course",fetch = FetchType.LAZY)
    private Collection<Teacher> teacherList;

    @JsonManagedReference
    @JsonIgnore
    @OneToMany(mappedBy = "course",fetch = FetchType.LAZY)
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

}
