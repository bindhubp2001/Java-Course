package com.xworkz.servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.xworkz.servlets.dto.ContactInfoDTO;

@WebServlet(urlPatterns = "/contact", loadOnStartup = 2)
public class ContactInfoServlets extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String name=req.getParameter("name");
		String email=req.getParameter("email");
		String mobile=req.getParameter("mobile");
		String comment=req.getParameter("comment");
		
		ContactInfoDTO contactInfoDTO=new ContactInfoDTO(name, email, mobile, comment);
		
		req.setAttribute("contactInfoDTO", contactInfoDTO);
		RequestDispatcher dispatcher=req.getRequestDispatcher("ContactSuccess.jsp");
		dispatcher.forward(req, resp);
		
	}

}
