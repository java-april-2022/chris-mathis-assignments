<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
<title>Fruit Store</title>
</head>
<body>
<h1 class="d-flex justify-content-center">Fruit Store</h1>
<div class="table d-flex justify-content-center bg-dark text-light border border-warning border border-5">
<table class="col-sm-9">
<tbody>
<tr>
<th>Fruit</th>
<th>Price</th>
</tr>
<c:forEach var="key" items="${fruits.keySet()}">
<%-- <c:forEach var="cost" items="${priceFromMyController}"> --%>
<tr> 
<td>${key}</td>
<td>${fruits[key]}<%-- ${cost} --%></td>
</tr>
</c:forEach>
<%-- </c:forEach> --%>
</tbody>
</table>
</div>
</body>
</html>