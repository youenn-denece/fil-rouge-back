package com.example.filrougeback.controller;

import com.example.filrougeback.entities.Course;
import com.example.filrougeback.repository.CourseRepository;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import com.example.filrougeback.entities.Category;
import com.example.filrougeback.repository.CategoryRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin()
@RestController
@RequestMapping("/api/it-training/category")
public class CategoryController {

    @Autowired
    private CategoryRepository categoryRepository;
    @GetMapping("/")
    public List<Category> getAllCategory() {
        return (List<Category>) categoryRepository.findAll();
    }
    @GetMapping("/{id}")
    public Category getCategoryById(@PathVariable Integer id) {
        Category cat = categoryRepository.findById(Long.valueOf(id)).get();
        return cat;
    }
}
