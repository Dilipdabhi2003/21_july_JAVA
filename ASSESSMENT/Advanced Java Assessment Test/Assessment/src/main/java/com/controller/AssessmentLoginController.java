package com.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.AssessmentDao;
import com.dao.AssessmentLoginDao;
import com.model.AssessmentUserModel;


@WebServlet("/AssessmentLoginController")
public class AssessmentLoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public AssessmentLoginController() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		
			AssessmentUserModel lmodel=new AssessmentUserModel();
			lmodel.setEmail(request.getParameter("email"));
			lmodel.setPassword(request.getParameter("password"));
			
			AssessmentUserModel model=new AssessmentLoginDao().getLogin(lmodel);
			
			if(model == null)
			{
				request.setAttribute("msg", "Invalid username or password");
				request.getRequestDispatcher("Login.jsp").forward(request, response);
			}
			else
			{
				request.setAttribute("msg", "Login Successfully!");
				request.getRequestDispatcher("cust-home.jsp").forward(request, response);
			}	
	}
}
