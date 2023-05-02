package com.api.rest.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="blend_details")
public class BlendDetails implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@ManyToOne
	private Blend blend;
	
	@ManyToOne
	private Product product;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Blend getBlend() {
		return blend;
	}

	public void setBlend(Blend blend) {
		this.blend = blend;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public BlendDetails(Long id, Blend blend, Product product) {
		super();
		this.id = id;
		this.blend = blend;
		this.product = product;
	}

	public BlendDetails() {
		super();
	}
	
	

}
