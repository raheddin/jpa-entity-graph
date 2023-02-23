package com.example.jpaentitygraph.controller;

import com.example.jpaentitygraph.model.Post;
import com.example.jpaentitygraph.model.User;
import com.example.jpaentitygraph.repository.PostRepository;
import com.example.jpaentitygraph.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/post")
@RequiredArgsConstructor
public class PostController {

    private final PostRepository postRepository;

    @GetMapping
    public ResponseEntity<List<Post>> getAll(){
        return  ResponseEntity.ok().body(postRepository.findAll());
    }

    @PostMapping
    public ResponseEntity<Post> getAll(@RequestBody Post post){
        return  ResponseEntity.ok().body(postRepository.save(post));
    }


}
