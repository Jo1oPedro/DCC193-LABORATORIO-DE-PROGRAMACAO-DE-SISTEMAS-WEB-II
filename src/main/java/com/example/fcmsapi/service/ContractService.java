package com.example.fcmsapi.service;

import com.example.fcmsapi.model.entity.Contract;
import com.example.fcmsapi.model.repository.ContractRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ContractService {
    private ContractRepository repository;

    public ContractService(ContractRepository repository) {
        this.repository = repository;
    }

    public List<Contract> getContracts(){
        return repository.findAll();
    }

    public Optional<Contract> getContractById(Long id){
        return repository.findById(id);
    }
}
