package com.zilker.javex;

import java.util.Scanner;
import java.util.logging.Logger;

public class Prog {
	static Logger l = Logger.getLogger(Prog.class.getName());

	public static void main(String args[]) {
		int sum = 0, flag = 0;
		Scanner sc = new Scanner(System.in);
		l.info("Enter string:");
		String str = sc.nextLine();
		// check if digit
		for (int i = 0; i < str.length(); i++) {
			if (Character.isDigit(str.charAt(i))) {
				flag = 1;
				// add to sum
				sum = sum + Character.getNumericValue(str.charAt(i));
			}
		}
		// print the sum
		if (flag == 1) {
			l.info("The sum is" + sum);
		} else {
			l.info("The sum is 0");
		}
		sc.close();
	}
}
