package com.api.rest.controller;

import java.util.List;
//CONTROLLER

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.api.rest.model.User;
import com.api.rest.repository.UserRepository;

@RestController
@RequestMapping("/user")
@CrossOrigin(origins = "http://localhost:3000")
public class UserController {
	
	@Autowired
	private UserRepository userRepository;;
	
	@GetMapping("/users")
	public List<User> findAll(){
		return userRepository.findAll();
	}
	
	@PostMapping("/users")
	public User create(@RequestBody User user) {
		return userRepository.save(user);
	}
	
	@PutMapping("/users/{id}")
	public User update(@RequestBody User user, @PathVariable Long id) {
		User userBase = userRepository.getReferenceById(id);
		userBase.setFirstName(user.getFirstName());
		userBase.setLastName(user.getLastName());
		userBase.setEmail(user.getEmail());
		userBase.setPassword(user.getPassword());
		userBase.setRoles(user.getRoles());
		
		return userRepository.save(userBase);
	}
	
	@DeleteMapping("/users/{id}")
	public void delete(@PathVariable Long id) {
		userRepository.deleteById(id);
	}
	
}
