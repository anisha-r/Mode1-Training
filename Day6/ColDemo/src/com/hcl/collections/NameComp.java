package com.hcl.collections;

import java.util.Comparator;

public class NameComp implements Comparator<Student>{

	@Override
	public int compare(Student s1, Student s2) {
		return s1.city.compareTo(s2.city);
	}

	
}


