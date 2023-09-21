package com.example.cookingamdocsbackend.controller;

import com.example.cookingamdocsbackend.exception.ResourceNotFoundException;
import com.example.cookingamdocsbackend.model.User;
import com.example.cookingamdocsbackend.repository.UserRepository;
import com.example.cookingamdocsbackend.service.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping("api/users")
public class CookingController {

    @Autowired
    private UserServiceImpl userServiceImpl;

    @GetMapping("/getAllUsers")
    public List<User> getAllUsers(){
        return userServiceImpl.getAllUsers();
    }

    @PostMapping("/putUsers")
    public User createUser(@RequestBody User user){
        return userServiceImpl.createUser(user);
    }

    @GetMapping("/getByID/{id}")
    public ResponseEntity<User> getUserByID(@PathVariable long id){
        return ResponseEntity.ok(userServiceImpl.getUserByID(id));
    }

    @PutMapping("/updateByID/{id}")
    public ResponseEntity<User> updateUserByID(@PathVariable long id ,@RequestBody User user){
        return ResponseEntity.ok(userServiceImpl.updateUserByID(id , user));
    }


    @DeleteMapping("/deleteByID/{id}")
    public ResponseEntity<User> deleteUserByID(@PathVariable long id){
        return new ResponseEntity<>(userServiceImpl.deleteUserByID(id) , HttpStatus.NO_CONTENT);
    }
}
