package com.hcl.collections;

import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;

public class MapGenDemo {
	
	public static void main(String[] args) {
		Map<Integer, String> m= new Hashtable<Integer,String>();
		m.put(1, "Darshan");
		m.put(2, "Vinod");
		m.put(2, "anisha");
		m.put(2, "janani");
		m.put(2, "priya");
		m.put(2, "hema1");
		
		int key;
		String result;
		System.out.println("Enter key ");
		Scanner sc = new Scanner(System.in);
		key = sc.nextInt();
		result = m.getOrDefault(key, "not found");
		System.out.println(result);
	}

}
