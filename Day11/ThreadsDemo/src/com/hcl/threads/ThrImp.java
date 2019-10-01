package com.hcl.threads;

import java.util.ArrayList;
import java.util.List;

class ListDemo implements Runnable {
	@Override
	public void run() {
		List lstData = new ArrayList();
		lstData.add("jaanu");
		lstData.add("anu");
		lstData.add("anisha");
		lstData.add("nisha");
		lstData.add("achu");
		lstData.add("ammaa");
		for (Object object : lstData) {
			System.out.println(object);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
		}
		
	}
}
class LinkDemo implements Runnable {
	@Override
	public void run() {
		List lstData = new ArrayList();
		lstData.add("jaanu");
		lstData.add("anu");
		lstData.add("anisha");
		lstData.add("nisha");
		lstData.add("achu");
		lstData.add("ammaa");
		for (Object object : lstData) {
			System.out.println("Linked list" +object);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
		}
		
	}
}
class VectorDemo implements Runnable {
	@Override
	public void run() {
		List lstData = new ArrayList();
		lstData.add("jaanu");
		lstData.add("anu");
		lstData.add("anisha");
		lstData.add("nisha");
		lstData.add("achu");
		lstData.add("ammaa");
		for (Object object : lstData) {
			System.out.println("Vector" +object);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
		}
		
	}
}

public class ThrImp {
	public static void main(String[] args) {
		Thread t1 = new Thread(new ListDemo());
		Thread t2 = new Thread(new LinkDemo());
		Thread t3 = new Thread(new VectorDemo());
		
		t1.start();
		t2.start();
		t3.start();
	}

}
