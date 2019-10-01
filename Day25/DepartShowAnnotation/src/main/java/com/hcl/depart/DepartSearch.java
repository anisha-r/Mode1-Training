package com.hcl.depart;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;

public class DepartSearch {
	
	public static void main(String[] args) {
		int deptno=1;
		Configuration cfg=new AnnotationConfiguration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sf=cfg.buildSessionFactory();
		Session s=sf.openSession();
		Query q=s.createQuery("from Department where deptno=" +deptno);
		List<Depart> lstDepart = q.list();
		Depart e=lstDepart.get(0);
		if(e!=null) {
			System.out.println("Deptno " +e.getDeptno());
			System.out.println("Name " +e.getDname());
			System.out.println("Location "+e.getLoc());
			System.out.println("Head "+e.getHead());
			System.out.println("-------------");
		}else {
			System.out.println("record not found");
		}
	}

}
