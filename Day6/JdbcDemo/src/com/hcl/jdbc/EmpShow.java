package com.hcl.jdbc;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class EmpShow {
	
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sqlpractice","root","root");
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery("select * from Emp");
			while(rs.next()) {
				System.out.println("employ no " +rs.getInt("empno"));
				System.out.println("Employ name" +rs.getString("ename"));
				System.out.println("Employ job" +rs.getString("job"));
				System.out.println("Employ mgr" +rs.getInt("mgr"));
				System.out.println("Employ HireDate" +rs.getInt("hiredate"));
				System.out.println("Employ Sal" +rs.getInt("Sal"));
				
			}	} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
