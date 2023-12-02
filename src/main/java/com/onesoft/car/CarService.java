package com.onesoft.car;

import java.util.Comparator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class CarService {
	@Autowired
	CarDao cd;
	public String setPost(List<Car> c) {
		return cd.setPost(c);
	}
	public Car setMin() {
		List<Car>d=cd.getPrice();
		Car min = d.stream().min(Comparator.comparing(Car::getPrice)).get();
		return min;
	}
	public List<Car> setPrice(int p) throws PriceNotFound {
			List<Car> em = cd.getPrice(p);
			if(em.isEmpty()) {
				 throw new PriceNotFound ("Invalid Data");
			}
			else {
				return em;
			}
		
	}

}
