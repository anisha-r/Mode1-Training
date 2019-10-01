package com.hcl.employ;

import java.util.Scanner;
import java.util.Iterator;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;
public class EmployInsertMain {
	public static void main(String[] args) {
		Employ e=new Employ();
		Scanner sc=new Scanner(System.in);
		Configuration cfg= new AnnotationConfiguration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sf=cfg.buildSessionFactory();
		Session s=sf.openSession();
		int empno=0;
		Query q=s.createQuery("SELECT max(empno) from Employ");
		for(Iterator it =q.iterate();it.hasNext(); ) {
			empno=(Integer)it.next();
		}
		empno++;
		System.out.println(empno);
		Transaction tx=s.beginTransaction();
		Employ e1 = new Employ();
		try {
			e1.setEmpno(empno);
			e1.setName("Anisha");
			e1.setDept("Java");
			e1.setDesig("Software");
			e1.setBasic(12345);
			s.save(e1);
			tx.commit();
			System.out.println("records Inserted");
		} catch (Exception e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}
		
	}


}
