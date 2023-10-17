<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Application Form</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
	crossorigin="anonymous">
<style>
body {
	background:
		url("https://images.unsplash.com/photo-1625225233840-695456021cde?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D&auto=format&fit=crop&w=1470&q=80");
	background-size: cover;
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
				<li class="nav-item"><a class="nav-link " aria-current="page"
					href="index.jsp">Home</a></li>
				<li class="nav-item"><a class="nav-link active"
					href="LoanApply.jsp">Apply </a></li>
			</ul>

		</div>
	</nav>
	<br>

	<h2 class="d-flex justify-content-center p-2">Fill The Form</h2>
	<br>

	<div class="container">
		<form action="loans" method="post">

			<div class="row">
				<div class="col-6">
					Name : <input type="text" name="name" class="form-control" />
				</div>

				<div class="col-6">
					Working Place : <input type="text" name="working"
						class="form-control" />
				</div>
			</div>
			<br>

			<div class="row">
				<div class="col-6">
					Amount : <input type="text" name="amount" class="form-control" />
				</div>

				<div class="col-6">
					Intrest : <input type="text" name="intrest" class="form-control" />
				</div>
			</div>
			<br>

			<div class="row">
				<div class="col-6">
					Surety : <input type="text" name="surety" class="form-control" />
				</div>

				<div class="col-6">
					Company : <input type="text" name="company" class="form-control" />
				</div>
			</div>
			<br>

			<div class="row">
				<div class="col-6">
					Loan Tenure : <input type="text" name="loanTenure"
						class="form-control" />
				</div>

				<div class="col-6">
					Loan Type : <input type="text" name="loanType" class="form-control" />
				</div>
			</div>
			<br>

			<div class="form-check">
				<input class="form-check-input" type="checkbox" value=""
					id="flexCheckDefault" required> <label
					class="form-check-label" for="flexCheckDefault"> <strong>Accept The
					Terms </strong></label>
			</div>


			<div class="text-center">
				<input type="submit" value="Submit"
					class="btn btn-success px-5 py-2" />
			</div>
		</form>
	</div>

</body>
</html>