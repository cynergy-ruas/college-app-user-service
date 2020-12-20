package io.github.cynergy.userservice.database;

import io.github.cynergy.userservice.model.User;
import io.github.cynergy.userservice.utils.UserNotFoundException;

public interface UserDao {
    public User getUser(String id) throws UserNotFoundException;

    public void updateUser(User user) throws UserNotFoundException;

    public void createUser(User user);
}
