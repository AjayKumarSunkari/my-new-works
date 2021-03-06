package com.springboot.carz4u.service.RtoServices;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RtoServicesController {
	
	@Autowired
	RtoServicesRepository rtoServicesRepository;
	
	private static final Logger log = LoggerFactory.getLogger(RtoServicesController.class);
	
	@GetMapping("/rtoCharges/{carName}")
	public RtoCharges findByCarName(@PathVariable String carName){
		log.info("Start {} Class, findByCarName method.",log.getName());
		return rtoServicesRepository.findByCarName(carName);
	}

}
