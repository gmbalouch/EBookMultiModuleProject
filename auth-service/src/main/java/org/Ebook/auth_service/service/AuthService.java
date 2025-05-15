package org.Ebook.auth_service.service;

import org.Ebook.auth_service.repository.AuthRepository;
import org.Ebook.common_entities.entities.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class AuthService {
    @Autowired
    private AuthRepository authRepository;

    public User signup(User user) {
        if (authRepository.existsByUsername(user.getUsername())) {
            throw new RuntimeException("Username already exists");
        }

        if (authRepository.existsByEmail(user.getEmail())) {
            throw new RuntimeException("Email already exists");
        }

        User savedUser = authRepository.save(user);
        return savedUser;
    }

    public boolean signin(User user) {
        Optional<User> userOpt = authRepository.findByUsername(user.getUsername());

        if (userOpt.isEmpty()) {
            throw new RuntimeException("User not found");
        }

        if (!userOpt.get().getPassword().equals(user.getPassword())) {
            throw new RuntimeException("Invalid password");
        }

        return true;
    }

    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = authRepository.findByUsername(username)
                .orElseThrow(() -> new UsernameNotFoundException("User not found"));

        return new org.springframework.security.core.userdetails.User(
                user.getUsername(),
                user.getPassword(),
                new ArrayList<>());
    }

    public User findByUsername(String username) throws UsernameNotFoundException {
        User user = authRepository.findByUsername(username)
                .orElseThrow(() -> new UsernameNotFoundException("User not found"));

        return user;
    }

    public boolean existsByUsername(String username) throws UsernameNotFoundException {
         return authRepository.existsByUsername(username);
    }



}
