package com.hcl.inventory;

public class StockBAL {
	
	public static  int generateOrderIdBal() {
		return new StockDAO().generateOrderIdDao();
	}
	
	public static String placeStockBal(String stockId,int qtyOrd) {
		return new StockDAO().placeStockDao(stockId, qtyOrd);
	}

	public static Stock setStockBal(String stockId) {
		return new StockDAO().setStockDao(stockId);
	}
	
	public static String createStockBal(Stock objStock) {
		return new StockDAO().createStockDao(objStock);
	}
	public static  String generateStockBal() {
		return new StockDAO().generateStockDao();
		
	}
	


}
