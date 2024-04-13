package com.example.fcmsapi.api.dto;

import com.example.fcmsapi.model.entity.Championship;
import com.example.fcmsapi.model.entity.Coach;
import com.example.fcmsapi.model.entity.Match;
import com.example.fcmsapi.model.entity.Team;
import jakarta.persistence.ManyToOne;
import org.modelmapper.ModelMapper;

import java.util.Date;

public class MatchDTO {
    private long id;
    private Date date;
    private Integer audienceNumber;
    @ManyToOne
    private Team winner;
    @ManyToOne
    private Team loser;

    @ManyToOne
    private Championship championship;

    public static MatchDTO create(Match match) {
        ModelMapper modelMapper = new ModelMapper();
        return modelMapper.map(match, MatchDTO.class);
    }
}
