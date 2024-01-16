package com.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.AdminDao;
import com.model.Admin;

/**
 * Servlet implementation class AdminController
 */
@WebServlet("/AdminController")
public class AdminController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public AdminController() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		String action=request.getParameter("action");
		if(action.equalsIgnoreCase("login"))
		{
			Admin admin=new Admin();
			admin.setUsername(request.getParameter("username"));
			admin.setPassword(request.getParameter("password"));
			
			AdminDao ad=new AdminDao();
			ad.getAllUser();
			response.sendRedirect("adminhome.jsp");
		}
		else if(action.equalsIgnoreCase("delete"))
		{
			int id=Integer.parseInt(request.getParameter("id"));
			AdminDao ad=new AdminDao();
			ad.deleteUser(id);
			response.sendRedirect("adminhome.jsp");
		}
	}

}
