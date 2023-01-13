package com.example.filrougeback.entities;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Teacher {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int courseId;

    private double grade;

    // notAvailableDates : array

    // Constructor

    public Teacher() {

    }

    public Teacher(double grade) {
        this.grade = grade;
    }

    // Getter and Setter


    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "grade=" + grade +
                '}';
    }
}
