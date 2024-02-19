package com.example.manager_students.service;

import com.example.manager_students.models.Student;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class StudentService implements IStudentService {
    @Override
    public List<Student> findAll() {
        Connection connection = DBConnection.getConnection();
        List<Student> studentList = new ArrayList<>();
        try {
            PreparedStatement statement = connection.prepareStatement("select * from students");
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
                int id = resultSet.getInt("id_student");
                String nameStudent = resultSet.getString("name_student");
                String email = resultSet.getString("email_student");
                String address = resultSet.getString("address_student");
                Student student = new Student(id, nameStudent, email, address);
                studentList.add(student);

            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                connection.close();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }

        return studentList;
    }

    @Override
    public void save(Student student) {
        Connection connection = DBConnection.getConnection();
        try {
            PreparedStatement statement = connection.prepareStatement("insert into students values (?,?,?) ");
            statement.setString(1, student.getNameStudent());
            statement.setString(2, student.getEmail());
            statement.setString(3, student.getAddress());
            statement.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }finally {
            try {
                connection.close();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }

    }
}
