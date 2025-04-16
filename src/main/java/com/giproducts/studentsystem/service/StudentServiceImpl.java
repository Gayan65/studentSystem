package com.giproducts.studentsystem.service;

import com.giproducts.studentsystem.exception.StudentNotFoundException;
import com.giproducts.studentsystem.model.Student;
import com.giproducts.studentsystem.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentRepository studentRepository;

    @Override
    public Student saveStudent(Student student) {
        return studentRepository.save(student);
    }

    @Override
    public List<Student> getAllStudent() {
        return studentRepository.findAll();
    }

    @Override
    public void deleteStudent(Integer id) {
        // Check if the student exists
        Student existingStudent = studentRepository.findById(id)
                .orElseThrow(() -> new StudentNotFoundException(id));

        //delete here
        studentRepository.deleteById(id);
    }

    @Override
    public Student editStudent(Student student) {
        // Check if the student exists
        Student existingStudent = studentRepository.findById(student.getId())
                .orElseThrow(() -> new StudentNotFoundException(student.getId()));

        // Update fields
        existingStudent.setName(student.getName());
        existingStudent.setAddress(student.getAddress());

        // Save the updated student
        return studentRepository.save(existingStudent);
    }
}
