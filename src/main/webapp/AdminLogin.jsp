<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>AdminLogin</title>
<link rel="stylesheet" href="style.css">
</head>
<body>
<div class="container">
  <div class="myform">
   <form action="LoginController" method="get">
   <h2>ADMIN LOGIN</h2>
   <input type="text" placeholder="Admin Name" name="AdNm">
   <input type="password"  placeholder="Password" name="pass">
   <button type="submit">LOGIN</button><br><br>
   <%!String str=null; %>
  <%
   Object o=session.getAttribute("msg");
   str=(String)o;
   out.println(str);
  %>
   </form>
  </div>
  <div class="image">
  <img src="https://img.freepik.com/free-vector/secure-login-concept-illustration_114360-4582.jpg?w=2000" width="500px">
  </div>
</div>

</body>
</html>