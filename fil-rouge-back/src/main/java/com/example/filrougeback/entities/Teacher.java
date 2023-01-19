package com.example.filrougeback.entities;


import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Data
@Entity
@DiscriminatorValue("Teacher")
public class Teacher extends User {

    private double grade;

    @JsonBackReference
    @ManyToOne
    @JoinColumn(name = "COURSE_ID")
    private Course course;

    @JsonManagedReference
    @OneToMany(mappedBy = "teacher")
    private List<Session> sessionList;


    public Teacher() {
    }

    public Teacher(double grade, Course course, List<Session> sessionList) {
        super();
        this.grade = grade;
        this.course = course;
        this.sessionList = sessionList;
    }
}
