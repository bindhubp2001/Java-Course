<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Welcome to BakeryShopping</title>
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

				<li class="nav-item"><a class="nav-link active"
					href="index.jsp">Purchase </a></li>
			</ul>
		</div>
	</nav>

	<form action="purchase" method="post" style="margin-top: 4%">
		<div class="container">
			<div class="row">
				<div class="col-6">
					Item Name <input type="text" name="name" class="form-control" />
				</div>

				<div class="col-6">
					Item Price <input type="text" name="price" class="form-control" />
				</div>
			</div>
			<br>

			<div class="row">
				<div class="col-6">
					Quantity <select class="form-select" name="quantity">
						<option>--Select--</option>
						<option>1</option>
						<option>2</option>
						<option>3</option>
						<option>4</option>
						<option>5</option>
						<option>6</option>
						<option>7</option>
						<option>8</option>
						<option>9</option>
						<option>10</option>
					</select>
				</div>

				<div class="col-6">
					Discount <select class="form-select" name="disc">
						<option>--Select--</option>
						<option>5</option>
						<option>10</option>
						<option>15</option>
						<option>20</option>
						<option>50</option>
					</select>
				</div>
			</div>
			<br>

			<div class="row">
				<div class="col-6">
					GST <input type="text" name="gst" class="form-control" />
				</div>

				<div class="col-6">
					Manufacture Date <input type="date" name="manf"
						class="form-control" />
				</div>
			</div>
			<br>

			<div class="row">
				<div class="col-6">
					Expiry Date <input type=date name="exp" class="form-control" />
				</div>
			</div>
			<br> <br>

			<div class="text-center">
				<input type=submit value="SAVE" class="btn btn-success px-5 py-2" />
			</div>
			<br>

		</div>
	</form>

</body>
</html>