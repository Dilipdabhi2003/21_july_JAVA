<!DOCTYPE html>
<html lang="zxx">

<head>
    <meta charset="UTF-8">
    <meta name="description" content="Male_Fashion Template">
    <meta name="keywords" content="Male_Fashion, unica, creative, html">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Male-Fashion | Template</title>

    <!-- Google Font -->
    <link href="https://fonts.googleapis.com/css2?family=Nunito+Sans:wght@300;400;600;700;800;900&display=swap"
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
                
                <a href="cregistration.jsp">Sign Up</a>
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
            <a href="#" class="search-switch"><img src="img/icon/search.png" alt=""></a>
            <a href="#"><img src="img/icon/heart.png" alt=""></a>
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
   <%@ include file="header.jsp" %> <!-- Header Section End -->

    <!-- Map Begin -->
     <div class="col-lg-7 offset-lg-4">
                    <div class="banner__item">
                        <div class="banner__item__pic">
                            <img src="img/banner/banner-1.jpg" alt="">
                        </div>
                        <div class="banner__item__text">
                            <h2>Clothing Collections 2030</h2>
                            <a href="#">Shop now</a>
                        </div>
                    </div>
                </div>
    <!-- Map End -->

    <!-- Contact Section Begin -->
    <section class="contact spad">
        <div class="container">
            <div class="row">
                <div class="col-lg-6 col-md-6">
                    <div class="contact__text">
                        <div class="section-title">
                            <span>Information</span>
                            <h1>Welcome Back!</h1>
                            <h3>Please Sign in now</h3>
                        </div>
                    </div>
                </div>
                <div class="col-lg-6 col-md-6">
                    <div class="contact__form">
                        
                        <div class="col-lg-12 col-md-12">
                    <div class="login_part_form">
                        <div class="login_part_form_iner">
                            
                            <form class="row contact_form" action="CustomerController" method="post" novalidate="novalidate">
                                <div class="col-md-12 form-group p_star">
                                    <input type="email" class="form-control" id="email" name="email" 
                                        placeholder="Email">
                                </div>
                                <div class="col-md-12 form-group p_star">
                                    <input type="password" class="form-control" id="password" name="password" 
                                        placeholder="Password">
                                </div>
                                <div class="col-md-12 form-group">
                                    <button type="submit" value="login" name="action" class="btn_3">
                                        LOGIN
                                    </button>
                                    <button type="submit" value="cancel" name="action" class="btn_3">
                                        CANCEL
                                    </button>
                                    
                                </div>
                                <a href="forgotpassword.jsp" bgcolor="">Forgot Password</a>
                            </form>
                                </div>
                        </div>
                    </div>
                </div>
                    </div>
                </div>
            </div>
       
    </section>
    <!-- Contact Section End -->

    <!-- Footer Section Begin -->
    <%@ include file="footer.jsp" %>
    <!-- Footer Section End -->

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