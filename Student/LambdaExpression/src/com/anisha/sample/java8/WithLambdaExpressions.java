package com.anisha.sample.java8;

public class WithLambdaExpressions {
	
	public static void main(String[] args) {
		MyInterface myInterface=(var1, var2)->(var1 + var2);
		int result1=myInterface.addTwoNumbers(10, 20);
		System.out.println(result1);
//		
//		MyInterface myInterfac1=(var1, var2)->{return(var1 + var2); };
//		int result2 = myInterfac1.addTwoNumbers(30, 40);
//		System.out.println(result2);
//		
		
	}
}
