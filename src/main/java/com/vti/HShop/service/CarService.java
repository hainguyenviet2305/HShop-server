package com.vti.HShop.service;

import com.vti.HShop.dto.CarDto;
import com.vti.HShop.entity.Car;
import com.vti.HShop.form.CarCreateForm;
import com.vti.HShop.form.CarUpdateForm;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface CarService {
    Page<CarDto> findAll(Pageable pageable);

    CarDto create(CarCreateForm form);

    CarDto update(CarUpdateForm form);

    void deleteById(Car.PrimaryKey pk);
}
