package com.example.fcmsapi.service;

import com.example.fcmsapi.model.entity.Match;
import com.example.fcmsapi.model.repository.MatchRepository;

import java.util.List;
import java.util.Optional;

public class MatchService {
    private MatchRepository repository;

    public MatchService(MatchRepository repository) {
        this.repository = repository;
    }

    public List<Match> getMatchs() {
        return repository.findAll();
    }

    public Optional<Match> getMatchById(Long id) {
        return repository.findById(id);
    }
}
