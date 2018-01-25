package com.zilker.javex;

import java.util.Scanner;
import java.util.logging.Logger;

public class Prog3 {
	static Logger l = Logger.getLogger(Prog3.class.getName());

	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);
		int sum = 0;
		// read input
		l.info("Enter numbers: ");
		int a = sc.nextInt();
		sum = a;
		int b = sc.nextInt();
		int c = sc.nextInt();
		// check equality
		if (a == b) {
			if (a == c)
				;
			else {
				sum += c;
			}
		} else {
			// add to sum
			sum += b;
			if (a == c || b == c)
				;
			else {
				sum += c;
			}
		}
		l.info("The sum is" + sum);
	}
}
