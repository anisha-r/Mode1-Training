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
    <sql:query var="deptQuery" dataSource="${conn}">
       select * from department where deptno=?
       <sql:param value="${param.deptno}"></sql:param>
    </sql:query>
    <ag:set var="flag" value="0"></ag:set>
    <ag:forEach var="e" items="${deptQuery.rows}">
     Department No:
     <ag:out value="${e.deptno}"></ag:out> <br/>
     Department Name:
     <ag:out value="${e.dname}"></ag:out>  <br/>
     Department Location:
     <ag:out value="${e.loc}"></ag:out>  <br/>
     Department Head :
     <ag:out value="${e.head}"></ag:out>  <br/></hr>
     <ag:set var="flag" value="1"></ag:set> 
    </ag:forEach>
      
    <ag:if test="${flag==0}">
       <ag:out value="Depart not found..."></ag:out>
    </ag:if>

</body>
</html>