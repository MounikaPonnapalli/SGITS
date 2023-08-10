package com.example.demo.service.impl;

import java.util.List;
//import java.util.Optional;
import org.springframework.stereotype.Service;

import com.example.demo.exception.ResourceNotFoundException;
import com.example.demo.entity.Car;
import com.example.demo.repository.CarRepo;
import com.example.demo.service.CarService;


@Service
public class CarServiceImpl implements CarService{

	private CarRepo carRepo;
	
	public CarServiceImpl(CarRepo carRepo) {
		super();
		this.carRepo = carRepo;
	}

	@Override
	public Car saveCar(Car car)
	{
		return carRepo.save(car);
	}

	@Override
	public List<Car> getAllCar() {
		// TODO Auto-generated method stub
		return carRepo.findAll();
	}
	
	@Override
	public Car getCarById(Long id) 
	{
		//Optional<Car> car=carRepo.findById(id);
		//if(car.isPresent())
		//{
		//	return car.get();
		//}
		//else
		//{
		//	throw new ResourceNotFoundException("Car","Id",id);
		//}
		return carRepo.findById(id).orElseThrow(() -> new ResourceNotFoundException("Car","Id",id));
	}
    @Override
	public Car updateCar(Car car,Long id)
	{
    	// we need to check whether car with given id is exist in DB or not
    	Car existingCar=carRepo.findById(id).orElseThrow(() -> new ResourceNotFoundException("Car","Id",id));
		existingCar.setId(car.getId());
    	existingCar.setcBrand(car.getcBrand());
    	existingCar.setcModel(car.getcModel());
    	existingCar.setcOwner(car.getcOwner());
    	existingCar.setcServicHis(car.getcServicHis());
    	existingCar.setcOwner(car.getcOwner());
    	carRepo.save(existingCar);
    	
    	return existingCar;
		
	}
    @Override
    public void deleteCar(Long id)
    {
    	// check whether a car exist in a DB or not
    	carRepo.findById(id).orElseThrow(()-> new ResourceNotFoundException("Car","Id",id));
    	
    	carRepo.deleteById(id);
    }


}
