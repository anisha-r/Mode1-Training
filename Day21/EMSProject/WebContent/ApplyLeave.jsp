<%@page import="com.hcl.ems.LeaveType"%>
<%@page import="jdk.nashorn.internal.ir.RuntimeNode.Request"%>
<%@page import="java.util.Date"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="com.hcl.ems.LeaveHistory"%>
<%@page import="com.hcl.ems.EmsBAL"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<form method="get" action="leaveAppSec.jsp" >
<%
int empId=Integer.parseInt((String)session.getAttribute("user"));
%>

<h1><p> Apply Leave </p></h1>
<p>Start Date &nbsp;&nbsp;<input type="date" name="startdate"/></p>
<p>End Date &nbsp;&nbsp;<input type="date" name="enddate"/></p>
<p>No of Days &nbsp;&nbsp;<input type="text" name="noofdays"/></p>
<p>Leave Type &nbsp;&nbsp;<input type="text" name="leavetype"/></p>
<p>Leave Reason &nbsp;&nbsp;<input type="text" name="leavereason"/></p>   
<input type="submit" value="Apply"/>&nbsp;&nbsp;&nbsp;&nbsp;
<input type="submit" value="Cancel"/>
<%
LeaveHistory leave = new LeaveHistory();
SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-DD");
Date d = new Date(request.getParameter("startdate"));
leave.setLeaStartDate(d);
Date d1 = new Date(request.getParameter("enddate")) ;
leave.setLeaEndDate(d1);
//leave.setLeaNoOfDays(Integer.parseInt(request.getParameter("noofdays")));
leave.setLeaNoOfDays(Integer.parseInt(request.getParameter("noofdays")));
leave.setLeaType(LeaveType.valueOf(request.getParameter("leavetype")));
leave.setLeaReason(request.getParameter("leavereason"));
//leave.setLeaStatus(request.getParameter(""))
%>


<%=EmsBAL.applyLeave(leave, empId)%>
</form>
</body>
</html>