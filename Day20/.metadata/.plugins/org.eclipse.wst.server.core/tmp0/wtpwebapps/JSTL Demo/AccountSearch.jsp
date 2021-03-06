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
   url="jdbc:mysql://localhost:3306/bank"
   user="root"
  password="root"  
    />
  <sql:query var="accountQuery" dataSource="${conn}">
       select * from Accounts where accountNo=?
       <sql:param value="${param.accountNo}"></sql:param>
    </sql:query>
    <ag:set var="flag" value="0"></ag:set>
    <ag:forEach var="e" items="${accountQuery.rows}">
     First Name:
     <ag:out value="${e.firstName}"></ag:out> <br/>
     Last Name:
     <ag:out value="${e.lastName}"></ag:out>  <br/>
     City:
     <ag:out value="${e.city}"></ag:out>  <br/>
     State:
     <ag:out value="${e.state}"></ag:out>  <br/>
     Amount :
     <ag:out value="${e.amount}"></ag:out>  <br/>
     cheqFacil :
     <ag:out value="${e.cheqFacil}"></ag:out>  <br/>
     Account Type:
     <ag:out value="${e.accountType}"></ag:out>  <br/></hr>
     <ag:set var="flag" value="1"></ag:set> 
    </ag:forEach>
      
    <ag:if test="${flag==0}">
       <ag:out value="Account not found..."></ag:out>
    </ag:if>
</body>
</html>