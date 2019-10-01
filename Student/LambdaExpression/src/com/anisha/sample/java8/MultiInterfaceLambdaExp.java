package com.anisha.sample.java8;


public class MultiInterfaceLambdaExp {
	
	public static void main(String[] args) {
		
		MultiInterface m = (name) -> (name + " World");
		System.out.println(m.sayHello("Helloo"));
		System.out.println(MultiInterface.add(1, 2));
		System.out.println(m.defaultMethod(10));
		MultiInterface m2=(name) -> (name + " World");
		System.out.println(m.equals(m2));
		
		
	}

}
