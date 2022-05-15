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
<title>BookShelf</title>
</head>
<body>
<div class="container mb-5">
<nav class="navbar navbar-expand-lg navbar-light bg-light">
<div class="container-fluid">
<h1 class="text-success">Welcome To The Bookshelf <c:out value="${userInSession.userName}"></c:out></h1>
<a class="navbar-brand" href="/logout">Logout</a> || <a class="navbar-brand" href="/new">Add A Book</a> || <a class="navbar-brand" href="/home">BookShelf Home</a>
</div>
</nav>
</div>
<div>
<table class="table table-striped table table-bordered border-success border border-5">
<thead>
<tr>
<th>ID</th>
<th>Title</th>
<th>Author</th>
<th>Added By</th>
</tr>
</thead>
<tbody>
<c:forEach items="${books}" var="book">
<tr>
<td> ${book.id} </td>
<td> <a href="/details/${book.id}"> ${book.title} </a></td>
<td> ${book.author} </td>
<td> ${book.user.userName} </td>
</tr>
</c:forEach>
</tbody>
</table>
</div>
</body>
</html>