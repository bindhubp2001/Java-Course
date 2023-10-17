<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css"
	integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
	crossorigin="anonymous">
</head>

<body>

	<nav class="navbar navbar-expand-lg navbar-dark bg-dark">
		<a class="navbar-brand" href="#">X-Workz</a>
		<button class="navbar-toggler" type="button" data-toggle="collapse"
			data-target="#navbarNav" aria-controls="navbarNav"
			aria-expanded="false" aria-label="Toggle navigation">
			<span class="navbar-toggler-icon"></span>
		</button>
		<div class="collapse navbar-collapse" id="navbarNav">
			<ul class="navbar-nav">
				<li class="nav-item"><a class="nav-link" href="Match.jsp">Match</a></li>
			</ul>
		</div>
	</nav>

	<h3 style="text-align: center;">
		Tournament name : ${dto.name}<br> Host Country : ${dto.host}<br>
		Date : ${dto.date}<br> Team 1 : ${dto.team1}<br> Team 2 :
		${dto.team2}<br> Captain 1 : ${dto.captain1}<br> Captain 2 :
		${dto.captain2}<br> Umpire : ${dto.umpire}<br> Stadium :
		${dto.stadium}<br> Third Umpire : ${dto.umpire3}<br>
		Capacity : ${dto.capacity}<br>
		<h4 style="color: green; text-align: center;">Saved
			SucessFully...</h4>
	</h3>

</body>
</html>