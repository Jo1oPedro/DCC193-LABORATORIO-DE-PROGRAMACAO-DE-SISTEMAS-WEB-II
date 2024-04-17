package com.example.fcmsapi.model.repository;

import com.example.fcmsapi.model.entity.Coach;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CoachRepository extends JpaRepository <Coach, Long> {
}
