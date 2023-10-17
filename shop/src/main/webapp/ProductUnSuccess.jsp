<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>X-Workz</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
	crossorigin="anonymous">

<style>
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

				<li class="nav-item"><a class="nav-link " href="Product.jsp">Product
				</a></li>
			</ul>
		</div>
	</nav>
	<form action="buyy" method="post" name="myForm">
	<span style="color:red;">Price is Mandatory</span>
		<div class="container" style='margin-top: 7%'>
			<div class="row">
				<div class="col-6">
					Name : <input type="text" name="${param.name}" class="form-control" />
				</div>
				<div class="col-6">
					Type : <select class="form-select" name="type">
						<option>--Select--</option>
						<option>FootWear</option>
						<option>Denim</option>
						<option>Jackets</option>
						<option>Traditional Wear</option>
						<option>Accessories</option>
						<option>Winter Wear</option>
					</select>
				</div>
			</div>
			<br>
			<div class="row">
				<div class="col-6">
					Price : <input type="text" name="price" class="form-control"
						required />
				</div>


				<div class="col-6">
					Brand : <input type="text" name="brand" class="form-control" />
				</div>
			</div>
			<br>
			<div class="row">
				<div class="col-6">
					Quantity : <select class="form-select" name="quantity">
						<option>--Select--</option>
						<option>1</option>
						<option>2</option>
						<option>3</option>
						<option>4</option>
						<option>5</option>
						<option>10</option>
					</select>
				</div>

				<div class="col-6">
					Desc :
					<textarea class="form-control" rows="2"></textarea>
				</div>
			</div>
			<br> <br>
			<div class="text-center">
				<input type="submit" value="Submit"
					class="btn btn-success px-5 py-2" />
			</div>
		</div>
	</form>


</body>
</html>