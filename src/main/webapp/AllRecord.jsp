<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
<meta charset="ISO-8859-1">
<title></title>
</head>
<body>
<h1>All Product Data</h1>

<c:if test="${requestScope.message !=null}">
	NOTE : ${message}
</c:if>

<c:if test="${requestScope.plist !=null and not empty requestScope.plist}">
<table border="1" cellpadding="3">
	<tr>
		<td>Product Id</td>
		<td>Name</td>
		<td>Price</td>
		<td>Quantity</td>
	</tr>
	<c:forEach items="${requestScope.plist}" var="p"> 		
	<tr>
		<td>${p.prodId}</td>
		<td>${p.prodNm}</td>
		<td>${p.prodPrice }</td>
		<td>${p.prodQty}</td>
	</tr>
	</c:forEach>
</table></c:if>

</body>
</html>