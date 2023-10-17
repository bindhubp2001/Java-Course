package com.xworkz.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/player", loadOnStartup = 2)
public class PlayerResource extends HttpServlet {

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {

		String name = req.getParameter("name");
		String sports = req.getParameter("sports");
		String exp = req.getParameter("experience");
		String place = req.getParameter("place");

		System.out.println("Name is : " + name);
		System.out.println("Sport is : " + sports);
		System.out.println("Experience is : " + exp);
		System.out.println("Place is : " + place);
		
		System.out.println(req.getHeader(place));
		System.out.println(req.getMethod());
		System.out.println(req.getRequestURI());

		res.setContentType("text/plain");

		PrintWriter writer = res.getWriter();
		writer.println(name + " name saved Suceesfulyyy......");
		writer.println("Sports Specialization Saved Succesfully.... -> " + sports);
		writer.println("Experience of Player Saved SaucessFully..... -> " + exp);
		writer.println("Place of player Saved SuccessFully.... -> " + place);

	}

}
