<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Address</title>
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
					href="LoginSuccess.jsp">Home</a></li>
				<li class="nav-item"><a class="nav-link active" href="#">Wecome,
						${info.userName}</a></li>
			</ul>
		</div>
	</nav>
	<div class="container" style='margin-top:5%;'>
		<form action="add" method="post">
		<span style="color:green; text-align:center">${success }</span>
			<div class="row">
				<div class="col-6">
					House No : <input type="text" name="houseNumber"
						class="form-control" />
				</div>

				<div class="col-6">
					State : <input type="text" name="state" class="form-control" />
				</div>
			</div>
			<br>
			<div class="row">
				<div class="col-6">
					Street : <input type="text" name="street" class="form-control" />
				</div>

				<div class="col-6">
					Country : <input type="text" name="country" class="form-control" />
				</div>
			</div>
			<br>
			<div class="row">
				<div class="col-6">
					City : <input type="text" name="city" class="form-control" />
				</div>
			</div>
			<br>

			<div class="text-center">
				<input type="submit" value="Send" class="btn btn-success px-5 py-2" />
			</div>

		</form>
	</div>
</body>
</html>