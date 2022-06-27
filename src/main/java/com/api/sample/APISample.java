package com.api.sample;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public class APISample {

	@WebMethod
	public String HelloMyName(String name) {
		
		return "Hello "+name;
	}
	
}
