package com.xworkz.servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.xworkz.servlets.dto.ProductDTO;


@WebServlet(urlPatterns = "/buyy",loadOnStartup = 3)
public class ShoppingServlet extends HttpServlet{
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String name = req.getParameter("name");
		String type = req.getParameter("type");
		String price = req.getParameter("price");
		String brand = req.getParameter("brand");
		String quantity = req.getParameter("quantity");
		
		ProductDTO dto=new ProductDTO(name, type, price, brand, quantity );
		
		
		
		if(price!=null && !price.isEmpty()) {
			double cost=Double.parseDouble(price);
			int noOfItems=Integer.parseInt(quantity);
			
			double total=cost*noOfItems;
			req.setAttribute("info", dto);
			req.setAttribute("total", total);
			
			RequestDispatcher dispatcher=req.getRequestDispatcher("ProductSuccess.jsp");
			dispatcher.forward(req, resp);
		}
		else {
			RequestDispatcher dispatcher=req.getRequestDispatcher("ProductUnSuccess.jsp");
			dispatcher.forward(req, resp);
		}
	}

}
