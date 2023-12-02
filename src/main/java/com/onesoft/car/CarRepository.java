package com.onesoft.car;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;


public interface CarRepository extends JpaRepository<Car, Integer> {
	
	@Query(value="select * from car_details where price < ?", nativeQuery = true)
	List<Car> getPrice(int p);
	
	

	

}
