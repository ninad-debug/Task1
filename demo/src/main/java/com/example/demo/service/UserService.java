package com.example.demo.service;

import com.example.demo.dao.UserRepo;
import com.example.demo.dto.UserEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

@Service
public class UserService {
    @Autowired
    private UserRepo userRepo;

    public String createUser(UserEntity userEntity){
        userRepo.save(userEntity);
        return "User Created Successfully!";
    }

    public UserEntity getUserEntity(String location, String priceRange){
        return userRepo.getUser(location, priceRange);
    }

    public UserEntity getUserEntity(Integer numberOfBedrooms, String propertyType){
        return userRepo.getUser(numberOfBedrooms, propertyType);
    }
}
