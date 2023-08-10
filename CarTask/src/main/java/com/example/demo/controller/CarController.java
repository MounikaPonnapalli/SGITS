package com.example.demo.controller;
import java.util.List;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Car;
import com.example.demo.service.CarService;

@RestController
@RequestMapping("/api/cars")
public class CarController {

	private CarService carService;

	public CarController(CarService carService) {
		super();
		this.carService = carService;
	}
	//build create car REST API
	@PostMapping("/post")
	public ResponseEntity<Car> saveCar(@RequestBody Car car)
	{
		return new ResponseEntity<Car>(carService.saveCar(car),HttpStatus.CREATED);
	}
	
	//build get all cars REST API
	@GetMapping
	public List<Car> getAllCar()
	{
		return carService.getAllCar();
	}
	
	//build get employee by id REST API
	//http://localhost:8080/api/car/1
	@GetMapping("{id}")
	public ResponseEntity<Car>getCarById(@PathVariable("id")Long id){
		return new ResponseEntity<Car>(carService.getCarById(id),HttpStatus.OK);
	}
	@PutMapping("{id}")
	public ResponseEntity<Car>updateCar(@PathVariable("id")Long id ,@RequestBody Car car)
	{
		return new ResponseEntity<Car>(carService.updateCar(car,id),HttpStatus.OK);
	}
	//build delete car REST API
	@DeleteMapping("{id}")
    public ResponseEntity<String> deleteCar(@PathVariable("id") Long id){
		
		// delete car from DB
		carService.deleteCar(id);
		
		return new ResponseEntity<String>("Employee deleted successfully!.", HttpStatus.OK);
	}
	
	
}
