package com.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.dao.UserDao;
import com.model.UserModel;

/**
 * Servlet implementation class ActionController
 */
@WebServlet("/ActionController")
public class ActionController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ActionController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    
    ApplicationContext a=new ClassPathXmlApplicationContext("spring-servlet.xml");
    UserDao dao=(UserDao) a.getBean("dao");
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String action=request.getParameter("action");
		if(action.equalsIgnoreCase("Register"))
		{
			UserModel rmodel=new UserModel();
			rmodel.setFname(request.getParameter("fname"));
			rmodel.setLname(request.getParameter("lname"));
			rmodel.setEmail(request.getParameter("email"));
			rmodel.setMobile(request.getParameter("mobile"));
			rmodel.setAddress(request.getParameter("address"));
			rmodel.setGender(request.getParameter("gender"));
			rmodel.setPassword(request.getParameter("password"));
			rmodel.setCpassword(request.getParameter("cpassword"));
			
			dao.register(rmodel);
			response.sendRedirect("login.jsp");
		}
		else if(action.equalsIgnoreCase("Login"))
		{
			UserModel lmodel=new UserModel();
			lmodel.setEmail(request.getParameter("email"));
			lmodel.setPassword(request.getParameter("password"));
			UserModel userModel=dao.login(lmodel);
			if(userModel != null)
			{
				 HttpSession session = request.getSession();
			     session.setAttribute("userModel", userModel);
			     response.sendRedirect("home.jsp");
			}
			else
			{
				System.out.println("Error");
				response.sendRedirect("login.jsp");
			}
		}
	}

}
