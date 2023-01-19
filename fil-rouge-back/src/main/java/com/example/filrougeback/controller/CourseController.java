package com.example.filrougeback.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import com.example.filrougeback.entities.Course;
import com.example.filrougeback.repository.CourseRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
import java.util.List;
import java.util.Optional;

@CrossOrigin
@RestController
@RequestMapping("/api/it-training/course")
public class CourseController {
    @Autowired
    private CourseRepository courseRepository;

    @GetMapping("/")
    public List<Course> getAllCourse() {
        return (List<Course>) courseRepository.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Course> getCourseById(@PathVariable Integer id) {
        return courseRepository.findById(Long.valueOf(id));
    }

    @PostMapping("/createCourse")
    public ResponseEntity<String> createCourse(@RequestBody Course course) {
        courseRepository.save(course);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

}
