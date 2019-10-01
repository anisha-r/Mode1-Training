package com.hcl.depart;

import java.util.Scanner;

import org.springframework.jdbc.core.JdbcTemplate;

public class DepartInsertDao {
	
	private JdbcTemplate jdbcTemplate;

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	public void insertdepart() {
		int deptno;
		String dname,loc,head;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the dept number");
		deptno=Integer.parseInt(sc.nextLine());
		System.out.println("enter the dept name");
		dname=sc.nextLine();
		System.out.println("enter the dept loc");
		loc=sc.nextLine();
	    System.out.println("enter the head");
	    head=sc.nextLine();
	    String cmd="insert into department values(?,?,?,?)";
	    jdbcTemplate.update(cmd, new Object[]
	    		{
	    			deptno,
	    			dname,
	    			loc,
	    			head
	    		});
		
	}
}
