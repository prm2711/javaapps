package com.ztech.servlets;

import java.io.IOException;
import java.util.logging.Logger;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ztech.dao.InsertData;
import com.ztech.dto.Student;

/**
 * Servlet implementation class InsertServlet
 */
@WebServlet("/InsertServlet")
public class InsertServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public InsertServlet() {
		super();
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		Logger log = Logger.getLogger(InsertServlet.class.getName());
		String roll_no = request.getParameter("roll_no");
		String student_name = request.getParameter("student_name");
		String marks = request.getParameter("marks");
		String marksphy = request.getParameter("marksphy");
		String markschem = request.getParameter("markschem");
		int rollno = 0;
		int markValue;
		int markPhysics;
		int markChem;
		
		InsertData insertData = new InsertData();
		
		rollno = Integer.parseInt(roll_no);
		markValue = Integer.parseInt(marks);
		markPhysics= Integer.parseInt(marksphy);
		markChem= Integer.parseInt(markschem);
		
		Student student = new Student();
		student.setRollNo(rollno);
		//student.setStudentName(student_name);
		student.setMarks(markValue);
		student.setMarksPhy(markPhysics);
		student.setMarksChem(markChem);

		insertData.insertStudent(student);
		log.info("Data Inserted");
	}

}
