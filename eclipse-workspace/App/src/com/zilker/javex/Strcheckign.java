package com.zilker.javex;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Logger;

public class Strcheckign {
	static Logger log = Logger.getLogger(Strcheckign.class.getName());

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		// read input
		log.info("Enter substring: ");
		String str = sc.nextLine();
		int n, count, number = 0;
		boolean f = false;
		log.info("Enter number: ");
		n = sc.nextInt();
		sc.nextLine();
		log.info("Enter array: ");
		List<String> strArr = new LinkedList<String>();
		for (count = 0; count < n; count++) {
			strArr.add(sc.nextLine());
		}
		// check if present
		for (String e : strArr) {
			if (e.contains(str)) {
				f = true;
				number++;
				log.info("Found in " + e);
			}
		}
		// print number of times
		if (f == true) {
			log.info("Present " + number + " times");
		} else {
			log.info("Not present");
		}
		sc.close();
	}
}
