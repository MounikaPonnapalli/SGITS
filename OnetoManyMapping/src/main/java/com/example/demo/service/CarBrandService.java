package com.example.demo.service;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
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
    
   public List<CarBrand> getAllCarBrands() {
        return carBrandRepository.findAll();
    }
    

    public CarBrand getCarBrandById(Long id) {
        return carBrandRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("CarBrand with ID " + id + " not found"));
    }
    
    public CarBrand updateCarBrand(Long id, CarBrand carBrand) {
        CarBrand existingCarBrand = getCarBrandById(id);
        existingCarBrand.setCarBrand(carBrand.getCarBrand());
        existingCarBrand.setCountryOfOrigin(carBrand.getCountryOfOrigin());
        return carBrandRepository.save(existingCarBrand);
    }
    public void deleteCarBrand(Long id) {
        Optional<CarBrand> optionalCarBrand = carBrandRepository.findById(id);
        if (optionalCarBrand.isPresent()) {
            carBrandRepository.delete(optionalCarBrand.get());
        } else {
            throw new EntityNotFoundException("CarBrand with ID " + id + " not found");
        }
    }

	public Page<CarBrand> findAll(PageRequest of) {
		// TODO Auto-generated method stub
		return carBrandRepository.findAll(of);
	}

	public Page<CarBrand> findAll(int pageNumber, int pageSize, String field) {
	    Sort sort = Sort.by(field);
	    return carBrandRepository.findAll(PageRequest.of(pageNumber, pageSize, sort));
	}


}
