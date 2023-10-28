package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Qus3Servlet")
public class Qus3Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public Qus3Servlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		String fname=request.getParameter("fname");
		String lname=request.getParameter("lname");
		String email=request.getParameter("email");
		String mobile=request.getParameter("mobile");
		String gender=request.getParameter("gender");
		String password=request.getParameter("password");
		
		try
		{
			System.out.println();
			System.out.println("Student Information");
			System.out.println("Student First Name : "+fname);
			System.out.println("Student Last Name : "+lname);
			System.out.println("Student Email : "+email);
			System.out.println("Student Mobile Number : "+mobile);
			System.out.println("Student Gender : "+gender);
			System.out.println("Student Password : "+password);
		} catch (Exception e) 
		{
			e.printStackTrace();
			// TODO: handle exception
		}
	}

}
