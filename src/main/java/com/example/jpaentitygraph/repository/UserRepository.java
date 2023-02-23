package com.example.jpaentitygraph.repository;

import com.example.jpaentitygraph.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {

}
