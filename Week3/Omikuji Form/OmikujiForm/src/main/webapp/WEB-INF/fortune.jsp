<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
<meta charset="UTF-8">
<title>Your Fortune</title>
</head>
<body>
<h1 class="text-center mb-5">Here Is Your Omikuji!!</h1>
<div class="text-center bg-primary text-light m-3 p-3 d-flex justify-content-center">
<p class="fs-3 m-3 p-3">In <c:out value="${number}"/> years you will live in <c:out value = "${city}"/> 
with <c:out value = "${person}"/> as your roommate, selling <c:out value = "${hobby}"/> 
for a living. The next time you see a <c:out value = "${thing}"/>, you will have good luck. 
Also, <c:out value = "${message}"/>.</p></div>
<a class="m-3 d-flex justify-content-center" href="/">New Fortune</a>

</body>
</html>