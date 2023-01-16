package com.example.filrougeback.controller;

import com.example.filrougeback.entities.User;
import com.example.filrougeback.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(name = "/api/it-training")
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping("/getUser")
    public String getUser() {
        return "unstring";
    }

    @PostMapping("/createUser")
    public User createUser(@RequestBody User user) {
        User savedUser = null;
        savedUser = userRepository.save(user);

        return savedUser;
    }
}
