package com.example.demoquizapp.repository;

import com.example.demoquizapp.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
}
