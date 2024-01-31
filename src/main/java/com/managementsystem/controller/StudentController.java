package com.managementsystem.controller;






import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;


import com.managementsystem.entity.Student;

import com.managementsystem.service.StudentService;







@Controller
public class StudentController {
    
    @Autowired
    StudentService service;

    @GetMapping("/students")
    public String listStudents(Model model) {
        model.addAttribute("students", service.getAllStudents());
        return "Student";
    }

    @GetMapping("/students/new")
    public String createStudentForm(Model model) {
        Student student = new Student();
        model.addAttribute("student", student);
        return "new_student";
    }

    @PostMapping("/saveStudents")
    public String saveStudent(@ModelAttribute("student") Student student) {
        service.saveStudent(student);
        return "redirect:/students";
    }

    @GetMapping("/students/edit/{id}")
    public String editStudentForm(@PathVariable Long id, Model model) {
        model.addAttribute("student", service.getStudentById(id));
        return "edit_student";
    }

    @PostMapping("/students/{id}")
    public String updateStudent(@PathVariable Long id,
                                @ModelAttribute("student") Student student,
                                Model model) {
        Student existingStudent = service.getStudentById(id);

        existingStudent.setId(id);
        existingStudent.setName(student.getName());
        existingStudent.setDepartment(student.getDepartment());
        existingStudent.setEmail(student.getEmail());
        existingStudent.setPhonenumber(student.getPhonenumber());
        existingStudent.setAddress(student.getAddress());
        existingStudent.setJoiningDate(student.getJoiningDate());
        existingStudent.setBatch(student.getBatch());
        existingStudent.setDateOfBirth(student.getDateOfBirth());

        service.updateStudent(existingStudent);
        return "redirect:/students";
    }

    @GetMapping("/students/{id}")
    public String deleteStudent(@PathVariable Long id) {
        service.deleteStudentById(id);
        return "redirect:/students";
    }
}

  
