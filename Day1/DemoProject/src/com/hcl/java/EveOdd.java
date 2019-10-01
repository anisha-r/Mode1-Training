package com.hcl.java;

public class EveOdd {
	
	public void check(int n) {
		if(n%2==0) {
			System.out.println("Even Number");
		}else {
			System.out.println("Odd number");
		}
			
	}
	public static void main(String[] args) {
		int n = 6;
		new EveOdd().check(n);
		
	}

}
