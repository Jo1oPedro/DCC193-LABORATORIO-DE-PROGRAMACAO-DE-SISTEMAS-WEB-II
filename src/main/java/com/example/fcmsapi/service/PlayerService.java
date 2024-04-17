package com.example.fcmsapi.service;

import com.example.fcmsapi.model.entity.Player;
import com.example.fcmsapi.model.repository.PlayerRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PlayerService {
    private PlayerRepository repository;

    public PlayerService(PlayerRepository repository) {
        this.repository = repository;
    }

    public List<Player> getPlayers(){
        return repository.findAll();
    }

    public Optional<Player> getPlayerById(Long id){
        return repository.findById(id);
    }
}
