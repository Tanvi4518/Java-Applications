<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">

<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65" crossorigin="anonymous">
<title>Add Product</title>
<style>
 *{
    padding :0;
    margin :0;
    box-sizing :border-box;
 }
 body{
   background :#eaedf2;
 }
 .row{
    background:white;
    border-radius :30px;
 }
  img{
  border-top-left-radius :30px;
  border-bottom-left-radius :30px;
  height:10000px ;
  margin-top:110px;
  
  }
  .btn1{
   border :none;
   outline :none;
   height : 50px;
   width : 100%;
   background-color:blue;
   color:white;
   border-radius:4px;
   font-weight:bold;
  }
  .btn1:hover{
   background :white;
   border :1px solid;
   color:blue;
  }
  #div1{
      text-align:center;
      color:blue;
  }
</style>
</head>
<body>
<%!String str=null; %>
<section class="Form">
<div class="container">
<div class="row no-gutter">
<div class="row">
<div class="col-lg-5">
<img src="https://sendmyshipment.com/xpanel/uploads/1559235399_785054-ecommerce-istock-020119.jpg"class="img-fluid" alt="ecart">
</div>
<div class="col-lg-7 px-5 pt-5">
<h1 style="color:blue;" class="font-weight-bold py-3 blue">Add Product in Cart</h1>
<form action="ProductController" method="get">
<div class="form-row">
  <div class="col-lg-7">
     <input type="text"  placeholder="Enter Product ID" name="prodId" class="form-control my-2 p-3">
  </div>
</div>
<div class="form-row">
  <div class="col-lg-7">
     <input type="text"  placeholder="Enter Product Name" name="prodNm" name="prodId" class="form-control my-2 p-3">
  </div>
</div>
<div class="form-row">
  <div class="col-lg-7">
     <input type="text"  placeholder="Enter Product Price" name="prodPrice" name="prodId" class="form-control my-2 p-3">
  </div>
</div>
<div class="form-row">
  <div class="col-lg-7">
     <input type="text"  placeholder="Enter Product Quantity" name="prodQty" name="prodId" class="form-control my-2 p-3">
  </div>
</div>
<div class="form-row">
  <div class="col-lg-7">
     <button type="submit" class="btn1 my-2 p-3" >Submit</button>
  </div>
</div>
<div >
<p style="text-align:right 30px">
<a href="Dashboard.html" >Back</a><br>
<p>
</div>
</form>
</div>
</div>
</div>
</div>
</section>

<div id="div1">
<% 
 str=(String)session.getAttribute("msg");
 session.invalidate();
%>
   <h1><%=str %></h1>
</div>
</body>
</html>