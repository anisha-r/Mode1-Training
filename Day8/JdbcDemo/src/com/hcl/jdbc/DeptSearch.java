package com.hcl.jdbc;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;


public class DeptSearch {
	public static void main(String[] args) {
		int deptno;
		System.out.println("Enter the Department no");
		Scanner sc = new Scanner(System.in);
		deptno=sc.nextInt();
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = 
DriverManager.getConnection("jdbc:mysql://localhost:3306/sqlpractice","root","root");
			String cmd = "select * from Dept where deptno=?";
			PreparedStatement pst = con.prepareStatement(cmd);
			pst.setInt(1, deptno);
			ResultSet rs = pst.executeQuery();
			if(rs.next()) {
				System.out.println("Dapartment  no " +rs.getInt("deptno"));
				System.out.println("Department name" +rs.getString("dname"));
				System.out.println("Location name" +rs.getString("loc"));
				
			} else {
				System.out.println("Record not found....");
			}
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

