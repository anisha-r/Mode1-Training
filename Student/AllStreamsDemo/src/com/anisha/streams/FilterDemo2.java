package com.anisha.streams;

import java.util.ArrayList;
import java.util.List;

public class FilterDemo2 {
	public static void main(String[] args) {
		List<Employee> list=new ArrayList<Employee>();
		list.add(new Employee(10,"Apple",1010f,'E'));
		list.add(new Employee(30,"Mango",1010,'M'));
		list.add(new Employee(40,"Carrot",100,'M'));
		list.add(new Employee(30,"Pomo",10,'C'));
		list.add(new Employee(30,"Guava",10,'M'));
		
		list.stream().filter((emp)-> emp.getBand()==('M'))
		.forEach((arg)->{System.out.println(arg.getEmpName());});
		
		}
	}
