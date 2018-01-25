package com.zilker.javex;

import java.util.IllegalFormatException;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.logging.Logger;

public class Prog4 {
	static Logger l = Logger.getLogger(Prog4.class.getName());
	static int a[] = new int[100];
	static int ct = 0;

	public static void rec(int l) {
		// incrementing count
		if (a[l] == 11) {
			ct++;
		}
		if (l == 0) {// completion
			return;
		} else {
			// backward addition
			l--;
			rec(l);
		}

	}

	public static void main(String args[]) throws InputMismatchException {

		Scanner sc = new Scanner(System.in);
		l.info("Enter number: ");
		int i, n;
		n = sc.nextInt();
		l.info("Enter values: ");
		for (i = 0; i < n; i++) {
			try {
				a[i] = sc.nextInt();
			} catch (Exception e) {
				System.out.println("Integer only");
				return;
			}
		}
		rec(n - 1);
		// obtain count
		l.info("The count is " + ct);
		sc.close();

	}

}
