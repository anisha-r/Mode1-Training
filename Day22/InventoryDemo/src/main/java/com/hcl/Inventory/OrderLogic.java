package com.hcl.Inventory;

import java.util.List;

public class OrderLogic {
	
	private List items;

	public List getItems() {
		return items;
	}

	public void setItems(List items) {
		this.items = items;
	}
	public void display() {
		for(int i=0;i<items.size();i++) {
			Order c=(Order)items.get(i);
			c.display();
	int value=c.getQtyord()-c.getObjProduct().getQunanitityavail();
	if(!(value>=0)) {
		System.out.println("Total Amount=" +(c.getObjProduct().getPrice()*c.getQtyord()));
	}
		else {
			System.out.println("Insufficient Products");
	}
		}
	}

}
