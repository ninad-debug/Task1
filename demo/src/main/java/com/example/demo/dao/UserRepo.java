package com.example.demo.dao;

import com.example.demo.dto.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface UserRepo extends JpaRepository<UserEntity,Integer> {
    @Query("select u from user u where u.location=:location and u.priceRange=:priceRange")
    UserEntity getUser(String location, String priceRange);

    @Query("select u from user u where u.numberOfBedrooms=:numberOfBedrooms and u.propertyType=:propertyType")
    UserEntity getUser(Integer numberOfBedrooms, String propertyType);
}
