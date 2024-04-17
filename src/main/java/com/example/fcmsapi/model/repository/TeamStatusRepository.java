package com.example.fcmsapi.model.repository;

import com.example.fcmsapi.model.entity.TeamStatus;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TeamStatusRepository extends JpaRepository <TeamStatus, Long> {
}
