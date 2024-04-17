package com.example.fcmsapi.model.repository;

import com.example.fcmsapi.model.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository <User, Long> {
}
