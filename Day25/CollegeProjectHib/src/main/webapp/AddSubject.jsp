<%@page import="com.hcl.hib.CollegeCRUD"%>
<%@page import="com.hcl.hib.Subject"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form method="get" action="AddSubject.jsp" name="subjectForm" >

<select name="subject" id="dropdown" onchange="change()">
 <option value="maths">Maths</option>
 <option value="science">Science</option>
 <option value="social">Social</option>
 <option value="civics">Civics</option>
 <option value="geography">Geography</option>
</select>


 <p>Theory  &nbsp;&nbsp;<input type="text" name="theory" readonly="readonly"/></p>
 <p>Practical  &nbsp;&nbsp;<input type="text" name="practical" readonly="readonly"/></p>
 <p>Year  &nbsp;&nbsp;<input type="text" name="year"/></p>
 <p>Instructor  &nbsp;&nbsp;<input type="text" name="instructor"/></p>
 <input type="submit" value="click"/>
  
    <script>
        function change(){
        var a= document.getElementById("dropdown").value;
        
       
        if(a =="maths"){
        	subjectForm.theory.value="42";
        	subjectForm.practical.value="14";
        }
        if(a =="science"){
        	subjectForm.theory.value="90";
        	subjectForm.practical.value="50";
        }
        if(a =="social"){
        	subjectForm.theory.value="69";
        	subjectForm.practical.value="41";
        }
        
        if(a =="civics"){
        	subjectForm.theory.value="79";
        	subjectForm.practical.value="41";
        }
        
        if(a =="geography"){
        	subjectForm.theory.value="107";
        	subjectForm.practical.value="93";
        }
        
        
        }
        </script>
        <% 
        if(request.getParameter("year") !=null && 
         request.getParameter("instructor") !=null &&
         request.getParameter("subject") !=null &&
         request.getParameter("theory") !=null &&
         request.getParameter("practical") !=null){
	     Subject s=new Subject();
	     s.setYear(Integer.parseInt(request.getParameter("year")));
	     s.setInstructor(request.getParameter("instructor"));
	     s.setSubject(request.getParameter("subject"));
	     s.setTheory(Integer.parseInt(request.getParameter("theory")));
	     s.setPractical(Integer.parseInt(request.getParameter("practical")));
	     CollegeCRUD crud=new CollegeCRUD();
	     out.println(crud.insertSubject(s));
} 
	%>
</form>
</body>
</html>