package com.userform.userform.service;

import com.userform.userform.model.User;

import java.util.List;
import java.util.Optional;

public interface UserService {

    public User saveUser(User user);
    public List<User> getAll();
    public Optional<User> getById(String id);
    }
