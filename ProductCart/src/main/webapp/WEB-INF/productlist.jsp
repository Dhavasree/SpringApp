<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<title>My Product List</title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
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
				<li><a href="addproduct">Add Product</a></li>
			</ul>
		</div>
	</nav>
	<div class="container">
		<div>
			<h2>Product Cart</h2>
		</div>
		<div class="jumbotron text-center">
			<input class="form-control" id="myInput" type="text"
				placeholder="Type to search Products..">
		</div>

		<table class="table table-striped" id="myList">

			<tr>
				<th>Brand Name</th>
				<th>Model</th>
				<th>Product Price</th>
				<th>Country</th>
			</tr>
			<c:forEach items="${productli}" var="product">
				<tbody id="myTable">
					<tr>
						<td>${product.brand_name}</td>
						<td>${product.model}</td>
						<td>${product.price}</td>
						<td>${product.country}</td>
					</tr>
				</tbody>
				<br />
			</c:forEach>
		</table>
	</div>
	<script>
		$(document)
				.ready(
						function() {
							$("#myInput")
									.on(
											"keyup",
											function() {
												var value = $(this).val()
														.toLowerCase();
												$("#myTable tr")
														.filter(
																function() {
																	$(this)
																			.toggle(
																					$(
																							this)
																							.text()
																							.toLowerCase()
																							.indexOf(
																									value) > -1)
																});
											});
						});
	</script>

</body>
</html>