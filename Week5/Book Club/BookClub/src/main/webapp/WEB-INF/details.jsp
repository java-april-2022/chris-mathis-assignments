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
<title>Book Details</title>
</head>
<body>
<div class="container mb-5">
<nav class="navbar navbar-expand-lg navbar-light bg-light">
<div class="container-fluid">
<h1 class="text-success">Book Details</h1>
<a class="navbar-brand" href="/logout">Logout</a> || <a class="navbar-brand" href="/new">Add A Book</a> || <a class="navbar-brand" href="/home">BookShelf Home</a>
</div>
</nav>
</div>
<div class="d-flex justify-content-center">
<div class="card text-white bg-success mb-3 fs-3" style="max-width: 40rem;">
  <div class="card-body">
    <p class="card-title fs-1 text-center bg-light text-dark">${book.title}</p>
    <p class="card-text">${book.user.userName} read ${book.title} by ${book.author},</p>
    <p class="card-text">Here are ${book.user.userName}'s thoughts:</p>
    <p class="card-text">${book.myThoughts}</p>
  </div>
  </div>
  </div>
</body>
</html>