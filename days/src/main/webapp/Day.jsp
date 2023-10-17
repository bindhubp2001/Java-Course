<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>

<head>
<meta charset="ISO-8859-1">
<title>Add Day Form</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
	crossorigin="anonymous">


</head>

<body >
	<nav class="navbar navbar-expand-lg navbar-dark bg-dark">
		<div class="container-md">
			<a class="navbar-brand" href="#">X-Workz</a>
		</div>

		<div class="collapse navbar-collapse" id="navbarSupportedContent">
			<ul class="navbar-nav me-auto mb-2 mb-lg-0">
				<li class="nav-item"><a class="nav-link " aria-current="page"
					href="index.jsp">Home</a></li>
				<li class="nav-item"><a class="nav-link active" href="Day.jsp">Add
						Day </a></li>
			</ul>

		</div>
	</nav>
	<br>

	<h2 class="d-flex justify-content-center p-2">Add Day Here</h2>
	<br>

	<div class="container">
		<form action="day" method="post">

			<div class="row">
				<div class="col-6">
					<input type="text" name="date" class="form-control" placeholder="Enter Date"/>
				</div>

				<div class="col-6">
					<input type="text" name="month" class="form-control" placeholder="Enter Month"/>
				</div>
			</div>
			<br>

			<div class="row">
				<div class="col-6">
					<input type="text" name="year" class="form-control" placeholder="Enter Year"/>
				</div>

				<div class="col-6">
					<input type="text" name="day" class="form-control" placeholder="Enter Day"/>
				</div>
			</div>
			<br>


			<div class="text-center">
				<input type="submit" value="Save" class="btn btn-success px-5 py-2" />
			</div>
		</form>
	</div>
</body>

</html>