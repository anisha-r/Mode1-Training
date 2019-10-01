package com.hcl.collections;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class SortEmploy {
	public static void main(String[] args) {
		Comparator<Employ> c = new NameComparator();
		Set<Employ> setEmploy = new TreeSet<Employ>(c);
		setEmploy.add(new Employ(1, "divya", 67333));
		setEmploy.add(new Employ(2, "anisha giri", 67343));
		setEmploy.add(new Employ(3, "janani", 67353));
		setEmploy.add(new Employ(4, "priya", 67336));
		setEmploy.add(new Employ(5, "hema siva", 67337));
		setEmploy.add(new Employ(6, "dharshini", 68333));
		System.out.println("employ list");
		setEmploy.forEach(System.out::println);
		
	}

}
