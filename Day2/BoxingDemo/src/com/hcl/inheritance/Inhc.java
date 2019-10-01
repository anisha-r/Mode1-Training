package com.hcl.inheritance;


class First{
        private int a = 5;
      
	public First() {
		System.out.println("base class constructor");
	}
	
}
class Second extends First{
	static {
		System.out.println("derived class static");
	}
	public Second() {
		System.out.println("Derived class constructor");
	}
}

public class Inhc {
	public static void main(String[] args) {
		new Second();
	}

}

