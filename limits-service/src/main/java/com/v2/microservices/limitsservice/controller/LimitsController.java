package com.v2.microservices.limitsservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.v2.microservices.limitsservice.bean.Limits;
import com.v2.microservices.limitsservice.configuration.Configuration;

@RestController
public class LimitsController {
	

	@Autowired
	private Configuration config;
	
	@GetMapping("/limits")
	public Limits retrieveLimits() {
		//return new Limits(1,100);
		return new Limits(config.getMinimum(),config.getMaximun());
	}

}
