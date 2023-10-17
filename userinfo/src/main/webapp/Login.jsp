<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
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
				<li class="nav-item"><a class="nav-link active"
					href="Login.jsp">Login </a></li>
			</ul>
		</div>
	</nav>

	<div class="container d-flex justify-content-center"
		style="margin-top: 8%">
		<form action="fill" method="post">
			<span style="color: red;">${error }</span>
			<div class="row">
				<div class="">
					User ID : <input type="text" name="name" class="form-control" />
				</div>
			</div>
			<br>
			<div class="row">
				<div class="">
					Password : <input type="password" name="password"
						class="form-control" />
				</div>
			</div>
			<br>
			<div class="text-center">
				<input type="submit" value="Submit"
					class="btn btn-success px-5 py-2" />
			</div>
		</form>
	</div>
</body>
</html>