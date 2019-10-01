package com.hcl.depart;

import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;


public class DepartCrud {
	public String deleteDepart(int deptno){
		Depart res=searchDepart(deptno);	
	SessionFactory sf=HibernateUtil.getConnection();
		Session s=sf.openSession();
		Transaction t=s.beginTransaction();
		s.delete(res);
		t.commit();
		return "Record Deleted";
	}
	
	public String updateDepart(Depart d){
		Depart res=searchDepart(d.getDeptno());
		res.setDname(d.getDname());
		res.setLoc(d.getLoc());
		res.setHead(d.getHead());
		
		SessionFactory sf=HibernateUtil.getConnection();
		Session s=sf.openSession();
		Transaction t=s.beginTransaction();
		s.update(d);
		t.commit();
		return "Record Updated";
	}
	public List<Depart> showDepart() {
		SessionFactory sf=HibernateUtil.getConnection();
		Session s = sf.openSession();
		Query q=s.createQuery("from Department");
		List<Depart> lstDepart =q.list();
		return lstDepart;
	}
	public Depart searchDepart(int deptno) {
		SessionFactory sf=HibernateUtil.getConnection();
		Session s=sf.openSession();
		Query q=s.createQuery("from Department where deptno=" +deptno);
		List<Depart> lstDepart=q.list();
		Depart d=null;
		if(lstDepart.size()!=0) {
			d=lstDepart.get(0);
		}
		return d;
	}
	public String insertDepart(Depart depart) {
		SessionFactory sf=HibernateUtil.getConnection();
		Session s=sf.openSession();
		Transaction t=s.beginTransaction();
		s.save(depart);
		t.commit();
		return "Record Inserted";
	}
}