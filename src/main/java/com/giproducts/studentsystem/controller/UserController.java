package com.giproducts.studentsystem.controller;

import com.giproducts.studentsystem.model.Student;
import com.giproducts.studentsystem.model.User;
import com.giproducts.studentsystem.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
@CrossOrigin
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/add")
    public String add(@RequestBody User user) {
        userService.saveUser(user);
        return "user added successfully";
    }

}
