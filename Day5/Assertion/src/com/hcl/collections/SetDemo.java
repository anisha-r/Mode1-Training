package com.hcl.collections;


import java.util.LinkedHashSet;
import java.util.Set;

public class SetDemo {
	public static void main(String[] args) {
		
		Set  s = new LinkedHashSet();
		s.add("vinod");
		s.add("hema");
		s.add("keerthana");
		s.add("Raghu");
		s.add("Anubhav");
		
		
		s.add("vinod");
		s.add("hema");
		s.add("keerthana");
		s.add("Raghu");
		s.add("Anubhav");
		s.add("vinod");
		s.add("hema");
		s.add("keerthana");
		s.add("Raghu");
		s.add("Anubhav");
		s.add("vinod");
		s.add("hema");
		s.add("keerthana");
		s.add("Raghu");
		s.add("Anubhav");
		System.out.println("Hashset Data");
		
		s.forEach(System.out::println);
		
		
		
		
		
	}

}
