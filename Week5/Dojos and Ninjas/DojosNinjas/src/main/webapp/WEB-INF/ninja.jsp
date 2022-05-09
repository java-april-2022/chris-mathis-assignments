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
<title>New Ninja</title>
</head>
<body>
<h1>Add A Ninja</h1>
<form:form method="POST" action="/newNinja" modelAttribute="ninja">
<form:form>
<form:label path="dojo">Dojo Name:</form:label>
<form:errors path="dojo"></form:errors>
<form:select path="dojo">
<c:forEach items="${listDojos}" var="dojo">
<option value="${dojo.id}">${dojo.name}</option>
</c:forEach>
</form:select>
<form:label path="firstName">First Name:</form:label>
<form:errors path="firstName"></form:errors>
<form:input path="firstName"/>
<form:label path="lastName">Last Name:</form:label>
<form:errors path="lastName"></form:errors>
<form:input path="lastName"/>
<form:label path="age">Age:</form:label>
<form:errors path="age"></form:errors>
<form:input path="age"/>
<input type="submit" value="Train Ninja">
</form:form>

</form:form>
</body>
</html>