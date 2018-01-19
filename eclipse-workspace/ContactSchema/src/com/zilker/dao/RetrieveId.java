package com.zilker.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.zilker.connection.ConnectionSetup;
import com.zilker.constant.Constants;

public class RetrieveId {
	public static int getID(String first) {
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
		int contactid = 0;
		try {

			// Execute a query
			statement = connection.createStatement();
			PreparedStatement prep = connection.prepareStatement(Constants.RETID);
			prep.setString(1, first);
			result = prep.executeQuery();
			while (result.next()) {
				contactid = result.getInt(1);
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
			ConnectionSetup.closeConnection(result, statement,null);
		}
		return contactid;
	}
}
