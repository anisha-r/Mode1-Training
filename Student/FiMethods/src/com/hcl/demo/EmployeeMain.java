package com.hcl.demo;

public class EmployeeMain {
	public static void main(String[] args) {
		
		 FirstInterface e= Employee::new;
     	Employee emp=e.employee(20);
	   System.out.println(emp.getEmpNo());

		 SecondInterface e1 = Employee::new;
    	  Employee emp1=e1.employe("HCL");
	      System.out.println(emp1.getEmpName());		
		
	}

}
