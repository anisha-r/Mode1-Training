
<%@page import="com.hcl.depart.DepartCrud"%>
<%@page import="com.hcl.depart.Depart"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form method="get" action="DepartInsert.jsp">
  Department No:
  <input type="text" name="deptno" /><br/><br/>
  Name :
  <input type="text" name="dname" /><br/><br/>
  Location:
  <input type="text" name="loc" /><br/><br/>
  Head:
  <input type="text" name="head" /><br/><br/>
  
  <input type="submit" value="Insert" />
</form>
<% 
if(request.getParameter("deptno") !=null && 
request.getParameter("dname") !=null &&

request.getParameter("loc") !=null &&
request.getParameter("head") !=null) {
	Depart d=new Depart();
	d.setDeptno(Integer.parseInt(request.getParameter("deptno")));
	d.setDname(request.getParameter("dname"));
	d.setLoc(request.getParameter("loc"));
	d.setHead(request.getParameter("head"));
	DepartCrud crud=new DepartCrud();
	out.println(crud.insertDepart(d));
}
	%>
</body>
</html>