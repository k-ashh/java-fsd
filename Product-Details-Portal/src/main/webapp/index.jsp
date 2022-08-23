<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ page import="com.portal.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Product Details Portal</title>
</head>
<body>
<h1 align="center">Welcome to the Product Details Portal</h1>
<h3 align="center">Enter the Product Details Below:</h3>
<div align="center">
	<form action="./Submission" method="post">
	Product ID: <input type="number" name="id"><br>
	Product Name:<input type="text" name="name"><br>
	Product Price: <input type="text" name="price"><br>
	Manufacturer: <input type="text" name="manufacturer"><br>
	Model: <input type="text" name="model"><br>
	<input type="submit" value="submission">
	</form>
</div>

</body>
</html>