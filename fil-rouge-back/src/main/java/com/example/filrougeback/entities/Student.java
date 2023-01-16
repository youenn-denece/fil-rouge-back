package com.example.filrougeback.entities;

import jakarta.persistence.*;

import java.util.List;

@Entity
@DiscriminatorValue("Student")
public class Student extends User {
    private String company;

    @ManyToMany(mappedBy = "studentList")
    private List<Session> sessionList;

    public Student() {
        super();
    }

    public Student(String firstname, String lastname, String email, String password, String company, List<Session> sessionList) {
        super(firstname, lastname, email, password);
        this.company = company;
        this.sessionList = sessionList;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public List<Session> getSessionList() {
        return sessionList;
    }

    public void setSessionList(List<Session> sessionList) {
        this.sessionList = sessionList;
    }

    @Override
    public String toString() {
        return "Student{" +
                "company='" + company + '\'' +
                ", sessionList=" + sessionList +
                '}';
    }
}
