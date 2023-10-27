package com.xworkz.servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.xworkz.servlets.dto.BakeryDTO;

@WebServlet(urlPatterns = "/purchase", loadOnStartup = 4)
public class BakeryServlet extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String name = req.getParameter("name");
		String price = req.getParameter("price");
		String quantity = req.getParameter("quantity");
		String disc = req.getParameter("disc");
		String gst = req.getParameter("gst");
		String manf = req.getParameter("manf");
		String exp = req.getParameter("exp");
		
		BakeryDTO bakeryDTO=new BakeryDTO(name, price, quantity, disc, gst, manf, exp);
		
		if (price != null && !price.isEmpty()) {
			double cost = Double.parseDouble(price);
			int noOfItems = Integer.parseInt(quantity);
			int discounPrice = Integer.parseInt(disc);
			double gst1 = Double.parseDouble(gst);

			double discounPrice1 = (cost / discounPrice);
			double total = (cost-discounPrice1) * noOfItems + gst1 ;

			req.setAttribute("dto", bakeryDTO);
			req.setAttribute("quantity", quantity);
			
			req.setAttribute("total", total);
			RequestDispatcher dispatcher = req.getRequestDispatcher("Bakery.jsp");
			dispatcher.forward(req, resp);
		}
	}

}
