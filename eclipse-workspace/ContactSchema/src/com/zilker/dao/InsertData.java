package com.zilker.dao;

import com.zilker.connection.*;
import com.zilker.constant.Constants;
import com.zilker.dto.*;
import java.sql.*;
import java.util.Scanner;
import java.util.logging.Logger;

public class InsertData {
	private static Logger logger = Logger.getLogger(ContactEntry.class.getName());
	private static Contacts contactinfo = new Contacts();
	private static Phone phone = new Phone();

	private static Scanner scan = new Scanner(System.in);

	public static int getType(String type) {
		if (type.equals("Office")) {
			return 1;
		} else if (type.equals("Mobile")) {
			return 2;
		} else if (type.equals("Home")) {
			return 3;
		}
		return -1;

	}

	public static Contacts getContact() {
		int id;
		String first = null, last = null, email = null;
		logger.info("Enter first name:");
		first = scan.next();
		logger.info("Enter last name:");
		last = scan.next();
		logger.info("Enter email id:");
		email = scan.next();
		contactinfo.setFirstName(first);
		contactinfo.setLastName(last);
		id = contactinfo.setEmailId(email);
		while (id == 0) {
			logger.info("Invalid id. enter again");
			email = scan.next();
			id = contactinfo.setEmailId(email);
		}
		return contactinfo;
	}

	public static Phone getPhone() {
		String extension = null, code = null, phoneno = null, type = null;
		int id;
		logger.info("Enter phone type:");
		type = scan.next();
		if (getType(type) == 1) {
			logger.info("Enter office extension:");
			extension = scan.next();
			logger.info("Enter office number:");
			phoneno = scan.next();
			phone.setPhoneId(1);
			phone.setPhoneNo(phoneno);
		} else if (getType(type) == 2) {
			logger.info("Enter mobile code:");
			code = scan.next();
			logger.info("Enter mobile number:");
			phoneno = scan.next();
			phone.setPhoneId(2);
			id = phone.setPhoneNo(phoneno);
			while (id == 0) {
				logger.info("Invalid number. enter again");
				phoneno = scan.next();
				id = phone.setPhoneNo(phoneno);
			}
		} else if (getType(type) == 3) {
			logger.info("Enter home area code:");
			extension = scan.next();
			logger.info("Enter country code:");
			code = scan.next();
			logger.info("Enter phone number:");
			phoneno = scan.next();
			phone.setPhoneId(3);
			phone.setPhoneNo(phoneno);
		}
		phone.setExtension(extension);
		phone.setCode(code);

		return phone;
	}

	public static void insert(Contacts contact, Phone phone) {
		Connection connection = null;
		try {
			connection = ConnectionSetup.getConnection();
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		Statement statement = null;
		ResultSet result = null;
		String first = contact.getFirstName();
		String last = contact.getLastName();
		String email = contact.getEmailId();
		String extension = phone.getExtension();
		String code = phone.getCode();
		String phoneno = phone.getPhoneNo();
		int phoneid = phone.getPhoneId();
		PreparedStatement prep = null;
		try {

			// Execute a query
			statement = connection.createStatement();
			prep = connection.prepareStatement(Constants.INS);
			prep.setString(1, first);
			prep.setString(2, last);
			prep.setString(3, email);
			prep.executeUpdate();
			PreparedStatement prep1 = connection.prepareStatement(Constants.INSP);
			prep1.setString(1, extension);
			prep1.setString(2, code);
			prep1.setString(3, phoneno);
			prep1.setInt(4, phoneid);
			prep1.executeUpdate();
			prep1.close();
			logger.info("Data is inserted");
		} catch (SQLException se) {
			// Handle errors for JDBC
			se.printStackTrace();
		} catch (Exception e) {
			// Handle errors for Class.forName
			e.printStackTrace();
		} finally {
			// finally block used to close resources
			try {
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			ConnectionSetup.closeConnection(result, statement, prep);
		}

	}
}