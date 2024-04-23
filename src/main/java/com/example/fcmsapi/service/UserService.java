package com.example.fcmsapi.service;

import com.example.fcmsapi.model.entity.User;
import com.example.fcmsapi.model.repository.UserRepository;

import java.util.List;
import java.util.Optional;

public class UserService {

    private UserRepository repository;

    public UserService(UserRepository repository) {
        this.repository = repository;
    }

    public List<User> getUsers() {
        return repository.findAll();
    }

    public Optional<User> getUserById(Long id) {
        return repository.findById(id);
    }
}
