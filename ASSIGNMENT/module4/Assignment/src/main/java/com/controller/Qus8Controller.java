package com.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.Qus8Dao;
import com.model.Qus8Model;

@WebServlet("/Qus8Controller")
public class Qus8Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public Qus8Controller() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
	
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		String action=request.getParameter("action");
		if(action.equalsIgnoreCase("submit"))
		{
			Qus8Model rmodel=new Qus8Model();
			rmodel.setFname(request.getParameter("fname"));
			rmodel.setLname(request.getParameter("lname"));
			rmodel.setEmail(request.getParameter("email"));
			rmodel.setMobile(request.getParameter("mobile"));
			
			int x=new Qus8Dao().addData(rmodel);
			if(x>0)
			{
				request.setAttribute("msg", "“Message Passing System ...");
				request.getRequestDispatcher("login8.jsp").forward(request, response);
			}
			else
			{
				request.setAttribute("msg", "Record Not Inserted...");
				request.getRequestDispatcher("index8.jsp").forward(request, response);
			}
		}
	}

}
