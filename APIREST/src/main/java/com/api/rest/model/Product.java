package com.api.rest.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "product")
public class Product {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	@Column
	private String name;
	@Column
	private String country;
	@Column
	private String region;
	@Column 
	private String description;
	@Column
	private String species;
	@Column
	private String variety;
	@Column
	private Double price;
	@Column
	private Float sca;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getSpecies() {
		return species;
	}

	public void setSpecies(String species) {
		this.species = species;
	}

	public String getVariety() {
		return variety;
	}

	public void setVariety(String variety) {
		this.variety = variety;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Float getSca() {
		return sca;
	}

	public void setSca(Float sca) {
		this.sca = sca;
	}

	public Product(Integer id, String name, String country, String region, String description, String species,
			String variety, Double price, Float sca) {
		super();
		this.id = id;
		this.name = name;
		this.country = country;
		this.region = region;
		this.description = description;
		this.species = species;
		this.variety = variety;
		this.price = price;
		this.sca = sca;
	}

	public Product() {
		super();
	}
	
	

}
