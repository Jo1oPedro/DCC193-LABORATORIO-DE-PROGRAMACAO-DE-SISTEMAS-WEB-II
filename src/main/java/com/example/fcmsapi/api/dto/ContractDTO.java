package com.example.fcmsapi.api.dto;

import com.example.fcmsapi.model.entity.Championship;

import com.example.fcmsapi.model.entity.Coach;
import com.example.fcmsapi.model.entity.Contract;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.modelmapper.ModelMapper;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ContractDTO {

    private long id;
    private Date date;
    private Integer value;
    private String duration;

    public static ContractDTO create(Contract contract) {
        ModelMapper modelMapper = new ModelMapper();
        return modelMapper.map(contract, ContractDTO.class);
    }

}
