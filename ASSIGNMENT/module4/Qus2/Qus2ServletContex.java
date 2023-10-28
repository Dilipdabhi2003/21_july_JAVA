package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Qus2ServletContex")
public class Qus2ServletContex extends HttpServlet {
	private static final long serialVersionUID = 1L;
       ServletContext context=null;
    public Qus2ServletContex() 
    {
        super();
        
           }
    @Override
    public void init(ServletConfig config) throws ServletException 
    {
    	context=config.getServletContext();
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		String username=context.getInitParameter("username");
		String password=context.getInitParameter("password");
		out.println("<h1>UserName Is "+username);
		out.println("<br>Password Is "+password);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		
	}

}
