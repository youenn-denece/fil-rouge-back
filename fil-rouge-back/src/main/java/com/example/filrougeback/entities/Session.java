package com.example.filrougeback.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.util.Date;

@Entity
public class Session {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private int courseId;

    private int campusId;

    private int classroomId;

    private boolean isInter;

    private Date startDate;

    private Date endDate;

    private double price;

    private int maxStudentNumber;

    // studentList :array


    // Constructor

    public Session() {

    }

    public Session(int courseId, int campusId, int classroomId, boolean isInter, Date startDate, Date endDate, double price, int maxStudentNumber) {
        this.courseId = courseId;
        this.campusId = campusId;
        this.classroomId = classroomId;
        this.isInter = isInter;
        this.startDate = startDate;
        this.endDate = endDate;
        this.price = price;
        this.maxStudentNumber = maxStudentNumber;
    }


    // Getter and Setter


    public int getId() {

        return id;
    }

    public void setId(int id) {

        this.id = id;
    }

    public int getCourseId() {

        return courseId;
    }

    public void setCourseId(int courseId) {

        this.courseId = courseId;
    }

    public int getCampusId() {

        return campusId;
    }

    public void setCampusId(int campusId) {

        this.campusId = campusId;
    }

    public int getClassroomId() {

        return classroomId;
    }

    public void setClassroomId(int classroomId) {

        this.classroomId = classroomId;
    }

    public boolean isInter() {

        return isInter;
    }

    public void setInter(boolean inter) {

        isInter = inter;
    }

    public Date getStartDate() {

        return startDate;
    }

    public void setStartDate(Date startDate) {

        this.startDate = startDate;
    }

    public Date getEndDate() {

        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public Double getPrice() {

        return price;
    }

    public void setPrice(Double price) {

        this.price = price;
    }

    public int getMaxStudentNumber() {

        return maxStudentNumber;
    }

    public void setMaxStudentNumber(int maxStudentNumber) {

        this.maxStudentNumber = maxStudentNumber;
    }

    @Override
    public String toString() {
        return "Session{" +
                "courseId=" + courseId +
                ", campusId=" + campusId +
                ", classroomId=" + classroomId +
                ", isInter=" + isInter +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                ", price=" + price +
                ", maxStudentNumber=" + maxStudentNumber +
                '}';
    }
}
