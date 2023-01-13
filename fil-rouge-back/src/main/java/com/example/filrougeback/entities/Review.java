package com.example.filrougeback.entities;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


@Entity
public class Review {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private int userId;

    private int teacherId;

    private int sessionId;

    private int welcomeGrade;

    private int servicesGrade;

    private int sessionGrade;

    private int pedagogyGrade;

    private int knowledgeGrade;

    private int availabilityGrade;

    private int replyingGrade;

    private int ambianceGrade;

    private int satisfactionGrade;

    private String comments;

    private boolean recommandation;

    private boolean futureProjects;


    // Constructor

    public Review() {

    }

    public Review(int userId, int teacherId, int sessionId, int welcomeGrade, int servicesGrade, int sessionGrade, int pedagogyGrade, int knowledgeGrade, int availabilityGrade, int replyingGrade, int ambianceGrade, int satisfactionGrade, String comments, boolean recommandation, boolean futureProjects) {
        this.userId = userId;
        this.teacherId = teacherId;
        this.sessionId = sessionId;
        this.welcomeGrade = welcomeGrade;
        this.servicesGrade = servicesGrade;
        this.sessionGrade = sessionGrade;
        this.pedagogyGrade = pedagogyGrade;
        this.knowledgeGrade = knowledgeGrade;
        this.availabilityGrade = availabilityGrade;
        this.replyingGrade = replyingGrade;
        this.ambianceGrade = ambianceGrade;
        this.satisfactionGrade = satisfactionGrade;
        this.comments = comments;
        this.recommandation = recommandation;
        this.futureProjects = futureProjects;
    }


    // Getter and Setter


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(int teacherId) {
        this.teacherId = teacherId;
    }

    public int getSessionId() {
        return sessionId;
    }

    public void setSessionId(int sessionId) {
        this.sessionId = sessionId;
    }

    public int getWelcomeGrade() {
        return welcomeGrade;
    }

    public void setWelcomeGrade(int welcomeGrade) {
        this.welcomeGrade = welcomeGrade;
    }

    public int getServicesGrade() {
        return servicesGrade;
    }

    public void setServicesGrade(int servicesGrade) {
        this.servicesGrade = servicesGrade;
    }

    public int getSessionGrade() {
        return sessionGrade;
    }

    public void setSessionGrade(int sessionGrade) {
        this.sessionGrade = sessionGrade;
    }

    public int getPedagogyGrade() {
        return pedagogyGrade;
    }

    public void setPedagogyGrade(int pedagogyGrade) {
        this.pedagogyGrade = pedagogyGrade;
    }

    public int getKnowledgeGrade() {
        return knowledgeGrade;
    }

    public void setKnowledgeGrade(int knowledgeGrade) {
        this.knowledgeGrade = knowledgeGrade;
    }

    public int getAvailabilityGrade() {
        return availabilityGrade;
    }

    public void setAvailabilityGrade(int availabilityGrade) {
        this.availabilityGrade = availabilityGrade;
    }

    public int getReplyingGrade() {
        return replyingGrade;
    }

    public void setReplyingGrade(int replyingGrade) {
        this.replyingGrade = replyingGrade;
    }

    public int getAmbianceGrade() {
        return ambianceGrade;
    }

    public void setAmbianceGrade(int ambianceGrade) {
        this.ambianceGrade = ambianceGrade;
    }

    public int getSatisfactionGrade() {
        return satisfactionGrade;
    }

    public void setSatisfactionGrade(int satisfactionGrade) {
        this.satisfactionGrade = satisfactionGrade;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public boolean isRecommandation() {
        return recommandation;
    }

    public void setRecommandation(boolean recommandation) {
        this.recommandation = recommandation;
    }

    public boolean isFutureProjects() {
        return futureProjects;
    }

    public void setFutureProjects(boolean futureProjects) {
        this.futureProjects = futureProjects;
    }

    @Override
    public String toString() {
        return "Review{" +
                "userId=" + userId +
                ", teacherId=" + teacherId +
                ", sessionId=" + sessionId +
                ", welcomeGrade=" + welcomeGrade +
                ", servicesGrade=" + servicesGrade +
                ", sessionGrade=" + sessionGrade +
                ", pedagogyGrade=" + pedagogyGrade +
                ", knowledgeGrade=" + knowledgeGrade +
                ", availabilityGrade=" + availabilityGrade +
                ", replyingGrade=" + replyingGrade +
                ", ambianceGrade=" + ambianceGrade +
                ", satisfactionGrade=" + satisfactionGrade +
                ", comments='" + comments + '\'' +
                ", recommandation=" + recommandation +
                ", futureProjects=" + futureProjects +
                '}';
    }




}
