package io.github.cynergy.userservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.github.cynergy.userservice.model.ApiResponse;
import io.github.cynergy.userservice.model.User;
import io.github.cynergy.userservice.service.UserService;
import io.github.cynergy.userservice.utils.UserNotFoundException;

@RequestMapping("user")
@RestController
public class UserController {

	@Autowired
	private UserService service;
	
	@PostMapping("update")
	public ApiResponse updateUser(@RequestHeader("App-User-Id") String userId, @RequestBody User user) throws UserNotFoundException {
		this.service.updateUser(userId, user);

		return ApiResponse.Ok();
	}

	@PostMapping("create")
	public ApiResponse createUser(@RequestHeader("App-User-Id") String userId, @RequestBody User user) {
		this.service.createUser(userId, user);

		return ApiResponse.Ok();
	}

	@GetMapping
	public User getUser(@RequestHeader("App-User-Id") String userId) throws UserNotFoundException {
		return service.getUser(userId);
	}
}
