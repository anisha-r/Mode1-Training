package com.hcl.hib;


import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;

public class MainProg {
	
	public static void main(String[] args) {
		Configuration cfg=new AnnotationConfiguration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sf=cfg.buildSessionFactory();
		Session s=sf.openSession();
		Query q=s.createQuery("from Depart");
		List<Depart> lstdepart=q.list();
		for (Depart depart : lstdepart) {
			System.out.println("Deptno " +depart.getDeptno());
			System.out.println("Name " +depart.getDname());
			System.out.println("Location "+depart.getLoc());
			System.out.println("Head "+depart.getHead());
			System.out.println("-------------");
}
	}

}
