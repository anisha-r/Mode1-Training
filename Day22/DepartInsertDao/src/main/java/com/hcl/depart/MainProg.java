package com.hcl.depart;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class MainProg {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("jdbc.xml");
		DepartInsertDao d=(DepartInsertDao)ctx.getBean("myDao");
		d.insertdepart();
		System.out.println("Record Inserted ");
	}
		
	}


