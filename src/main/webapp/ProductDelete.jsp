<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Delete</title>
<link rel="stylesheet" type="text/css" href="searchbar.css">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
</head>
<body>
<div class="main">
<form action="DeleteController" method="get">
<h3 style="color:red">Enter Product ID to delete :</h3>
<input type="text" placeholder="Enter Product ID" name="pid"><br><br>
<button type="submit">Delete</button><br><br>
<div class="main1">
<a href="Dashboard.html" >Back</a><br><br>
<%!String msg=null; %>
<%
   Object o=session.getAttribute("msg");
   msg=(String)o;
   out.println(msg);
%>
</div>
</form>
</div>
</body>
</html>