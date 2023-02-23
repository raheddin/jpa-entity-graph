package com.example.jpaentitygraph.repository;

import com.example.jpaentitygraph.model.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post,Long> {

}
