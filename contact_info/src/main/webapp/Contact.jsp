<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Contact Information</title>
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

				<li class="nav-item"><a class="nav-link active"
					href="index.jsp">Home</a></li>
			</ul>
		</div>
	</nav>

	<div class="container d-flex justify-content-center"
		style="margin-top: 8%">
		<form action="contact" method="post">
			<div class="row">
				<div class="col-6">
					Name : <input type="text" name="name" id="name"
						class="form-control" />
				</div>
				<div class="col-6">
					Email : <input type="email" name="email" id="email"
						class="form-control" />
				</div>

			</div>
			<br> <br>
			<div class="row">
				<div class="col-6">
					Mobile : <input type="number" name="mobile" id="mobile"
						class="form-control" />
				</div>
				<div class="col-6">
					Comment : <input type="text" name="comment" id="comment"
						class="form-control">
					
				</div>

			</div>
			<br> <br>
			<div class="text-center">
				<input type=submit value="SEND" class="btn btn-success px-5 py-2" />
			</div>
	</div>

	</form>
</body>
</html>