package com.example.filrougeback.controller;

import com.example.filrougeback.entities.Session;
import com.example.filrougeback.entities.User;
import com.example.filrougeback.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api/it-training/user")
//@CrossOrigin(origins = "http://localhost:4200")
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping("/getUser")
    public String getUser() {
        return "unstring";
    }

    @GetMapping("/{id}")
    public Optional<User> getUserById(@PathVariable Integer id) {
        return userRepository.findById(id.longValue());
    }
    @PostMapping("/createUser")
    public User createUser(@RequestBody User user) {
        User savedUser = null;
        savedUser = userRepository.save(user);
        return savedUser;
    }
}
