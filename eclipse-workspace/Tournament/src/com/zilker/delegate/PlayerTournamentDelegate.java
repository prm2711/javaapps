package com.zilker.delegate;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.zilker.dao.FindPlayerMatches;
import com.zilker.dao.FindPlayerName;
import com.zilker.dao.FindTournamentName;
import com.zilker.dto.MatchWithName;

public class PlayerTournamentDelegate {
     
	public boolean checkValidity(HttpServletRequest request, HttpServletResponse response) throws IOException {
		response.setContentType("text/html");
		String player = request.getParameter("player");
		int playerid, tourid;
		String tour = request.getParameter("tour");
		FindPlayerName findPlayer = new FindPlayerName();
		FindPlayerMatches findPlayerMatch = new FindPlayerMatches();
		FindTournamentName findTour = new FindTournamentName();
		ArrayList<MatchWithName> matches = new ArrayList<MatchWithName>();
	
			playerid = findPlayer.retrievePlayerID(player);
			tourid = findTour.retrieveTournamentID(tour);
			if (playerid == -1) {
				request.setAttribute("msg", "Enter valid Player");
				return false;
			} else if (tourid == -1) {
				request.setAttribute("msg", "Enter valid Tournament");
				return false;
			} else {
				matches = findPlayerMatch.retrieveTournament(playerid, tourid);
				if (matches.isEmpty() == false) {
					request.setAttribute("list", matches);
					return true;
				} else {
					request.setAttribute("msg", "No such match");
					return false;
				}
			
		}

	}
}
