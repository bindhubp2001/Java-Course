package com.xworkz.servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.xworkz.servlets.dto.ShopDTO;

@WebServlet(urlPatterns = "/buy", loadOnStartup = 3)
public class ShopServlet extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String name = req.getParameter("name");
		String type = req.getParameter("type");
		String price = req.getParameter("price");
		String brand = req.getParameter("brand");
		String desc=req.getParameter("desc");
		String quantity = req.getParameter("quantity");

		double cost = Double.parseDouble(price);
		int noOfItems = Integer.parseInt(quantity);

		double total = cost * noOfItems;

		ShopDTO dto = new ShopDTO(name, type, price, brand, quantity, total,desc);

		req.setAttribute("items", dto);

		RequestDispatcher dispatcher = req.getRequestDispatcher("ProductSuccess.jsp");
		dispatcher.forward(req, resp);

	}

}
