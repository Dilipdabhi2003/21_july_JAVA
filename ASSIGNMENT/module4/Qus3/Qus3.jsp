<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form method="post" action="Qus3Servlet" >
<center>	
	<tr>
		<td>Enter Firstname :</td><td><input type="text" name="fname"></td>
	</tr><br><br>
	
	<tr>
		<td>Enter Lastname :</td><td><input type="text" name="lname"></td>
	</tr><br><br>
	
	<tr>
		<td>Enter Email :</td><td><input type="email" name="email"></td>
	</tr><br><br>
	
	<tr>
		<td>Enter Mobile :</td><td><input type="tel" name="mobile"></td>
	</tr><br><br>
	
	<tr>
		<td>Gender :</td><td><input type="radio" name="gender" value="Male">Male<input type="radio" name="gender" value="Female">Female</td>
	</tr><br><br>
	
	<tr>
		<td>Password :</td><td><input type="password" name="password"></td>
	</tr><br><br>
	
	<input type="submit" value="Login">
</center>	
</form>

</body>
</html>