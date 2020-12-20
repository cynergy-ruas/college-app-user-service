package io.github.cynergy.userservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import io.github.cynergy.userservice.database.UserDao;
import io.github.cynergy.userservice.model.User;
import io.github.cynergy.userservice.utils.UserNotFoundException;

@Service
public class UserService {
    
    @Autowired
    @Qualifier("mongo-db")
    UserDao dao;

    public User getUser(String id) throws UserNotFoundException{
        return this.dao.getUser(id);
    }

    public void updateUser(String id, User user) throws UserNotFoundException {
        user.setId(id);
        this.dao.updateUser(user);
    }

    public void createUser(String id, User user) {
        user.setId(id);
        this.dao.createUser(user);
    }
}
