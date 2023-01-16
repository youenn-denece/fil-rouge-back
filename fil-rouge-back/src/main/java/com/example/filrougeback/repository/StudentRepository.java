package com.example.filrougeback.repository;

import com.example.filrougeback.entities.Student;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends CrudRepository<Student, Long> {
}
