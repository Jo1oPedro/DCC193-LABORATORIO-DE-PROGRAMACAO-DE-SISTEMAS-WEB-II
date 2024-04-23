package com.example.fcmsapi.service;

import com.example.fcmsapi.model.entity.TeamStatus;
import com.example.fcmsapi.model.repository.TeamStatusRepository;

import java.util.List;
import java.util.Optional;

public class TeamStatusService {
    private TeamStatusRepository repository;

    public TeamStatusService(TeamStatusRepository repository) {
        this.repository = repository;
    }

    public List<TeamStatus> getTeamsStatus() {
        return repository.findAll();
    }

    public Optional<TeamStatus> getTeamStatusById(Long id) {
        return repository.findById(id);
    }
}
