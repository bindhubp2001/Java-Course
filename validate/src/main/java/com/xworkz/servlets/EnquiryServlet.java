package com.xworkz.servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.xworkz.servlets.dto.EnquiryDTO;

@WebServlet(urlPatterns = "/check",loadOnStartup = 6)
public class EnquiryServlet extends HttpServlet{
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
		String name = req.getParameter("name");
		String mobile = req.getParameter("mobile");
		String email = req.getParameter("email");
		String dob = req.getParameter("dob");
		String location = req.getParameter("location");
		String password = req.getParameter("password");
		String confirmPassword = req.getParameter("confirmPassword");
		
		EnquiryDTO dto=new EnquiryDTO(name, mobile, email, dob, location, password, confirmPassword);
		
		req.setAttribute("dto", dto);
		RequestDispatcher dispatcher = req.getRequestDispatcher("EnquirySuccess.jsp");
		dispatcher.forward(req, resp);
		
	}

}
