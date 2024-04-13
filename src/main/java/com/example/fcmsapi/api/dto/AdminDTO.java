package com.example.fcmsapi.api.dto;

import com.example.fcmsapi.model.entity.Admin;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.modelmapper.ModelMapper;

@Data
public class AdminDTO {
    public static AdminDTO create(Admin admin) {
        ModelMapper modelMapper = new ModelMapper();
        return modelMapper.map(admin, AdminDTO.class);
    }
}
