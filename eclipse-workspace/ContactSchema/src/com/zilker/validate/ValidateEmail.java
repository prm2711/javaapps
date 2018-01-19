package com.zilker.validate;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateEmail {
	private static Pattern regexPattern;
	private static Matcher regMatcher;

	public static int validateEmailAddress(String emailAddress) {

		regexPattern = Pattern.compile("^[(a-zA-Z0-9\\_)]+@[(a-zA-z)]+\\.[(a-zA-z)]{2,3}$");
		regMatcher = regexPattern.matcher(emailAddress);
		if (regMatcher.matches()) {
			return 1;
		} else {
			return 0;
		}
	}

	public static int validateMobileNumber(String mobileNumber) {
		regexPattern = Pattern.compile("^[1-9][0-9]{9}$");
		regMatcher = regexPattern.matcher(mobileNumber);
		if (regMatcher.matches()) {
			return 1;
		} else {
			return 0;
		}
	}

}
