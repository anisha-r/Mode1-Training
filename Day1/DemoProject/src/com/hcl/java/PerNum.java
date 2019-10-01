package com.hcl.java;

public class PerNum {
	
	public void check(int n) {
		int sum=0;
		for(int i=1;i<n;i++) {
			if(n%i==0) {
				sum+=i;
			}
		}
		if(sum==n) {
			System.out.println("Perfect No");
		} else {
			System.out.println("not a perfect number");
		}
	}
	public static void main(String[] args) {
		int n=28;
		new PerNum().check(n);
	}

}
