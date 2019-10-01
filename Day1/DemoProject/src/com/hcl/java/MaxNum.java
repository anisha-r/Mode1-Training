package com.hcl.java;

public class MaxNum {
	public void check(int a,int b, int c) {
		if(a>b&&a>c) {
			System.out.println("a is great");
		} else if (b>c) {
			System.out.println("b is great");
		} else {
			System.out.println("c ic great");
		}
	}
     public static void main(String[] args) {
		int a=10,b=5,c=6;
		MaxNum obj=new MaxNum();
		obj.check(a, b, c);
	}
}
