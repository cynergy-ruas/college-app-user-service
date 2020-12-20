package io.github.cynergy.userservice.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import io.github.cynergy.userservice.model.User;

public interface UserRepository extends MongoRepository<User, Integer> {

}
