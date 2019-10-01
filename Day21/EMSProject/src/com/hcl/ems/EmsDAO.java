package com.hcl.ems;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

public class EmsDAO {
	
	public String applyLeave(LeaveHistory leave,int empId){
		String result="";
		Connection con = DaoConnection.getConnection();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-DD");
		String stdate =sdf.format(leave.getLeaStartDate());
		String endate =sdf.format(leave.getLeaEndDate());
		Employee emp = new Employee();
		LeaveType lt=LeaveType.EL;
		LeaveStatus ls;
		java.util.Date dt = new java.util.Date();
		long diff = leave.getLeaStartDate().getTime()-leave.getLeaEndDate().getTime();
		String laodate =sdf.format(dt);
		if(diff>0){
			if(stdate.compareTo(laodate)<0){
				result="Start Date cannot be less than current date";
				return result;
			}
		String cmd1="select EMP_LEAVE_BALANCE from employee where emp_Id=?";
		try {
			PreparedStatement pst1 = con.prepareStatement(cmd1);
			pst1.setInt(1, empId);
			ResultSet rs = pst1.executeQuery();
			int lbal = rs.getInt("EMP_LEAVE_BALANCE");
			if(diff<lbal){
				String cmd="Insert into leave_history(LEA_START_DATE,LEA_END_DATE,"
						+ "LEA_NO_OF_DAYS,LEA_REASON,LEA_TYPE,LEA_APPLIED_ON,"
						+ "LEA_MGR_COMMENTS,EMP_ID,LEA_STATUS)"
						+ " values(?,?,?,?,?,?,?,?,?)";
				PreparedStatement pst = con.prepareStatement(cmd);
				pst.setString(1, stdate);
				pst.setString(2, endate);
				pst.setLong(3, diff);
				pst.setString(4, leave.getLeaReason());
				pst.setString(5, lt.toString());
				pst.setString(6, dt.toString());
				pst.setString(7, leave.getLeaMgrComments());
				pst.setInt(8, empId);
			if(emp.getEmpMgrId()==0){
				ls=LeaveStatus.APPROVED;
				
			
			} else {
				ls=LeaveStatus.PENDING;
			}
			pst.setString(9,ls.toString());
			result = "Leave Applied";
			}else{
				result  ="Leave Balance is Not Sufficient";
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}else{
			result="Start date cannot be greater than end Date";
		}		
		
		
		
		return result;
	}
		
	public Employee myDetails(int empId){
		 Connection con= DaoConnection.getConnection();
		 String cmd="select * from employee where emp_Id=?";
		 Employee employee=null;
		 try {
			PreparedStatement pst=con.prepareStatement(cmd);
			pst.setInt(1, empId);
			ResultSet rs=pst.executeQuery();
			if(rs.next()) {
				employee=new Employee();
				employee.setEmpId(empId);
				employee.setEmpName(rs.getString("EMP_NAME"));
				employee.setEmpDptName(rs.getString("EMP_DPT_NAME"));
				employee.setEmpEmail(rs.getString("EMP_EMAIL"));
				employee.setEmpDateJoin(rs.getDate("EMP_DATE_JOINED"));
				employee.setEmpMgrId(rs.getInt("EMP_MGR_ID"));
				employee.setEmpMobNo(rs.getString("EMP_MOB_NO"));
				employee.setEmpLeaveBal(rs.getInt("EMP_LEAVE_BALANCE"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		 return employee;
	 }
	
	public boolean loginDao(int empId,String secretCode) {
		Connection con=DaoConnection.getConnection();
		String cmd="Select * from EmployLogin where emp_Id=? AND secretCode=?";
		boolean flag=true;
		try {
			PreparedStatement pst=con.prepareStatement(cmd);
			pst.setInt(1, empId);
			pst.setString(2, secretCode);
			ResultSet rs=pst.executeQuery();
			if(rs.next()) {
				flag=true;
			}else
				flag=false;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return flag;
		
	}
	
	public List<LeaveHistory> leaveSectionDao(int empId){
		Connection con=DaoConnection.getConnection();
		String cmd="select * from leave_History where emp_Id=?";
		List<LeaveHistory> lh = new ArrayList<LeaveHistory>();
		LeaveHistory leave = new LeaveHistory();
		try {
			PreparedStatement pst=con.prepareStatement(cmd);
			pst.setInt(1, empId);
			ResultSet rs = pst.executeQuery();
			while(rs.next()){
				leave.setLeaId(rs.getInt("LEA_ID"));
				leave.setLeaStartDate(rs.getDate("LEA_START_DATE"));
				leave.setLeaEndDate(rs.getDate("LEA_END_DATE"));
				leave.setLeaNoOfDays(rs.getInt("LEA_NO_OF_DAYS"));
				leave.setLeaReason(rs.getString("LEA_REASON"));
				leave.setLeaType(LeaveType.valueOf(rs.getString("LEA_TYPE")));
				leave.setLeaAppliedOn(rs.getDate("LEA_APPLIED_ON"));
				leave.setLeaMgrComments(rs.getString("LEA_MGR_COMMENTS"));
				leave.setLeaStatus(LeaveStatus.valueOf(rs.getString("LEA_STATUS")));
				lh.add(leave);
			}
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return lh;
		
	}
	
	
		
	
}
