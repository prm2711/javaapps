<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" type="text/css" href="css/styles.css">
<title>RSS feed</title>
</head>
<body>
<h1>Current Stories</h1>
	<%@ page import="java.sql.*"%>
	<%@ page import="java.net.*"%>
	<%@ page import="java.io.*"%>
	<%@ page import="org.json.*"%>
	<%@ page import="org.w3c.dom.Document"%>
	<%@ page import="org.xml.sax.*"%>
	<%@ page import="java.util.regex.*"%>

	<%
		JSONArray array = (JSONArray) request.getAttribute("array");
		
		try {
			for (int i = 0; i < array.length(); i++) {
				JSONObject object3 = (JSONObject) array.get(i);
	%>
	<div class="news-list">
	<%
				out.println("<br>"+ object3.get("description"));
	%>
	</div><br>
	<%
			}

		} catch (JSONException je) {
			System.out.println(je.toString());
		}
	%>
</body>
</html>