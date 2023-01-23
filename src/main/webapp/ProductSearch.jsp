<%@page import="java.util.List"%>
<%@page import="linkcode.shop.admin.model.Product"%>
<%@page import="linkcode.shop.admin.daoImpl.ProductServiceImpl"%>
<%@page import="linkcode.shop.admin.dao.ProductService"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Search Product</title>
<link rel="stylesheet" type="text/css" href="searchbar.css">
</head>
<style>
 .content-table{
   border-collapse:collapse;
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
<div class="main">
<form action="SearchProductController" method="get">
<h3 style="color:red">Enter Product ID to Search :</h3>
  <input type="text" placeholder=" Enter Product ID"name="pid"><br><br>
  <button type="submit">Search</button><br><br>
  <div class="main1">
 <a href="Dashboard.html" >Back</a><br>
  </div>
</form>

<%!List<Product> prodlst=null;
  Product prod=null;%>
<%
  Object o=session.getAttribute("prod");
  if(o instanceof List)
  {
	  prodlst=(List<Product>)o;
	  session.invalidate();
	  if(prodlst!=null)
	  {
		  prod=prodlst.get(0);
		  prodlst=null;
 %>
 <table class="content-table">
 <thead>
  <tr>
  <th> ID</th>
  <th> Name</th>
  <th> Price</th>
  <th> Quantity</th>
  </tr>
</thead>
<tbody>
 <tr>
    <td><%=prod.getProdId() %></td>
    <td><%=prod.getProdNm() %></td>
    <td><%=prod.getProdPrice() %></td>
    <td><%=prod.getProdQty()%></td>
 </tr>
 </tbody>
 </table>
 <%
 }
  }else{
	  String str=(String)o;
	  out.println(str);
  }
  %>
	  


</div>

</body>
</html>