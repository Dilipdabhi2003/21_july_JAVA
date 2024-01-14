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
							<h1>Edit sub Product :</h1>
						</div>
					</div>
				</div>
			</div>
			
			
			<!-- Sign In Start -->
        <div class="container">
            <div class="row justify-content-center">
                <div class="col-md-6">
                            <h3>Edit Sub Product</h3>
                        </div>
                        <form method="post" action="../AdminController" enctype="multipart/form-data">
                        <table>
                         <%
                        	Connection cc=new DBUtil().getConnectionData();
                        	String qry="select * from subproduct where sproductid=?";
                        	PreparedStatement st=cc.prepareStatement(qry);
                        	st.setInt(1, Integer.parseInt(request.getParameter("sproductid")));
                        	ResultSet rs=st.executeQuery();
                        	if(rs.next())
                        	{
                        %>
                        	
                        	
                       	
                      
                        
                        <tr><td><input  type="text" name="mproductid" value="<%=rs.getInt(2)  %>"  readonly></td></tr>
                        <tr>
                        <td>Enter Sub Product Name :<td>
                        <td><input type="text" name="sproductname"  value="<%= rs.getString(3)%>"></td>
                        </tr>
                        <tr>
                        <td>Enter New Image :</td>
                            <td><input type="file" name="simage"  value="<%=rs.getString(4) %>>"></td>
                        </tr>
                        <tr>
                            <td>Enter Price:<td>
                           <td> <input type="text"  name="price"   value="<%= rs.getString(5)%>"></td>
                        </tr>
                        <tr>
                            <td>Enter Product Content</td>
                            <td><input type="text"  name="content"  value="<%= rs.getString(6)%>"></td>
                        </tr>
                        <tr>
                        <td><input type="hidden" name="mproductid" value="<%=rs.getInt(2) %>"></td>
                        <td><input type="hidden" name="sproductid" value="<%=rs.getInt(1) %>"></td>
                        <td><button type="submit"  value="edit" name="action">Edit</button></td>
                       </tr>
                       <%
                       }
                        cc.close();	
                        	%>
                        
                      	</table>
                       	 </form>
                    </div></div></div>
              
       		 			<%@ include file="footer.jsp" %>
        	
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