package com.hcl.Inventory;

public class Product {
	 
	private String product;
	private int qunanitityavail;
	private int price;
	public String getProduct() {
		return product;
	}
	public void setProduct(String product) {
		this.product = product;
	}
	public int getQunanitityavail() {
		return qunanitityavail;
	}
	public void setQunanitityavail(int qunanitityavail) {
		this.qunanitityavail = qunanitityavail;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public void product() {
		System.out.println("product: " +product+ " Quantity Available :"+qunanitityavail+"price :"+price);
	}

}
