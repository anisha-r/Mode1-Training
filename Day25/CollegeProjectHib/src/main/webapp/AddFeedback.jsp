<%@page import="java.util.List"%>
<%@page import="com.hcl.hib.CollegeCRUD"%>
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
 CollegeCRUD c=new CollegeCRUD();
 String fid=c.feedbackId();
 session.setAttribute("fid", fid);
 %> 
<form method="get" action="AddFeedback.jsp" name="frmFeedback">

 FeedBackId<input type="text" value="<%=fid %>" name="fid" />



 StudentName<input type="text" name="studentName" />
 
Instructor:
 <select name="instructor" onchange="change()">
 <option value="please select">Please select</option>

    <%  
    List<String> lstsub=new CollegeCRUD().getInstructors();
		for(String s : lstsub){
			%>
			<option value="<%=s %>">  <%=s %></option>
			<% 
		}
	%>
	</select>
	<%
	session.setAttribute("studentName",request.getParameter("studentName"));
	session.setAttribute("instructor",request.getParameter("instructor"));
	%>
	</form>
Please give your feedback:
<form method="get" action="FeedBackConfirm.jsp">

	<br/><br/>
	select Subject : 
	<select name="subject" >
	<option value="dropdown"></option>
		<%
		String ins =request.getParameter("instructor");
		
		session.setAttribute("instructor", ins);
		List<String> lst1=new CollegeCRUD().getSubjectz(ins);
		for(String s : lst1){
			%>
			<option value="<%=s%>"><%=s%></option>
     <%
		}
	%>
</select>

   <input type="radio" id="Choice1"
     name="fbvalue" value="Excellent">
    <label for="Choice1">Excellent</label>
    <input type="radio" id="Choice2"
     name="fbvalue" value="Good">
    <label for="Choice2">Good</label>

    <input type="radio" id="Choice3" 
     name="fbvalue" value="Adequate">
    <label for="Choice3">Adequate</label>

    <input type="radio" id="Choice4"
     name="fbvalue" value="Inadequate">
    <label for="Choice4">Adequate</label>
	<input type="submit" value="Show" />
	
</form>
<script>
  function change() {
	  document.frmFeedback.submit();
  }
</script>
</body>
</html>