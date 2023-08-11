package com.example.demo.entity;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class CarBrand {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String carBrand;
	private String countryOfOrigin;
	
	@OneToMany(mappedBy = "carbrand", cascade = CascadeType.ALL, orphanRemoval = true)
	private List<CarModel> carmodel;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCarBrand() {
		return carBrand;
	}

	public void setCarBrand(String carBrand) {
		this.carBrand = carBrand;
	}

	public String getCountryOfOrigin() {
		return countryOfOrigin;
	}

	public void setCountryOfOrigin(String countryOfOrigin) {
		this.countryOfOrigin = countryOfOrigin;
	}

	public List<CarModel> getCarmodel() {
		return carmodel;
	}

	public void setCarmodel(List<CarModel> carmodel) {
		this.carmodel = carmodel;
	}

	@Override
	public String toString() {
		return "CarBrand [id=" + id + ", carBrand=" + carBrand + ", countryOfOrigin=" + countryOfOrigin + ", carmodel="
				+ carmodel + "]";
	}

}
