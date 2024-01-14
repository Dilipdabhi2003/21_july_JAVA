package com.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.catalina.connector.Request;
import org.json.JSONObject;

import com.dao.BookDao;
import com.model.BookModel;
import com.razorpay.Order;
import com.razorpay.RazorpayClient;
import com.razorpay.Utils;

/**
 * Servlet implementation class OrderCreation
 */
@WebServlet("/OrderCreation")
public class OrderCreation extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public OrderCreation() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RazorpayClient client=null;
		String orderId=null;
		try 
		{
//			client = new RazorpayClient("rzp_test_eNcc019nABBIgL", "qOdBaY9RnQXzttvJqiutrmhC");
			client = new RazorpayClient("rzp_test_Lidx6sR8sO3SjL", "P7kwUACm3xElHnZxGUxgMVBa");
			String amount=request.getParameter("amount");
			Integer digit= Integer.parseInt(amount)*100;  
			
			JSONObject options=new JSONObject();
			options.put("amount", digit.toString());
			options.put("currency", "INR");
			options.put("receipt", "zxr456");
			options.put("payment_capture", true);
			/* options.put("notes", new JSONObject()); */
			Order order=client.Orders.create(options);
			orderId=order.get("id");
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
		response.getWriter().append(orderId);	
}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RazorpayClient client=null;
		try {
//			client=new RazorpayClient("rzp_test_eNcc019nABBIgL","qOdBaY9RnQXzttvJqiutrmhC");
			client = new RazorpayClient("rzp_test_Lidx6sR8sO3SjL", "P7kwUACm3xElHnZxGUxgMVBa");
			JSONObject options=new JSONObject();
			options.put("razorpay_payment_id",request.getParameter("razorpay_payment_id"));
			options.put("razorpay_order_id",request.getParameter("razorpay_order_id"));
			options.put("razorpay_signature",request.getParameter("razorpay_signature"));
			boolean SigRes=Utils.verifyPaymentSignature(options,"P7kwUACm3xElHnZxGUxgMVBa");
			if(SigRes)
			{
				response.getWriter().append("Payment Successfull");
				Thread.sleep(1000);
				response.sendRedirect("review.jsp");
				
			}
			else
			{
				response.getWriter().append("Payment Failed");
			}
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("ERROR IN PAYMENT"+e.getMessage());
		}
	}	


}
