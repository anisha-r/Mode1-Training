package com.hcl.boxing;

public class BoxEmploy {
	
	public void show(Object ob) {
		Employ e=(Employ)ob;
		System.out.println(e);
	}
	
	public static void main(String[] args) {
		Employ objEmploy=new Employ();
		objEmploy.empno=1;
		objEmploy.name="Nagindra";
		objEmploy.basic=85434;
		
		new BoxEmploy().show(objEmploy);
		
	}

}
