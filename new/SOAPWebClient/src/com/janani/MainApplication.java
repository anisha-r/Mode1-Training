package com.janani;

import java.rmi.RemoteException;

public class MainApplication {
	
	public static void main(String[] args) {
		
		String result;
		
		
		JananiProxy jan = new JananiProxy();
		
		try {
			result= jan.getName();
			System.out.println("Janani details " +result);
		} catch (RemoteException e) {
			e.printStackTrace();
		}
		
		
		
	}

}
