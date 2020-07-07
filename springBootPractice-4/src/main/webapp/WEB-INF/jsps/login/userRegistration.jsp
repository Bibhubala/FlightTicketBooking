<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h4>User Registration</h4>
	<form action="insert" method="post">
		<pre>
First name:<input type="text" name="firstName"> <br>
Last Name:<input type="text" name="lastName"><br>
email:<input type="email" name="email"><br>
Password:<input type="password" name="password"><br> 
confirm password:<input type="password" name="confirmPassword"><br>
<input type="submit" value="Enter">
<a href="login"> click here for login</a>
</pre>
	</form>
	<br>
	<a href="login"> click here for login and book a flight</a>
	
</body>
</html>