package com.example.filrougeback.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.Data;
import lombok.ToString;

import java.util.Collection;
import java.util.List;

@Entity
@Data
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "name")
    private String name;

    @JsonManagedReference
    @ToString.Exclude
    @OneToMany(mappedBy = "category",fetch = FetchType.EAGER)
    private Collection<Course> courseList;

    // Constructor

    public Category() {

    }

    public Category(String name, Collection<Course> courseList) {
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

    public Collection<Course> getCourseList() {
        return courseList;
    }

    public void setCourseList(Collection<Course> courseList) {
        this.courseList = courseList;
    }

}
