<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Employee Management Screen</title>
</head>
<body>
<div align="center">
<h1>Employee List</h1>
<br/><br/>
<form:form action="search" modelAttribute="searchEmployee" >
Employ Name:
<form:input path="empName" />
<h4>AND</h4>
Employ Band:
<form:select path="band" >
    <form:option value='0' >SELECT </form:option>
    <form:option value='E'>E</form:option>
    <form:option value='C'>C</form:option>
    <form:option value='M'>M</form:option>
  </form:select>
Salary:
<form:input path="salary" />  
  <input type="submit" value="search">
</form>
</form:form>
<h2>No of Employees:${listEmployee.size()}</h2>

<table border="1">
<th>EmpName</th>
<th>Salary</th>
<th>Band</th>
<th>DateOfJoin</th>

<c:forEach var="employee" items="${listEmployee}">

<tr>
<td>${employee.empName}</td>
<td>${employee.salary}</td>
<td>${employee.band}</td>
<td>${employee.dateOfJoin}</td>
</tr>
</c:forEach>
</table>
</body>
</html>

