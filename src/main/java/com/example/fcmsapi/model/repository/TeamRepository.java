package com.example.fcmsapi.model.repository;

import com.example.fcmsapi.model.entity.Team;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TeamRepository extends JpaRepository <Team, Long> {
}
