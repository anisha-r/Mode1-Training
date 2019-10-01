package com.hcl.jdbc;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class DeptUpdate {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int deptno;
		String dname,loc;
		System.out.println("enter deptno");
		deptno=sc.nextInt();
		System.out.println("enter dept name ");
		dname=sc.next();
		System.out.println("enter location");
		loc=sc.next();
		String cmd = "Update Dept set dname=?, loc=? WHERE deptno=?";
		Connection con = DaoConnection.getConnection();
		try {
			PreparedStatement pst = con.prepareStatement(cmd);
			pst.setString(1, dname);
			pst.setString(2, loc);
			pst.setInt(3, deptno);
			pst.executeUpdate();
			System.out.println("record updated");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}


