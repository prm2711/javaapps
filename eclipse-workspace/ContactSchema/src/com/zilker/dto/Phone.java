package com.zilker.dto;

import com.zilker.validate.ValidateEmail;

public class Phone {
	private String extension;
	private String code;
	private String phoneno;
	private int phoneid;

	public Phone() {
		this.extension = null;
		this.code = null;
		this.phoneno = null;
		this.phoneid = 0;
	}

	// extension and code
	public String getExtension() {
		return extension;
	}

	public void setExtension(String ext) {
		this.extension = ext;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String cod) {
		this.code = cod;
	}

	// phone number and type id
	public String getPhoneNo() {
		return phoneno;
	}

	public int setPhoneNo(String phno) {
		int id = ValidateEmail.validateMobileNumber(phno);
		if (id == 1) {

			this.phoneno = phno;
			return 1;
		} else {
			return 0;
		}
	}

	public int getPhoneId() {
		return phoneid;
	}

	public void setPhoneId(int ph) {
		this.phoneid = ph;
	}
}
