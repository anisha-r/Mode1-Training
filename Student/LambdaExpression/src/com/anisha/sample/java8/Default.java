package com.anisha.sample.java8;

public interface Default {
	default void printHello(){
		System.out.println("Hello Default");
	}
	static void hello(){
		System.out.println("hello Static");
	}

}
