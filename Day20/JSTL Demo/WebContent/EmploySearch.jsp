<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="ag" %>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<sql:setDataSource var="conn"
   driver="com.mysql.jdbc.Driver"
   url="jdbc:mysql://localhost:3306/sqlpractice"
   user="root"
  password="root"  
    />
    <sql:query var="empQuery" dataSource="${conn}">
       select * from employ where empno=?
       <sql:param value="${param.empno}"></sql:param>
    </sql:query>
    <ag:set var="flag" value="0"></ag:set>
    <ag:forEach var="e" items="${empQuery.rows}">
      Employ No:
     <ag:out value="${e.empno}"></ag:out> <br/>
      Employ Name:
     <ag:out value="${e.name}"></ag:out>  <br/>
      Employ Department:
     <ag:out value="${e.dept}"></ag:out>  <br/>
     Designation :
     <ag:out value="${e.desig}"></ag:out>  <br/>
     Basic:
        <ag:out value="${e.basic}"></ag:out> 
        <ag:set var="flag" value="1"></ag:set> 
    </ag:forEach>
    <ag:if test="${flag==0}">
       <ag:out value="Employ bot found..."></ag:out>
    </ag:if>
</body>
</html>