package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Car;

public interface CarService {
	Car saveCar(Car car);
	List<Car> getAllCar();
	Car getCarById(Long id);
	Car updateCar(Car car,Long id);
	void deleteCar(Long id);
}

