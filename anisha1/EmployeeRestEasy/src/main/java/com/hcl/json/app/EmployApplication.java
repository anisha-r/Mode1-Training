	package com.hcl.json.app;
	
	import java.util.HashSet;
	import java.util.Set;
	
	import javax.ws.rs.core.Application;

import com.hcl.json.service.EmployserviceImpl;
	
	public class EmployApplication extends Application {
	
	private Set<Object> singletons = new HashSet<Object>();
	
	public EmployApplication() {
	singletons.add(new EmployserviceImpl());
	}
	
	@Override
	public Set<Object> getSingletons() {
	return singletons;
	}
	
	}
	
