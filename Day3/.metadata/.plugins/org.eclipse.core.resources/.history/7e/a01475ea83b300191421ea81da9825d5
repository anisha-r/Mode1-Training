package com.hcl.quiz;

class Employ {
	String name;
	public Employ(String name) {
		this.name=name;
		
	}
	@Override
	public String toString() {
		return "Employ [name=" + name + "]";
	}
	
}
class HrEmploy extends Employ {
	public HrEmploy(String name) {
		super(name);
	}
}
class JavaEmploy extends Employ {
	public JavaEmploy(String name) {
		super(name);
	}
}
public class Quiz3 {
	public static void main(String[] args) {
		Employ[] arrEmploy= new Employ[]
				{
						new HrEmploy("Sagar"),
						new JavaEmploy("Niveditha"),
						new HrEmploy("Lakshmi"),
						new JavaEmploy("Gupta"),
						new HrEmploy("Pramod"),
						new JavaEmploy("Sakshi"),
						new HrEmploy("Kavin"),
						new JavaEmploy("Safid"),
						new JavaEmploy("Sajid"),
						
				};
		for (Employ employ : arrEmploy) {
			if(employ instanceof JavaEmploy) {
				System.out.println(employ);
			}
			
		}
	}
}
