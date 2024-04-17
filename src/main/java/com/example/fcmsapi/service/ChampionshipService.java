package com.example.fcmsapi.service;

import com.example.fcmsapi.model.entity.Championship;
import com.example.fcmsapi.model.repository.ChampionshipRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ChampionshipService {
    private ChampionshipRepository repository;

    public ChampionshipService(ChampionshipRepository repository) {
        this.repository = repository;
    }

    public List<Championship> getChampionships(){
        return repository.findAll();
    }

    public Optional<Championship> getChampionshipById(Long id){
        return repository.findById(id);
    }
}
