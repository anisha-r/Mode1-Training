package com.hcl.intf;

interface IFirst {
	default void name() {
		System.out.println("Name from IFirst..");
	}
}
interface ISecond {
	default void name() {
		System.out.println("Name fron ISecond");
	}

}
interface IThird {
	default void name() {
		System.out.println("Name from IThird");
	}
}

class Demo implements IFirst,ISecond,IThird {

	@Override
	public void name() {
		IFirst.super.name();
		ISecond.super.name();
		IThird.super.name();
		
		
	}
	
}

public class IntfTest {
	public static void main(String[] args) {
		new Demo().name();
	}

}
	