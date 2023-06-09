package com.demo.todolistbe.user;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Integer> {

  Optional<User> findByUsername(String user);
  Boolean existsByUsername(String user);
}
