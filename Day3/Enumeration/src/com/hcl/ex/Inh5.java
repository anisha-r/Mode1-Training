package com.hcl.ex;

class Sc1 {
	int a,b;
	public Sc1() {
		a=5;
		b=8;
	}
	@Override
	public final String toString() {
		return "A is " +a+ "B is " +b;
		
	}
	
	
	
}
class Sc extends Sc1 {
	public Sc(int a,int b) {                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           
		
	}
}
public class Inh5 {
	public static void main(String[] args) {
		Sc obj = new Sc(12,5);
		System.out.println(obj);
	}

}
