<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.*" %>
<%@ page import="com.portal.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Display</title>
</head>
<body>
<h3 align="center">Product Information</h3><br>
<% Product p = (Product)request.getAttribute("Product"); %>
<table align="center" border="1" >
	<tr bgcolor="00ff7f">
		<b>
		<th>Product ID</th>
		<th>Product Name</th>
		<th>Price</th>
		<th>Manufacturer</th>
		<th>Model</th>
		</b>
	</tr>
	<tr>
		<td><%= p.getId() %></td>
		<td><%= p.getName() %></td>
		<td><%= p.getPrice() %></td>
		<td><%= p.getManufacturer() %></td>
		<td><%= p.getModel() %></td>
	</tr>
</table>
</body>
</html>