package com.hcl.boxing;

public class StudentTest {
	public static void main(String[] args) {
		Student e1=new Student();
		e1.sno=1;
		e1.name="Yash";
		e1.city="cbe";
		
		Student e2=new Student();
		e2.sno=1;
		e2.name="Yash";
		e2.city="cbe";
		
		System.out.println(e1==e2);
		System.out.println(e1.equals(e2));
		

}
}
