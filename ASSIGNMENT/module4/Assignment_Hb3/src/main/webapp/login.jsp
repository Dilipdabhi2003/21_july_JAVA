<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
${msg }
<form action="LoginController" method="post">
<table>
<tr>
<td>Enter User Name :</td><td><input type="text" name="username"></td>
</tr>
<tr>
<td>Enter Password :</td><td><input type="password" name="password"></td>
</tr>
<tr>
<td><input type="submit" name="Login"></td>
</tr>
</table>
</form>
</body>
</html>