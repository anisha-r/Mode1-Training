package com.hcl.boxing;

public class Student { 
	int sno;
	String name;
	String city;
	double cgp;
	@Override
	public String toString() {
		return "Student [sno=" + sno + ", name=" + name + ", city=" + city + ", cgp=" + cgp + "]";
	}
	
	@Override
	public boolean equals(Object obj) {
		 Student e= (Student)obj;
		 if(e.name==name) {
			 return true;
		 } else {
			 return false;
		 }
       
	}
	
	
      
}
