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
  <sql:query var="accounts" dataSource="${conn}">
  select Max(accountNo)+1 Accno from Accounts
  </sql:query>
<ag:set var="accno" value="0"> </ag:set>  
<ag:forEach var="account" items="${accounts.rows}">
   <ag:set var="accno" value="${account.Accno}"></ag:set>
</ag:forEach>
Account No:
<b>
   <ag:out value="${accno}"></ag:out>
</b>
<br/><br/>
<sql:update dataSource="${conn}" var="accounts">
    insert into Accounts(AccountNo,FirstName,LastName,City,State,Amount,CheqFacil,AccountType)
    values(?,?,?,?,?,?,?,?)
    <sql:param value='${accno}'></sql:param>
       <sql:param value='${param["firstName"]}'></sql:param>
          <sql:param value='${param["lastName"]}'></sql:param>
            <sql:param value='${param["city"]}'></sql:param>
              <sql:param value='${param["state"]}'></sql:param>
                <sql:param value='${param["amount"]}'></sql:param>
                   <sql:param value='${param["cheqFacil"]}'></sql:param>
                       <sql:param value='${param["accountType"]}'></sql:param>
</sql:update>
<ag:out value="Account created Successflly"></ag:out>
</body>
</html>