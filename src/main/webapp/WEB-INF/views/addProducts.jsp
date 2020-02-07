<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="spform" %>
   <%@  include   file="header.jsp" %>
    
    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Products</title>
</head>



<body>

<spform:form action="carryproducts" method="post" modelAttribute="product"  >

<div class="container">

  <h2><b>Product Details</b></h2>
  
  <div class="form-group">
     <label>Product code</label>
     <spform:input type="number" class="form-control"  placeholder="Enter product code" path="productId"/>
  </div>
    
  <div class="form-group">
      <label>Product name</label>
      <spform:input type="text" class="form-control"  placeholder="Enter Product name" path="productName"/>
  </div>
    
  <div class="form-group">
      <label>Product price</label>
      <spform:input type="number" class="form-control"  placeholder="$$$" path="productPrice"/>
  </div>
  
  <div class="form-group">
    <label for="comment">Description:</label>
    <textarea class="form-control" rows="5" id="comment" path="productDescription"></textarea>
  </div>
  
    <button type="submit" class="btn btn-primary"><b>Add Product</b></button>
    
 </spform:form>


</body>
</html>