package com.example.filrougeback.entities;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "name")
    private String name;

    @OneToMany(mappedBy = "category")
    private List<Course> courseList;

    // Constructor

    public Category() {

    }

    public Category(String name, List<Course> courseList) {
        this.name = name;
        this.courseList = courseList;
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

    public List<Course> getCourseList() {
        return courseList;
    }

    public void setCourseList(List<Course> courseList) {
        this.courseList = courseList;
    }

    @Override
    public String toString() {
        return "Category{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", courseList=" + courseList +
                '}';
    }
}
