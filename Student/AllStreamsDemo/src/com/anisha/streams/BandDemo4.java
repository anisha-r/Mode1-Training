package com.anisha.streams;

import java.util.ArrayList;
import java.util.List;

public class BandDemo4 {
	public static void main(String[] args) {
		List<Employee> list=new ArrayList<Employee>();
		list.add(new Employee(10,"Apple",1010f,'E'));
		list.add(new Employee(30,"Mango",4010,'M'));
		list.add(new Employee(40,"Carrot",2000,'M'));
		list.add(new Employee(30,"Pomo",1000,'C'));
		list.add(new Employee(30,"Guava",1500,'M'));
		Long noOfRecords=list.stream().count();
		System.out.println(noOfRecords);
      // Long empSalGt3000 =list.stream().filter((var)->var.getSalary() > 3000).count();
      // System.out.println(empSalGt3000);
       Long empSal3000 =list.stream().filter((var)->var.getSalary()> 3000 && var.getBand()=='M').count();
       System.out.println(empSal3000);
       Long e3000 =list.stream().filter((var)->var.getSalary()< 3000 && var.getSalary() > 
       1500 && var.getBand()=='M').count();
       System.out.println(e3000);
       
       
       

		}


}
