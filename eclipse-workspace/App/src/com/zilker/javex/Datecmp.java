package com.zilker.javex;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;
import java.util.logging.Logger;

public class Datecmp {
	// compare function
	public static int cmpDate(Date d1, Date d2) {
		if (d1.compareTo(d2) == 0) {
			return 0;
		} else if (d1.compareTo(d2) > 0) {
			return 1;
		} else {
			return -1;
		}
	}

	public static void main(String args[]) throws ParseException {
		Logger log = Logger.getLogger(Datecmp.class.getName());
		Scanner sc = new Scanner(System.in);
		log.info("Enter dates: ");
		String str1 = null;
		String str2 = null;
		str1 = sc.next();
		str2 = sc.next();
		// format
		SimpleDateFormat sd = new SimpleDateFormat("dd-MM-yyyy");
		sd.setLenient(false);
		Date d1;
		Date d2;
		// check validity
		try {
			d1 = sd.parse(str1);
		} catch (Exception e) {
			log.info("Date 1 Not valid");
			return;
		}
		try {
			d2 = sd.parse(str2);
		} catch (Exception e) {
			log.info("Date 2 Not valid");
			return;
		}
		// checking comparison
		Calendar cal = Calendar.getInstance();
		if (cmpDate(d1, d2) == 0) {
			log.info(d1.toString() + " is equal to " + d2.toString());
		} else if (cmpDate(d1, d2) == 1) {
			log.info(d1.toString() + " is after " + d2.toString());
		} else {
			log.info(d1.toString() + " is before " + d2.toString());

		}
		sc.close();
	}
}
