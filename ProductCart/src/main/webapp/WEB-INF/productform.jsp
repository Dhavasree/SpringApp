<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<head>
<title>Bootstrap Example</title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
<body>


	<nav class="navbar navbar-inverse">
		<div class="container-fluid">
			<div class="navbar-header">
				<a class="navbar-brand" href="#">PRODUCT CART</a>
			</div>
			<ul class="nav navbar-nav">
				<li class="active"><a href="home">Home</a></li>
				<li><a href="findproduct">See Product</a></li>
			</ul>
		</div>
	</nav>
	<div class="container">
		<div class="page-header">
			<h4>Welcome, Enter The Product Details</h4>
		</div>
		<div>
			<form action="saveproduct" method="Post">
				<div class="form-group">
					<label for="model">MODEL:</label> <input name="model"
						class="form-control" placeholder="Enter Model Name" type="text" /><br />
				</div>
				<div class="form-group">
					<label for="brand">BRAND:</label> <input name="brand_name"
						class="form-control" placeholder="Enter Brand Name" type="text" /><br />
				</div>
				<div class="form-group">
					<label for="contry">COUNTRY:</label> <input name="country"
						class="form-control" placeholder="Enter Country" type="text" /><br />
				</div>
				<div class="form-group">
					<label for="price">PRICE:</label> <input name="price"
						class="form-control" placeholder="Enter Price" type="text" /><br />
				</div>

				<button type="submit" class="btn btn-default">Submit</button>
			</form>
		</div>
	</div>
</body>
</html>