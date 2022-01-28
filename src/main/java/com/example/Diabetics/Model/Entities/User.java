package com.example.Diabetics.Model.Entities;


import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table
public class User {


    @Id
    private   int nationalId;
    private  String firstname;
    private  String lastname;
    private int age;
    private String patient_type;
    private int phone;
    private String address;
    private String username;
    private String password;
    private String email;



    @OneToMany(mappedBy = "user")
    @JsonIgnore
    private List<Doctor> items = new ArrayList<>();

    public User(int nationalId, String firstname, String lastname, int age, String patient_type, int phone, String address, String email, String username, String password, List<Doctor> items) {
        this.nationalId = nationalId;
        this.firstname = firstname;
        this.lastname = lastname;
        this.age = age;
        this.email=email;
        this.patient_type = patient_type;
        this.phone = phone;
        this.address = address;
        this.username = username;
        this.password = password;
        this.items = items;
    }

    public User() {
    }

    public int getNationalId() {
        return nationalId;
    }

    public void setNationalId(int nationalId) {
        this.nationalId = nationalId;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPatient_type() {
        return patient_type;
    }

    public void setPatient_type(String patient_type) {
        this.patient_type = patient_type;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<Doctor> getItems() {
        return items;
    }

    public void setItems(List<Doctor> items) {
        this.items = items;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}