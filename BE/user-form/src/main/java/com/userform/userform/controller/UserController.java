package com.userform.userform.controller;

import com.userform.userform.model.User;
import com.userform.userform.service.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")

public class UserController {

    @Autowired
    private UserServiceImpl userServiceImpl;

    @GetMapping
    ResponseEntity<List<User>> getAll(){
        return new ResponseEntity<>(userServiceImpl.getAll(),HttpStatus.OK);
    }

    @GetMapping("/{id}")
    ResponseEntity<User> getById(@PathVariable String id){
        return new ResponseEntity<>(userServiceImpl.getById(id).get(), HttpStatus.OK);
    }

    @PostMapping
    ResponseEntity<User> saveUser(@RequestParam User user){
        return new ResponseEntity<>(userServiceImpl.saveUser(user), HttpStatus.CREATED);
    }
}
