
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Home</title>
<link rel="stylesheet" type="text/css" href="<c:url value = "/css/front.css"/>">
</head>
<body>
	<ul>

		<li class="home">
			<%
				if (session.getAttribute("name").equals("admin")) {
			%>
			<form method="post" action="<c:url value = "/jsp/home.jsp"/>" class="form-button-home">
				<input class="button-add" type="submit" name="link" value="Home">
			</form>
			<%
				} else if (session.getAttribute("name").equals("user")) {
			%><form method="post" action="<c:url value = "/jsp/userhome.jsp"/>" class="form-button-home">
				<input class="button-add" type="submit" name="link" value="Home">
			</form>
			<%
				}
			%>
		</li>
		<li class="drop"><div class="dropdown">
				<button class="dropbtn">Add Data</button>
				<div class="dropdown-content">
					<form method="post" action="<c:url value = "/jsp/inserttour.jsp"/>" class="form-button">
						<input class="button-add" type="submit" name="link"
							value="Tournament">
					</form>
					<form method="post" action="<c:url value = "/jsp/insertplayer.jsp"/>" class="form-button">
						<input class="button-add" type="submit" name="link" value="Player">
					</form>
					<form method="post" action="<c:url value = "/ListServlet"/>" class="form-button">
						<input class="button-add" type="submit" name="link" value="Match">
					</form>
				</div>
			</div></li>

		<li class="retrieve"><form method="post"
				action="<c:url value = "/RetrievePlayerServlet"/>" class="form-button">
				<input class="button-add" type="submit" value="Retrieve Players">
			</form></li>
		<li class="drop"><div class="dropdown">
				<button class="dropbtn">Retrieve Matches</button>
				<div class="dropdown-content">
					<form method="post" action="<c:url value = "/RetrieveMatchServlet"/>"
						class="form-button">
						<input class="button-add" type="submit" value="All Matches">
					</form>
					<form method="post" action="<c:url value = "/ListServlet"/>" class="form-button-match">
						<input class="button-add" type="submit" name="link"
							value="Player vs Player">
					</form>
					<form method="post" action="<c:url value = "/ListServlet"/>" class="form-button-match">
						<input class="button-add" type="submit" name="link"
							value="Player in Tournament">
					</form>
				</div>
			</div></li>

		<li class="logout"><form method="post" action="<c:url value = "/LogoutServlet"/>"
				class="form-button">
				<input class="button-add" type="submit" value="Logout">
			</form></li>
	</ul>
</body>
</html>