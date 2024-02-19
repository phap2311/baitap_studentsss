package com.example.manager_students.controllers;

import com.example.manager_students.models.Student;
import com.example.manager_students.service.IStudentService;
import com.example.manager_students.service.StudentService;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "StudentServlet" , urlPatterns = "student")
public class StudentServlet extends HttpServlet {
    IStudentService iStudentService = new StudentService();
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String action = req.getParameter("action");
        if (action==null){
            action="";
        }
        switch (action){
            case "create":
               showCreateStudent(req,resp);
                break;
            case "edit":
                // showEditStudent(req,resp);
                break;
            case "delete":
                // deleteStudent(req,resp);
                break;
            default:
                showListStudent(req,resp);
                break;
        }
    }

    private void showCreateStudent(HttpServletRequest req, HttpServletResponse resp) {
        RequestDispatcher dispatcher = req.getRequestDispatcher("/student/create.jsp");
        try {
            dispatcher.forward(req,resp);
        } catch (ServletException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        try {
            resp.sendRedirect("/student");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private void showListStudent(HttpServletRequest req, HttpServletResponse resp) {
        RequestDispatcher dispatcher = req.getRequestDispatcher("/student/list.jsp");
        List<Student>students = iStudentService.findAll();
        req.setAttribute("ds",students);
        try {
            dispatcher.forward(req,resp);
        } catch (ServletException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String action = req.getParameter("action");
        if (action==null){
            action="";
        }
        switch (action){
            case "create":
                createStudent(req,resp);
                break;
            case "edit":
                // showEditStudent(req,resp);
                break;
            case "delete":
                // deleteStudent(req,resp);
                break;
            default:
                showListStudent(req,resp);
                break;
        }
    }

    private void createStudent(HttpServletRequest req, HttpServletResponse resp) {
        String nameStudent = req.getParameter("nameStudent");
        String email = req.getParameter("emailStudent");
        String address = req.getParameter("addressStudent");
        Student student = new Student(nameStudent,email,address);
        iStudentService.save(student);


    }
}
