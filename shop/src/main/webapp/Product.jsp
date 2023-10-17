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

<style>
body {
	background-image: linear-gradient(to right, rgb(230, 230, 250),
		rgb(135, 206, 235));
}
</style>

<script>
	function validateStringInput(inputValue) {
		return inputValue.trim().length > 3;
	}

	function validateTypeSelectInput(inputValue) {
		return inputValue !== "--Select--";
	}

	function validateQuantitySelectInput(inputValue) {
		return inputValue !== "--Select--";
	}

	function priceValidate(inputValue) {
		return inputValue > 0;
	}
	
	function validateDescInput(inputValue) {
		return inputValue.trim().length > 3 && inputValue.trim().length <= 20;
	}

	function validateForm() {
		var stringInput = document.getElementById('name').value;
		var typeSelectInput = document.getElementById('type').value;
		var quantitySelectInput = document.getElementById('quantity').value;
		var priceInput = document.getElementById('price').value;
		var descInput = document.getElementById('desc').value;

		if (!validateStringInput(stringInput)) {
			alert("Please enter a valid string with at least 4 characters.");
			return false;
		}

		if (!validateTypeSelectInput(typeSelectInput)) {
			alert("Please select an option.");
			return false;
		}

		if (!validateQuantitySelectInput(quantitySelectInput)) {
			alert("Please select an option.");
			return false;
		}

		if (!priceValidate(priceInput)) {
			alert("Please enter a valid non-negative number.");
			return false;
		}
		
		if (!validateDescInput(descInput)) {
			alert("Please enter description max of 20 characters.");
			return false;
		}

		return true;
	}
</script>

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
	<form action="buy" method="post" name="myForm"
		onsubmit="return validateForm()">

		<div class="container" style='margin-top: 7%'>
			<div class="row">
				<div class="col-6">
					Name : <input type="text" name="name" id="name"
						class="form-control" />
				</div>
				<div class="col-6">
					Type : <select class="form-select" name="type" id="type">
						<option selected>--Select--</option>
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
					Price : <input type="number" name="price" id="price"
						class="form-control" required />
				</div>


				<div class="col-6">
					Brand : <input type="text" name="brand" class="form-control" />
				</div>
			</div>
			<br>
			<div class="row">
				<div class="col-6">
					Quantity : <select class="form-select" name="quantity"
						id="quantity">
						<option selected>--Select--</option>
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
					<textarea class="form-control" rows="2" name="desc" id="desc"></textarea>
				</div>
			</div>
			<br> <br>
			<div class="text-center">
				<input type="submit" value="Submit"
					class="btn btn-success px-5 py-2" />
			</div>
		</div>
	</form>

	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM"
		crossorigin="anonymous"></script>
</body>
</html>