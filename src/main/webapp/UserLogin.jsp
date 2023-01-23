<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>User Login</title>
</head>
<body>
<%!String str=null; %>
<form action="UserLoginController" method="get">
Username<input type="text" name="email"><br>
Password<input type="text" name="password"><br>
<input type="submit" value="Login"><br>
<%Object o=session.getAttribute("msg");
  str=(String)o;
  out.println(str);
%>
</form>

</body>
</html>