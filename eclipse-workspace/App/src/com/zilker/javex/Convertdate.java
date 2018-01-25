package com.zilker.javex;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.TimeZone;
import java.util.logging.Logger;

public class Convertdate {
	static Logger log = Logger.getLogger(Convertdate.class.getName());

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String d1 = null;
		Date d;
		log.info("Enter date: ");
		d1 = sc.nextLine();
		//Specifying format
		SimpleDateFormat sd = new SimpleDateFormat("EE yyyy-MM-dd 'at' h:mm:ss a z");
		SimpleDateFormat sd1 = new SimpleDateFormat("dd-MM-yyyy");
		sd.setLenient(false);
		sd1.setLenient(false);
		//Checking validity
		try
		{
		d = sd1.parse(d1);
		}
		catch(Exception e)
		{
			log.info("Not valid");
			return ;
		}
		
	    //Conversion
		sd.setTimeZone(TimeZone.getTimeZone("UTC"));
		String str = sd.format(d);
		log.info(str);
		sc.close();
	}
}
