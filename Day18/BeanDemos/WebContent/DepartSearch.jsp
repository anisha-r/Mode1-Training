<%@page import="java.sql.ResultSet"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<jsp:useBean id="bean1" class="com.hcl.beans.DepartSearch" />
    <jsp:setProperty property="*" name="bean1"/>
      <%
      ResultSet rs=bean1.searchDepart();
      if(rs.next()) {
    	  out.print("Name " +rs.getString("dname") + "<br/>");
    	  out.print("loc " +rs.getString("loc") + "<br/>");
    	  out.print("Head " +rs.getString("head") + "<br/>");
      } else {
    	  out.print("record not found");
      }
      
      
      
      %>

</body>
</html>