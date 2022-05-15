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
<title>Book Club</title>
</head>
<body>
<h1 class="text-center mb-5">Book Club</h1>
<div class="d-flex justify-content-around">
<form:form method="POST" action="/newUser" modelAttribute="newUser" class="col-4 p-4 bg-dark text-light">
<h2 class="text-primary text-center mb-5">Register</h2>
<p>
<form:label path="userName">Name: </form:label>
<form:errors path="userName"></form:errors>
<form:input path="userName"/>
</p>
<p>
<form:label path="email">Email: </form:label>
<form:errors path="email"></form:errors>
<form:input path="email"/>
</p>
<p>
<form:label path="password">Password: </form:label>
<form:errors path="password"></form:errors>
<form:password path="password"/>
</p>
<p>
<form:label path="confirm">Confirm Password: </form:label>
<form:errors path="confirm"></form:errors>
<form:password path="confirm"/>
</p>
<input type="submit" value="Register">

</form:form>

<form:form method="POST" action="/login" modelAttribute="newLogin" class="col-4 p-4 bg-dark text-light">
<h2 class="text-success text-center mb-5">Login</h2>
<p>
<form:label path="email">Email: </form:label>
<form:errors path="email"></form:errors>
<form:input path="email"/>
</p>
<p>
<form:label path="password">Password: </form:label>
<form:errors path="password"></form:errors>
<form:password path="password"/>
</p>
<input type="Submit" value="Login">

</form:form>
</div>
</body>
</html>