package com.example.filrougeback.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String company; // null

    // sessionList : array

    // Constructor

    public Student() {

    }

    public Student(String company) {
        this.company = company;
    }


    // Getter and Setter


    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }


    @Override
    public String toString() {
        return "Student{" +
                "company='" + company + '\'' +
                '}';
    }



}
