<%@page import="com.util.DBUtil"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
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
				<a href="#"></a>
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

	<!-- Header Section Begin -->
	<%@ include file="header.jsp" %>	<!-- Header Section End -->

	<!-- Hero Section Begin -->
	<section class="hero">
		<div class="hero__slider owl-carousel">
			<div class="hero__items set-bg" data-setbg="img/hero/hero-1.jpg">
				<div class="container">
					<div class="row">
						<div class="col-xl-5 col-lg-7 col-md-8">
							<div class="hero__text">
								<h6>Summer Collection</h6>
								<h2>Fall - Winter Collections 2030</h2>
								<p>A specialist label creating luxury essentials. Ethically
									crafted with an unwavering commitment to exceptional quality.</p>
								<a href="#" class="primary-btn">Shop now <span
									class="arrow_right"></span></a>
								<div class="hero__social">
									<a href="#"><i class="fa fa-facebook"></i></a> <a href="#"><i
										class="fa fa-twitter"></i></a> <a href="#"><i
										class="fa fa-pinterest"></i></a> <a href="#"><i
										class="fa fa-instagram"></i></a>
								</div>
							</div>
						</div>
					</div>
				</div>
			</div>
			<div class="hero__items set-bg" data-setbg="img/hero/hero-2.jpg">
				<div class="container">
					<div class="row">
						<div class="col-xl-5 col-lg-7 col-md-8">
							<div class="hero__text">
								<h6>Summer Collection</h6>
								<h2>Fall - Winter Collections 2030</h2>
								<p>A specialist label creating luxury essentials. Ethically
									crafted with an unwavering commitment to exceptional quality.</p>
								<a href="#" class="primary-btn">Shop now <span
									class="arrow_right"></span></a>
								<div class="hero__social">
									<a href="#"><i class="fa fa-facebook"></i></a> <a href="#"><i
										class="fa fa-twitter"></i></a> <a href="#"><i
										class="fa fa-pinterest"></i></a> <a href="#"><i
										class="fa fa-instagram"></i></a>
								</div>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</section>
	<!-- Hero Section End -->

	<%@ include file="banner.jsp"%>


	<!-- Product Section Begin -->
	<section class="product spad">
		<div class="container">
			<div class="row">
				<div class="col-lg-12">
					<ul class="filter__controls">
						<li class="active" data-filter="*">Best Sellers</li>
						<li data-filter=".new-arrivals">New Arrivals</li>
						<li data-filter=".hot-sales">Hot Sales</li>
					</ul>
				</div>
			</div>
			<div class="row product__filter">
				<%
				Connection cc = new DBUtil().getConnectionData();
				String qry = "select * from mainproduct";
				PreparedStatement st = cc.prepareStatement(qry);
				ResultSet rs = st.executeQuery();
				while (rs.next()) {
				%>
				<div
					class="col-lg-3 col-md-6 col-sm-6 col-md-6 col-sm-6 mix new-arrivals">
					<div class="product__item">
						<div class="product__item__pic set-bg" data-setbg="">
							<img alt="" src="productimage\<%=rs.getString(3)%>"
								height="260PX" width="350px"> <span class="label">New</span>
							<ul class="product__hover">
								<li><a href="#"><img src="img/icon/heart.png" alt=""></a></li>
								<li><a href="#"><img src="img/icon/compare.png" alt="">
										<span>Compare</span></a></li>
								<li><a href="#"><img src="img/icon/search.png" alt=""></a></li>
							</ul>
						</div>
						<div class="product__item__text">
							<h6><%=rs.getString(2)%></h6>
							<a href="viewsubproduct.jsp?mproductid=<%=rs.getInt(1)%>"
								class="add-cart">+ See More</a>
							<div class="rating">
								<i class="fa fa-star-o"></i> <i class="fa fa-star-o"></i> <i
									class="fa fa-star-o"></i> <i class="fa fa-star-o"></i> <i
									class="fa fa-star-o"></i>
							</div>

							<div class="product__color__select">
								<label for="pc-1"> <input type="radio" id="pc-1">
								</label> <label class="active black" for="pc-2"> <input
									type="radio" id="pc-2">
								</label> <label class="grey" for="pc-3"> <input type="radio"
									id="pc-3">
								</label>
							</div>
						</div>
					</div>
				</div>
				<%
				}
				cc.close();
				%>

			</div>
		</div>
	</section>
	<!-- Product Section End -->

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
	w
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