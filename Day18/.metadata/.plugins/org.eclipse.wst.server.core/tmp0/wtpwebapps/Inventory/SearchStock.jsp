<%@page import="com.hcl.inventory.Stock"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<jsp:useBean id="bean1" class="com.hcl.inventory.SearchStock" />
    <jsp:setProperty property="*" name="bean1"/>
    <%
    Stock obj=bean1.searchStock();
    if(obj!=null) {
    	out.println("Item Name " +obj.getItemName() +"</br></br>");
    	out.println("Price " +obj.getPrice() +"</br></br>");
    	out.println("QuantityAvail " +obj.getQuantityAvail() +"</br></br>");
    } else {
    	out.println("record not found");
    }
    
    %>

</body>
</html>