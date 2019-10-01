package com.hcl.inventory;

public class PlaceOrder {
	private String stockId;
	private int qtyOrd;
	public String getStockId() {
		return stockId;
	}
	public void setStockId(String stockId) {
		this.stockId = stockId;
	}
	public int getQtyOrd() {
		return qtyOrd;
	}
	public void setQtyOrd(int qtyOrd) {
		this.qtyOrd = qtyOrd;
	}
	public String placeStock() {
		return StockBAL.placeStockBal(stockId, qtyOrd);
	}

}
