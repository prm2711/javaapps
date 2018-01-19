package com.ztech.dao;

import com.ztech.dto.*;
import com.ztech.utilities.*;

import java.sql.*;
import java.util.logging.Logger;

public class InsertData {
	private Logger logger = Logger.getLogger(InsertData.class.getName());

	public void insertStudent(Student student) {

		ConnectionSetup conn = new ConnectionSetup();
		Connection connection = null;
		ExecuteStatement execute = new ExecuteStatement();
		connection = conn.getConnection();

		Statement statement = null;
		try {

			// Execute a query
			statement = connection.createStatement();
			execute.insertStudent(connection, student);

			logger.info("Data is inserted");

		} catch (SQLException se) {
			// Handle errors for JDBC
			logger.info("Problem in insertion");
		} finally {
			// finally block used to close resources
			conn.closeStatement(statement);
			conn.closeConnection(connection);
		}

	}
}