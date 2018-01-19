package com.zilker.display;

import java.util.logging.Logger;

import com.zilker.dao.FindPlayerName;
import com.zilker.dao.FindTournamentName;
import com.zilker.dto.Match;
import com.zilker.dto.Player;

public class DisplayPlayer {
	private Logger logger = Logger.getLogger(DisplayPlayer.class.getName());

	public void display(Player player) {
		String play = player.getPlayerName();
		String country = player.getCountry();
		int o = player.getOrig();
		int n = player.getNew();
		int num = player.getNumber();
		int w = player.getWon();
		int l = player.getLost();
		int d = player.getDraw();
		logger.info("Player: " + play);
		logger.info("Country: " + country);
		logger.info("Original Points: " + o);
		logger.info("New Points: " + n);
		logger.info("Number of matches: " + num);
		logger.info("Won: " + w);
		logger.info("Lost: " + l);
		logger.info("Draw: " + d);

	}

	public void disp(Match match) {
		FindPlayerName player = new FindPlayerName();
		FindTournamentName tour = new FindTournamentName();
		int tourid = match.getTourId();
		int play1id = match.getPlay1Id();
		int play2id = match.getPlay2Id();
		String status = match.getStatus();
		int w = match.getWinner();
		int l = match.getLoser();
		String score = match.getScore();
		String tournament = tour.retrieveTournament(tourid);
		logger.info("Tournament: " + tournament);
		String player1 = player.retrieveName(play1id);
		logger.info("Player1: " + player1);
		String player2 = player.retrieveName(play2id);
		logger.info("Player2: " + player2);
		if (status.equals("Suspended"))
			;
		else {
			String win = player.retrieveName(w);
			logger.info("Winner: " + win);
			String loss = player.retrieveName(l);
			logger.info("Loser: " + loss);
		}
		logger.info("Status: " + status);
		logger.info("Score: " + score);
	}

}
