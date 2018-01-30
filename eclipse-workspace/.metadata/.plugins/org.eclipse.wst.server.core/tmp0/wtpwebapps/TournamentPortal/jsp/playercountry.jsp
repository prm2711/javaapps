<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ include file="front-user.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Player by Country</title>
<link rel="stylesheet" type="text/css" href="<c:url value = "/css/styles.css"/>">
<link rel="stylesheet" type="text/css" href="<c:url value = "/css/button-style.css"/>">
<link rel="stylesheet" type="text/css" href="<c:url value = "/css/insertpage.css"/>">
</head>
<body>
	<h1>${msg }</h1>
	<form method="post" action="<c:url value = "/ViewCountryServlet"/>" class="insert-form"
		onsubmit="return validateForm()">
		<input type="text" name="country" id="country"
			placeholder="Enter Country" /><br> <input class="submitButton"
			type="submit" value="View Player by Country">
	</form>
	<script src="<c:url value = "/js/validatecountry.js"/>"></script>
</body>
</html>