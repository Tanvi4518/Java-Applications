<%@page import="linkcode.shop.admin.model.Product"%>
<%@page import="linkcode.shop.user.controller.Bill"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Product Bill</title>
</head>
<body>
<h1>Product List</h1>
<%!List<Product> plst=null;
   Bill bobj=null;
%>
<%
   plst=(List<Product>)session.getAttribute("prodlst");
    for(Product p:plst){
%>
<table border='3px'>
<tr>
    <td><%=p.getProdId() %></td>
    <td><%=p.getProdNm() %></td>
    <td><%=p.getProdPrice() %></td>
    <td><%=p.getProdQty() %></td>
</tr>
</table>
<% 
    }
%>

<h1>Bill Detail</h1>
<%
   bobj=(Bill)session.getAttribute("bill");
%>
<table border='3px'>
<tr>
    <td><%=bobj.getProdId() %></td>
    <td><%=bobj.getTotal() %></td>
    <td><%=bobj.getCgst() %></td>
    <td><%=bobj.getSgst() %></td>
    <td><%=bobj.getFinaltotal() %></td>
</tr>
</table>


</body>
</html>