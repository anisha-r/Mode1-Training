package com.hcl.json;

import java.util.Scanner;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class JsonExample3 {
	public static void main(String args[]){ 
		JSONObject obj=new JSONObject();
		  for (int i = 0; i < 3; i++) {
			  JSONArray arr = new JSONArray();  
			  arr.add("anu"+i);
		      arr.add("sonoo");  
		      arr.add("anisha");
		      arr.add(25+i);
		      arr.add(1000*i);
		      arr.add(new Integer(27));    
		       arr.add(new Double(600000));   
		     obj.put(1, arr);
		}
		  System.out.print(obj);  
		  }  
}

		
		

