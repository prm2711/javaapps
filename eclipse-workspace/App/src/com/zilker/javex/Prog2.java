package com.zilker.javex;

import java.util.Scanner;
import java.util.logging.Logger;

public class Prog2 {
	static Logger l = Logger.getLogger(Prog2.class.getName());

	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);
		l.info("Enter day: ");
		String str = sc.nextLine();
		boolean f = false;
		l.info("Enter number: ");
		int a = sc.nextInt();
		// for weekends
		if (str.compareToIgnoreCase("Saturday") == 0 || str.compareToIgnoreCase("Sunday") == 0) {
			if (a >= 40) {
				f = true;
			}
		}
		// weekdays
		else {
			// checking limits
			if (a >= 40 && a <= 60) {
				f = true;
			}
		}
		l.info("The result is " + f);
		sc.close();
	}
}
