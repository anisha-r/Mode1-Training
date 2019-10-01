package com.anisha.streams;

import java.util.ArrayList;
import java.util.List;

public class CountDemo3 {
	public static void main(String[] args) {
		List<Employee> list=new ArrayList<Employee>();
		list.add(new Employee(10,"Apple",1010f,'E'));
		list.add(new Employee(30,"Mango",4010,'M'));
		list.add(new Employee(40,"Carrot",100,'M'));
		list.add(new Employee(30,"Pomo",100,'C'));
		list.add(new Employee(30,"Guava",10,'M'));
		Long noOfRecords=list.stream().count();
		System.out.println(noOfRecords);
		
       Long empSalGt3000 =list.stream().filter((var)->var.getSalary() > 3000).count();
       System.out.println(empSalGt3000);
		}


}
