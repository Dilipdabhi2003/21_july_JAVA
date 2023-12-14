package com.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.Qus9Dao;
import com.model.Qus9Model;

@WebServlet("/Qus9Controller")
public class Qus9Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public Qus9Controller() {
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
		if(action.equalsIgnoreCase("register"))
		{
			Qus9Model rmodel=new Qus9Model();
			rmodel.setFname(request.getParameter("fname"));
			rmodel.setLname(request.getParameter("lname"));
			rmodel.setAddress(request.getParameter("address"));
			rmodel.setEmail(request.getParameter("email"));
			rmodel.setMobile(request.getParameter("mobile"));
			rmodel.setPassword(request.getParameter("password"));
			int x=new Qus9Dao().addData(rmodel);
			if(x>0)
			{
				request.setAttribute("msg", "Record Inserted ...");
				request.getRequestDispatcher("show9.jsp").forward(request, response);
			}
			else
			{
				request.setAttribute("msg", "Record Not Inserted...");
				request.getRequestDispatcher("index9.jsp").forward(request, response);
			}
		}	
	}

}
