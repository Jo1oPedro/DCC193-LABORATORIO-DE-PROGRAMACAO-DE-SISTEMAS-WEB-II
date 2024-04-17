package com.example.fcmsapi.model.repository;

import com.example.fcmsapi.model.entity.Championship;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ChampionshipRepository extends JpaRepository <Championship, Long> {
}
