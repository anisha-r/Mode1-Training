
<%@page import="com.hcl.depart.Depart"%>
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
int deptno=Integer.parseInt(request.getParameter("deptno"));
DepartCrud crud = new DepartCrud();
Depart d = crud.searchDepart(deptno);
if(d != null) {
	out.println("Name "+d.getDname() +"<br/>");
	out.println("Location "+d.getLoc() +"<br/>");
	out.println("Head "+d.getHead() +"<br/>");
} else {
	out.println("Not Found...");
}
%>

</body>
</html>