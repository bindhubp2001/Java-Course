<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login Success</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
	crossorigin="anonymous">

<style>
body {
	 background-image: linear-gradient(to right,rgb(230,230,250), rgb(135,206,235));
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

	<h4 style='text-align: center; margin-top: 4%'>
		Name : ${items.name}<br> <br> Type : ${items.type}<br>
		<br> Price : ${items.price}<br> <br> Brand :
		${items.brand}<br> <br> Quantity : ${items.quantity}<br>

		<br>Description : ${items.desc}<br>
		<br>
		<h3 style="color: green; text-align: center;">Grand_Total :
			${items.total}</h3>
		<br> <br>
	</h4>
</body>
</html>