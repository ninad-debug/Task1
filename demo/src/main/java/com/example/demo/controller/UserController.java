package com.example.demo.controller;

import com.example.demo.dto.UserEntity;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping("/create")
    String createUser(@RequestBody UserEntity userEntity){
        return userService.createUser(userEntity);
    }

    @GetMapping("/getByLocation&priceRange/{location}/{priceRange}")
    UserEntity getUser(@RequestParam String location, @RequestParam String priceRange){
        return userService.getUserEntity(location, priceRange);
    }

    @GetMapping("/getByLocation&priceRange/{numberOfBedrooms}/{propertyType}")
    UserEntity getUser(@RequestParam Integer numberOfBedrooms,@RequestParam String propertyType){
        return userService.getUserEntity(numberOfBedrooms, propertyType);
    }
}
