package com.example.fcmsapi.api.dto;

import com.example.fcmsapi.model.entity.Admin;
import com.example.fcmsapi.model.entity.Championship;
import com.example.fcmsapi.model.entity.Team;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.modelmapper.ModelMapper;

public class ChampionshipDTO {
    private long id;
    private String name;
    private Team winner;

    private Team currentLeader;
    public static ChampionshipDTO create(Championship championship) {
        ModelMapper modelMapper = new ModelMapper();
        return modelMapper.map(championship, ChampionshipDTO.class);
    }

}
