package com.example.demo.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.ResponseEntity.BodyBuilder;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.CarBrand;
import com.example.demo.service.CarBrandService;
import jakarta.persistence.EntityNotFoundException;

@RestController
@RequestMapping("/api")
public class CarBrandController {

	@Autowired
	public CarBrandService carBrandService;

	@PostMapping("/carbrand")
	public CarBrand createCarBrand(@RequestBody CarBrand carbrand)
	{
		return carBrandService.saveCarBrand(carbrand);
	}
	//build get all cars REST API
	@GetMapping("/carbrands")
    public List<CarBrand> getAllCarBrands() {
        return carBrandService.getAllCarBrands();
    }
	//pagination
	@GetMapping("/pagination")
	public Page<CarBrand> findCarBrandsWithPagination(@RequestParam("offset") int offset,@RequestParam("pageSize") int pageSize){
        Page<CarBrand> carbrand = carBrandService.findAll(PageRequest.of(offset, pageSize));
        return carbrand;
    }
    
	//pagination with sorting
	//@GetMapping("/paginationAndSort/{offset}/{pageSize}/{field}")
	@GetMapping("/paginationAndSort")
	public Page<CarBrand> findCarBrandsWithPaginationAndSort(@RequestParam("offset") int offset, @RequestParam("pageSize") int pageSize, @RequestParam("field") String field) {
	    Sort sort = Sort.by(field);
	    Page<CarBrand> carbrand = carBrandService.findAll(PageRequest.of(offset, pageSize, sort));
	    return carbrand;
	}

		//http://localhost:8081/api/carbrands/1
	 @GetMapping("/carbrands/{id}")
	    public CarBrand getCarBrandById(@PathVariable Long id) {
	        return carBrandService.getCarBrandById(id);
	    }
	 @PutMapping("/carbrands/{id}")
	    public CarBrand updateCarBrand(@PathVariable Long id, @RequestBody CarBrand carBrand) {
	        return carBrandService.updateCarBrand(id, carBrand);
	    }
	
	@DeleteMapping("/carbrands/{id}")
	public ResponseEntity<String> deleteCarBrand(@PathVariable Long id) {
		try {
			carBrandService.deleteCarBrand(id);
			return ResponseEntity.noContent().build();
		} catch (EntityNotFoundException e) {
			return ((BodyBuilder) ResponseEntity.notFound()).body(e.getMessage());
		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("An error occurred");
		}
	}
}