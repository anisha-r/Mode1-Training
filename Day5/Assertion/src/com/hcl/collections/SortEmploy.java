package com.hcl.collections;

import java.util.Comparator;
import java.util.SortedSet;
import java.util.TreeSet;

public class SortEmploy {
	
	public static void main(String[] args) {
		Comparator c = new BasicComparator();
		SortedSet s = new TreeSet(c);
		s.add(new Employ(1, "hema", 563455));
		s.add(new Employ(2, "Anisha", 563456));
		s.add(new Employ(3, "Anubhav", 563475));
		s.add(new Employ(4, "janu", 573455));
		System.out.println("sorted data");
		s.forEach(System.out::println);
	}

}
