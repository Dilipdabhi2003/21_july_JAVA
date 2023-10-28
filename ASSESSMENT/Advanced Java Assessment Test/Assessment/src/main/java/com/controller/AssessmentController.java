package com.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.AssessmentDao;
import com.model.AssessmentUserModel;


@WebServlet("/AssessmentController")
public class AssessmentController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
    public AssessmentController() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		AssessmentUserModel aum=new AssessmentUserModel();
		aum.setFirstname(request.getParameter("firstname"));
		aum.setLastname(request.getParameter("lastname"));
		aum.setEmail(request.getParameter("email"));
		aum.setMobile(request.getParameter("mobile"));
		aum.setAddress(request.getParameter("address"));
		aum.setGender(request.getParameter("gender"));
		aum.setPassword(request.getParameter("password"));
		aum.setCpassword(request.getParameter("cpassword"));
		
		int x=new AssessmentDao().doRegister(aum);
		
		if(x>0)
		{
			request.setAttribute("msg", "Record Inserted...");
			request.getRequestDispatcher("Login.jsp").forward(request, response);
		}
		else
		{
			request.setAttribute("msg", "Record not Inserted...");
			request.getRequestDispatcher("SignUp.jsp").forward(request,response);
		}
	}

}
