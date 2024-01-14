package com.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.ReviewDao;
import com.model.ReviewModel;

/**
 * Servlet implementation class ReviewController
 */
@WebServlet("/ReviewController")
public class ReviewController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ReviewController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ReviewModel rmodel=new ReviewModel();
		rmodel.setName(request.getParameter("name"));
		rmodel.setEmail(request.getParameter("email"));
		rmodel.setRating(request.getParameter("rating"));
		rmodel.setComments(request.getParameter("comments"));
		int x=new ReviewDao().addReview(rmodel);
		if(x>0)
		{	
			response.sendRedirect("cust-home.jsp");
		}
		else
		{
			response.sendRedirect("clogin.jsp");
		}
	
	}

}
