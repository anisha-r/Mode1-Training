package com.anisha;

import java.rmi.RemoteException;

import com.jaanu.CalculatorProxy;
import com.jaanu.JananiDemoProxy;
import com.jehanat.SapCodeProxy;

public class MainApp {
	
	public static void main(String[] args) {
		
		int  result1=0;
		int  result2=0;
		int res=0;
		
		AnishaProxy ani = new AnishaProxy();
		SapCodeProxy ani1 = new SapCodeProxy();
	 CalculatorProxy ani2 = new CalculatorProxy();
		
		
		
		
		try {
			result1= ani.getInt();
			System.out.println("Anisha details " +result1);
			result2= ani1.getInt();
			System.out.println("Jehanat details " +result2);
			res=ani2.add(result1, result2);
			System.out.println("Janani details " +res);
			
			
		} catch (RemoteException e) {
			e.printStackTrace();
		}
		
		
		
	}

}
