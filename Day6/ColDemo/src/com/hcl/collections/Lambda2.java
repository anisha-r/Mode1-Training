package com.hcl.collections; 

@FunctionalInterface
interface IHello {
	
	void sayHello();
	
}
@FunctionalInterface
interface ICalc {
	int calc(int a,int b);
}

public interface Lambda2 {
	
	public static void main(String[] args) {
		IHello h1 = () -> {
			System.out.println("hello from anisha...");
		};
		IHello h2 = () -> {
			System.out.println("hello from giri");
			
		};
		IHello h3 = () -> {
			System.out.println("hello from anuu");
		};
		
		IHello[] arr = new IHello[]{h1,h2,h3};
		for (IHello iHello : arr) {
			iHello.sayHello();
		}
		ICalc ad1 = (a,b) -> {
			System.out.println("sum ");
			return a+b;
		};
		ICalc ad2 = (a,b) -> (a-b);
		ICalc ad3 = (a,b) -> (a*b);
		System.out.println(ad1.calc(12, 5));
		System.out.println(ad2.calc(5, 3));
		System.out.println(ad3.calc(66, 77));
		
//		h1.sayHello();
//		h2.sayHello();
//		h3.sayHello();
	}
	

}
