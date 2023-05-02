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

import com.api.rest.model.Rol;

import com.api.rest.repository.RolRepository;


@RestController
@RequestMapping("/rol")
@CrossOrigin(origins = "http://localhost:3000")
public class RolController {
	
	@Autowired
	private RolRepository rolRepository;;
	
	@GetMapping("/roles")
	public List<Rol> findAll(){
		return rolRepository.findAll();
	}
	
	@PostMapping("/roles")
	public Rol create(@RequestBody Rol rol) {
		return rolRepository.save(rol);
	}
	
	@PutMapping("/roles/{id}")
	public Rol update(@RequestBody Rol rol, @PathVariable Long id) {
		Rol rolBase = rolRepository.getReferenceById(id);
		rolBase.setName(rol.getName());
		
	
		return rolRepository.save(rolBase);
	}
	
	@DeleteMapping("/users/{id}")
	public void delete(@PathVariable Long id) {
		rolRepository.deleteById(id);
	}
	
}
