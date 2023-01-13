package com.example.filrougeback.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Campus {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private int name;

    private int city;

    // Constructor

    public Campus() {

    }

    public Campus(int name, int city) {
        this.name = name;
        this.city = city;
    }


    // Getter and Setter


    public int getId() {

        return id;
    }

    public void setId(int id) {

        this.id = id;
    }

    public int getName() {

        return name;
    }

    public void setName(int name) {

        this.name = name;
    }

    public int getCity() {

        return city;
    }

    public void setCity(int city) {

        this.city = city;
    }

    @Override
    public String toString() {
        return "Campus{" +
                "name=" + name +
                ", city=" + city +
                '}';
    }





}
