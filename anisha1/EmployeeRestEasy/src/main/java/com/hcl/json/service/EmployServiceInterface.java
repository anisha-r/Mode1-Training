package com.hcl.json.service;

import javax.ws.rs.core.Response;

import com.hcl.json.model.Employee;

public interface EmployServiceInterface {
	
	public Employee[] getAllEmployees();

}
