package com.zilker.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.zilker.dao.RetrieveData;
import com.zilker.dto.Player;

/**
 * Servlet implementation class RetrievePlayerServlet
 */
@WebServlet("/RetrievePlayerServlet")
public class RetrievePlayerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RetrievePlayerServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out=response.getWriter();
		RetrieveData retrieveData=new RetrieveData();
		ArrayList<Player> play = new ArrayList<Player>();
		RequestDispatcher rd;
		play=retrieveData.retrievePlayer();
		rd = request.getRequestDispatcher("/jsp/retrieveplayer.jsp");
		request.setAttribute("play",play);
		rd.forward(request, response);
	}

}
