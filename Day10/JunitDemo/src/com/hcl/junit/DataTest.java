package com.hcl.junit;

import static org.junit.Assert.*;

import org.junit.Test;

public class DataTest {
	
	@Test(expected=NullPointerException.class)
	public void testNullEx() {
		Data obj=null;
		assertEquals(5, obj.sum(2,3));
	}
	
	@Test
	public void testDiv() {
		Data objData = new Data();
		assertEquals(2, objData.div(5, 2));
	
		
	}
	@Test(expected=ArithmeticException.class)
	public void testDivEx() {
		Data obj = new Data();
		obj.div(5,0);
	}
	
	
	@Test
	public void testGetPropertyTest() {
		Data objData = new Data();
		assertNotNull(objData.getPropertyTest("bhargav"));
		assertNull(objData.getPropertyTest("tushar"));
		
		
	}
	
	@Test
	public void testEven() {
		Data objData = new Data();
//		int a = 13;
//		assertTrue(true);
		assertTrue(objData.even(10));
		assertFalse(objData.even(11));
	}
	
	@Test
	public void testMinArray() {
		Data objData = new Data();
		int[] a = new int[]{1,2,3,4,5};
		
		int[] a1 = new int[]{11,2,3,4,1};
		
		
		assertEquals(1, objData.minArray(a1));
	}
	@Test 
	public void testMax3() {
		Data objData = new Data();
		assertEquals(5, objData.max3(5, 1, 3));

		assertEquals(5, objData.max3(1, 5, 3));

		assertEquals(5, objData.max3(1, 3, 5));
		
		
	}
	
	@Test
	public void testSum() {
		Data objData = new Data();
		assertEquals(4, objData.sum(2, 2));
		assertEquals(4, objData.sum(1, 3));
		
	}

	@Test
	public void testSayHello() {
		Data objData = new Data();
		assertEquals("welcome to Junit", objData.sayHello());
	}

}
