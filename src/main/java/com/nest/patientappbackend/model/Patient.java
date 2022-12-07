package com.nest.patientappbackend.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "patients")
public class Patient {

    @Id
    @GeneratedValue
    private int id;
    private String name;
    private String gender;
    private String address;
    private String dob;
    private String email;
    private String phone;
    private String docName;
    private String appoDate;

    public Patient() {
    }

    public Patient(int id, String name, String gender, String address, String dob, String email, String phone, String docName, String appoDate) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.address = address;
        this.dob = dob;
        this.email = email;
        this.phone = phone;
        this.docName = docName;
        this.appoDate = appoDate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getDocName() {
        return docName;
    }

    public void setDocName(String docName) {
        this.docName = docName;
    }

    public String getAppoDate() {
        return appoDate;
    }

    public void setAppoDate(String appoDate) {
        this.appoDate = appoDate;
    }
}
