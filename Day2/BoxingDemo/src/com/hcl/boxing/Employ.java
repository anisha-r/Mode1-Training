package com.hcl.boxing;

public class Employ {
	int empno;
	String name;
	double basic;
	
	
	
	@Override
	public String toString() {
		return "employ [empno=" + empno + ", name=" + name + ", basic=" + basic + "]";
	}



	


	@Override
	public boolean equals(Object obj) {
		 Employ e= (Employ)obj;
		 if(e.basic==basic) {
			 return true;
		 } else {
			 return false;
		 }



	}
}

