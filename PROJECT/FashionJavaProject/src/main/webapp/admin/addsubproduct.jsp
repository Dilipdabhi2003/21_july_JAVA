<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="com.util.DBUtil"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <title>DarkPan - Bootstrap 5 Admin Template</title>
    <meta content="width=device-width, initial-scale=1.0" name="viewport">
    <meta content="" name="keywords">
    <meta content="" name="description">

    <!-- Favicon -->
    <link href="img/favicon.ico" rel="icon">

    <!-- Google Web Fonts -->
    <link rel="preconnect" href="https://fonts.googleapis.com">
    <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
    <link href="https://fonts.googleapis.com/css2?family=Open+Sans:wght@400;600&family=Roboto:wght@500;700&display=swap" rel="stylesheet"> 
    
    <!-- Icon Font Stylesheet -->
    <link href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.10.0/css/all.min.css" rel="stylesheet">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.4.1/font/bootstrap-icons.css" rel="stylesheet">

    <!-- Libraries Stylesheet -->
    <link href="lib/owlcarousel/assets/owl.carousel.min.css" rel="stylesheet">
    <link href="lib/tempusdominus/css/tempusdominus-bootstrap-4.min.css" rel="stylesheet" />

    <!-- Customized Bootstrap Stylesheet -->
    <link href="css/bootstrap.min.css" rel="stylesheet">

    <!-- Template Stylesheet -->
    <link href="css/style.css" rel="stylesheet">
</head>

<body>

 <div class="container-fluid position-relative d-flex p-0">
        <!-- Spinner Start -->
        <div id="spinner" class="show bg-dark position-fixed translate-middle w-100 vh-100 top-50 start-50 d-flex align-items-center justify-content-center">
            <div class="spinner-border text-primary" style="width: 3rem; height: 3rem;" role="status">
                <span class="sr-only">Loading...</span>
            </div>
        </div>
        <!-- Spinner End -->
        <%@ include file="sidebar.jsp" %>
        	 <!-- Content Start -->
       		 <div class="content">
       		 	<%@ include file="header.jsp" %>
       		 		<div class="container-fluid">
				<div class="row column_title">
					<div class="col-md-12">
						<div class="page_title">
							<h1>Add Main Product :</h1>
						</div>
					</div>
				</div>
			</div>
			
			
			<!-- Sign In Start -->
        <div class="container-fluid">
            <div class="row h-100 align-items-center justify-content-center" style="min-height: 100vh;">
                <div class="col-12 col-sm-8 col-md-6 col-lg-5 col-xl-4">
                    <div class="bg-secondary rounded p-4 p-sm-5 my-4 mx-3">
                        <div class="d-flex align-items-center justify-content-between mb-3">
                            <a href="index.html" class="">
                        
                            </a>
                            <h3>Add Product</h3>
                        </div>
                        <form method="post" action="../AdminController" enctype="multipart/form-data">
                        <select name="mproductid">
                        <option value="0">---Select Main Product---</option>
                        <%
                        	Connection cc=new DBUtil().getConnectionData();
                        	String qry="select * from mainproduct";
                        	PreparedStatement st=cc.prepareStatement(qry);
                        	ResultSet rs=st.executeQuery();
                        	while(rs.next())
                        	{
                        %>
                        	<option value="<%=rs.getInt(1)  %>"><%= rs.getString(2) %></option>
                        	
                       	<%
                        	}
                        	cc.close();
                       	%>
                        </select>
                        
                        
                        <div class="form-floating mb-3">
                            <input type="text" class="form-control" name="sproductname" id="floatingInput" placeholder="Enter Sub Product Name">
                            <label for="floatingInput">Enter Sub Product Name</label>
                        </div>
                        <div class="form-floating mb-4">
                            <input type="file" class="form-control" name="simage" id="floatingPassword">
                        </div>
                        <div class="form-floating mb-3">
                            <input type="text" class="form-control" name="price" id="floatingInput" placeholder="Enter Sub Product Price">
                            <label for="floatingInput">Enter Price</label>
                        </div>
                        <div class="form-floating mb-3">
                            <input type="text" class="form-control" name="content" id="floatingInput" placeholder="Enter Sub Product content">
                            <label for="floatingInput">Enter Product Content</label>
                        </div>
                        
                        <button type="submit" class="btn btn-primary py-3 w-100 mb-4" value="addsubproduct" name="action">ADD</button>
                       
                        </form>
                    </div>
                </div>
            </div>
        </div>
       		 			<%@ include file="footer.jsp" %>
        	</div>
        <!-- Content End -->
       <!-- Back to Top -->
        <a href="#" class="btn btn-lg btn-primary btn-lg-square back-to-top"><i class="bi bi-arrow-up"></i></a>
    </div>
 <!-- JavaScript Libraries -->
    <script src="https://code.jquery.com/jquery-3.4.1.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0/dist/js/bootstrap.bundle.min.js"></script>
    <script src="lib/chart/chart.min.js"></script>
    <script src="lib/easing/easing.min.js"></script>
    <script src="lib/waypoints/waypoints.min.js"></script>
    <script src="lib/owlcarousel/owl.carousel.min.js"></script>
    <script src="lib/tempusdominus/js/moment.min.js"></script>
    <script src="lib/tempusdominus/js/moment-timezone.min.js"></script>
    <script src="lib/tempusdominus/js/tempusdominus-bootstrap-4.min.js"></script>

    <!-- Template Javascript -->
    <script src="js/main.js"></script>
</body>

</html>