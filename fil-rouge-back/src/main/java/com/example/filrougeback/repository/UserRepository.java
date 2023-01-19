package com.example.filrougeback.repository;

import com.example.filrougeback.entities.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {
    //public User findUserByMailAndPassword(String email, String password);

    List<User> findByEmail(String email);
}