<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>E-Tournica</title>
<link rel="stylesheet" type="text/css" href="css/welcome.css">
<link rel="stylesheet" type="text/css" href="css/login.css">
</head>
<body>
	<h1>
		<img
			src="https://livedemo00.template-help.com/wt_50776/images/logo.png"
			alt="logo" class="logo-img"> @ E-Tournica
	</h1>
	<h2>
		<i>Your stop for badminton updates</i>
	</h2>
	<div class="login-card">
		<center>
			<h5>${msg }</h5>
		</center>
		<h1>
			<b>Log-in</b>
		</h1>
		<br>
		<form method="post" action="UserValidationServlet"
			onsubmit="return validateForm()">

			<input type="text" name="username" placeholder="Username"
				id="username"> <input type="password" name="password"
				placeholder="Password" id="password"> <input type="submit"
				name="login" class="login login-submit" value="Login">
		</form>
	</div>
	<script src="js/validate.js"></script>

</body>
</html>