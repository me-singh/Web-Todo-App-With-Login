<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>

<head>
<meta charset="ISO-8859-1">
<link href="webjars/bootstrap/3.3.6/css/bootstrap.min.css"
		rel="stylesheet">
<title>Title</title>

<style>
	.footer {
		position: absolute;
		bottom: 0;
		width: 100%;
		height: 60px;
		background-color: #f5f5f5;
	}
</style>

</head>

<body>

<nav class="navbar navbar-default">
	
	<a href="/" class="navbar-brand">Brand</a>

	<ul class="nav navbar-nav">
		<li class="active"><a href="#">Home</a></li>
		<li><a href="/show-todo.do">Todos</a></li>
		<li><a href="http://www.in28minutes.com">In28Minutes</a></li>
	</ul>

	<ul class="nav navbar-nav navbar-right">
		<li><a href="/login.do">Login</a></li>
	</ul>

</nav>

<div class="container">
	<p><font color="red">${error}</font></p>
	<form action="/login.do" method="post">
	Enter name: <input type="text" name="name"/>
	Enter password: <input type="password" name="password"/>
	<input type="submit" value="Login" class="btn btn-succes"/>
	</form>
</div>

<footer class="footer">
	<p>footer content</p>
</footer>

<script src="webjars/jquery/1.9.1/jquery.min.js"></script>
<script src="webjars/bootstrap/3.3.6/js/bootstrap.min.js"></script>

</body>
</html>