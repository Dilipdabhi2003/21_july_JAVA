<!DOCTYPE html>
<%@page import="com.model.SubProductModel"%>
<%@page import="com.model.CustomerModel"%>
<%@page import="com.util.DBUtil"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<html lang="zxx">

<head>
<meta charset="UTF-8">
<meta name="description" content="Male_Fashion Template">
<meta name="keywords" content="Male_Fashion, unica, creative, html">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta http-equiv="X-UA-Compatible" content="ie=edge">
<title>Male-Fashion | Template</title>

<!-- Google Font -->
<link
	href="https://fonts.googleapis.com/css2?family=Nunito+Sans:wght@300;400;600;700;800;900&display=swap"
	rel="stylesheet">

<!-- Css Styles -->
<link rel="stylesheet" href="css/bootstrap.min.css" type="text/css">
<link rel="stylesheet" href="css/font-awesome.min.css" type="text/css">
<link rel="stylesheet" href="css/elegant-icons.css" type="text/css">
<link rel="stylesheet" href="css/magnific-popup.css" type="text/css">
<link rel="stylesheet" href="css/nice-select.css" type="text/css">
<link rel="stylesheet" href="css/owl.carousel.min.css" type="text/css">
<link rel="stylesheet" href="css/slicknav.min.css" type="text/css">
<link rel="stylesheet" href="css/style.css" type="text/css">

 <style>
        /* Add styles for the form container */
        #feedback_form_container {
            border: 15px solid #ccc;
            padding: 20px;
            border-radius: 10px;
            margin: 20px;
        }

        /* Add styles for the form labels */
        label {
            font-weight: bold;
        }

        /* Add styles for the form inputs */
        .form-control {
            width: 100%;
            padding: 8px;
            margin: 5px 0 15px 0;
            display: inline-block;
            border: 1px solid #ccc;
            box-sizing: border-box;
            border-radius: 4px;
        }

        /* Add styles for the form buttons */
        .btn {
            padding: 10px 20px;
            font-size: 16px;
            border: none;
            border-radius: 4px;
            cursor: pointer;
        }

        .btn-success {
            background-color: #4CAF50;
            color: white;
        }
    </style>
</head>

<body>

	<!-- Page Preloder -->
	<div id="preloder">
		<div class="loader"></div>
	</div>

	<!-- Offcanvas Menu Begin -->
	<div class="offcanvas-menu-overlay"></div>
	<div class="offcanvas-menu-wrapper">
		<div class="offcanvas__option">
			<div class="offcanvas__links">
				<a href="#">Sign in</a> <a href="#">FAQs</a>
			</div>
			<div class="offcanvas__top__hover">
				<span>Usd <i class="arrow_carrot-down"></i></span>
				<ul>
					<li>USD</li>
					<li>EUR</li>
					<li>USD</li>
				</ul>
			</div>
		</div>
		<div class="offcanvas__nav__option">
			<a href="#" class="search-switch"><img src="img/icon/search.png"
				alt=""></a> <a href="#"><img src="img/icon/heart.png" alt=""></a>
			<a href="#"><img src="img/icon/cart.png" alt=""> <span>0</span></a>
			<div class="price">$0.00</div>
		</div>
		<div id="mobile-menu-wrap"></div>
		<div class="offcanvas__text">
			<p>Free shipping, 30-day return or refund guarantee.</p>
		</div>
	</div>
	<!-- Offcanvas Menu End -->

	<%@ include file="header.jsp"%>
	<!-- Header Section End -->

	<!-- Breadcrumb Section Begin -->
	<!-- Breadcrumb Section End -->

	<!-- Shopping Cart Section Begin -->
	<div id="feedback_form_container">
	<h2>Feedback</h2>
	<div class="mb-4 small">Please provide your feedback in the form
		below</div>
	<form name="feedback_form" id="feedback_form" action="ReviewController" method="post">
		<div class="row">
			<div class="col">
				<label class="form-label" for="feedback_name">Your Name:</label> <input
					type="text" required name="name" class="form-control"
					id="feedback_name" />
			</div>

			<div class="col mb-4">
				<label class="form-label" for="feedback_email">Email:</label> <input
					type="email" name="email" required class="form-control"
					id="feedback_email" />
			</div>
		</div>
		
		<label>How do you rate your overall experience?</label>
		<div class="mb-3 d-flex flex-row py-1">
			<div class="form-check mr-3">
				<input class="form-check-input" type="radio" name="rating"
					id="rating_bad" value="bad"> <label
					class="form-check-label" for="rating_bad"> Bad </label>
			</div>

			<div class="form-check mx-3">
				<input class="form-check-input" type="radio" name="rating"
					id="rating_good" value="good"> <label
					class="form-check-label" for="rating_good"> Good </label>
			</div>

			<div class="form-check mx-3">
				<input class="form-check-input" type="radio" name="rating"
					id="rating_excellent" value="excellent"> <label
					class="form-check-label" for="rating_excellent"> Excellent!
				</label>
			</div>
		</div>
		<div class="mb-4">
			<label class="form-label" for="feedback_comments">Comments:</label>
			<textarea class="form-control" required rows="6" name="comments"
				id="feedback_comments"></textarea>
		</div>
		
		<button type="submit" name="action" value="review">Post</button>
	</form>
</div>
	<!-- Shopping Cart Section End -->

	<!-- Footer Section Begin -->

	<!-- Footer Section End -->
	<%@ include file="footer.jsp"%>
	<!-- Search Begin -->
	<div class="search-model">
		<div class="h-100 d-flex align-items-center justify-content-center">
			<div class="search-close-switch">+</div>
			<form class="search-model-form">
				<input type="text" id="search-input" placeholder="Search here.....">
			</form>
		</div>
	</div>
	<!-- Search End -->

	<!-- Js Plugins -->
	<script src="js/jquery-3.3.1.min.js"></script>
	<script src="js/bootstrap.min.js"></script>
	<script src="js/jquery.nice-select.min.js"></script>
	<script src="js/jquery.nicescroll.min.js"></script>
	<script src="js/jquery.magnific-popup.min.js"></script>
	<script src="js/jquery.countdown.min.js"></script>
	<script src="js/jquery.slicknav.js"></script>
	<script src="js/mixitup.min.js"></script>
	<script src="js/owl.carousel.min.js"></script>
	<script src="js/main.js"></script>
</body>

</html>