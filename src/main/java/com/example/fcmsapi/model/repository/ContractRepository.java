package com.example.fcmsapi.model.repository;

import com.example.fcmsapi.model.entity.Contract;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContractRepository extends JpaRepository <Contract, Long> {
}
