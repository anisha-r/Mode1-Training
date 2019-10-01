
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
    int empno=Integer.parseInt(request.getParameter("empno"));
 DepartCrud crud=new DepartCrud();
 Depart d = crud.searchDepart(empno);
   %>
   <form action="DepartUpdate.jsp" method="get">
    EmployNo:
    <input type="text" name="deptno" readonly="readonly" value=<%=d.getDeptno() %> /><br/><br/>
    Name:
    <input type="text" name="dname"  value=<%=d.getDname() %> /><br/><br/>
 Location:
    <input type="text" name="loc"  value=<%=d.getLoc() %> /><br/><br/>
    Designation:
    <input type="text" name="head" value=<%=d.getHead() %> /><br/><br/>
  
    <input type="submit" value="Update" />
    <%
    if(request.getParameter("deptno") !=null && 
    request.getParameter("dname") !=null &&
    request.getParameter("loc") !=null &&
    request.getParameter("head") !=null) {
    	d=new Depart();
    	d.setDeptno(Integer.parseInt(request.getParameter("empno")));
    	d.setDname(request.getParameter("dname"));
    	d.setLoc(request.getParameter("loc"));
    	d.setHead(request.getParameter("head"));
    	crud=new DepartCrud();
    	out.println(crud.updateDepart(d));
    %>
    <jsp:forward page="DepartShow.jsp" />
    <%
    }
    %>
   
   </form>
</body>
</html>