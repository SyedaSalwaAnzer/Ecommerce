<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@ page isELIgnored="false" %>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="x" %>
   <%@  include   file="header.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Show Users</title>
</head>
<body>
<x:forEach items="${userList}" var="user">
${user.userName}
${user.password}
${user.email}
${user.contact}
</x:forEach>
</body>
</html>