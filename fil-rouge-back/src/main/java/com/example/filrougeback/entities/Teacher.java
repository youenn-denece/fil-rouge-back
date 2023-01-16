package com.example.filrougeback.entities;


import jakarta.persistence.*;

import java.util.List;

@Entity
@DiscriminatorValue("Teacher")
public class Teacher extends User {

    private double grade;

    @ManyToOne
    @JoinColumn(name = "COURSE_ID")
    private Course course;

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

    @Override
    public String toString() {
        return "Teacher{" +
                "grade=" + grade +
                ", course=" + course +
                ", sessionList=" + sessionList +
                '}';
    }
}
