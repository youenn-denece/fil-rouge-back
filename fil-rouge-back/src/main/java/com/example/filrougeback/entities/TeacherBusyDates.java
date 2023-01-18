package com.example.filrougeback.entities;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

import java.util.Date;

@Data
@Entity
public class TeacherBusyDates {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private int teacherId;

    private Date startDate;

    private Date endDate;


    // Constructor

    public TeacherBusyDates() {

    }

    public TeacherBusyDates(int teacherId, Date startDate, Date endDate) {
        this.teacherId = teacherId;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    // Getter and Setter


    public int getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(int teacherId) {
        this.teacherId = teacherId;
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

}
