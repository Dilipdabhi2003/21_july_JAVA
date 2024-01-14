<!DOCTYPE html>
<%@page import="com.model.CustomerModel"%>
<html lang="zxx">

<head>
<title>Male-Fashion | Template</title>

<!-- Google Font -->
<!-- <link
	href="https://fonts.googleapis.com/css2?family=Nunito+Sans:wght@300;400;600;700;800;900&display=swap"
	rel="stylesheet">


<link rel="stylesheet" href="css/bootstrap.min.css" type="text/css">
<link rel="stylesheet" href="css/font-awesome.min.css" type="text/css">
<link rel="stylesheet" href="css/elegant-icons.css" type="text/css">
<link rel="stylesheet" href="css/magnific-popup.css" type="text/css">
<link rel="stylesheet" href="css/nice-select.css" type="text/css">
<link rel="stylesheet" href="css/owl.carousel.min.css" type="text/css">
<link rel="stylesheet" href="css/slicknav.min.css" type="text/css">
<link rel="stylesheet" href="css/style.css" type="text/css"> -->

<script type="text/javascript">
	var xhttp = new XMLHttpRequest();
	var RazorpayOrderId;
	function CreateOderID() {
		alert("Payment mode");

		var number = document.getElementById("amount").value;
		alert(number);
		xhttp.open("GET",
				"http://localhost:8080/FashionJavaProject/OrderCreation?amount="
						+ number, false);
		xhttp.send();
		RazorpayOrderId = xhttp.responseText;
		OpenCheckOut();
	}
</script>
<script src="https://checkout.razorpay.com/v1/checkout.js"></script>
<script type="text/javascript">
	function OpenCheckOut() {
		alert("Welcome To Razorpay");
		var number = document.getElementById("amount").value;
		alert(number);
		var options = {
			/* "key":"rzp_test_eNcc019nABBIgL", */
			"key" : "rzp_test_Lidx6sR8sO3SjL",
			"amount" : number,
			"currency" : "INR",
			"name" : "Male Fashion",
			"description" : "Test",
			"order_id" : RazorpayOrderId,
			"callback_url" : "http://localhost:8080/FashionJavaProject/OrderCreation",
			"prefill" : {
				"name" : "Male Fashion",
				"email" : "dilipdabhi0017@gmail.com",
				"contact" : "9016545414"
			},
			"notes" : {
				"address" : "s.nagar"
			},
			"theme" : {
				"color" : "#3399cc"
			}

		};
		var rzp1 = new Razorpay(options);
		rzp1.on('Payment Failed', function(response) {
			alert(response.error.code);
			alert(response.error.description);
			alert(response.error.source);
			alert(response.error.step);
			alert(response.error.reason);
			alert(response.error.metadata.order_id);
			alert(response.error.metadata.payment_id);
		});
		rzp1.open();
		/* e.preventDefault(); */
	}
</script>

</head>
<body>

	<!-- Page Preloder -->
	<div id="preloder">
		<div class="loader"></div>
	</div>

	<!-- Offcanvas Menu Begin -->

	<!-- Offcanvas Menu End -->

	<!-- Header Section Begin -->
	<%-- <%@ include file="header.jsp"%> --%>
	<%
	String total = request.getParameter("total");
	
	%>


		<h1 align="center">Payment Now!</h1>

	<div
		style="display: flex; justify-content: center; align-items: center; height: 100vh; border: 1;">
		<table>

			<tr>
				<th>Total</th>
				<th colspan="1">Action</th>
			</tr>


			<tr>
			<td class="quantity__item"><input type="text" id="amount"
					value="<%=total%>" readonly></td>
					
				<td><button id="payButton" onclick="CreateOderID()"
						 style="background-color: red;
  color: #fff;"> 
 Pay Now Checkout</button></td>
			</tr>


		</table>
	</div>

	<!-- Footer Section Begin -->
	<%-- <%@ include file="footer.jsp"%> --%>

	<!-- Footer Section End -->

	<!-- Search Begin -->

	<!-- Search End -->

	<!-- Js Plugins -->
	<!-- <script src="js/jquery-3.3.1.min.js"></script>
	<script src="js/bootstrap.min.js"></script>
	<script src="js/jquery.nice-select.min.js"></script>
	<script src="js/jquery.nicescroll.min.js"></script>
	<script src="js/jquery.magnific-popup.min.js"></script>
	<script src="js/jquery.countdown.min.js"></script>
	<script src="js/jquery.slicknav.js"></script>
	<script src="js/mixitup.min.js"></script>
	<script src="js/owl.carousel.min.js"></script>
	<script src="js/main.js"></script> -->
</body>

</html>