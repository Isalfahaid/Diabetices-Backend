package com.example.Diabetics.Model.Entities;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;

@Entity
@Table
public class DoctorPoste {
    @Id
    private int doctorPosteId ;
    private String img;
    private String title ;
    private String subject ;


    @ManyToOne
    @JoinColumn(name ="id",referencedColumnName = "id")
    private Doctor doctor ;

    public DoctorPoste() {
    }

    public DoctorPoste(int doctorPosteId, String img, String title, String subject) {
        this.doctorPosteId = doctorPosteId;
        this.img = img;
        this.title = title;
        this.subject = subject;
    }

    public int getDoctorPosteId() {
        return doctorPosteId;
    }

    public void setDoctorPosteId(int doctorPosteId) {
        this.doctorPosteId = doctorPosteId;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }
}
