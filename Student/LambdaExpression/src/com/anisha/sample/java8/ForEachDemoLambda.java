package com.anisha.sample.java8;

import java.util.ArrayList;
import java.util.List;

public class ForEachDemoLambda {
	
	public static void main(String[] args) {
		List<String> list=new ArrayList<String>();
		list.add("One");
		list.add("two");
		list.add("three");
		list.add("Four");
		list.forEach((var) -> System.out.println(var));;
	
	}

}
