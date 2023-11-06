package com.vti.HShop.repository;

import com.vti.HShop.entity.Car;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarRepository extends JpaRepository<Car, Car.PrimaryKey> {
}
