package com.hcl.json.service;

	import java.util.HashMap;
import java.util.List;
import java.util.Map;
	import java.util.Set;

	import javax.ws.rs.Consumes;
	import javax.ws.rs.DELETE;
	import javax.ws.rs.GET;
	import javax.ws.rs.POST;
	import javax.ws.rs.Path;
	import javax.ws.rs.PathParam;
	import javax.ws.rs.Produces;
	import javax.ws.rs.core.MediaType;
	import javax.ws.rs.core.Response;

import com.hcl.json.dao.EmployDaoInterfaceImpl;
import com.hcl.json.model.Employee;


	@Path("/employee")
	@Consumes(MediaType.APPLICATION_XML)
	@Produces(MediaType.APPLICATION_XML)
	public  class EmployserviceImpl implements EmployServiceInterface {

		EmployDaoInterfaceImpl employeeDAO=new EmployDaoInterfaceImpl();


		@GET
		@Path("/getAll")
		public Employee[] getAllEmployees() {
		List<Employee> ids = employeeDAO.getAllEmployees();
		Employee[] e = new Employee[ids.size()];
		int i=0;
		for(Employee id : ids){
		e[i] = (Employee)employeeDAO.getAllEmployees();
		i++;
		}
		return e;
		}

		}



