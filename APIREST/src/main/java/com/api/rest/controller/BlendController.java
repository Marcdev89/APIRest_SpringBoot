package com.api.rest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.api.rest.model.Blend;
import com.api.rest.repository.BlendRepository;

@RestController
@RequestMapping("/blend")
@CrossOrigin(origins = "http://localhost:3000")
public class BlendController {
	
	@Autowired
	public BlendRepository blendRepository;
	
	@GetMapping("/blends")
	public List<Blend> findAll(){
		return blendRepository.findAll();
	}
	
	@PostMapping("/blends")
	public Blend create(@RequestBody Blend blend) {
		return blendRepository.save(blend);
	}

}
