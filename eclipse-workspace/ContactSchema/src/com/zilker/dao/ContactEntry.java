package com.zilker.dao;

import java.util.Scanner;
import java.util.logging.Logger;

import com.zilker.dto.Contacts;
import com.zilker.dto.Phone;

public class ContactEntry {
	private static Logger logger = Logger.getLogger(ContactEntry.class.getName());
	private static Contacts contactinfo = new Contacts();
	private static Phone phone = new Phone();
	static public void menuDisplay() {
		logger.info("1.INSERT DATA");
		logger.info("2.UPDATE DATA");
		logger.info("3.RETRIEVE DATA");
		logger.info("4.SORT DATA BY FIRST NAME");
		logger.info("5.SORT DATA BY LAST NAME");
		logger.info("6.EXIT");

	}

	public static void main(String[] args) {
		int choice = 0;
		logger.info("CONTACT MANAGEMENT");
		Scanner scan = new Scanner(System.in);
		String first=null,last=null,email=null,phoneinp=null;
		do {
			menuDisplay();
			logger.info("Enter a choice:");
			choice = scan.nextInt();
			switch (choice) {
			case 1:
				contactinfo = InsertData.getContact();
				phone=InsertData.getPhone();
				InsertData.insert(contactinfo, phone);
				break;
			
			case 2:
				logger.info("Enter first name for which you want to update:");
				first=scan.next();
				logger.info("Enter new email id:");
				email=scan.next();
				logger.info("Enter new phone number:");
				phoneinp=scan.next();
				UpdateData.update(first,email,phoneinp);
				break;
			case 3:
				logger.info("Enter first name:");
				first=scan.next();
				logger.info("Enter last name:");
				last=scan.next();
				RetrieveData.retrieve(first,last);
				break;
			case 4:
				SortData.sortFirst();
				break;
			case 5:
				SortData.sortLast();
				break;
			}
		} while (choice != 6);
		scan.close();
	}
}
