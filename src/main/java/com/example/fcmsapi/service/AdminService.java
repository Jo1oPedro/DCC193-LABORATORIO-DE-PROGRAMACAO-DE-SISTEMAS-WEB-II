package com.example.fcmsapi.service;

import com.example.fcmsapi.model.entity.Admin;
import com.example.fcmsapi.model.repository.AdminRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AdminService {
    private AdminRepository repository;

    public AdminService(AdminRepository repository) {
        this.repository = repository;
    }

    public List<Admin> getAdmins(){
        return repository.findAll();
    }

    public Optional<Admin> getAdminById(Long id){
        return repository.findById(id);
    }
}
