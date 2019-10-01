package com.hcl.inventory;

import java.util.Scanner;


public class SetStockMain {
	
	public static void main(String[] args) {
		String stockId;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter stockId");
		stockId=sc.nextLine();
		Stock objStock = StockBAL.setStockBal(stockId);
		if(objStock!=null) {
			System.out.println("ItemName "
					+objStock.getItemName());
			System.out.println("Price "
					+objStock.getPrice());
			System.out.println("QuantityAvail "
					+objStock.getQuantityAvail());
	}else {
		System.out.println("stockId not found");
	}
		
	}

}
