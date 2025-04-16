package com.giproducts.studentsystem.service;

import com.giproducts.studentsystem.model.Student;

import java.util.List;

public interface StudentService {
    public Student saveStudent(Student student);
    public List<Student> getAllStudent();
    public void deleteStudent(Integer id);
    public Student editStudent(Student student);

}
