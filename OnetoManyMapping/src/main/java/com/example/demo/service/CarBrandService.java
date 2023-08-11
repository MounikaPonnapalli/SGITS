package com.example.demo.service;
/*import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.CarBrand;
import com.example.demo.repository.CarBrandRepository;

import jakarta.persistence.EntityNotFoundException;
@Service
public class CarBrandService {
	@Autowired
    private CarBrandRepository carBrandRepository;

    public CarBrand saveCarBrand(CarBrand carbrand) {
        return carBrandRepository.save(carbrand);
    }

    public void deleteCarBrand(Long id) {
        Optional<CarBrand> optionalCarBrand = carBrandRepository.findById(id);
        if (optionalCarBrand.isPresent()) {
            carBrandRepository.delete(optionalCarBrand.get());
        } else {
            throw new EntityNotFoundException("CarBrand with ID " + id + " not found");
        }
    }
}
*/

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.CarBrand;
import com.example.demo.repository.CarBrandRepository;

@Service
public class CarBrandService {
    @Autowired
    private CarBrandRepository carBrandRepository;

    public CarBrand saveCarBrand(CarBrand carbrand) {
        return carBrandRepository.save(carbrand);
    }

    public void deleteCarBrand(Long id) {
        carBrandRepository.deleteById(id);
    }
}
