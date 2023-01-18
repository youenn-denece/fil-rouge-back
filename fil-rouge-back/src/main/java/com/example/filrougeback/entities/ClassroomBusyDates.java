package com.example.filrougeback.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

import java.util.Date;
@Data
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

}
