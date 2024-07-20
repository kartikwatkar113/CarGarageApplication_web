<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login - GoGarage AutoMobs</title>
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css"
	integrity="sha384-xOolHFLEh07PJGoPkLv1IbcEPTNtaed2xpHsD9ESMhqIYd0nLMwNLD69Npy4HI+N"
	crossorigin="anonymous">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.6.0/css/all.min.css" integrity="sha512-Kc323vGBEqzTmouAECnVceyQqyqdsSiqLQISBL29aUW4U/M7pSPA/gEUZQqv1cwx4OnYxTxve5UMg5GT6L4JJg==" crossorigin="anonymous" referrerpolicy="no-referrer" />
<link rel="stylesheet" href="myCSS.css"/>
</head>
<body>
	<nav class="navbar navbar-light fixed-top" style='background-color:#E1C16E; width: 100%;'>
		<a class="navbar-brand" href="#"> <i class="fa-solid fa-car-on"></i>
			GoGarage AutoMobs
		</a>
	</nav>
	<div class="main-content">
		<div class="login-form">
			<h2>Employee Login</h2>
			<form action="EmpController" method="Post">
				<div class="form-group" >
					<label for="username">Username:</label>
					<input type="text" class="form-control" id="username" name="username" required>
				</div>
				<div class="form-group" style='margin-bottom:20px;'>
					<label for="password">Password:</label>
					<input type="password" class="form-control" id="password" name="password" required>
				</div>
				<button type="submit" class="btn btn-dark btn-block">Login</button>
				<div class="fgt" style=""><a href="" >Forgot Password</a></div>
			</form>
		</div>
	</div>
	<div class="footer">
		Copyright ©2024 GoGarage AutoMobs Pune. All rights reserved
	</div>
	<script src="https://cdn.jsdelivr.net/npm/jquery@3.5.1/dist/jquery.slim.min.js"
		integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj"
		crossorigin="anonymous"></script>
	<script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js"
		integrity="sha384-9/reFTGAW83EW2RDu2S0VKaIzap3H66lZH81PoYlFhbGU+6BZp6G7niu735Sk7lN"
		crossorigin="anonymous"></script>
	<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/js/bootstrap.min.js"
		integrity="sha384-+sLIOodYLS7CIrQpBjl+C7nPvqq+FbNUBDunl/OZv93DB7Ln/533i8e/mZXLi/P+"
		crossorigin="anonymous"></script>
</body>
</html>
