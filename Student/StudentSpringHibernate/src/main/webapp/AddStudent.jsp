<%@page import="java.util.Date"%>
<%@page import="com.hcl.student.dao.StudentDAOImpl"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="com.hcl.student.Controller.StudentController"%>
<%@page import="com.hcl.student.model.Student"%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib uri="http://www.springframework.org/tags/form"
prefix="springForm"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<springForm:form method="POST" commandName="Student" action="/AddStudent" >
 <center>
  Roll Number:
  <springForm:input  path="rollNum" /> <br/><br/>
  Student Name:
  <springForm:input  path="sName" />  <br/><br/>
  Age:
  <springForm:input  path="age" /> <br/><br/>
  Gender:
  <springForm:select path="gender">
  <springForm:radiobutton path="gender" value="male" />  
  <springForm:radiobutton path="gender" value="Female" />
  </springForm:select>
  Country:
  <springForm:select path="gender">
  <springForm:option value="india">India </springForm:option>
  <springForm:option value="australia">Australia</springForm:option>
  <springForm:option value="japan">Japan</springForm:option>
  <springForm:option value="china">China</springForm:option>
</springForm:select> 
  Date of Join:
 <springForm:input type="date" path="dateOfJoin" /> <br/><br/>
  Final score:
  <springForm:input type="text" path="fScore" /> <br/><br/>
  <springForm:input type="submit" path="click" />
  </center>

</springForm:form>

</body>
</html>