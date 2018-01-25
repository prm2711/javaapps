package com.zilker.javex;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;
import java.util.logging.Logger;

public class Dateofbirth {
	static Logger log = Logger.getLogger(Dateofbirth.class.getName());

	// Finding day
	public static String getDay(Date d1) {
		Calendar c = Calendar.getInstance();
		String day = null;
		int dayval;
		c.setTime(d1);
		dayval = c.get(Calendar.DAY_OF_WEEK);
		switch (dayval) {
		case 1:
			day = "Sunday";
			break;
		case 2:
			day = "Monday";
			break;
		case 3:
			day = "Tuesday";
			break;
		case 4:
			day = "Wednesday";
			break;
		case 5:
			day = "Thursday";
			break;
		case 6:
			day = "Friday";
			break;
		case 7:
			day = "Saturday";
			break;
		}
		return day;
	}

	public static void main(String args[]) throws ParseException {
		Scanner sc = new Scanner(System.in);
		log.info("Enter date: ");
		String str1 = null;
		str1 = sc.nextLine();
		SimpleDateFormat sd = new SimpleDateFormat("dd-MM-yyyy");
		sd.setLenient(false);
		Date d1;
		// Checking validity
		try {
			d1 = sd.parse(str1);
		} catch (Exception e) {
			log.info("Not valid date");
			return;
		}
		// retrieve day
		String day = getDay(d1);
		log.info("The day is " + day);
		sc.close();
	}
}
