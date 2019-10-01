package com.anisha.sample.java8;

public class MyinterfaceImpl implements Default {
	public static void main(String[] args) {
		new MyinterfaceImpl().printHello();
		Default.hello();
	}
}