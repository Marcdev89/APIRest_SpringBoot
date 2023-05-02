package com.api.rest.controller;

import java.util.List;

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

import com.api.rest.model.Product;
import com.api.rest.repository.ProductRepository;

@RestController
@RequestMapping("/products")
@CrossOrigin(origins = "http://localhost:3000")
public class ProductController {
	
	@Autowired
	public ProductRepository productRepository;
	
	@GetMapping("/products")
	public List<Product> findAll(){
		return productRepository.findAll();
	}
	
	@PostMapping("/products")
	public Product create(@RequestBody Product product) {
		return productRepository.save(product);
	}
	
	@PutMapping("/products/{id}")
	public Product update(@RequestBody Product product, @PathVariable Integer id) {
		Product productBase = productRepository.getReferenceById(id);
		productBase.setName(product.getName());
		productBase.setCountry(product.getCountry());
		productBase.setRegion(product.getRegion());
		productBase.setDescription(product.getDescription());
		productBase.setSpecies(product.getSpecies());
		productBase.setVariety(product.getVariety());
		productBase.setSca(product.getSca());
		productBase.setPrice(product.getPrice());
		
		return productRepository.save(productBase);	
	}
	
	@DeleteMapping("/products/{id}")
	public void delete(@PathVariable Integer id) {
		productRepository.deleteById(id);
		
	}
	
}
