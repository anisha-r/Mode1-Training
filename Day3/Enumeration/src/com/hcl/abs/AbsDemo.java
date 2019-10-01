package com.hcl.abs;

abstract class Training {
	abstract void name();
	abstract void email();
}

class Anubhav extends Training {

	@Override
	void name() {
		System.out.println("Name is Anubhav");
	
		
	}

	@Override
	void email() {
		
		System.out.println("Anubhavanand@gmail.com");
	
		
	}
	
	
}

class SaiKrishna extends Training {

	@Override
	void name() {
		System.out.println("Name is Saikrishna..");
		
	}

	@Override
	void email() {
		System.out.println("Email is SaiKrishna@gmail.com");
		
		
	}
	
}
public class AbsDemo {
	public static void main(String[] args) {
		Training[] arr=new Training[]
				{
						new Anubhav(),
						new SaiKrishna()
				};
		for (Training t : arr) {
			t.name();
			t.email();
			
		}

	}

}
