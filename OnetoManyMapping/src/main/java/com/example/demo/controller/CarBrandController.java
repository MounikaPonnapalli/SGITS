package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.CarBrand;
import com.example.demo.service.CarBrandService;

//import java.util.List;

/*import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.ResponseEntity.BodyBuilder;
import org.springframework.web.bind.annotation.DeleteMapping;
//import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
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
	public CarBrand createCarBrand(@RequestBody CarBrand carbrand) {
		return carBrandService.saveCarBrand(carbrand);
	}

	/*
	 * @PostMapping("/carmodel") // public CarModel createCarModel(@RequestBody
	 * CarModel carmodel) { //return CarModelService.saveCarModel(carmodel); }
	 * 
	 * @GetMapping public List<CarBrand> getAllCarBrand() { return
	 * CarBrandService.getAllCarBrand(); }
	 * 
	 * @GetMapping("{id}") public
	 * ResponseEntity<CarBrand>getCarBrandById(@PathVariable("id")Long id){ return
	 * new
	 * ResponseEntity<CarBrand>(CarBrandService.getCarBrandById(id),HttpStatus.OK);
	 * }
	 * 
	 * @PutMapping("{id}") public
	 * ResponseEntity<CarBrand>updateCarBrand(@PathVariable("id")Long id
	 * ,@RequestBody CarBrand carbrand) { return new
	 * ResponseEntity<CarBrand>(CarBrandService.updateCarBrand(carbrand,id),
	 * HttpStatus.OK); }
	 */

	/*@DeleteMapping("/carbrands/{id}")
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
}*/
@RestController
@RequestMapping("/api")
public class CarBrandController 
{
    @Autowired
    private CarBrandService carBrandService;

    @PostMapping("/carbrands")
    public CarBrand createCarBrand(@RequestBody CarBrand carbrand) {
        return carBrandService.saveCarBrand(carbrand);
    }

    @DeleteMapping("/carbrandss/{id}")
    public ResponseEntity<Void> deleteCarBrand(@PathVariable Long id) 
    {
        carBrandService.deleteCarBrand(id);
        return ResponseEntity.noContent().build();
    }
}