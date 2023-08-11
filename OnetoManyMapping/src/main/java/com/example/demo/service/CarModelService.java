package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.CarModel;
import com.example.demo.repository.CarModelRepository;

/*import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Optional;
import com.example.demo.entity.CarModel;
import com.example.demo.repository.CarModelRepository;

import jakarta.persistence.EntityNotFoundException;
@Service
public class CarModelService 
{
    @Autowired
    private CarModelRepository carModelRepository;
    
    public  CarModel saveCarModel(CarModel carmodel)
    {
	    return carModelRepository.save(carmodel);
	}
    public void deleteCarModel(Long id) 
    {
    	Optional<CarModel> optionalCarModel= carModelRepository.findById(id);
        if (optionalCarModel.isPresent()) 
	    {
		    carModelRepository.delete(optionalCarModel.get());
        }
	    else 
	    {
		   throw new EntityNotFoundException("CarModel with ID " + id + " not found");
	    }
	}}
*/
@Service
public class CarModelService 
{
    @Autowired
    private CarModelRepository carModelRepository;

    public CarModel saveCarModel(CarModel carmodel) {
        return carModelRepository.save(carmodel);
    }

    public void deleteCarModel(Long id) 
    {
        carModelRepository.deleteById(id);
    }
}