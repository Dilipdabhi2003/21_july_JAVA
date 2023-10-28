<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login Page</title>
</head>
<body>
${msg }
<h1><center>Forgot Password</center></h1>
<form method="post" action="AssessmentVerifyController">
                        <div class="row g-3">
                           
                            <div class="col-md-6">
                                <div class="form-floating">
                                    <input type="email" class="form-control" id="email" name="email" placeholder="Your Email">
                                    <label for="email">Your Email</label>
                                </div>
                            </div>
                                
                            <div class="col-12">
                                <button class="btn btn-primary py-3 px-5" name="action" value="submit" type="submit">Submit</button>
                                <button class="btn btn-primary py-3 px-5" name="action" value="cancel" type="submit">Cancel</button>
                            </div>
                           
                        </div>
                    </form>
                
</body>
</html>