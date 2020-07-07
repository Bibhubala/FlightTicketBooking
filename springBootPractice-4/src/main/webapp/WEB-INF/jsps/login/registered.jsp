<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h4>Login profile</h4>

	
<%-- First name:${user.firstName}<br>
Last Name:${user.lastName}<br>
Middle Name:${user.middleName}<br>
email:${user.email}<br>
Password:${user.password}<br> 
 --%>
 
 <%-- <form action="flight" method="post">
 email:<input type="email" name="email"><br>
 password:<input type="password" name="password"><br>
 <input type="submit" value="login">
 ${msg}
 </form> --%>

<form action="flight" method="post">
email:<input type="text" name="email"><br>
password:<input type="password" name="password"> <br>
<input type="submit" value="Register"> <br>
<p style="color:red">${msg}</p>
</form>

</body>
</html>