<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
       <%@ include file = "front.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Add a Tournament</title>
<link rel="stylesheet" type="text/css" href="css/insertpage.css">
<link rel="stylesheet" type="text/css" href="css/button-style.css">
</head>
<body>
<h1>${msg }</h1>
	<form method="post" action="InsertTournamentServlet" class="insert-form"
		onsubmit="return validateForm()">
		<h2>Add a Tournament</h2>
		<input type="text" name="tourname" id="tourname"
			placeholder="Tournament Name" /> <br>
		<input class="submitButton" type="submit" value="Add Tournament">
	</form>
	<script src="js/validateinserttour.js"></script>
</body>
</html>