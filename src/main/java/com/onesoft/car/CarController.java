package com.onesoft.car;

import java.util.List;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;





@RestController
@RequestMapping(value="/admin")
public class CarController {
	@Autowired
	CarService cs;
	static Logger log = Logger.getLogger(CarController.class);
	
	@PostMapping(value="/post")
	public String setPost(@RequestBody List <Car> c) {
		PropertyConfigurator.configure("log4j.properties");
		log.info(cs.setPost(c));
		return cs.setPost(c);
	}
	
	@GetMapping(value="/get")
	public Car setMin() {
		PropertyConfigurator.configure("log4j.properties");
		log.info(cs.setMin());
		return cs.setMin();
	}
	
	@GetMapping(value="/price/{p}")
	public List <Car> setPrice(@PathVariable int p) throws PriceNotFound{
		return cs.setPrice(p);
	}

}
