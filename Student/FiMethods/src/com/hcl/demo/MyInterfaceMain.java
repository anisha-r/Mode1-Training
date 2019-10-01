package com.hcl.demo;

import java.util.function.Consumer;

public class MyInterfaceMain {
	
	public static void main(String[] args) {
		
		MyInterface m=(a)->{System.out.println(a);};
		m.someMethod("HCL");
		
		MyInterface m1 = System.out::println;
		m.someMethod("Java CoE");
		
		Consumer<String> consumer = System.out::println;
		consumer.accept("Bye");
		
	}
	

}
