package com.hcl.ems;

import java.util.List;

public class EmsBAL {
	public static boolean loginBal(int empId,String secretCode) {
		return new EmsDAO().loginDao(empId, secretCode);
	}
	
	public static Employee myDetails(int empId){
		return new EmsDAO().myDetails(empId);
	}
	public static List<LeaveHistory> leaveSection(int empId) {
		return new EmsDAO().leaveSectionDao(empId);
	}
	
	public static String applyLeave(LeaveHistory leave,int empId){
		return new EmsDAO().applyLeave(leave, empId);
	}
	
}
