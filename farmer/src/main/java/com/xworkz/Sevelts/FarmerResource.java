package com.xworkz.Sevelts;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/farmer",loadOnStartup = 4)
public class FarmerResource extends HttpServlet {
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String name=req.getParameter("farmerName");
		System.out.println(name);
		
		resp.setContentType("text/html");
		
		PrintWriter printWriter=resp.getWriter();
		
		printWriter.print("<html><head></head><body><h1> Farmer Information Saved SuccessFullyy</h1></body></html>");
	}

}
