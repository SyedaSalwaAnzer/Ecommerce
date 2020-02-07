<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@ page isELIgnored="false" %>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    

    
    <%@  include   file="header.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Show Products</title>
</head>
<body>
<div class="jumbotron">
  <div class="container text-center">
    <h1>Electronics</h1>      
  </div>
</div>

ID 
NAme
Price
Description
Moreinfo

<div class="container">  
<c:forEach items="${productList}" var="pro">

${pro.productName}
${pro.productId}
 ${pro.productPrice}
 ${pro.productDescription}
 
<a href="info?pid=${product.productid}">moreinfo</a>
</c:forEach>
 
 <!--  
<div class="container">    
  <div class="row">
    <div class="col-sm-4">
      <div class="panel panel-primary">
        <div class="panel-heading">${pro.productName}</div>
        <div class="panel-body"><img src="https://placehold.it/150x80?text=IMAGE" class="img-responsive" style="width:100%" alt="Image"></div>
        <div class="panel-footer">${pro.productId} ${pro.productPrice}</div>
      </div>
    </div>
</div> -->
<br>

</div>
</body>
</html>














<!--
<table  border="3" align="center" > <tr><th>PriductId</th><th>ProductName</th><th>ProductPrice</th></tr>
<x:forEach items="${productList}" var="pro">
<tr>
<td>${pro.productId}</td>
<td>${pro.productName}</td>
<td>${pro.productPrice}</td>
</tr></table>
</x:forEach>
<div class="container">
    <div class="row">
      <div class="col-sm-9 col-md-7 col-lg-5 mx-auto">
        <div class="card card-signin my-5">
          <div class="card-body">
    !<        <h5 class="card-title text-center">Sign In</h5>
            <form class="form-signin">
              <div class="form-label-group">
                <input type="email" id="inputEmail" class="form-control" placeholder="Email address" required autofocus>
                <label for="inputEmail">Email address</label>
              </div>

              <div class="form-label-group">
                <input type="password" id="inputPassword" class="form-control" placeholder="Password" required>
                <label for="inputPassword">Password</label>
              </div>

              <div class="custom-control custom-checkbox mb-3">
                <input type="checkbox" class="custom-control-input" id="customCheck1">
                <label class="custom-control-label" for="customCheck1">Remember password</label>
              </div>
              <button class="btn btn-lg btn-primary btn-block text-uppercase" type="submit">Sign in</button>
              <hr class="my-4">
              <button class="btn btn-lg btn-google btn-block text-uppercase" type="submit"><i class="fab fa-google mr-2"></i> Sign in with Google</button>
              <button class="btn btn-lg btn-facebook btn-block text-uppercase" type="submit"><i class="fab fa-facebook-f mr-2"></i> Sign in with Facebook</button>
            </form>
          </div>
        </div>
      </div>
    </div>
  </div>-->
