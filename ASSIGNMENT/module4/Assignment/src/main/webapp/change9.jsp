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
<form action="Qus9VerifyController" method="post">

<h1>Enter Email For Verify : </h1><input type="email" id="email" name="email">
<button name="action" value="submit" type="submit">Submit</button>
<button name="action" value="cancel" type="submit">Cancel</button>

</form>
</body>
</html>