package com.example.fcmsapi.service;

import com.example.fcmsapi.model.entity.Coach;
import com.example.fcmsapi.model.repository.CoachRepository;

import java.util.List;
import java.util.Optional;

public class CoachService {
    private CoachRepository repository;

    public CoachService(CoachRepository repository) {
        this.repository = repository;
    }

    public List<Coach> getCoachs() {
        return this.repository.findAll();
    }

    public Optional<Coach> getCoachById(Long id) {
        return repository.findById(id);
    }
}
