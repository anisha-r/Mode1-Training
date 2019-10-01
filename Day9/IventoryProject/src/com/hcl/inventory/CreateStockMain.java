package com.hcl.inventory;

import java.util.Scanner;



public class CreateStockMain {
	

		public static void main(String[] args) {
			String stockId=StockBAL.generateStockBal();
//			System.out.println(StockBAL.generateStockBal());
			String ItemName;
			int price,QuantityAvail;
			
//			System.out.println(accountno);
			Stock objStock = new Stock();
			objStock.setStockId(stockId);
			Scanner sc = new Scanner(System.in);

			
			System.out.println("enter the Itemname");
			objStock.setItemName(sc.nextLine());
			
			System.out.println("enter the price ");
			objStock.setPrice(Integer.parseInt(sc.nextLine()));
			
			System.out.println("enter the QuantityAvail");
			objStock.setQuantityAvail(Integer.parseInt(sc.nextLine()));
			
		
			System.out.println(StockBAL.createStockBal(objStock));
		
	}

}
