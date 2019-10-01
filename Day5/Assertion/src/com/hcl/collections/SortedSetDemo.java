package com.hcl.collections;

import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetDemo {
	public static void main(String[] args) {
		SortedSet s = new TreeSet();
		s.add("Visalakshi");
		s.add("Lakshmi");
		s.add("Hema");
		s.add("Keerthana");
		s.add("Raghu");
		s.add("Anubhav");
		System.out.println("Sorted data ");
		s.forEach(System.out::println);
		
		
		
	}

}
