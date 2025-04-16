package com.giproducts.studentsystem.controller;


import com.giproducts.studentsystem.model.Student;
import com.giproducts.studentsystem.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @PostMapping("/add")
    public String add(@RequestBody Student student) {
        studentService.saveStudent(student);
        return "new student add";
    }

    @GetMapping("/getAll")
    public List<Student> getAllStudent() {
        return studentService.getAllStudent();
    }

    @DeleteMapping("/delete/{id}")
    public String deleteStudent(@PathVariable Integer id) {
        studentService.deleteStudent(id);
        return "student deleted ";
    }

    @PutMapping("/edit")
    public Student editStudent(@RequestBody Student student){
        return studentService.editStudent(student);
    }
}
