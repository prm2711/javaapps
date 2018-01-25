package com.zilker.validate;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateEmail {
	 private Pattern regexPattern;
	    private Matcher regMatcher;

	    public String validateEmailAddress(String emailAddress) {

	        regexPattern = Pattern.compile("^[(a-zA-Z0-9\\_\\.)]+@[(a-zA-z)]+\\.[(a-zA-z)]{2,3}$");
	        regMatcher   = regexPattern.matcher(emailAddress);
	        if(regMatcher.matches()) {
	            return "Valid Email Address";
	        } else {
	            return "Invalid Email Address";
	        }
	    }

	    public String validateMobileNumber(String mobileNumber) {
	        regexPattern = Pattern.compile("^[1-9][0-9]{9}$");
	        regMatcher   = regexPattern.matcher(mobileNumber);
	        if(regMatcher.matches()) {
	            return "Valid Mobile Number";
	        } else {
	            return "Invalid Mobile Number";
	        }
	    }

	    public static void main(String[] args) {

	        String emailAddress = "suryaprakash-pisay@ztech.io";
	        String mobileNumber = "19865716202";
	        ValidateEmail validations = new ValidateEmail();
	        System.out.println(validations.validateEmailAddress(emailAddress));
	        System.out.println(validations.validateMobileNumber(mobileNumber));
	    }
}
