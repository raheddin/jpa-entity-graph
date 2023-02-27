package com.example.jpaentitygraph.controller;

import com.example.jpaentitygraph.model.Comment;
import com.example.jpaentitygraph.model.User;
import com.example.jpaentitygraph.repository.CommentRepository;
import com.example.jpaentitygraph.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/comment")
@RequiredArgsConstructor
public class CommentController {

    private final CommentRepository commentRepository;

    @GetMapping
    public ResponseEntity<List<Comment>> getAll() {
        return ResponseEntity.ok().body(commentRepository.findAll());
    }

    @PostMapping
    public ResponseEntity<Comment> getAll(@RequestBody Comment comment) {
        return ResponseEntity.ok().body(commentRepository.save(comment));
    }


}
