package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="cars")
public class Car {

@Id
@GeneratedValue
private Long id;
private String cBrand;
private String cModel;
private Long cYear;
private String cColor;
private String cFeatures;
private Long cMileage;
private String cLocation;
private String cServicHis;
private String cOwner;

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getcBrand() {
		return cBrand;
	}
	public void setcBrand(String cBrand) {
		this.cBrand = cBrand;
	}
	public String getcModel() {
		return cModel;
	}
	public void setcModel(String cModel) {
		this.cModel = cModel;
	}
	public Long getcYear() {
		return cYear;
	}
	public void setcYear(Long cYear) {
		this.cYear = cYear;
	}
	public String getcColor() {
		return cColor;
	}
	public void setcColor(String cColor) {
		this.cColor = cColor;
	}
	public String getcFeatures() {
		return cFeatures;
	}
	public void setcFeatures(String cFeatures) {
		this.cFeatures = cFeatures;
	}
	public Long getcMileage() {
		return cMileage;
	}
	public void setcMileage(Long cMileage) {
		this.cMileage = cMileage;
	}
	public String getcLocation() {
		return cLocation;
	}
	public void setcLocation(String cLocation) {
		this.cLocation = cLocation;
	}
	public String getcServicHis() {
		return cServicHis;
	}
	public void setcServicHis(String cServicHis) {
		this.cServicHis = cServicHis;
	}
	public String getcOwner() {
		return cOwner;
	}
	public void setcOwner(String cOwner) {
		this.cOwner = cOwner;
	}
	@Override
	public String toString() {
		return "Car [id=" + id + ", cBrand=" + cBrand + ", cModel=" + cModel + ", cYear=" + cYear + ", cColor=" + cColor
				+ ", cFeatures=" + cFeatures + ", cMileage=" + cMileage + ", cLocation=" + cLocation + ", cServicHis="
				+ cServicHis + ", cOwner=" + cOwner + "]";
	}
	
	}
