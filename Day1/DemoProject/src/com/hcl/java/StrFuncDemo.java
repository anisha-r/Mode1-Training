package com.hcl.java;

public class StrFuncDemo {
	public static void main(String[] args) {
		String str="Welcome to Java Programming..";
		System.out.println("length of the string " +str.length());
		System.out.println("5th position "  +str.charAt(5));
		System.out.println("Index of a is " +str.indexOf('a'));
		System.out.println("Last occurence of a is " +str.lastIndexOf('a'));
		System.out.println("substring " +str.substring(3,9));
		
		String s1="hello",s2="hello";
		System.out.println(s1.equals(s2));
		
		String s3="program",s4="java";
		System.out.println(s3.compareTo(s4));
		
	}

}
