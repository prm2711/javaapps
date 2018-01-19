package com.zilker.display;

import com.zilker.dao.*;
import com.zilker.dto.Match;
import com.zilker.exceptions.MyException;
import com.zilker.utilities.AdminValidation;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.logging.Logger;

public class MatchEntry {
	private static Logger logger = Logger.getLogger(MatchEntry.class.getName());
	private static Scanner scan = new Scanner(System.in);

	public void useraction() {
		RetrieveData retrieveData = new RetrieveData();
		SortData sortData = new SortData();
		int choice = 0;
		do {
			usermenuDisplay();

			logger.info("Enter a choice:");
			try {
				choice = scan.nextInt();
				if (choice < 1 || choice > 3)
					throw new MyException("Enter valid value: ");
			} catch (InputMismatchException e) {
				scan.nextLine();
				logger.warning("Enter valid choice: ");

				choice = scan.nextInt();
			} catch (MyException e) {
				logger.warning(e.toString());
				choice = scan.nextInt();
			}
			switch (choice) {

			case 1:
				retrieveData.retrievePlayer();
				break;

			case 2:
				sortData.sortName();
				break;
			}
		} while (choice != 3);
	}

	void menuDisplay() {
		logger.info("1.INSERT DATA");
		logger.info("2.RETRIEVE PLAYER INFO");
		logger.info("3.RETRIEVE MATCH INFO");
		logger.info("4.VIEW PLAYER MATCHES");
		logger.info("5.VIEW PARTICULAR RESULT");
		logger.info("6.VIEW PLAYER MATCHES IN A TOURNAMENT");
		logger.info("7.FIND MOST IMPROVED PLAYER");
		logger.info("8.EXIT");

	}

	public void usermenuDisplay() {
		logger.info("1.RETRIEVE PLAYER INFO");
		logger.info("2.VIEW SORTED LIST BY NAME");
		logger.info("3.EXIT");

	}

	public static void main(String[] args) {

		logger.info("TOURNAMENT MANAGEMENT");
		String admin = null, password = null;
		AdminValidation adminValidation = new AdminValidation();
		MatchEntry matchEntry = new MatchEntry();
		int val = 0, check = -1;
		do {
			logger.info("Enter whether user(1) or admin(2) or exit(3): ");
			try {
				val = scan.nextInt();
				if (val < 1 || val > 3)
					throw new MyException("Enter value");
			} catch (InputMismatchException e) {
				scan.nextLine();
				logger.warning("Enter valid choice: ");
				val = scan.nextInt();
			} catch (MyException e) {
				logger.warning(e.toString());
				val = scan.nextInt();
			}
			if (val == 2) {
				scan.nextLine();
				logger.info("Enter username: ");
				admin = scan.nextLine();
				logger.info("Enter password: ");
				password = scan.nextLine();
				check = adminValidation.validateAdmin(admin, password);
				if (check == 1) {
					matchEntry.adminaction();
				} else {
					logger.info("Enter valid username and password: ");
					admin = scan.nextLine();
					password = scan.nextLine();
					matchEntry.adminaction();
				}

			} else if (val == 1) {
				matchEntry.useraction();
			}
		} while (val != 3);
		scan.close();
	}

	private void adminaction() {
		int choice = 0;
		do {
			menuDisplay();

			logger.info("Enter a choice:");
			try {
				choice = scan.nextInt();
				if (choice < 1 || choice > 8)
					throw new MyException("Enter valid value:");
			} catch (InputMismatchException e) {
				scan.nextLine();
				logger.warning("Enter valid choice: ");
				choice = scan.nextInt();
			} catch (MyException e) {
				logger.warning(e.toString());
				choice = scan.nextInt();

			}
			adminchoice(choice);
		} while (choice != 8);
	}

	private void adminchoice(int choice) {
		Match match = new Match();
		RetrieveData retrieveData = new RetrieveData();
		InsertData insertData = new InsertData();
		FindPlayerMatches findPlayer = new FindPlayerMatches();
		int pid, p2id, tourid;
		switch (choice) {
		case 1:
			match = insertData.getMatch();
			if (match != null)
				insertData.insertMatch(match);
			break;

		case 2:
			retrieveData.retrievePlayer();
			break;
		case 3:
			retrieveData.retrieveMatch();
			break;
		case 4:
			logger.info("Enter a player id:");
			try {
				pid = scan.nextInt();
			} catch (InputMismatchException e) {
				scan.nextLine();
				logger.warning("Enter valid id: ");
				pid = scan.nextInt();
			}
			findPlayer.retrieveMatch(pid);
			break;
		case 5:
			logger.info("Enter player1 id:");
			try {
				pid = scan.nextInt();
			} catch (InputMismatchException e) {
				scan.nextLine();
				logger.warning("Enter valid id: ");
				pid = scan.nextInt();
			}
			logger.info("Enter player2 id:");
			try {
				p2id = scan.nextInt();
			} catch (InputMismatchException e) {
				scan.nextLine();
				logger.warning("Enter valid id: ");
				p2id = scan.nextInt();
			}
			findPlayer.retrieveResult(pid, p2id);
			break;
		case 6:
			logger.info("Enter player1 id:");
			try {
				pid = scan.nextInt();
			} catch (InputMismatchException e) {
				scan.nextLine();
				logger.warning("Enter valid id: ");
				pid = scan.nextInt();
			}
			logger.info("Enter TOURNAMENT id:");
			try {
				tourid = scan.nextInt();
			} catch (InputMismatchException e) {
				scan.nextLine();
				logger.warning("Enter valid id: ");
				tourid = scan.nextInt();
			}
			findPlayer.retrieveTournament(pid, tourid);
			break;
		case 7:
			retrieveData.findMostImproved();
			break;
		}

	}
}
