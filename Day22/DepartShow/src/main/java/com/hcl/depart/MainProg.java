package com.hcl.depart;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class MainProg {

		public static void main(String[] args) {
			ApplicationContext ctx=new ClassPathXmlApplicationContext("jdbc.xml");
			DepartQueryDao d = (DepartQueryDao)ctx.getBean("myDao");
			d.showDepart();
		}
		

}
