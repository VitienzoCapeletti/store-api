package com.store_api.controller;

import com.store_api.domain.user.User;
import com.store_api.dtos.UserDTO;
import com.store_api.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController()
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService service;

    @PostMapping
    public ResponseEntity<User> create(@RequestBody UserDTO userDTO) {
        User newUser = service.create(userDTO);
        return new ResponseEntity<>(newUser, HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<User>> findAll() {
        List<User> users = this.service.findAll();
        return new ResponseEntity<>(users, HttpStatus.OK);
    }

}
