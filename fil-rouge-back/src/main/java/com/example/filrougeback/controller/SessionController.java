package com.example.filrougeback.controller;

import com.example.filrougeback.entities.Session;
import com.example.filrougeback.repository.SessionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/it-training/session")
@CrossOrigin(origins = "http://localhost:4200")
public class SessionController {

    @Autowired
    private SessionRepository sessionRepository;

    @GetMapping("/")
    public List<Session> getAllSessions() {
        return (List<Session>) sessionRepository.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Session> getSessionById(@PathVariable Integer id) {
        return sessionRepository.findById(Long.valueOf(id));
    }

    @PostMapping("/createSession")
    public ResponseEntity<String> createSession(@RequestBody Session session) {
        sessionRepository.save(session);

        return new ResponseEntity<>(HttpStatus.CREATED);
    }
}
