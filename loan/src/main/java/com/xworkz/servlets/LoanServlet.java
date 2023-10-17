package com.xworkz.servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/loans", loadOnStartup = 4)
public class LoanServlet extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String name = req.getParameter("name");
		String working = req.getParameter("working");
		String amount = req.getParameter("amount");
		String intrest = req.getParameter("intrest");
		String surety = req.getParameter("surety");
		String company = req.getParameter("company");
		String loanTenure = req.getParameter("loanTenure");
		String loanType = req.getParameter("loanType");

		req.setAttribute("name", name);
		req.setAttribute("working", working);
		req.setAttribute("amount", amount);
		req.setAttribute("intrest", intrest);
		req.setAttribute("surety", surety);
		req.setAttribute("company", company);
		req.setAttribute("loanTenure", loanTenure);
		req.setAttribute("loanType", loanType);

		RequestDispatcher dispatcher = req.getRequestDispatcher("AppliedSucessful.jsp");
		dispatcher.forward(req, resp);

	}

}
