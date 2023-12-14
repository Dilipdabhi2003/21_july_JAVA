package com.controller;

import java.io.File;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

import com.Dao.RegistrationDao;

import com.model.usermodel;

/**
 * Servlet implementation class RegistationController
 */
@WebServlet("/RegistationController")
@MultipartConfig(fileSizeThreshold = 1024 * 1024 * 512, // 512MB
maxFileSize = 1024 * 1024 * 512, // 512MB
maxRequestSize = 1024 * 1024 * 512) // 512MB
public class RegistationController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public RegistationController() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		usermodel rmodel=new usermodel();
		rmodel.setFirstname(request.getParameter("firstname"));
		rmodel.setLastname(request.getParameter("lastname"));
		rmodel.setUsername(request.getParameter("username"));
		rmodel.setPassword(request.getParameter("password"));
		rmodel.setPhoto(request.getParameter("photo"));
		String msg=new RegistrationDao().doRegister(rmodel);
		
		String savePath="C:\\Users\\master-66\\eclipse-workspace\\Assignment_Hb3\\src\\main\\webapp\\image";
		File fileSaveDir=new File(savePath);
		if (!fileSaveDir.exists()) {
			fileSaveDir.mkdir();
			
		}
		Part file=request.getPart("mimage");
	 	String fileName=extractfilename(file);
	    file.write(savePath+File.separator+fileName);
	    String filePath=savePath+File.separator+fileName;
	    System.out.println(filePath);
		usermodel mpm=new usermodel();
		mpm.setPhoto(request.getParameter("photo"));
		mpm.setPhoto(fileName);
		if(!msg.equals("error"))
		{
			request.setAttribute("msg", msg);
			request.getRequestDispatcher("login.jsp").forward(request, response);
			
		}
		else
		{
			request.setAttribute("msg", "Record not inserted");
			request.getRequestDispatcher("registration.jsp").forward(request, response);
			
		}
			
	}

	private String extractfilename(Part file) {
		// TODO Auto-generated method stub
		return null;
	}

}
