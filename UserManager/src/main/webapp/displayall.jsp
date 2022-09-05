<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ page import="com.example.*" %>
<%@ page  import="java.util.*"%>
    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Display</title>
</head>
<body>
<%List<User> u=(List<User>)request.getAttribute("user");
%>

<table  border="1">
<tr><th>id</th><th>User Name</th><th>Password</th></tr>
<%for(User usr:u){ %>
<tr><td><%=usr.getUid()%></td><td><%=usr.getUname() %></td><td><%=usr.getUpassword() %></td></tr>
<%} %>
</table>

</body>

</html>
