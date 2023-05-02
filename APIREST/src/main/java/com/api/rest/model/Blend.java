package com.api.rest.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;



@Entity
@Table(name = "blend")
public class Blend implements Serializable{
	
	private static final long serialVersionUID = 1L; 
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String size;
	private Double totalprice;
	
	@ManyToOne
	private User user;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "blend")
    private List<BlendDetails> BlendDetails;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public Double getTotalprice() {
		return totalprice;
	}

	public void setTotalprice(Double totalprice) {
		this.totalprice = totalprice;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public List<BlendDetails> getBlendDetails() {
		return BlendDetails;
	}

	public void setBlendDetails(List<BlendDetails> blendDetails) {
		BlendDetails = blendDetails;
	}

	public Blend(Long id, String size, Double totalprice, User user,
			List<com.api.rest.model.BlendDetails> blendDetails) {
		super();
		this.id = id;
		this.size = size;
		this.totalprice = totalprice;
		this.user = user;
		BlendDetails = blendDetails;
	}

	public Blend() {
		super();
	}


	
	
	
	
	

}
