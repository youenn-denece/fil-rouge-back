package com.example.filrougeback.repository;

import com.example.filrougeback.entities.Course;
import com.example.filrougeback.entities.Category;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.List;

@Repository
public interface CourseRepository extends CrudRepository<Course, Long> {

}
