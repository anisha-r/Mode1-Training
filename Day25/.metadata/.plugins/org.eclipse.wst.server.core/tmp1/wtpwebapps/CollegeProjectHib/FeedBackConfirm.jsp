<%@page import="com.hcl.hib.CollegeCRUD"%>
<%@page import="com.hcl.hib.Feedback"%>
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
  String fid=(String)session.getAttribute("fid");
  String studentName=(String)session.getAttribute("studentName");
  String instructor=(String)session.getAttribute("instructor");
  String subject=request.getParameter("subject");
  String fbvalue=request.getParameter("fbvalue");
 %>
<form method="get" action="FeedBackConfirm.jsp">
  <center>
   FeedBack ID:
   <input type="text" value=<%=fid%> name="fid" />
   Student Name:
   <input type="text" value=<%=studentName%> name="studentName" />
   Instructor:
   <input type="text" value=<%=instructor%> name="instructor" />
   Subject:
   <input type="text" value=<%=subject%> name="subject" />
   Feedback value:
   <input type="text" value=<%=fbvalue%> name="fbvalue" />
    <input type="submit" value="Confirm Please"/>
  </center>

  <% 
        if(request.getParameter("fid") !=null && 
         request.getParameter("studentName") !=null &&
         request.getParameter("instructor") !=null &&
         request.getParameter("subject") !=null &&
         request.getParameter("fbvalue") !=null){
	     Feedback s=new Feedback();
	    s.setFid(request.getParameter("fid"));
	    s.setStudentName(request.getParameter("studentName"));
	    s.setInstructor(request.getParameter("instructor"));
	    s.setSubject(request.getParameter("subject"));
	    s.setFbValue(request.getParameter("fbvalue"));
	    CollegeCRUD crud=new CollegeCRUD();
	    out.println(crud.insertFeedback(s));
	   
} 
	%>



</form>
</body>
</html>