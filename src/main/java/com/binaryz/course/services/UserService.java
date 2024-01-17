package com.binaryz.course.services;

import com.binaryz.course.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import com.binaryz.course.entities.User;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository repository;


    public List<User> findAll() {
        return repository.findAll();
    }

    public User findById(Long id) {
        Optional<User> obj = repository.findById(id);
        return obj.get();
    }
}