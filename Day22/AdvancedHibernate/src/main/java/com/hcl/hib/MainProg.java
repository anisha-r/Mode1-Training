package com.hcl.hib;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;

public class MainProg {
	
	public static void main(String[] args) {
		Configuration cfg=new AnnotationConfiguration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sf=cfg.buildSessionFactory();
		Session s=sf.openSession();
		Query q=s.createQuery("from Employ");
		q.setFirstResult(0);
		q.setMaxResults(10);
	//	List list=q.list();
		
		
		List<Employ> lstEmploy=q.list();
//		Criteria c = s.createCriteria(Employ.class);
//		c.add(Restrictions.gt("basic", 60000));
//		List list1=c.list();
//		Criteria c1=s.createCriteria(Employ.class);
//		c1.addOrder(Order.asc("basic"));
//		List list=c1.list();
		Criteria c=s.createCriteria(Employ.class);
		c.setProjection(Projections.property("dept"));
		List<String> list=c.list();
		for (String e: list) {
		//Employ employ=(Employ)e;
			// System.out.println("Empno " +employ.getEmpno());
			System.out.println("Dept " +e);
//			System.out.println("Dept "+employ.getDept());
//			System.out.println("Desig "+employ.getDesig());
//			System.out.println("Salary "+employ.getBasic());
//			System.out.println("-------------");
//		}
//		for (Employ employ : lstEmploy) {
//			System.out.println("Empno " +employ.getEmpno());
//			System.out.println("Name " +employ.getName());
//			System.out.println("Dept "+employ.getDept());
//			System.out.println("Desig "+employ.getDesig());
//			System.out.println("Salary "+employ.getBasic());
//			System.out.println("-------------");
//		}
	}

	}
}
