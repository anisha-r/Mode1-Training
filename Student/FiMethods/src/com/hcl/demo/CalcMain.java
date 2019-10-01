package com.hcl.demo;

public class CalcMain {
	
	public static void main(String[] args) {
		
	
	
	Calculator c = new Calculator();
	Integer d=c.calc((a,b)->a%b, 10 , 5);
	System.out.println(d);
	}
}
