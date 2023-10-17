package com.xworkz.weapon;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/gun", loadOnStartup = 4)
public class WeaponResource extends HttpServlet {

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String name = req.getParameter("name");
		String madeBy = req.getParameter("madeBy");
		String price = req.getParameter("price");
		String type = req.getParameter("type");

		System.out.println("Name : " + name);
		System.out.println("Made By : " + madeBy);
		System.out.println("Price : " + price);
		System.out.println("Type : " + type);

		resp.setContentType("text/html");

		PrintWriter writer = resp.getWriter();

		writer.print("<!DOCTYPE html>\r\n" + "<html>\r\n" + "\r\n" + "<head>\r\n"
				+ "	<meta charset=\"ISO-8859-1\">\r\n" + "	<title>Print Info</title>\r\n"
				+ "	<link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css\" rel=\"stylesheet\"\r\n"
				+ "		integrity=\"sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC\" crossorigin=\"anonymous\">\r\n"
				+ "\r\n" + "	<style>\r\n" + "		body {\r\n"
				+ "			background: url(\"https://media.istockphoto.com/id/1333817369/photo/professional-female-sniper-hands-assembling-a-gun.jpg?s=612x612&w=0&k=20&c=qO5YRA3OYNCpj2gaHS51xZZ4f7NzzuZzREp4na5Y4sA=\");\r\n"
				+ "			background-size: cover;\r\n" + "		}\r\n" + "\r\n" + "		h2 {\r\n"
				+ "			color: white;\r\n" + "		}\r\n" + "	</style>\r\n" + "</head>\r\n" + "\r\n"
				+ "<body class=\"bg-secondary text-white\">\r\n"
				+ "	<nav class=\"navbar navbar-expand-lg navbar-dark bg-dark\">\r\n"
				+ "		<div class=\"container-md\">\r\n"
				+ "			<a class=\"navbar-brand\" href=\"#\">X-Workz</a>\r\n" + "		</div>\r\n" + "\r\n"
				+ "		<div class=\"collapse navbar-collapse\" id=\"navbarSupportedContent\">\r\n"
				+ "			<ul class=\"navbar-nav me-auto mb-2 mb-lg-0\">\r\n"
				+ "				<li class=\"nav-item\">\r\n"
				+ "					<a class=\"nav-link \" aria-current=\"page\" href=\"index.html\">Home</a>\r\n"
				+ "				</li>\r\n" + "				<li class=\"nav-item\">\r\n"
				+ "					<a class=\"nav-link active\" href=\"weapon.html\">Weapon </a>\r\n"
				+ "				</li>\r\n" + "			</ul>\r\n" + "\r\n" + "		</div>\r\n" + "	</nav><br>\r\n"
				+ "\r\n");

		writer.print("<br>" + "<h5 style='text-align:center;'>Name :  " + name + "</h5>");
		writer.print("<br><h5 style='text-align:center;'>Made By :  " + madeBy + "</h5>");
		writer.print("<br><h5 style='text-align:center;'>Price :  "+ price+"</h5>");
		writer.print("<br><h5 style='text-align:center;'>Type :  "+ type+"</h5>" );
		
		writer.print("<br><h4 style='text-align:center;color:green'>Information Saved SucessFully</h4>");

		writer.print("</body>\r\n" + "\r\n" + "</html>");
	}

}
