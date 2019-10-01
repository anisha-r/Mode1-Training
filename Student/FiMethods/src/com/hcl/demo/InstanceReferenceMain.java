package com.hcl.demo;

public class InstanceReferenceMain {
	
	public static void main(String[] args) {
		
		InstanceInterface i= () -> {
			System.out.println("Welcome");
		};
		i.myInterface();
		InstanceMethodInterface i1=new InstanceMethodInterface();
		InstanceInterface i2=i1::saySomething;
		i2.myInterface();
	}

}
