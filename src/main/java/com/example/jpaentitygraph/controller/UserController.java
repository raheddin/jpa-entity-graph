package com.example.jpaentitygraph.controller;

import com.example.jpaentitygraph.model.User;
import com.example.jpaentitygraph.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
@RequiredArgsConstructor
public class UserController {

    private final UserRepository userRepository;

    @GetMapping
    public ResponseEntity<List<User>> getAll(){
        return  ResponseEntity.ok().body(userRepository.findAll());
    }

    @PostMapping
    public ResponseEntity<User> getAll(@RequestBody User user){
        return  ResponseEntity.ok().body(userRepository.save(user));
    }


}
