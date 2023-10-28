<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login Page</title>
</head>
<body>
${msg }
<h1><center>Login Page</center></h1>
<form method="post" action="AssessmentLoginController">
<table>
<tr>
	<td>Email : </td><td><input type="text" name="email"></td><br><br>
</tr>

<tr>
	<td>Password : </td><td><input type="password" name="password"></td><br><br>
</tr>

	<tr>
<td><input type="submit" name="action" value="Login"></td>
</tr>

<tr>
<td><a href="Forgot.jsp">Forgot Password</td>
</tr>
</table></form>
</body>
</html>