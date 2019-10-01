package com.hcl.inventory;

public class CreateStock {
	private String stockId;
	private String itemName;
	private int price;
	private int quantityAvail;
	public String getStockId() {
		return stockId;
	}
	public void setStockId(String stockId) {
		this.stockId = stockId;
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getQuantityAvail() {
		return quantityAvail;
	}
	public void setQuantityAvail(int quantityAvail) {
		this.quantityAvail = quantityAvail;
	}
	public String createStock() {
		Stock objStock = new Stock();
		String stockId=StockBAL.generateStockBal();
		objStock.setStockId(stockId);
		objStock.setItemName(itemName);
		objStock.setPrice(price);
		objStock.setQuantityAvail(quantityAvail);
		return StockBAL.createStockBal(objStock);
	}

}
