<%@page import="com.model.AssessmentUserModel"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>Jay Mataji</h1>
 <div class="container-xxl py-5">
        <div class="container">
            <div class="row g-5">
                <div class="col-lg-6 wow fadeIn" data-wow-delay="0.1s">
                    <h1 class="display-6 mb-5">If You are Existing Customer , so start Login</h1>

                    <form method="post" action="AssessmentVerifyController">
                        <div class="row g-3">
                           
                            <div class="col-md-6">
                                <div class="form-floating">
                                    <input type="text" class="form-control" id="email" name="newpassword" placeholder="Your Password">
                                    <label for="email">Your Password</label>
                                  
                                </div>
                            </div>
                                 <div class="col-md-6">
                                <div class="form-floating">
                                    <input type="text" class="form-control" id="email" name="Cpassword" placeholder="Your Confirm Password">
                                    <label for="email">Your Confirm Password</label>
                                  
                                </div>
                            </div>
                            <div class="col-12">
                                <button class="btn btn-primary py-3 px-5" name="action" value="confirm" type="submit">Confirm</button>
                                <button class="btn btn-primary py-3 px-5" name="action" value="cancel" type="submit">Cancel</button>
                            </div>
                           
                        </div>
                    </form>
                </div>
                
            </div>
        </div>
    </div>

</body>
</html>