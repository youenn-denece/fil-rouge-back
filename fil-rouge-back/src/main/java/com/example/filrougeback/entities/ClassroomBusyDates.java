package com.example.filrougeback.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.util.Date;

@Entity
public class ClassroomBusyDates {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private int classroomId;

    private Date startDate;

    private Date endDate;


    // Constructor

    public ClassroomBusyDates() {

    }

    public ClassroomBusyDates(int classroomId, Date startDate, Date endDate) {
        this.classroomId = classroomId;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    @Override
    public String toString() {
        return "ClassroomBusyDates{" +
                "classroomId=" + classroomId +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                '}';
    }
}
