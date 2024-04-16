package com.example.fcmsapi.api.dto;

import com.example.fcmsapi.model.entity.User;
import org.modelmapper.ModelMapper;

public class UserDTO {
    public static UserDTO create(User user) {
        ModelMapper modelMapper = new ModelMapper();
        return modelMapper.map(user, UserDTO.class);
    }
}
