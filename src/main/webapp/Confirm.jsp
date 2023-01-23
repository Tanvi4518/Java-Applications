<%@page import="linkcode.shop.admin.model.Product"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%!List<Product> plst=null;
%>
<%
   plst=(List<Product>)session.getAttribute("prodlst");
   for(Product pobj:plst){
%>

<table border='3px'>
<tr>
<td><%=pobj.getProdId() %></td>
<td><%=pobj.getProdNm() %></td>
<td><%=pobj.getProdPrice() %></td>
<td><%=pobj.getProdQty() %></td>
</tr>
</table>
<%
   }
   out.println("Do you want to add more product in cart press yes or no");
%>
<div id="div1">
<a href="Product.jsp">Add Product</a>
<a href="BillServlet">Bill</a>
</div>
</body>
</html>