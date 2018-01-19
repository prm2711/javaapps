package com.zilker.dao;

import com.zilker.connection.*;
import com.zilker.constant.Constants;
import com.zilker.dto.*;
import java.sql.*;
import java.util.Scanner;
import java.util.logging.Logger;

public class UpdateData {
	private static Logger logger = Logger.getLogger(ContactEntry.class.getName());

	public static void update(String first, String email, String phone) {
		Connection connection = null;
		int contactid = 0;
		try {
			connection = ConnectionSetup.getConnection();
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		Statement statement = null;
		ResultSet result = null;
		PreparedStatement prep=null;
		try {

			// Execute a query
			statement = connection.createStatement();
			prep = connection.prepareStatement(Constants.UPDATECONTACT);
			prep.setString(1, email);
			prep.setString(2, first);
			prep.executeUpdate();
			contactid = RetrieveId.getID(first);
			prep = connection.prepareStatement(Constants.UPDATEPHONE);
			prep.setString(1, phone);
			prep.setInt(2, contactid);
			prep.executeUpdate();
			logger.info("Data is updated");
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