package com.controller;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PseudoColumnUsage;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import java.util.Properties;
import java.util.Random;

import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.dao.BookDao;
import com.dao.CustmorDao;
import com.dao.VerifyDao;
import com.model.BookModel;
import com.model.CustomerModel;


@WebServlet("/CustomerController")
public class CustomerController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public CustomerController() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		String action=request.getParameter("action");
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		String action=request.getParameter("action");
		if(action.equalsIgnoreCase("register"))
		{
			CustomerModel rmodel=new CustomerModel();
			rmodel.setFirstname(request.getParameter("firstname"));
			rmodel.setLastname(request.getParameter("lastname"));
			rmodel.setAddress(request.getParameter("address"));
			rmodel.setCity(request.getParameter("city"));
			rmodel.setPincode(Integer.parseInt(request.getParameter("pincode")));
			rmodel.setMobile(request.getParameter("mobile"));
			rmodel.setEmail(request.getParameter("email"));
			rmodel.setPassword(request.getParameter("password"));
			
			
			int x=new CustmorDao().custmorRegistration(rmodel);
			if(x>0)
			{
				request.getRequestDispatcher("clogin.jsp").forward(request, response);
				
			}
			else
			{
				request.getRequestDispatcher("cregistration.jsp").forward(request, response);
				
			}
		}
		else if(action.equalsIgnoreCase("login"))
		{
			CustomerModel lmodel=new CustomerModel();
			lmodel.setEmail(request.getParameter("email"));
			lmodel.setPassword(request.getParameter("password"));
			
			CustomerModel model=new CustmorDao().getCustomerLogin(lmodel);
			if(model!=null)
			{
				HttpSession session =request.getSession(true);
				session.setAttribute("model", model);
				session.setAttribute("customerid", model.getCustomerid());
				request.setAttribute("custid", model.getCustomerid());
				session.setAttribute("firstname", model.getFirstname());
				session.setAttribute("lastname", model.getLastname());
				session.setAttribute("email", model.getEmail());
				
				
				response.sendRedirect("cust-home.jsp");
			}
			else
			{
				response.sendRedirect("clogin.jsp");
			}
		}
		else if(action.equalsIgnoreCase("book"))
		{
			
				BookModel bmodel=new BookModel();
				int sproductid=Integer.parseInt(request.getParameter("sproductid"));
				String price=request.getParameter("price");
				int customerid=Integer.parseInt(request.getParameter("customerid"));
				bmodel.setCustomerid(customerid);
				bmodel.setSproductid(sproductid);
				bmodel.setPrice(price);
				bmodel.setQty("1");
				
				Date date=new Date();
				SimpleDateFormat sd=new SimpleDateFormat("dd/MM/yyyy");
				bmodel.setDate(sd.format(date).toString());
				bmodel.setTotal("0");
				bmodel.setBookstatus("Pending");
				bmodel.setPaymentstatus("Pending");
				int x=new BookDao().bookProduct(bmodel);
				if(x>0)
				{
					request.getRequestDispatcher("cart.jsp").forward(request, response);
					
				}
				else
				{
					System.out.println("error");
					request.getRequestDispatcher("viewsubproduct.jsp").forward(request, response);
					
				}
		}
		else if(action.equalsIgnoreCase("delete"))
		{
			BookModel dmodel=new BookModel();
			int id=Integer.parseInt(request.getParameter("sproductid"));
			int x=new BookDao().delete(id);
			request.setAttribute("msg", "Record was Deleted");
			request.getRequestDispatcher("cust-home.jsp").forward(request, response);
		}
		else if(action.equalsIgnoreCase("checkout"))
		{
			BookModel cmodel=new BookModel();
			String price=request.getParameter("price");
			int p=Integer.parseInt(price);
			String qty=request.getParameter("qty");
			int q=Integer.parseInt(qty);

			int total=p*q;
			
			cmodel.setSproductid(Integer.parseInt(request.getParameter("sproductid")));
			cmodel.setBookstatus("Successful");
			cmodel.setPaymentstatus("Successful");
			cmodel.setQty(""+q);
			cmodel.setTotal(""+total);
			
			int x=new BookDao().update(cmodel);
			
			if(total!=0 )
			{
				request.setAttribute("total",total);
				request.getRequestDispatcher("checkout.jsp?total="+total).forward(request, response);
				
				HttpSession session=request.getSession(true);
				String email=(String) session.getAttribute("email");
				CustomerModel f=new CustomerModel();
				VerifyDao dao=new VerifyDao();
				f=dao.getVerify(email);
				if(f==null)
				{
					request.setAttribute("invalidemail", "Email Address Not Valid");
					request.getRequestDispatcher("forgotpassword.jsp").forward(request, response);
				}
				else
				{
					String emailid=f.getEmail();
					String username=f.getFirstname()+" "+f.getLastname();
					final String Senderid = "male.fashion024@gmail.com";
					final String password = "qxircsgscqykjwkg";
					
					Properties props = new Properties();

					String host = "smtp.gmail.com";

					
					props.put("mail.smtp.socketFactory.port", "465");
					props.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
					props.put("mail.smtp.socketFactory.fallback", "true");
					props.put("mail.smtp.ssl.protocols", "TLSv1.2");
					props.put("mail.smtp.auth", "true");
					props.put("mail.smtp.debug", "true");
					props.put("mail.smtp.starttls.enable", "true");
					props.put("mail.smtp.host", host);
					props.put("mail.smtp.port", "465");
					props.put("mail.smtp.user", Senderid);
					props.put("mail.smtp.password", password);
					
					Session session1 = Session.getInstance(props, new Authenticator() {
						protected PasswordAuthentication getPasswordAuthentication() {
							return new PasswordAuthentication(Senderid, password);
						}
					});

					try {
						LocalDate date=LocalDate.now();
						String sandesh="Your order will be delivered on "+date.plusDays(10);
						Message message = new MimeMessage(session1);
						message.setFrom(new InternetAddress(Senderid));
						message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(emailid));// to
																										// mail
																										// address.
						message.setSubject("OTP Request");
						String msg1 = "<!DOCTYPE html><html><head></head><body><center><div style='background-color:#f8f8f8; width:500px; height:200px'><div style='background-color:#00e58b; width:500px; height:50px'><h3 style='color:white; padding-top:10px;'>Malefashion.com </h3></div><p style='color:gray; margin-left:-300px;'>Dear "
								+ username + ",</p><br><p style='color:gray; margin-top:-10px;'>" + sandesh
								+ "  <h5> Thank You For Visit <h5/></p><div></center></body></html>";
						message.setContent(msg1, "text/html; charset=utf-8");
				
						Transport.send(message);

						HttpSession otpsession = request.getSession();
						otpsession.setAttribute("otp", sandesh);
						otpsession.setMaxInactiveInterval(10 * 60); /*Session Set for 10 minutes*/
						otpsession.setAttribute("UserData", f);
						request.getRequestDispatcher("SendOTP.jsp").forward(request, response);

					} catch (Exception e) {
						request.setAttribute("SendOtpError", "Otp Not Send");
						request.getRequestDispatcher("forgotpassword.jsp").forward(request, response);
						e.printStackTrace();
					}

				}

			}
			
		}
	}
	

} 
