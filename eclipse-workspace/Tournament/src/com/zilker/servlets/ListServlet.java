package com.zilker.servlets;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.zilker.dao.ListPlayerTournament;
import com.zilker.dao.RetrieveData;
import com.zilker.dto.MatchWithName;

/**
 * Servlet implementation class ListServlet
 */
@WebServlet("/ListServlet")
public class ListServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ListServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub

		ListPlayerTournament list = new ListPlayerTournament();
		ArrayList<String> player = new ArrayList<String>();
		ArrayList<String> tour = new ArrayList<String>();
		HttpSession session=request.getSession();
		RequestDispatcher rd = null;
		String link = request.getParameter("link");
		player = list.retrievePlayerList();
		tour = list.retrieveTourList();
		session.setAttribute("player", player);
		session.setAttribute("tour", tour);
		if (link.equals("Match")) {
			rd = request.getRequestDispatcher("insertmatch.jsp");
			rd.forward(request, response);
		} else if (link.equals("Player vs Player")) {
			rd = request.getRequestDispatcher("twoplayermatch.jsp");
			rd.forward(request, response);
		} else if (link.equals("Player in Tournament")) {
			rd = request.getRequestDispatcher("playertour.jsp");
			rd.forward(request, response);
		}

	}

}
