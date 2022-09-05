package com.bitanya.employeems.entity;

import javax.persistence.*;

@Entity
@Table(name = "Employee_MS")
public class employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  String email;
    private String firstName;
    private String lastName;
    private String gender;
    private String DOB;
    private String phoneNum;
    private String address;

    public employee() {
        this.email = email;
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.DOB = DOB;
        this.phoneNum = phoneNum;
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getDOB() {
        return DOB;
    }

    public void setDOB(String DOB) {
        this.DOB = DOB;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "employee{" +
                "DOB='" + DOB + '\'' +
                ", phoneNum='" + phoneNum + '\'' +
                '}';
    }
}
