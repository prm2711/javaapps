package com.zilker.javex;

import java.util.Scanner;
import java.util.logging.Logger;

public class Replacehtml {
	static Logger log = Logger.getLogger(Replacehtml.class.getName());

	// match pattern with html tags
	public static String getHtml(String ch) {
		String rep = ch.replaceAll("<(/)?[a-zA-Z0-9-= \" ]+>", "");
		return rep;
	}

	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		log.info("Enter string: ");
		String str = scanner.nextLine();
		// call function
		String rep = getHtml(str);
		log.info("The replacement is " + rep);
		scanner.close();
	}
}
