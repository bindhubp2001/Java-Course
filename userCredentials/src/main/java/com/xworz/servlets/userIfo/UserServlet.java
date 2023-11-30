package com.xworz.servlets.userIfo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/user",loadOnStartup = 1)
public class UserServlet extends HttpServlet{
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String slNo=req.getParameter("slNo");
		String fName=req.getParameter("fName");
		String mName=req.getParameter("mName");
		String lName=req.getParameter("lName");
		String email=req.getParameter("email");
		String gender=req.getParameter("gender");
		String mobile=req.getParameter("mobile");
		String area=req.getParameter("area");
		String district=req.getParameter("dist");
		String state=req.getParameter("state");
		String pin=req.getParameter("pincode");
		
		UserCredentialDTO credentialDTO=new UserCredentialDTO(slNo, fName, mName, lName, email, gender, mobile, area, district, state, pin);
		
		resp.setContentType("text/html");
		
		PrintWriter printWriter=resp.getWriter();
		printWriter.print("<h1>saved SuccessFully<h1>");
		printWriter.print(credentialDTO.getSlNo()+"<br>");
		printWriter.print(credentialDTO.getfName()+"<br>");
		printWriter.print(credentialDTO.getlName()+"<br>");
		printWriter.print(credentialDTO.getmName()+"<br>");
		printWriter.print(credentialDTO.getEmail()+"<br>");
		printWriter.print(credentialDTO.getGender()+"<br>");
		printWriter.print(credentialDTO.getMobile()+"<br>");
		printWriter.print(credentialDTO.getArea()+"<br>");
		printWriter.print(credentialDTO.getDistrict()+"<br>");
		printWriter.print(credentialDTO.getState()+"<br>");	
		printWriter.print(credentialDTO.getPincode()+"<br>");
		
	}

}
