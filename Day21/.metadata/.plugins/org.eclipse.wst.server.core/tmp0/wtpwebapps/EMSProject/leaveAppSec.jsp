<%@page import="org.apache.jasper.tagplugins.jstl.core.ForEach"%>
<%@page import="java.util.List"%>
<%@page import="com.hcl.ems.LeaveHistory"%>
<%@page import="com.hcl.ems.EmsBAL"%>
<%@page import="com.hcl.ems.Employee"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
	int empId=Integer.parseInt((String)session.getAttribute("user"));
	Employee employee = EmsBAL.myDetails(empId);
	
%>
<h3><p>  My Leave Application Section</p></h3>
<table border="2">
<tr>
<th>Leave ID</th>
<th>Number of Days</th>
<th>Start Date</th>
<th>End Date</th>
<th>Leave Type</th>
<th>Status</th>
<th>Reason</th>
<th>Applied On</th>
<th>Manager Comments</th>
</tr>
  <%
 List<LeaveHistory> leaveHistory = EmsBAL.leaveSection(empId);
	for(LeaveHistory l: leaveHistory){
 %>
 <tr>
   
     <td><%=l.getLeaId() %>  </td>
     <td><%=l.getLeaNoOfDays() %> </td>
     <td><%=l.getLeaStartDate() %> </td>
     <td><%=l.getLeaEndDate() %> </td>
     <td><%=l.getLeaType() %> </td>
     <td><%=l.getLeaStatus() %>
     <td><%=l.getLeaReason() %> </td>
     <td><%=l.getLeaAppliedOn() %> </td>
     <td><%=l.getLeaMgrComments() %></td>
   
 </tr>
 <%
 }
 %>                 
 </table>
 <table>
 <tr> <td colspan="9"><p>
 <input type="submit" value="New Application" /></p></td></tr></table>
</table>
</body>
</html>