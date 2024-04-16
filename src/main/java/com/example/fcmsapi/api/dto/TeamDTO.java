package com.example.fcmsapi.api.dto;

import com.example.fcmsapi.model.entity.Team;
import org.modelmapper.ModelMapper;

import java.util.Date;

public class TeamDTO {
    private long id;
    private String $name;
    private Date foundationDate;

    public static TeamDTO create(Team team) {
        ModelMapper modelMapper = new ModelMapper();
        return modelMapper.map(team, TeamDTO.class);
    }
}
