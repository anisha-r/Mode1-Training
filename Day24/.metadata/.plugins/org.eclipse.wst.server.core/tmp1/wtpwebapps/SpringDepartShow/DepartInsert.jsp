<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
 <form method="get" action="DepartInsert.hcl">
       <center>
         Depart No:
          <input type="text" name="deptno" /><br/>
         Depart Name:
          <input type="text" name="dname" /><br/>
         Location:
          <input type="text" name="loc" /><br/>
         Head:
          <input type="text" name="head" /><br/>
       
           <input type="submit" value="insert" />
       </center>
    </form>

</body>
</html>