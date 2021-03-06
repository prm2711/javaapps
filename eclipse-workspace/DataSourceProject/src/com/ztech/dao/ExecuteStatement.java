package com.ztech.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Logger;

import com.ztech.constants.Constants;
import com.ztech.dto.Student;
import com.ztech.utilities.ConnectionSetup;

public class ExecuteStatement {
	private Logger log = Logger.getLogger(ExecuteStatement.class.getName());

	public void insertStudent(Connection connection,Student student) {
		ConnectionSetup conn = new ConnectionSetup();
		int rollno=student.getRollNo();
		String student_name=student.getName();
		int marks=student.getMarks();
		int phymarks=student.getMarksPhy();
		int chemmarks=student.getMarksChem();
		PreparedStatement prep = null;
		try {
			prep = connection.prepareStatement(Constants.INS);
			prep.setInt(1,rollno);
			prep.setString(2, student_name);
			prep.setInt(3, marks);
			prep.setInt(4, phymarks);
			prep.setInt(5, chemmarks);
			prep.executeUpdate();
		} catch (SQLException e) {
			log.warning("error in prepared statement");
		} finally {
			conn.closePreparedStatement(prep);
		}
	}
}
