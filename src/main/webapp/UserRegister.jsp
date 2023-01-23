<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>User Register</title>
</head>
<body>
<%!String str=null; %>
<form action="UserRegistercontroller" method="get">
Fname<input type="text" name="fname"><br>
Lname<input type="text" name="lname"><br>
Email<input type="text" name="email"><br>
password<input type="text" name="password"><br>
Cpassword<input type="text" name="cpassword"><br>
Country<input type="text" name="country"><br>
Address<input type="text" name="address"><br>
Pincode<input type="text" name="pincode"><br>
<input type="submit" value="Register">
<%Object o=session.getAttribute("msg");
   str=(String)o;
   out.println(str);
%>
<a href="UserLogin.jsp">Login Here</a>
</form>

</body>
</html>