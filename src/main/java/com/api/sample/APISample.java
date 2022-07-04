package com.api.sample;

import javax.jws.WebMethod;
import javax.jws.WebService;
import org.apache.log4j.Logger;

@WebService
public class APISample {

	private static final Logger LOGGER = Logger.getLogger(APISample.class);
	
	@WebMethod
	public String HelloMyName(String name) {
		
		LOGGER.info("Initializing ExampleLog4j application : "+name);
		LOGGER.error("Error ExampleLog4j application : "+name);
		LOGGER.warn("Warning ExampleLog4j application : "+name);
		
		return "Hello "+name;
	}
	
}
