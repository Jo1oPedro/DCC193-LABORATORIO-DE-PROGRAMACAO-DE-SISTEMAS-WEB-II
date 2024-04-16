package com.example.fcmsapi.api.dto;

import com.example.fcmsapi.model.entity.Championship;
import com.example.fcmsapi.model.entity.Team;
import com.example.fcmsapi.model.entity.TeamStatus;
import jakarta.persistence.ManyToOne;
import org.modelmapper.ModelMapper;

public class TeamStatusDTO {
    private long id;
    private Integer points;
    private Integer numberMatchesPlayed;

    private Championship championship;

    public static TeamStatusDTO create(TeamStatus teamStatus) {
        ModelMapper modelMapper = new ModelMapper();
        return modelMapper.map(teamStatus, TeamStatusDTO.class);
    }
}
