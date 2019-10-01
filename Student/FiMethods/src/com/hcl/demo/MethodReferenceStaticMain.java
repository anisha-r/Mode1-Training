package com.hcl.demo;

public class MethodReferenceStaticMain {
	
	public static void main(String[] args) {
		
		MethodReferenceStatic s=(a)->{return "Welcome" +a;};
		System.out.println(s.sayHello(22));
		
		MethodReferenceStatic s1=MethodReferenceStatic::someMethod;
		System.out.println(s1.sayHello(44));
	}

}
