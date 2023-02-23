package com.example.jpaentitygraph.repository;

import com.example.jpaentitygraph.model.Comment;
import com.example.jpaentitygraph.model.User;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CommentRepository extends JpaRepository<Comment,Long> {


    @EntityGraph(value = "comment-entity-graph")
    List<Comment> findAllByUser(User s);

    @Override
    @EntityGraph(value = "comment-entity-graph-user")
    List<Comment> findAll();

}
