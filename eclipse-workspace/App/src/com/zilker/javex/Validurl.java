package com.zilker.javex;

import java.util.logging.Logger;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Validurl {
	static Logger l = Logger.getLogger(Validurl.class.getName());

	public static boolean urlValid(String ch) {
		// check valid url
		Pattern p = Pattern.compile("(https://|http://|ftp://)+[www\\.]*[a-zA-Z0-9_]+[\\.][#?/=A-Za-z0-9-=]*");
		if (Pattern.matches(p.toString(), ch)) {
			return true;
		} else {
			return false;
		}
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		l.info("Enter input");
		String str = sc.nextLine();
		// call function
		if (urlValid(str) == true) {
			l.info("Valid");
		} else {
			l.info("Not Valid");
		}
		sc.close();
	}
}
