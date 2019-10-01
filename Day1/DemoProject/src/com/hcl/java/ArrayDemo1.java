package com.hcl.java;

public class ArrayDemo1 {
	
	public static void main(String[] args) {
		
		int[] a=new int[]{1,2,3,4,45};
		System.out.println("elements of array ");
		
//		for(int i=0;i<a.length;i++) {
//			System.out.println(a[i]);
//		}
		for (int i : a) {
			System.out.println(i);
			
		}
		
	}

}
