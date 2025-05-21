package com.example.demo.onetoone.controller;

import com.example.demo.onetoone.model.User;
import com.example.demo.onetoone.service.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;

@RestController
@RequestMapping("user")
public class UserController {
    private UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping
    public ResponseEntity<List<User>> getAll() {
        return ResponseEntity.ok(userService.getAllUsers());
    }

    @GetMapping("{id}")
    public ResponseEntity<User> getUserById(@PathVariable long id) {
        try {
            return ResponseEntity.ok(userService.getUserById(id).get());
        } catch (NoSuchElementException e) {
            return ResponseEntity.notFound().build();
        }
    }

    @PostMapping
    public ResponseEntity<User> createUser(@RequestBody User user) {
        return ResponseEntity.ok(userService.addNewUser(user));
    }

    @DeleteMapping("{id}")
    public ResponseEntity deleteById(@PathVariable long id) {
        userService.deleteById(id);
        return ResponseEntity.ok().build();
    }

}
