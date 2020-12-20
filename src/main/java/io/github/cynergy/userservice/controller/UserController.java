package io.github.cynergy.userservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import io.github.cynergy.userservice.model.User;
import io.github.cynergy.userservice.repository.UserRepository;

@RestController
public class UserController {

	@Autowired
	private UserRepository userReposity;
	
	@PostMapping("/user")
	public String saveUser(@RequestBody User user){
		userReposity.save(user);
		return "User successfully registered";
	}
	
	@GetMapping("/user")
	public List<User> getUsers(){
		return userReposity.findAll();
		}
}
