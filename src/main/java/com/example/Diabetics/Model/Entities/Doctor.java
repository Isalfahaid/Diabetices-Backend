package com.example.Diabetics.Model.Entities;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table
public class Doctor {
    @Id
    private int id;
    private String fname;
    private String lname;
    private int doctorage;
    private int doctorphone;
    private String doctoraddress;
    private String specialization;

        @ManyToOne
    @JoinColumn(name = "nationalId",referencedColumnName="nationalId")
    private User user;

    @OneToMany(mappedBy = "doctor")
    @JsonIgnore
    private List<DoctorPoste> items = new ArrayList<>();



    public Doctor(int id, String fname, String lname, int doctorage, int doctorphone, String doctoraddress, String specialization) {
        this.id = id;
        this.fname = fname;
        this.lname = lname;
        this.doctorage = doctorage;
        this.doctorphone = doctorphone;
        this.doctoraddress = doctoraddress;
        this.specialization = specialization;
    }

    public Doctor() {
    }

    public int getid() {
        return id;
    }

    public void setid(int id) {
        this.id = id;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public int getDoctorage() {
        return doctorage;
    }

    public void setDoctorage(int doctorage) {
        this.doctorage = doctorage;
    }

    public int getDoctorphone() {
        return doctorphone;
    }

    public void setDoctorphone(int doctorphone) {
        this.doctorphone = doctorphone;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public String getDoctoraddress() {
        return doctoraddress;
    }

    public void setDoctoraddress(String doctoraddress) {
        this.doctoraddress = doctoraddress;
    }
}


