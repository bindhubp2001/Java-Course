package com.xworkz.servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.xworkz.servlets.dto.MatchDTO;

@WebServlet(urlPatterns = "/play", loadOnStartup = 3)
public class MatchServlet extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String name = req.getParameter("tournamentName");
		String host = req.getParameter("host");
		String date = req.getParameter("date");
		String team1 = req.getParameter("team1");
		String team2 = req.getParameter("team2");
		String captain1 = req.getParameter("captain1");
		String captain2 = req.getParameter("captain2");
		String umpire = req.getParameter("umpire");
		String stadium = req.getParameter("stadium");
		String umpire3 = req.getParameter("3umpire");
		String capacity = req.getParameter("capacity");

		MatchDTO dto = new MatchDTO(name, host, date, team1, team2, captain1, captain2, umpire, stadium, umpire3,
				capacity);

		req.setAttribute("dto", dto);
		RequestDispatcher dispatcher = req.getRequestDispatcher("MatchSuccess.jsp");
		dispatcher.forward(req, resp);
	}

}
