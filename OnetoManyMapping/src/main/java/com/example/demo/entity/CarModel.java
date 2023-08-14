package com.example.demo.entity;

//import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class CarModel {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String cmodel;
	
	@ManyToOne
	@JsonIgnore
	@JoinColumn(name = "carbrand_id")
	private CarBrand carbrand;
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getCmodel() {
		return cmodel;
	}
	public void setCmodel(String cmodel) {
		this.cmodel = cmodel;
	}
	public CarBrand getCarbrand() {
		return carbrand;
	}
	public void setCarbrand(CarBrand carbrand) {
		this.carbrand = carbrand;
	}
	

}