package com.hcl.jdbc;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class DeptDelete {
	public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
		int deptno;
		String dname,loc;
		System.out.println("enter deptno");
		deptno=sc.nextInt();
		String cmd = "delete from Dept where deptno=?";
		Connection con = DaoConnection.getConnection();
		try {
			PreparedStatement pst = con.prepareStatement(cmd);
			pst.setInt(1, deptno);
			pst.executeUpdate();
			System.out.println("record deleted");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}


