package com.zilker.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Collections;
import java.util.logging.Logger;

import com.zilker.constant.Constants;
import com.zilker.dto.*;
import com.zilker.utilities.ConnectionSetup;

public class SortData {
	private ArrayList<Player> play = new ArrayList<Player>();

	private Logger logger = Logger.getLogger(SortData.class.getName());

	public void sortName() {
		Connection connection = null;
		ConnectionSetup conn = new ConnectionSetup();
		connection = conn.getConnection();
		Statement statement = null;
		ResultSet result = null;
		Integer origpoints = 0, newpoints = 0, numbermatch = 0, won = 0, lost = 0, draw = 0;
		String player = null, country = null;
		try {

			// Execute a query
			statement = connection.createStatement();

			result = statement.executeQuery(Constants.RETSORT);
			if (result == null) {
				logger.info("No record found.");
				return;
			}
			while (result.next()) {

				player = result.getString(1);
				country = result.getString(2);
				origpoints = result.getInt(3);
				newpoints = result.getInt(4);
				numbermatch = result.getInt(5);
				won = result.getInt(6);
				lost = result.getInt(7);
				draw = result.getInt(8);
				Player players = new Player(player, country, origpoints, newpoints, numbermatch, won, lost, draw);
				play.add(players);

			}
			logger.info("Player Country Original Points New Points NumberofMatches Won Lost Draw");
			Collections.sort(play, new SortbyName());
			for (Player p : play) {
				logger.info(p.toString());
			}
		} catch (SQLException se) {
			// Handle errors for JDBC
			logger.warning("sorting error");
		} finally {
			// finally block used to close resources

			conn.closeResult(result);
			conn.closeStatement(statement);
			conn.closeConnection(connection);
		}

	}

}
