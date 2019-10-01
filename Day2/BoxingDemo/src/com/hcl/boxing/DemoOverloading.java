package com.hcl.boxing;

public class DemoOverloading {
	
	public void show(int x) {
		System.out.println(" show method w.r.t Int" +x);
	}
	public void show(String x) {
		System.out.println(" show method w.r.t String" +x);
	}
	public void show(double x) {
		System.out.println(" show method w.r.t Double" +x);
	}
	public void show(boolean x) {
		System.out.println(" show method w.r.t Boolean" +x);
	}
	public static void main(String[] args) {
		
	
	DemoOverloading obj=new DemoOverloading();
	obj.show(12);
	obj.show(true);
	obj.show(12.5);;
	obj.show("HCL");
	
	}	
}
