package com.hcl.name;

import java.rmi.RemoteException;

public class MainApp {
	
	public static void main(String[] args) {
	
	HelloWorldProxy hel= new HelloWorldProxy();
	String res;

	try {
		res=hel.sayHelloWorld("");
		System.out.println(res);
	} catch (RemoteException e) {
		e.printStackTrace();
	}
	
}
}
