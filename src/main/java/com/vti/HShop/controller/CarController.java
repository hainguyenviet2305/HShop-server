package com.vti.HShop.controller;

import com.vti.HShop.dto.CarDto;
import com.vti.HShop.entity.Car;
import com.vti.HShop.form.CarCreateForm;
import com.vti.HShop.form.CarUpdateForm;
import com.vti.HShop.service.CarService;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
@Validated
@RestController
@AllArgsConstructor
@CrossOrigin("*")
public class CarController {
    private final CarService carService;

    @GetMapping("/api/v1/cars")
    public Page<CarDto> findAll(Pageable pageable) {
        return carService.findAll(pageable);
    }

    @PostMapping("/api/v1/cars")
    @ResponseStatus(HttpStatus.CREATED)
    public CarDto create(@RequestBody @Valid CarCreateForm form) {
        return carService.create(form);
    }

    @PutMapping("/api/v1/cars")
    public CarDto update(@RequestBody @Valid CarUpdateForm form) {
        return carService.update(form);
    }

    @DeleteMapping("/api/v1/cars")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteById(@RequestBody Car.PrimaryKey pk){
        carService.deleteById(pk);
    }
}
