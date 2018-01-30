package com.zilker.delegate;

import java.io.IOException;
import java.util.regex.Pattern;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.zilker.dao.FindCountry;
import com.zilker.dao.FindPlayerName;
import com.zilker.dao.FindTournamentName;
import com.zilker.dao.InsertData;
import com.zilker.dto.Match;
import com.zilker.dto.Tour;

public class InsertTournamentDelegate {

	public boolean checkValidity(HttpServletRequest request, HttpServletResponse response) throws IOException {
		response.setContentType("text/html");
		String tourname = request.getParameter("tourname");
		boolean valid = Pattern.compile("([a-zA-Z\\s]+)").matcher(tourname).matches();
		Tour tour = new Tour();
		InsertData insertData = new InsertData();
		if (valid == true) {
			tour.setTourName(tourname);
			insertData.insertTour(tour);
			request.setAttribute("msg", "Data inserted successfully");
			return true;
		} else {
			request.setAttribute("msg", "Enter valid Data");
			return false;
		}
	}

}
