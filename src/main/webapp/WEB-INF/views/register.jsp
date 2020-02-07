<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="spform" %>
    <%@  include   file="header.jsp" %>
<!DOCTYPE html>
<html lang="en">
<head>
  <title>register</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js"></script>
</head>
<body>

<div class="container">
  <h2><b>Sign up</b></h2>
  <spform:form action="carryuser" method="post" modelAttribute="usr"  >
  <div class="form-group">
      <label for="username">Username</label>
     <spform:input type="text" class="form-control"  placeholder="Enter User name" path="userName"/>
    </div>
     
    <div class="form-group">
      <label for="email">Email:</label>
      <spform:input type="email" class="form-control"  placeholder="Enter email" path="email"/>
    </div>
    <div class="form-group">
      <label for="mobile">Contact:</label>
      <spform:input type="number" class="form-control"  placeholder="Contact Number" path="contact"/>
    </div>
     <div class="form-group">
      <label for="pwd">Create password:</label>
     <spform:input type="password" class="form-control"  placeholder="Enter password" path="password"/>
    </div>
    <spform:select  class="from-control" path="role">
    <spform:option value="ROLE_USER">user</spform:option>
    <spform:option value="ROLE_ADMIN">admin</spform:option>
    </spform:select>
    <button type="submit" class="btn btn-primary"><b>SignUp!</b></button>
  </spform:form>
</div>

</body>
</html>
