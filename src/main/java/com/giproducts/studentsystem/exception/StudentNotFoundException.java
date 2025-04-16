package com.giproducts.studentsystem.exception;

public class StudentNotFoundException extends RuntimeException{
    public StudentNotFoundException(Integer id) {
        super(("Student not found with id: " + id));
    }
}
