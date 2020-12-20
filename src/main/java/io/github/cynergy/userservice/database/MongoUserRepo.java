package io.github.cynergy.userservice.database;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

import io.github.cynergy.userservice.model.User;

public interface MongoUserRepo extends MongoRepository<User, ObjectId> {
}
