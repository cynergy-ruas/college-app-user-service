package com.CyApp.CynergyApp.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.CyApp.CynergyApp.model.User;

public interface UserRepository extends MongoRepository<User, Integer> {

}
