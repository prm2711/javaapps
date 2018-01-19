package com.zilker.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
import java.util.logging.Logger;

import com.zilker.connection.ConnectionSetup;
import com.zilker.constant.Constants;
import com.zilker.dto.Contacts;
import com.zilker.dto.Phone;

public class RetrieveData {

	private static Logger logger = Logger.getLogger(RetrieveData.class.getName());

	public static String getType(int type) {
		if (type == 1) {
			return "Office";
		} else if (type == 2) {
			return "Mobile";
		} else if (type == 3) {
			return "Home";
		}
		return null;
	}

	public static void retrieve(String first, String last) {
		Connection connection = null;
		try {
			connection = ConnectionSetup.getConnection();
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		Statement statement = null;
		ResultSet result = null;
		String sql = null;
		Integer phid;
		String firstname = null, lastname = null, email = null, extension = null, code = null, phoneno = null;
		PreparedStatement prep=null;
		try {

			// Execute a query
			statement = connection.createStatement();
			prep = connection.prepareStatement(Constants.RETRIEVE);
			prep.setString(1, first);
			prep.setString(2, last);
			result = prep.executeQuery();
			if (result == null) {
				logger.info("No record found.");
				return;
			}
			while (result.next()) {
				firstname = result.getString(2);
				logger.info("First name: " + firstname);
				lastname = result.getString(3);
				logger.info("Last name: " + lastname);
				email = result.getString(4);
				logger.info("Email: " + email);
				extension = result.getString(5);
				code = result.getString(6);
				phoneno = result.getString(7);
				phid = result.getInt(8);
				if (phid == 1)
					logger.info("Phone Number: " + extension + " " + phoneno);
				else if (phid == 2)
					logger.info("Phone Number: " + code + " " + phoneno);
				else if (phid == 3)
					logger.info("Phone Number: " + extension + " " + code + " " + phoneno);
				logger.info("Type of Number: " + getType(phid));
			}

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
			ConnectionSetup.closeConnection(result, statement,prep);
		}

	}
}
