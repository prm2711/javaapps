package com.zilker.dao;

import com.zilker.constant.Constants;
import com.zilker.dto.*;
import com.zilker.exceptions.MyException;
import com.zilker.preparedstatement.ExecuteStatement;
import com.zilker.utilities.*;

import java.sql.*;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.logging.Logger;

public class InsertData {
	private Logger logger = Logger.getLogger(InsertData.class.getName());
	private Match match = new Match();
	private Scanner scan = new Scanner(System.in);

	public Match getMatch() {
		int p1id, p2id, win, lose, tourid;
		String status, score;
		logger.info("Enter tournament id:");
		try {
			tourid = scan.nextInt();
		} catch (InputMismatchException e) {
			scan.nextLine();
			logger.warning("Enter a valid id: ");
			tourid = scan.nextInt();
		}
		logger.info("Enter player1 id:");
		try {
			p1id = scan.nextInt();
		} catch (InputMismatchException e) {
			scan.nextLine();
			logger.warning("Enter a valid id: ");
			p1id = scan.nextInt();
		}
		logger.info("Enter player2 id:");
		try {
			p2id = scan.nextInt();
		} catch (InputMismatchException e) {
			scan.nextLine();
			logger.warning("Enter a valid id: ");
			p2id = scan.nextInt();
		}
		logger.info("Enter winner:");
		try {
			win = scan.nextInt();
		} catch (InputMismatchException e) {
			scan.nextLine();
			logger.warning("Enter a valid id: ");
			win = scan.nextInt();
		}
		logger.info("Enter loser:");
		try {
			lose = scan.nextInt();
		} catch (InputMismatchException e) {
			scan.nextLine();
			logger.warning("Enter a valid id: ");
			lose = scan.nextInt();
		}
		logger.info("Enter status:");
		status = scan.next();
		try {
			if (!status.equals("Complete") && !status.equals("Suspended")) {
				throw new MyException("Enter valid status: ");
			}
		} catch (MyException e) {
			logger.warning(e.toString());
			status = scan.next();
		}
		logger.info("Enter score:");
		score = scan.next();
		match.setTourId(tourid);
		match.setPlay1Id(p1id);
		match.setPlay2Id(p2id);
		match.setWinner(win);
		match.setLoser(lose);
		match.setStatus(status);
		match.setScore(score);
		return match;
	}

	public void insertMatch(Match match1) {

		ConnectionSetup conn = new ConnectionSetup();
		Connection connection = null;
		ExecuteStatement execute = new ExecuteStatement();
		connection = conn.getConnection();

		Statement statement = null;
		int tourid = match1.getTourId();
		int p1id = match1.getPlay1Id();
		int p2id = match1.getPlay2Id();
		int win = match1.getWinner();
		int lose = match1.getLoser();
		String status = match1.getStatus();
		String score = match1.getScore();
		PreparedStatement prepmatch = null, prepmatch2 = null;
		try {

			// Execute a query
			statement = connection.createStatement();

			execute.insertMatch(connection, tourid, p1id, p2id, win, lose, status, score);

			if (status.equals("Complete")) {
				execute.updateMatch(connection, win, lose);
			} else if (status.equals("Suspended")) {
				execute.updateDraw(connection, p1id, p2id);
			}
			prepmatch = connection.prepareStatement(Constants.UPDATEMATCH);
			prepmatch.setInt(1, p1id);
			prepmatch.executeUpdate();
			prepmatch2 = connection.prepareStatement(Constants.UPDATEMATCH);
			prepmatch2.setInt(1, p2id);
			prepmatch2.executeUpdate();
			logger.info("Data is inserted");

		} catch (SQLException se) {
			// Handle errors for JDBC
			logger.info("Problem in insertion");
		} finally {
			// finally block used to close resources
			conn.closePreparedStatement(prepmatch);
			conn.closePreparedStatement(prepmatch2);
			conn.closeStatement(statement);
			conn.closeConnection(connection);
		}

	}
}