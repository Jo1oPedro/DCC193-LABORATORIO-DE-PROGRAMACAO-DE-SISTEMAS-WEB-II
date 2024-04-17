package com.example.fcmsapi.model.repository;

import com.example.fcmsapi.model.entity.Player;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlayerRepository extends JpaRepository <Player, Long> {
}
