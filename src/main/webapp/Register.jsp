<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Register</title>
<link rel="stylesheet" href="style.css">
</head>
<body>
<div class="container">
  <div class="myform">
<form action="RegisterController" method="get"><br/><br/>
<h3 style="color:white;">ADMIN REGISTERATION</h3><br>
<input type="text" placeholder="Admin Name" name="AdNm"><br>
<input type="password" placeholder="Password" name="pass"><br>
 <button type="submit">REGISTER</button>
 <h5>Already have account?</h5>
 <span>
 <a href="AdminLogin.jsp">Login Here</a>
 </span>
</form>
</div>
  <div class="image">
  <img src="https://img.freepik.com/premium-vector/office-work-man-is-working-comfortable-office-flat-vector-illustration_330527-6.jpg?w=2000" width="500px">
  </div>
</div>
</body>
</html>