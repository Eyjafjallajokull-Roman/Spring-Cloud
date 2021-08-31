package com.example.userservices.repository;

import com.example.userservices.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByUserId(Long id);

    Optional<User> findUserByEmail(String email);
}
