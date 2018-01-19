package com.zilker.connection;

import java.sql.*;
import com.zilker.constant.*;

//opening and closing a connection
public class ConnectionSetup {
	private static Constants constant;
	private static Connection connection ;
	public static Connection getConnection()  throws SQLException

	{	
		try {
			Class.forName(constant.PATH);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		// Open a connection
		try {
			connection = DriverManager.getConnection(constant.DB_URL, constant.USER, constant.PASS);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return connection;
	}

	public static void closeConnection(ResultSet result, Statement statement,PreparedStatement prep) {
		try {
			if (result != null) {
				result.close();
			}
		} catch (Exception e) {
		}
		try {
			if (statement != null) {
				statement.close();
			}
		} catch (SQLException se2) {
		}
		try {
			if (connection != null) {
				connection.close();
			}
		} catch (SQLException se) {
			se.printStackTrace();
		}
		try {
			if (prep != null) {
				prep.close();
			}
		} catch (SQLException se) {
			System.out.println("no prep statement");
		}
	}
}
