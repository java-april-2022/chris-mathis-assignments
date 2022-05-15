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
<title>Add A Book</title>
</head>
<body>
<div class="container mb-5">
<nav class="navbar navbar-expand-lg navbar-light bg-light">
<div class="container-fluid">
<h1 class="text-success">Add Your Book To The Shelf</h1>
<a class="navbar-brand" href="/logout">Logout</a> || <a class="navbar-brand" href="/new">Add A Book</a> || <a class="navbar-brand" href="/home">BookShelf Home</a>
</div>
</nav>
</div>
<div class="d-flex justify-content-center">
<form:form method="POST" action="/newBook" modelAttribute="newBook" class="col-4 p-4 bg-success text-light text-center fs-3">
<p>
<form:label path="title">Title: </form:label>
<form:errors path="title"></form:errors>
<form:input path="title"/>
</p>
<p>
<form:label path="author">Author: </form:label>
<form:errors path="author"></form:errors>
<form:input path="author"/>
</p>
<p>
<form:label path="myThoughts">My Thoughts: </form:label>
<form:errors path="myThoughts"></form:errors>
<form:textarea path="myThoughts"/>
</p>
<p>
<form:hidden value="${userInSession.id}" path="user"/>
</p>
<input type="submit" value="Add">
</form:form>
</div>
</body>
</html>