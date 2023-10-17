<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Success Page</title>
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
				<li class="nav-item"><a class="nav-link active"
					aria-current="page" href="index.jsp">Home</a></li>
				<li class="nav-item"><a class="nav-link " href="LoanApply.jsp">Apply
				</a></li>
			</ul>
		</div>
	</nav>

	<h4 style='text-align: center;'>
		<br>Name : ${name}<br> <br> Amount : ${amount }<br>
		<br> Working Place : ${working}<br> <br> Intrest :
		${intrest }<br> <br>Surety : ${surety}<br> <br>
		Company : ${company }<br> <br>Loan Tenure : ${loanTenure}<br>
		<br> Loan Type : ${loanType }<br>

	</h4>
	<br>

	<h3 style='text-align: center; color:green;'>Loan Information
		Saved SuccessFully...</h3>
</body>
</html>