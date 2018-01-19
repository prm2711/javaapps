package com.ztech.dto;

public class Student {
	private int roll_no;
	private String student_name;
	private int marks;
	private int marksphy, markschem;

	public int getRollNo() {
		return roll_no;
	}

	public void setRollNo(int rollno) {
		this.roll_no = rollno;
	}

	public String getStudentName() {
		return student_name;
	}

	public void setStudentName(String student) {
		this.student_name = student;
	}

	public int getMarksPhy() {
		return marksphy;
	}

	public void setMarksPhy(int marks) {
		this.marksphy = marks;
	}
	public int getMarksChem() {
		return markschem;
	}

	public void setMarksChem(int marks) {
		this.markschem = marks;
	}
	
	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}
}
