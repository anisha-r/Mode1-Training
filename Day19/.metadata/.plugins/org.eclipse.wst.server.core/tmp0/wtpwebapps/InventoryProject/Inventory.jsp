<%@page import="com.hcl.inventory.DaoConnection"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<table border="3" /> 
  <tr>
     <th>StockId</th>
     <th>ItemName</th>
     <th>Price</th>
     <th>QuantityAvail</th>
     
   
</tr>
 <%
    Connection con=DaoConnection.getConnection();
    String cmd="select * from stock";
    PreparedStatement pst=con.prepareStatement(cmd);
    ResultSet rs=pst.executeQuery();
    while(rs.next()){
    	if(rs.getInt("QuantityAvail")  > 3) {
 %>
  <tr bgcolor="red">
     <td> <%=rs.getString("StockId") %></td>
     <td> <%=rs.getString("ItemName") %></td>
     <td> <%=rs.getInt("Price") %></td>
     <td> <%=rs.getInt("QuantityAvail") %></td>
     </tr>
     <%
     } else {
    %> 
     <tr>
   
     <td><blink> <%=rs.getString("StockId") %></blink></td>
     <td> <%=rs.getString("ItemName") %></td>
     <td> <%=rs.getInt("Price") %></td>
     <td> <%=rs.getInt("QuantityAvail") %></td>
     </tr>
     <% 
     }
     %>
     <%
     }
     %>
    </table><br/><br/>
</body>
</html>