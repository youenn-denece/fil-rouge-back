package com.example.filrougeback.controller;

import com.example.filrougeback.entities.Student;
import com.example.filrougeback.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/it-training")
@CrossOrigin(origins = "http://localhost:4200")
public class StudentController {

    @Autowired
    private StudentRepository studentRepository;

//    @GetMapping("/getUser")
//    public String getUser() {
//        return "unstring";
//    }

    @PostMapping("/createStudent")
    public ResponseEntity<String> createStudent(@RequestBody Student student) {
        Student savedStudent = null;
        System.out.println(student);
        savedStudent = studentRepository.save(student);

        return new ResponseEntity<>(HttpStatus.CREATED);
    }
}
