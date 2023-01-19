package com.example.filrougeback.entities;

import jakarta.persistence.*;

import java.util.List;
import java.util.Set;

@Entity
@DiscriminatorValue("Student")
public class Student extends User {
    private String company;

    @ManyToMany(mappedBy = "studentList")
    private List<Session> sessionList;

    public Student() {
        super();
    }

    public Student(String firstname, String lastname, String email, String password, Set<Authority> authorities, String company, List<Session> sessionList) {
        super(firstname, lastname, email, password, authorities);
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

}
