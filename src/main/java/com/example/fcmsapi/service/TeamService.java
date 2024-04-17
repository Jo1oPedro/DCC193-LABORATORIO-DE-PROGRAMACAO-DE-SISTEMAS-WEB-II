package com.example.fcmsapi.service;

import com.example.fcmsapi.model.entity.Team;
import com.example.fcmsapi.model.repository.TeamRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TeamService {
    private TeamRepository repository;

    public TeamService(TeamRepository repository) {
        this.repository = repository;
    }

    public List<Team> getTeams(){
        return repository.findAll();
    }

    public Optional<Team> getTeamById(Long id){
        return repository.findById(id);
    }
}
