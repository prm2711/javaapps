package com.zilker.dto;

import com.zilker.validate.ValidateEmail;

public class Contacts {
	private String first_name;
	private String last_name;
	private String emailId;

	public Contacts() {
		this.last_name = null;
		this.first_name = null;
		this.emailId = null;
	}

	// get and set names
	public String getFirstName() {
		return first_name;
	}

	public void setFirstName(String firstname) {
		this.first_name = firstname;
	}

	public String getLastName() {
		return last_name;
	}

	public void setLastName(String lastname) {
		this.last_name = lastname;
	}

	// get and set email
	public String getEmailId() {
		return emailId;
	}

	public int setEmailId(String email) {

		int check = ValidateEmail.validateEmailAddress(email);
		if (check == 1) {
			this.emailId = email;
			return 1;
		} else {
			return 0;
		}
	}

}
