package com.example.schoolmanager.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.schoolmanager.service.StudentService;

@Controller
public class StudentPageController {

    private final StudentService studentService;

    public StudentPageController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping({"/", "/students"})
    public String students(Model model) {
        model.addAttribute("students", studentService.getAll());
        return "students";
    }
}
