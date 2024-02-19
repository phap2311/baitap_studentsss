package com.example.manager_students.models;

public class Student {
    private int id;
    private String nameStudent;
    private String email;
    private String address;

    public Student() {
    }

    public Student(int id, String nameStudent, String email, String address) {
        this.id = id;
        this.nameStudent = nameStudent;
        this.email = email;
        this.address = address;
    }

    public Student(String nameStudent, String email, String address) {
        this.nameStudent = nameStudent;
        this.email = email;
        this.address = address;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNameStudent() {
        return nameStudent;
    }

    public void setNameStudent(String nameStudent) {
        this.nameStudent = nameStudent;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
