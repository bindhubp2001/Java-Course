package com.xworkz.sevlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/police")
public class PoliceSsationResource extends HttpServlet {

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String name = req.getParameter("stationName");
		String head = req.getParameter("headConstableName");
		String location = req.getParameter("location");
		String assistantCommisioner = req.getParameter("assistantCommisioner");
		String inspectorName = req.getParameter("inspectorName");
		String noOfCell = req.getParameter("noOfCell");
		String siName = req.getParameter("siName");
		String painted = req.getParameter("painted");

		int cellNo = Integer.parseInt(noOfCell);

		System.out.println("Police Station Name is : " + name);
		System.out.println("Head Constable  Name is : " + head);
		System.out.println("Police Station Location is : " + location);
		System.out.println("Assistence Commistioner Name is : " + assistantCommisioner);
		System.out.println("Inspector Name is : " + inspectorName);
		System.out.println("Number of Cells are : " + noOfCell);
		System.out.println("S I Name is : " + siName);
		System.out.println("Is Station Painted ? : " + painted);

		String uri = req.getRequestURI();
		String url = req.getRequestURL().toString();

		System.out.println("URI = " + uri);
		System.out.println("URL = " + url);

		resp.setContentType("text/html");

		PrintWriter printWriter = resp.getWriter();

		printWriter.print("<!DOCTYPE html>\r\n"
				+ "<html>\r\n"
				+ "\r\n"
				+ "<head>\r\n"
				+ "	<meta charset=\"ISO-8859-1\">\r\n"
				+ "	<title>X-Workz</title>\r\n"
				+ "	<link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css\" rel=\"stylesheet\"\r\n"
				+ "		integrity=\"sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC\" crossorigin=\"anonymous\">\r\n"
				+ "\r\n"
				+ "	<style>\r\n"
				+ " "
				+ "	</style>\r\n"
				+ "</head>\r\n"
				+ "\r\n"
				+ "<body>\r\n"
				+ "	<nav class=\"navbar navbar-expand-lg navbar-dark bg-dark\">\r\n"
				+ "		<div class=\"container-md\">\r\n"
				+ "			<a class=\"navbar-brand\" href=\"#\">X-Workz</a>\r\n"
				+ "		</div>\r\n"
				+ "\r\n"
				+ "		<div class=\"collapse navbar-collapse\" id=\"navbarSupportedContent\">\r\n"
				+ "			<ul class=\"navbar-nav me-auto mb-2 mb-lg-0\">\r\n"
				+ "				<li class=\"nav-item\">\r\n"
				+ "					<a class=\"nav-link active\" aria-current=\"page\" href=\"#\">Home</a>\r\n"
				+ "				</li>\r\n"
				+ "				<li class=\"nav-item\">\r\n"
				+ "					<a class=\"nav-link\" href=\"policeStation.html\">Police Station</a>\r\n"
				+ "				</li>\r\n"
				+ "			</ul>\r\n"
				+ "\r\n"
				+ "		</div>\r\n"
				+ "	</nav><br>\r\n"
				+ "\r\n"
				+ "	\r\n");
		        printWriter.println("Station Name : "+name);
		        printWriter.println("<br>"+"Assistence Commisioner Name: "+assistantCommisioner);
		        printWriter.println("<br>"+"Inspector Name: "+inspectorName);
		        printWriter.println("<br>"+"Location Name: "+location);
		        printWriter.println("<br>"+"Painted? : "+painted);
		        printWriter.println("<br>"+"SI Name: "+siName);
		        printWriter.println("<br>"+"Head Constable Name: "+head);
		        printWriter.println("<br>"+"Number of Cells  : "+noOfCell);
		       if(cellNo>5) {
		    	   printWriter.println("Big Station");
		       }
		       else {
		    	   printWriter.println("Small Station");
		       }
		       
		       if(painted.equals("YES")) {
		    	   printWriter.println("<span style='color:green;'><h2>Good Station</h2></span>");
		       }
		       else {
		    	   printWriter.println("<br><span style='color:green;'><h2>BAD Sation</ `h2></span>");
		       }
		printWriter.println(
				"</body>\r\n"
				+ "\r\n"
				+ "</html>");

	}

}
