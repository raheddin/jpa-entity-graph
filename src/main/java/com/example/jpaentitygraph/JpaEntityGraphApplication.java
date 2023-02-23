package com.example.jpaentitygraph;

import com.example.jpaentitygraph.model.Comment;
import com.example.jpaentitygraph.model.Post;
import com.example.jpaentitygraph.model.User;
import com.example.jpaentitygraph.repository.CommentRepository;
import jdk.jfr.TransitionFrom;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@SpringBootApplication
@RequiredArgsConstructor
public class JpaEntityGraphApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(JpaEntityGraphApplication.class, args);
    }

    private final CommentRepository repository;

    @Override
   // @Transactional
    public void run(String... args) throws Exception {
       /* User s = User.builder().name("Saheddin").email("sah@gmail.com").build();

        Post p = Post.builder().subject("2XEBER").user(s).build();

        Comment c =Comment.builder().post(p).user(s).reply("2NEWS").build();

        repository.save(c);

        */

        User s = User.builder().id(2l).name("Saheddin").email("sah@gmail.com").build();
      
      //  List<Comment> all = repository.findAll();
      //  User user=null;//all.get(0).getUser();
      //  System.out.println(user);


        List<Comment> allByUser = repository.findAllByUser(s);
        List<Comment> all = repository.findAll();


        System.out.println("END");



    }
}
