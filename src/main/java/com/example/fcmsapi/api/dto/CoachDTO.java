package com.example.fcmsapi.api.dto;

import com.example.fcmsapi.model.entity.Championship;

import com.example.fcmsapi.model.entity.Coach;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.modelmapper.ModelMapper;

public class CoachDTO {

    private String favoritePlaystyle;

    public static CoachDTO create(Coach coach) {
        ModelMapper modelMapper = new ModelMapper();
        return modelMapper.map(coach, CoachDTO.class);
    }

}
