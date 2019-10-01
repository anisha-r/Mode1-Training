package com.hcl.inventory;

import static org.junit.Assert.*;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.junit.AfterClass;
import org.junit.Test;

public class InventoryTestCase {
	@Test 
	  public void testGenerateStock1() {
		Connection con=DaoConnection.getConnection();
		int orderid=0;
		String cmd="select case when max(orderid) is null then 1"
				+ " else max(orderid)+1 "
				+ "end orderid from orders";
		try {
			PreparedStatement pst=con.prepareStatement(cmd);
			
	 			ResultSet rs=pst.executeQuery();
	 			rs.next();
	 			orderid=rs.getInt("orderid");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	
		assertEquals(orderid, StockBAL.generateOrderIdBal());
	}
	@Test
	public void testAddStock() {
		Stock objStock = new Stock();
		String stockId = StockBAL.generateStockBal();
		objStock.setStockId(stockId);
		objStock.setItemName("mouse");
        objStock.setPrice(3000);
        objStock.setQuantityAvail(4);
        assertEquals(" stock created successfully...", StockBAL.createStockBal(objStock));
	}
	
	
	
	
	@Test
	
	public void testPlaceStock() {
		assertEquals("Order Placed Successfully...", StockBAL.placeStockBal("S001", 1));
		assertEquals("Insufficent Quantity...", StockBAL.placeStockBal("S001", 1989));
		assertEquals("StockID not found...", StockBAL.placeStockBal("D001", 5));
	}

	@Test
	public void testSetStock() {
		assertNotNull(StockBAL.setStockBal("S001"));
		assertNull(StockBAL.setStockBal("D000"));
	
	}
	
		
	@Test
	public void testDaoConnection() {
		assertNotNull(DaoConnection.getConnection());
	}
	@Test
	public void testGenerateStock() {
		Connection con=DaoConnection.getConnection();
		String stid=null;
		String cmd = "select max(stockId) sid from stock ";
		
		try {
			PreparedStatement pst = con.prepareStatement(cmd);
			ResultSet rs=pst.executeQuery();
			rs.next();
			stid=rs.getString("sid");
			int id = Integer.parseInt(stid.substring(1));
			id++;
			String formated = String.format("%03d", id);
			stid = "S"+formated;
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}	
		assertEquals(stid, StockBAL.generateStockBal());
	}
	
     @Test
 	public void testGettersAndSetters() {
    	 Stock objStock = new Stock();
    		objStock.setStockId("S001");
    		objStock.setItemName("top");
    		objStock.setPrice(500);
    		objStock.setQuantityAvail(3);
    		
    		
    		assertEquals("S001", objStock.getStockId());
    		assertEquals("top", objStock.getItemName());
    		assertEquals(500, objStock.getPrice());
    		assertEquals(3, objStock.getQuantityAvail());
    	 
     }
}
