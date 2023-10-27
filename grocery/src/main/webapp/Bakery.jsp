<%@ page import="java.util.Date"%>
<%@ page import="java.text.SimpleDateFormat"%>
<%@ page import="java.util.Date"%>
<%@ page import="java.text.SimpleDateFormat"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Display Page</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
	crossorigin="anonymous">

<style>
h3 {
	text-align: center;
}

body {
	background-image: linear-gradient(to right, rgb(230, 230, 250),
		rgb(135, 206, 235));
}
</style>
</head>
<body>

	<nav class="navbar navbar-expand-lg navbar-dark bg-dark">
		<div class="container-md">
			<a class="navbar-brand" href="#">X-Workz</a>
		</div>

		<div class="collapse navbar-collapse" id="navbarSupportedContent">
			<ul class="navbar-nav me-auto mb-2 mb-lg-0">

				<li class="nav-item"><a class="nav-link " href="index.jsp">Product
				</a></li>
			</ul>
		</div>
	</nav>


	<h3 style="color: green; margin-top: 10%">Grand_Total of ${dto.name} is : ${total}</h3>
	<br>

	<%
	Date currentDate = new Date();
	SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyy");
	String formattedDate = dateFormat.format(currentDate);
	%>

	<h3>
		Current Date :
		<%=formattedDate%></h3>
	<br>



	<%
	Date currentTime = new Date();
	SimpleDateFormat timeFormat = new SimpleDateFormat("HH:mm:ss");
	String formattedTime = timeFormat.format(currentTime);
	%>

	<h3>
		Current Time :
		<%=formattedTime%></h3>

</body>
</html>