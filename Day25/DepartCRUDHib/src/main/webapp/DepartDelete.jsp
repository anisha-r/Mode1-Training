<%@page import="com.hcl.depart.DepartCrud"%>

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
if(request.getParameter("deptno") != null){
	int deptno=Integer.parseInt(request.getParameter("deptno"));
	DepartCrud crud=new DepartCrud();
	out.println(crud.deleteDepart(deptno));
	%>
	<jsp:forward page="DepartShow.jsp" />
	<%
     }
	%>
</body>
</html>