package com.example.filrougeback.repository;

import com.example.filrougeback.entities.Course;
import com.example.filrougeback.entities.Category;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Collection;

@Repository
public interface CourseRepository extends CrudRepository<Course, Long> {
    @Query(
            value = "SELECT co.name, co.id FROM course AS co JOIN category AS ca ON co.category_id = ca.id",
            nativeQuery = true)
    Collection<Course> findByCatId( );
}
