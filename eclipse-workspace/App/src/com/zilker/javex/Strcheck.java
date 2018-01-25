package com.zilker.javex;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Logger;

public class Strcheck {
	static Logger log = Logger.getLogger(Strcheck.class.getName());

	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		// read inputs
		log.info("Enter substring: ");
		String sub = scan.nextLine();
		int num, count, number = 0;
		boolean f = false;
		log.info("Enter number: ");
		num = scan.nextInt();
		scan.nextLine();
		log.info("Enter array: ");
		List<String> strArr = new LinkedList<String>();
		for (count = 0; count < num; count++) {
			strArr.add(scan.nextLine());
		}
		// check if equal
		for (String e : strArr) {
			if (e.equals(sub)) {
				f = true;
				number++;
				log.info("Found in " + e);
			}
		}
		// print number of times
		if (f == true) {
			log.info("Present " + number + " times");
		} else {
			log.info("Not Present");
		}
		scan.close();
	}
}
