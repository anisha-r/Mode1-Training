package com.hcl.collections;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;


public class SortStudent {
	public static void main(String[] args) {
		Comparator<Student> s = new NameComp();
		Set<Student> setStudent = new TreeSet<Student>(s);
		setStudent.add(new Student("anisha", "giri", "coimbatore", 9));
		setStudent.add(new Student("janani", "velu", "coimbatore", 6));
		setStudent.add(new Student("hema", "shiva", "coimbatore", 7));
		setStudent.add(new Student("anuu", "achuu", "coimbatore", 8));
		setStudent.add(new Student("anisha", "giri", "coimbatore", 9));
		System.out.println("student list");
		setStudent.forEach(System.out::println);
		
		
	}
}           
