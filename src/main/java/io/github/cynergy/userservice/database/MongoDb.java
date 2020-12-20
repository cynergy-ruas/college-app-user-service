package io.github.cynergy.userservice.database;

import java.util.Optional;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import io.github.cynergy.userservice.model.User;
import io.github.cynergy.userservice.utils.UserNotFoundException;

@Repository("mongo-db")
public class MongoDb implements UserDao {

    @Autowired
    MongoUserRepo repo;

    @Override
    public User getUser(String id) throws UserNotFoundException {
        Optional<User> res = null;
        try {
            // getting the user by id
            res = this.repo.findById(new ObjectId(id));
            
            // if no user found, throw exception
            if (! res.isPresent()) {
                throw new UserNotFoundException();
            }
        }
        catch (IllegalArgumentException e) {
            throw new UserNotFoundException();
        }

        // return the data
        return res.get();
    }

    @Override
    public void updateUser(User userData) throws UserNotFoundException {
        
        Optional<User> res = null;
        try {

            // getting the user by id
            res = this.repo.findById(new ObjectId(userData.getId()));
            
            // if no user found, throw exception
            if (! res.isPresent()) {
                throw new UserNotFoundException();
            }
        }
        catch (IllegalArgumentException e) {
            throw new UserNotFoundException();
        }
        
        // getting the data
        User user = res.get();

        // updating the data using what the request provided
        user.updateFrom(userData);
        
        // saving the data
        this.repo.save(user);
    }
    
    @Override
    public void createUser(User user) {
        this.repo.save(user);
    }
}
