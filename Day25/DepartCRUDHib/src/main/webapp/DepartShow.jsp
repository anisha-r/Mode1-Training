<%@page import="com.hcl.depart.Depart"%>
<%@page import="com.hcl.depart.DepartCrud"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<table border="3">
 <tr>
 <td>DeptNo</td>
 <td>Dname</td>
 <td>Location</td>
 <td>Head</td>
 </tr>
 
 <%
  DepartCrud obj=new DepartCrud();
 List<Depart> lstDepart =obj.showDepart(); 
 for(Depart d : lstDepart) {
%>
<tr>
<td><%=d.getDeptno()%> </td>
<td><%=d.getDname()%> </td>
<td><%=d.getLoc()%> </td>
<td><%=d.getHead()%> </td>
<td><a href="DepartUpdate.jsp?deptno=<%=d.getDeptno() %>">Update</a></td>
<td><a href="DepartDelete.jsp?deptno=<%=d.getDeptno() %>">Delete</a>
</tr>
<%
   }
%>

 


</table>

</body>
</html>