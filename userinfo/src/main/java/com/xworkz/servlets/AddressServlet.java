package com.xworkz.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.xworkz.servlets.dto.AddressDTO;

@WebServlet(urlPatterns = "/add", loadOnStartup = 3)
public class AddressServlet extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

//		String houseNuumber = req.getParameter("houseNumber");
//		String state = req.getParameter("state");
//		String street = req.getParameter("street");
//		String country = req.getParameter("country");
//		String city = req.getParameter("city");

		

		req.setAttribute("success", "Address Saved SuccesFully..");

		RequestDispatcher dispatcher = req.getRequestDispatcher("Adress.jsp");
		dispatcher.forward(req, resp);

	}

}
