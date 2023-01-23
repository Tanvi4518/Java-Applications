<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Product List</title>
</head>
<body>
<form action="ProductServlet" method="get">
<table border='3px'>
<tr>
   <td>Product ID:</td>
   <td><input type="text" name="prodId"></td>
</tr>
<tr>
   <td>Product Name:</td>
   <td><input type="text" name="prodNm"></td>
</tr>
<tr>
   <td>Product Price:</td>
   <td><input type="text" name="prodPrice"></td>
</tr>
<tr>
   <td>Product Quantity:</td>
   <td><input type="text" name="prodQty"></td>
</tr>
<tr>
   <td><input type="submit" value="Add to cart"></td>
</tr>

</table>
</form>

</body>
</html>