package com.api.rest.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.api.rest.model.BlendDetails;

import com.api.rest.repository.IBlendDetailsRepository;

@RestController
@RequestMapping("/details")
@CrossOrigin(origins = "http://localhost:3000")
public class BlendDetailsController {
	
	@Autowired
	public IBlendDetailsRepository iBlendDetailsRepository;
	
	@GetMapping("/")
	public List<BlendDetails> findAll(){
		return iBlendDetailsRepository.findAll();

	}
	
	@PostMapping("/")
	public BlendDetails create(@RequestBody BlendDetails blendDetails) {
		return iBlendDetailsRepository.save(blendDetails);
	}

}
