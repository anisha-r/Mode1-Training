package com.hcl.collections;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {
	
	public static void main(String[] args) {
		 
		Map m = new HashMap();
		m.put("priya", "darshini");
		m.put("anisha", "ravi");
		m.put("rishab", "hcl");
		m.put("priya", "lakshmii");
		
		String key = "priya";
		String value = (String)m.getOrDefault(key, "not found");
		System.out.println(value);
		
	}
}
