<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!-- c:out ; c:forEach etc. --> 
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!-- Formatting (dates) --> 
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!-- form:form -->
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!-- for rendering errors on PUT routes -->
<%@ page isErrorPage="true" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
<title>Dojo Details</title>
</head>
<body>
<h1><c:out value="${dojo.name}"></c:out> Location Ninjas</h1>
<table>
<tr>
<th>First Name</th>
<th>Last Name</th>
<th>Age</th>
</tr>
<c:forEach items="${dojo.ninjas}" var="ninjas">
<tr>
<td><c:out value="${ninja.firstName}"></c:out></td>
<td><c:out value="${ninja.lastName}"></c:out></td>
<td><c:out value="${ninja.age}"></c:out></td>
</tr>
</c:forEach>
</table>
<a href="/" role="button">Home</a>
</body>
</html>