<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
<meta charset="UTF-8">
<title>Write Your Destiny</title>
</head>
<body>
<h1 class="text-center mb-5">Send an Omikuji!</h1>
<div class="text-center bg-primary text-light m-3 p-3 d-flex justify-content-center">
<form action="/process" method="post">

<div class = "m-3">
<label for="" class="form-label">Pick any number 5 to 25</label>
<input type="number" class="form-control" name="number"/>
</div>

<div class = "m-3">
<label for="" class="form-label">Enter the name of a city</label>
<input type="text" class="form-control" name="city"/>
</div>

<div class = "m-3">
<label for="" class="form-label">Enter the name of a person</label>
<input type="text" class="form-control" name="person"/>
</div>

<div class = "m-3">
<label for="" class="form-label">Enter the name of a hobby or occupation</label>
<input type="text" class="form-control" name="hobby"/>
</div>

<div class = "m-3">
<label for="" class="form-label">Enter the name of a living thing</label>
<input type="text" class="form-control" name="thing"/>
</div>

<div class = "m-3">
<label for="" class="form-label">Say something nice</label>
<textarea name="message" class="form-control" id="" cols="30" rows="5"></textarea>
</div>

<p>Send and show a friend.</p>

<input class="m-3" type="submit" value="Create"/>

</form>
</div>
</body>
</html>