package com.hcl.collections;

import java.util.ArrayList;
import java.util.List;

public class ArrListDemo {
	
	public static void main(String[] args) {
		List lstNames = new ArrayList();
		lstNames.add("anubhav");
		lstNames.add("Vinod");
		lstNames.add("Prem");
		lstNames.add("Raghu");
		lstNames.add("Visalakshi");
		lstNames.add("Lakshmi");
		System.out.println("names are : ");
//		
       System.out.println("jdk 1.8");
       lstNames.forEach(System.out::println);
       /*edit */
       lstNames.set(2, "Prem Readdy");
       System.out.println("list after update");
       lstNames.forEach(System.out::println);
       System.out.println("list after removing index");
       lstNames.remove(0);
       lstNames.forEach(System.out::println);
       lstNames.remove("Lakshmi");
       System.out.println("list after removing by object");
       lstNames.forEach(System.out::println);
       
       
       System.out.println("4 th element" +lstNames.get(3));
       
		
	}

}
