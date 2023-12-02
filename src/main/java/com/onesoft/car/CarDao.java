package com.onesoft.car;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class CarDao {
	@Autowired
	CarRepository cr;

	public String setPost(List<Car> c) {
		cr.saveAll(c);
		return "Posted";
	}

	public List<Car> getPrice() {
		return cr.findAll();
	}

	public List<Car> getPrice(int p) {
		return cr.getPrice(p);
	}

	
}
