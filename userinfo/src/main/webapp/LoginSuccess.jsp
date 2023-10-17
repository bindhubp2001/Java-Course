<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>LoginSuccess</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
	crossorigin="anonymous">

</head>
<body>
	<nav class="navbar navbar-expand-lg navbar-dark bg-dark">
		<div class="container-md">
			<a class="navbar-brand" href="#">X-Workz</a>
		</div>

		<div class="collapse navbar-collapse" id="navbarSupportedContent">
			<ul class="navbar-nav me-auto mb-2 mb-lg-0">
				<li class="nav-item"><a class="nav-link " aria-current="page"
					href="index.jsp">Home</a></li>
				<li class="nav-item"><a class="nav-link" href="Login.jsp">Login</a></li>
				<li class="nav-item"><a class="nav-link active" href="#">Wecome,
						${info.userName}</a></li>
			</ul>
		</div>
	</nav>

	<h2 style="text-align:center; color:green;margin-top:6%">Login
		SuccessFully......</h2>

	<div style="text-align:center">
		<a class="btn btn-bd-download d-lg-inline-block my-2 my-md-0 ms-md-3"
			href="Adress.jsp">Add Adress</a>
	</div>

</body>
</html>