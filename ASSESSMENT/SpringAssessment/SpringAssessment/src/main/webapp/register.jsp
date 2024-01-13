<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Employee Page</title>
<script type="text/javascript">
function validateForm() {
    var fname = document.forms["register"]["fname"].value;
    var lname = document.forms["register"]["lname"].value;
    var address = document.forms["register"]["address"].value;
    var mobile = document.forms["register"]["mobile"].value;
    var gender = document.forms["register"]["gender"].value;
    var email = document.forms["register"]["email"].value;
    var password = document.forms["register"]["password"].value;
	var cpassword = document.forms["register"]["cpassword"].value;
    if (fname === "" && lname ==="") {
        alert("Name must be filled out");
        return false;
    }
    if (address === "") {
        alert("Address must be filled out");
        return false;
    }
    if (mobile === "" || isNaN(mobile) || mobile.length !== 10) {
        alert("Number must be a 10-digit number");
        return false;
    }
    if (gender === "") {
        alert("Please select a gender");
        return false;
    }
    if (email === "" || !validateEmail(email)) {
        alert("Please enter a valid email address");
        return false;
    }
    if (password === "" || !validatePassword(password)) {
        alert("Password must contain at least one lowercase, one uppercase, one number, one special character and minimum 8 characters");
        return false;
    }
    if(password !== cpassword){
    	alert("Your password And Confirm Password Not Same");
    	return false;
    }
    
    return true;
}

function validateEmail(email) {
    var emailRegex = /^[^\s@]+@[^\s@]+\.[^\s@]+$/;
    return emailRegex.test(email);
}

function validatePassword(password) {
    var passwordRegex = /^(?=.*[a-z])(?=.*[A-Z])(?=.*\d)(?=.*[@$!%?&])[A-Za-z\d@$!%?&]{8,}$/;
    return passwordRegex.test(password);
}
</script>
<style>

 body {
            font-family: Arial, sans-serif;
            background-color: #f2f2f2;
        }
        .container {
            max-width: 400px;
            margin: 0 auto;
            padding: 20px;
            background-color: #fff;
            border-radius: 5px;
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
        }
        h2 {
            text-align: center;
            margin-bottom: 20px;
        }
        .form-group {
            margin-bottom: 15px;
        }
        label {
            display: block;
            margin-bottom: 5px;
            font-weight: bold;
        }
        input[type="text"],
        input[type="email"],
        input[type="password"] {
            width: 100%;
            padding: 10px;
            border-radius: 5px;
            border: 1px solid #ccc;
        }
        input[type="submit"] {
            width: 100%;
            padding: 10px;
            background-color: #4CAF50;
            color: #fff;
            border: none;
            border-radius: 5px;
            cursor: pointer;
        }
        input[type="submit"]:hover {
            background-color: #45a049;
        }

</style>
</head>
<body>
<div class="container">
        <h2 align="center">User Sign Up</h2>
        <form action="ActionController" method="post">
            <div class="form-group">
                <label for="name">First Name:</label>
                <input type="text" id="name" name="fname" required>
            </div>
            <div class="form-group">
                <label for="name">Last Name:</label>
                <input type="text" id="name" name="lname" required>
            </div>
            <div class="form-group">
                <label for="email">Email:</label>
                <input type="email" id="email" name="email" required>
            </div>
            <div class="form-group">
                <label for="mobile">Mobile:</label>
                <input type="text" id="mobile" name="mobile" required>
            </div>
            <div class="form-group">
                <label for="address">Address:</label>
                <input type="text" id="address" name="address" required>
            </div>
            <div class="form-group">
                <label for="gender">Gender:</label>
                <input type="radio" id="gender" name="gender" value="Male" required>Male <input type="radio" id="gender" name="gender" value="FeMale" required>FeMale
            </div>
            <div class="form-group">
                <label for="password">Password:</label>
                <input type="password" id="password" name="password">
            </div>
            <div class="form-group">
                <label for="password">Confirm Password:</label>
                <input type="password" id="cpassword" name="cpassword">
            </div>
            <input type="submit" name="action" value="Register">
        </form>
    </div>

</body>
</html>