<%@page import="linkcode.shop.admin.model.Product"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>All Record</title>
</head>
<style>
*{
   margin:0;
   padding:0;
}
body{
	background:#CAE9F5;
}
   .background-image{
   background-size:cover;
   background-repeat:no-repeat;
   height:100vh;
   }
   .content-table{
   border-collapse:collapse;
   margin-top:50px;
   margin:30px 0;
   font-size:0.9em;
   min-width:400px;
   border-radius:5px 5px 0 0;
   overflow:hidden;
   box-shadow:0 0 20px blue;
    margin-left:auto;
     margin-right:auto;
   }
   .content-table thead tr{
      background-color:blue;
      color:#ffffff;
      text-align:left;
      font-weight:bold;
   }
   .content-table th,
   .content-table td{
   padding: 12px 15px;
   }
   .content-table tbody tr{
     border-bottom:1px solid #dddddd;
   }
   .content-table tbody tr:nth-of-type(even){
     background-color: #59bfff;
   }
   .content-table tbody tr:last-of-type{
   border-bottom:2px solid blue;
   }
   
</style>
<body>
<div class="background-image">
<h1 style="color:red; text-align:center; text-decoration:underline" >List of Products</h1>
<%List<Product> plst=null; 
%>
<%  plst =(List<Product>)session.getAttribute("prodlst");
   session.invalidate();
%>
<table class="content-table" >
<thead>
<tr>
<th> ID</th>
<th> Name</th>
<th> Price</th>
<th> Quantity</th>
</tr>
</thead>
<tbody>
<%

 for(Product prod:plst){
%>


<tr>
   <td><%=prod.getProdId() %></td>
   <td><%=prod.getProdNm() %></td>
   <td><%=prod.getProdPrice() %></td>
   <td><%=prod.getProdQty() %></td>
</tr>

<% } %>
</tbody>
</table>
</div>
</body>
</html>