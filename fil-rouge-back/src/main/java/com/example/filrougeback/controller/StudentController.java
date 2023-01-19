package com.example.filrougeback.controller;

import com.example.filrougeback.entities.Student;
import com.example.filrougeback.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.*;

import java.sql.Date;
import java.util.List;

@RestController
@RequestMapping("/api/it-training")
//@CrossOrigin(origins = "http://localhost:4200")
public class StudentController {

    @Autowired
    private StudentRepository studentRepository;
    @Autowired
    private PasswordEncoder passwordEncoder;
    @PostMapping("/register")
            public ResponseEntity<String> registerStudent(@RequestBody Student student) {
                Student savedStudent = null;
                ResponseEntity response = null;
                try {
                    String hashPwd = passwordEncoder.encode(student.getPassword());
                    student.setPassword(hashPwd);
                    savedStudent = studentRepository.save(student);
                    if (savedStudent.getId() > 0) {
                        response = ResponseEntity
                                .status(HttpStatus.CREATED)
                                .body("Given user details are successfully registered");
                    }
                } catch (Exception ex) {
                    response = ResponseEntity
                    .status(HttpStatus.INTERNAL_SERVER_ERROR)
                    .body("An exception occured due to " + ex.getMessage());
        }
        return response;
}
    @RequestMapping("/getStudent")
    public Student getStudentDetailsAfterLogin(Authentication authentication) {
        System.out.println(authentication);
        List<Student> students = studentRepository.findByEmail(authentication.getName());
        if (students.size() > 0) {
            return students.get(0);
        } else {
            return null;
        }
    }
    @PostMapping("/createStudent")
    public ResponseEntity<Student> createStudent(@RequestBody Student student) {
        Student savedStudent = null;
        savedStudent = studentRepository.save(student);

        return new ResponseEntity<Student>(savedStudent,HttpStatus.CREATED);
    }
}
