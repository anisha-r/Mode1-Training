package com.hcl.depart;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainDepartSearch {
	public static void main(String[] args) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("jdbc.xml");
		   DepartQueryDao d =(DepartQueryDao)ctx.getBean("myDao");
		   d.searchDepart(1);
	}


}
 