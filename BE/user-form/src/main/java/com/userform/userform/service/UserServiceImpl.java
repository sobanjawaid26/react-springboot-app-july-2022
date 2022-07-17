package com.userform.userform.service;

import com.userform.userform.model.User;
import com.userform.userform.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService{

    @Autowired(required=true)
    private UserRepository userRepository;

    @Override
    public User saveUser(User user){
        return userRepository.save(user);
    }

    @Override
    public List<User> getAll(){
        return userRepository.findAll();
    }

    @Override
    public Optional<User> getById(String id){
        return userRepository.findById(id);
    }
}
