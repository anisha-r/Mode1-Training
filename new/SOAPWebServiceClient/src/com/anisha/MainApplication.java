package com.anisha;

import java.rmi.RemoteException;

public class MainApplication {
	
	public static void main(String[] args) {
		
		int result=0;

		CalculatorProxy calculatorProxy= new CalculatorProxy();
		
		try {
			result= calculatorProxy.add(2, 10);
			System.out.println("Add of two numbers:" +result);
			result= calculatorProxy.mul(2, 10);
			System.out.println("Multiplication of two numbers:" +result);
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
