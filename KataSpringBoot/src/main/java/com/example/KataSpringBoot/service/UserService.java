package com.example.KataSpringBoot.service;

import com.example.KataSpringBoot.model.User;
import com.example.KataSpringBoot.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public record UserService(UserRepository userRepository) {

    @Autowired
    public UserService {
    }

    public void add(User user) {
        userRepository.save(user);
    }

    public List<User> listUser() {
        return userRepository.findAll();
    }

    public void delete(Long id) {
        userRepository.deleteById(id);
    }

    public void update(User user) {
        userRepository.saveAndFlush(user);
    }

    public User get(Long id) {
        return userRepository.findById(id).orElse(null);
    }
}
