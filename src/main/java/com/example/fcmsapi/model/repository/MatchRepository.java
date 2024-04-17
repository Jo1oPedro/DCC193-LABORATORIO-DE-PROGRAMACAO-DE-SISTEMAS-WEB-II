package com.example.fcmsapi.model.repository;

import com.example.fcmsapi.model.entity.Match;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MatchRepository extends JpaRepository <Match, Long> {
}
