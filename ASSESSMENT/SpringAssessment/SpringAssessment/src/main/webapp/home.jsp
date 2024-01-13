<!DOCTYPE html> 
<%@page import="com.model.UserModel"%>
<html lang="en"> 
<head> 
	<link href= 
"https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css"
	rel="stylesheet"
	/> 
</head> 
<style>
    .container {
        border: 1px solid #ccc; /* Add a border around the container */
        padding: 20px; /* Add some padding for better visual appearance */
        border-radius: 10px; /* Optional: Add rounded corners */
    }

    form {
        border: 1px solid #ddd; /* Add a border around the form */
        padding: 15px; /* Add some padding for better visual appearance */
        border-radius: 5px; /* Optional: Add rounded corners */
    }

    /* Optional: Add some styling for form groups, labels, and inputs */
    .form-group {
        margin-bottom: 15px;
    }

    label {
        display: block;
        margin-bottom: 5px;
    }

    input {
        width: 100%;
        padding: 8px;
        box-sizing: border-box;
        border: 1px solid #ddd;
        border-radius: 5px;
    }
     .navbar {
        display: flex;
        justify-content: center;
    }
</style>

<body> 
	<!-- NAVBAR -->
	
	<%
	UserModel model=(UserModel)session.getAttribute("userModel");
	%>
	<nav class="navbar navbar-expand navbar-dark bg-success" > 
	<div class="container-fluid"> 
		<a class="navbar-brand" href="./"> 
		Home
		</a> 
		<ul class="navbar-nav me-auto mb-2 mb-lg-0"> 
		<!-- NAVBAR LINKS -->
		<li class="nav-item"> 
			<a class="nav-link active" href="#"><%=model.getFname() %></a> 
		</li> 
		<li class="nav-item"> 
			<a class="nav-link" href="register.jsp">LogOut</a> 
		</li>
		<li class="nav-item"> 
			<a class="nav-link" href="Forgot.jsp">Change Password</a> 
		</li> 
		</ul> 
	</div> 
	</nav> 
	
	<div class="container">
        <h2 align="center">User Sign Up</h2>
        <form >
     
            <div class="form-group">
                <label for="name">First Name:</label>
                <input type="text" id="name" name="fname" value="<%=model.getFname() %>" readonly>
            </div>
            <div class="form-group">
                <label for="name">Last Name:</label>
                <input type="text" id="name" name="lname" value="<%=model.getLname() %>" readonly>
            </div>
            <div class="form-group">
                <label for="email">Email:</label>
                <input type="email" id="email" name="email" value="<%=model.getEmail() %>" readonly>
            </div>
            <div class="form-group">
                <label for="mobile">Mobile:</label>
                <input type="text" id="mobile" name="mobile" value="<%=model.getMobile() %>" readonly>
            </div>
            <div class="form-group">
                <label for="address">Address:</label>
                <input type="text" id="address" name="address" value="<%=model.getAddress() %>" readonly>
            </div>
            <div class="form-group">
                <label for="gender">Gender:</label>
                <input type="radio" id="gender" name="gender" value="Male"<%=model.getGender().equals("Male") ? "checked" : "" %> readonly>Male <input type="radio" id="gender" name="gender" value="FeMale"<%=model.getGender().equals("FeMale") ? "checked" : "" %> readonly>FeMale
            </div>
            <div class="form-group">
                <label for="password">Password:</label>
                <input type="text" id="password" value="<%=model.getPassword() %>" name="password">
            </div>
            <div class="form-group">
                <label for="password">Confirm Password:</label>
                <input type="text" id="cpassword" value="<%=model.getCpassword() %>" name="cpassword">
            </div>
            
        </form>
    </div>
	
</body> 
</html>
