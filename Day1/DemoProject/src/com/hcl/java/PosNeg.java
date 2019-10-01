package com.hcl.java;

public class PosNeg {
	public void check(int n) {
		if(n>=0) {
			System.out.println("Positive Number");
		
		}else {
			System.out.println("Negative Numbver");
		}
	}
	public static void main(String[] args) {
		int n = -35;
		PosNeg obj=new PosNeg();
		obj.check(n);
	}

}
