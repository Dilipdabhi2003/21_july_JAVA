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

import com.dao.AdminDao;
import com.model.MainProductModel;
import com.model.SubProductModel;


@WebServlet("/AdminController")
@MultipartConfig(fileSizeThreshold = 1024 * 1024 * 512, // 512MB
maxFileSize = 1024 * 1024 * 512, // 512MB
maxRequestSize = 1024 * 1024 * 512) // 512MB
public class AdminController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public AdminController() 
    {
    	
    }
    private String extractfilename(Part file) {
	    String cd = file.getHeader("content-disposition");
	    System.out.println(cd);
	    String[] items = cd.split(";");
	    for (String string : items) {
	        if (string.trim().startsWith("filename")) {
	            return string.substring(string.indexOf("=") + 2, string.length()-1);
	        }
	    }
	    return "";
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		String action=request.getParameter("action");
		if(action.equalsIgnoreCase("delete"))
		{
			int sid=Integer.parseInt(request.getParameter("sproductid"));
			int x=new AdminDao().delete(sid);
			request.setAttribute("msg", "Record was Deleted");
			request.getRequestDispatcher("dashboard.jsp").forward(request, response);
		}
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		String action=request.getParameter("action");
		if(action.equalsIgnoreCase("login"))
		{
			String username=request.getParameter("username");
			String password=request.getParameter("password");
			if(username.equals("admin") && password.equals("admin"))
			{
				response.sendRedirect("admin/dashboard.jsp");
			}
			else
			{
				response.sendRedirect("admin/login.jsp");
			}
		}
		else if(action.equalsIgnoreCase("addmainproduct"))
		{
			String savePath="C:\\Users\\master-66\\eclipse-workspace\\FashionJavaProject\\src\\main\\webapp\\productimage";
			File fileSaveDir=new File(savePath);
			if (!fileSaveDir.exists()) {
				fileSaveDir.mkdir();
				
			}
			Part file=request.getPart("mimage");
		 	String fileName=extractfilename(file);
		    file.write(savePath+File.separator+fileName);
		    String filePath=savePath+File.separator+fileName;
		    System.out.println(filePath);
			MainProductModel mpm=new MainProductModel();
			mpm.setMproductname(request.getParameter("mproductname"));
			mpm.setMimage(fileName);
			
			
			int x=new AdminDao().addMProduct(mpm);
			if(x>0)
			{
				response.sendRedirect("admin/dashboard.jsp");
			}
			else
			{
				response.sendRedirect("admin/addmainproduct.jsp");
			}
		}
		else if(action.equalsIgnoreCase("addsubproduct"))
		{
			String savePath="C:\\Users\\master-66\\eclipse-workspace\\FashionJavaProject\\src\\main\\webapp\\productimage";
			File fileSaveDir=new File(savePath);
			if (!fileSaveDir.exists()) {
				fileSaveDir.mkdir();
				
			}
			Part file=request.getPart("simage");
		 	String fileName=extractfilename(file);
		    file.write(savePath+File.separator+fileName);
		    String filePath=savePath+File.separator+fileName;
		    System.out.println(filePath);
			SubProductModel spm=new SubProductModel();
			spm.setMproductid(Integer.parseInt(request.getParameter("mproductid")));
			
			spm.setSproductname(request.getParameter("sproductname"));
			spm.setSimage(fileName);
			spm.setPrice(Integer.parseInt(request.getParameter("price")));
			spm.setContent(request.getParameter("content"));
			
			 int x=new AdminDao().addSProduct(spm);
			 if(x>0)
			 {
					response.sendRedirect("admin/dashboard.jsp");
				}
				else
				{
					response.sendRedirect("admin/addsubproduct.jsp");
				}
		}
		else if(action.equalsIgnoreCase("edit"))
		{
			String savePath="C:\\Users\\master-66\\eclipse-workspace\\FashionJavaProject\\src\\main\\webapp\\productimage";
			File fileSaveDir=new File(savePath);
			if (!fileSaveDir.exists()) {
				fileSaveDir.mkdir();
				
			}
			Part file=request.getPart("simage");
		 	String fileName=extractfilename(file);
		    file.write(savePath+File.separator+fileName);
		    String filePath=savePath+File.separator+fileName;
		    System.out.println(filePath);
			SubProductModel spm=new SubProductModel();
			spm.setMproductid(Integer.parseInt(request.getParameter("mproductid")));
			System.out.println("M"+spm.getMproductid());
			spm.setSproductname(request.getParameter("sproductname"));
			spm.setSproductid(Integer.parseInt(request.getParameter("sproductid")));
			System.out.println("s"+spm.getSproductid());
			spm.setSimage(fileName);
			spm.setPrice(Integer.parseInt(request.getParameter("price")));
			System.out.println("P"+spm.getPrice());
			spm.setContent(request.getParameter("content"));
			
			 int x=new AdminDao().editSProduct(spm);
			 if(x>0)
			 {
					response.sendRedirect("admin/dashboard.jsp");
			}
				else
				{
					response.sendRedirect("admin/edit.jsp");
				}
		}
	}

}
