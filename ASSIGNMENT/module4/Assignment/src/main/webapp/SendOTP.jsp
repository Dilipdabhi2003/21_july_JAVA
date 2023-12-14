<%@page import="com.model.Qus9Model"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
</head>

<body>
<h1 class="display-6 mb-5">If You are Existing Customer , so start Login</h1>
                    <%
String email=null;
if(session.getAttribute("otp")==null) 
{
response.sendRedirect("forgotpassword.jsp");
}
else	
{
	Qus9Model f=(Qus9Model)session.getAttribute("UserData");
	email=f.getEmail();
}
%>
                    <form method="post" action="Qus9VerifyController">
                        <div class="row g-3">
                           <label>Email Send On Email Address &emsp;<%=email%></label>
                            <div class="col-md-6">
                                <div class="form-floating">
                                    <input type="text" class="form-control" id="email" name="EnterOTP" placeholder="Your OTP">
                                    <label for="email">Your OTP</label>
                                    
                                </div>
                            </div>
                                
                            <div class="col-12">
                                <button class="btn btn-primary py-3 px-5" name="action" value="verify" type="submit">Verify</button>
                                <button class="btn btn-primary py-3 px-5" name="action" value="cancel" type="submit">Cancel</button>
                            </div>
                           
                        </div>
                    </form>
                </div>
                
            </div>
        </div>
    </div>
    <!-- Contact End -->
	


</body>
</html>