package com.example.filrougeback.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.ColumnDefault;

import java.util.Date;
import java.util.List;

@Data
@Entity
public class Session {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @JsonBackReference
    @ManyToOne
    @JoinColumn(name = "CAMPUS_ID")
    private Campus campus;

    @JsonBackReference
    @ManyToOne
    @JoinColumn(name = "TEACHER_ID")
    private Teacher teacher;

    @ManyToOne
    @JoinColumn(name = "COURSE_ID")
    private Course course;

    @JsonBackReference
    @ManyToOne
    @JoinColumn(name = "CLASSROOM_ID")
    private Classroom classroom;

    @ColumnDefault("true")
    private boolean isInter;

    @Temporal(TemporalType.DATE)
    private Date startDate;

    @Temporal(TemporalType.DATE)
    private Date endDate;

    private double price;

    private int maxStudentNumber;

    @ManyToMany
    @JoinTable(name = "SESSION_STUDENT",
            joinColumns = @JoinColumn(name = "SESSION_ID", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name = "STUDENT_ID", referencedColumnName = "id"))
    private List<Student> studentList;



    // Constructor

    public Session() {

    }

    public Session(Campus campus, Teacher teacher, Course course, Classroom classroom, boolean isInter, Date startDate, Date endDate, double price, int maxStudentNumber, List<Student> studentList) {
        this.campus = campus;
        this.teacher = teacher;
        this.course = course;
        this.classroom = classroom;
        this.isInter = isInter;
        this.startDate = startDate;
        this.endDate = endDate;
        this.price = price;
        this.maxStudentNumber = maxStudentNumber;
        this.studentList = studentList;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Campus getCampus() {
        return campus;
    }

    public void setCampus(Campus campus) {
        this.campus = campus;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    @JsonBackReference
    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public Classroom getClassroom() {
        return classroom;
    }

    public void setClassroom(Classroom classroom) {
        this.classroom = classroom;
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

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getMaxStudentNumber() {
        return maxStudentNumber;
    }

    public void setMaxStudentNumber(int maxStudentNumber) {
        this.maxStudentNumber = maxStudentNumber;
    }

    public List<Student> getStudentList() {
        return studentList;
    }

    public void setStudentList(List<Student> studentList) {
        this.studentList = studentList;
    }

}
