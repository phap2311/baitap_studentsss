package com.example.manager_students.service;

import com.example.manager_students.models.Student;

import java.util.List;

public interface IStudentService {
    List<Student> findAll();

    void save(Student student);
}
