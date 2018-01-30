package com.zilker.servlets;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.zilker.dao.SortData;
import com.zilker.delegate.PlayerCountryDelegate;
import com.zilker.dto.Player;

/**
 * Servlet implementation class ViewCountryServlet
 */
@WebServlet("/ViewCountryServlet")
public class ViewCountryServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ViewCountryServlet() {
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
		response.setContentType("text/html");
		ArrayList<Player> play = new ArrayList<Player>();
		RequestDispatcher rd;
		PlayerCountryDelegate playerDelegate = new PlayerCountryDelegate();
		boolean valid = playerDelegate.checkValidity(request, response);
		if(valid==false) {
		rd = request.getRequestDispatcher("playercountry.jsp");
		rd.include(request, response);
		}
		else {
		rd = request.getRequestDispatcher("retrieveplayer.jsp");
		rd.forward(request, response);
		}
		
	}

}
