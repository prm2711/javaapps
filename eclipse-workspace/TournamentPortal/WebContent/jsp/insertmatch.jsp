<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ include file="front.jsp"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert Match</title>
<link rel="stylesheet" type="text/css" href="<c:url value = "/css/insertpage.css"/>">
<link rel="stylesheet" type="text/css" href="<c:url value = "/css/button-style.css"/>">


<!-- Latest compiled and minified CSS -->
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">

<!-- Optional theme -->
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap-theme.min.css">

<!-- Latest compiled and minified JavaScript -->
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>



<!-- Latest compiled and minified CSS -->
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/bootstrap-select/1.12.4/css/bootstrap-select.min.css">

<!-- Latest compiled and minified JavaScript -->
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/bootstrap-select/1.12.4/js/bootstrap-select.min.js"></script>

<!-- (Optional) Latest compiled and minified JavaScript translation files -->
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/bootstrap-select/1.12.4/js/i18n/defaults-*.min.js"></script>


</head>
<body>
	<h1>${msg }</h1>
	<form method="post" action="<c:url value = "/InsertMatchServlet"/>" class="insert-form"
		onsubmit="return validateForm()">
		<h2>Insert a Match</h2>
		<br> <select name="tourname" id="tourname">
			<option value="">Select Tournament Name</option>
			<c:forEach var="tour" items="${tour}">
				<option value="${tour }">${tour }</option>

			</c:forEach>
		</select> <br> <select name="player1" id="player1">
			<option value="">Select Player1 Name</option>
			<c:forEach var="player" items="${player}">
				<option value="${player }">${player}</option>

			</c:forEach>
		</select><br> <select name="player2" id="player2">
			<option value="">Select Player2 Name</option>
			<c:forEach var="player" items="${player}">
				<option value="${player }">${player}</option>

			</c:forEach>
		</select><br> <select name="winner" id="winner">
			<option value="">Winner</option>
			<c:forEach var="player" items="${player}">
				<option value="${player }">${player}</option>

			</c:forEach>
		</select><br> <select name="loser" id="loser">
			<option value="">Loser</option>
			<c:forEach var="player" items="${player}">
				<option value="${player }">${player}</option>
			</c:forEach>
		</select> <br> <input type="text" name="status" id="status"
			placeholder="Status" /><br> <input type="text" name="score"
			id="score" placeholder="Score" /><br> <input
			class="submitButton" type="submit" value="Insert Match">
	</form>
	<script src="<c:url value = "/js/validateinsert.js"/>"></script>

<!--  <script>
		$('.selectpicker').selectpicker({
			style : 'btn-info',
			size : 4
		});
	</script>-->	
</body>
</html>